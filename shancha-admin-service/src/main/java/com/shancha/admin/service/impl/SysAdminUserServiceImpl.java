package com.shancha.admin.service.impl;

import com.shancha.admin.service.SysAdminUserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;

import com.shancha.admin.base.BaseServiceImpl;
import com.shancha.admin.contants.Constant;
import com.shancha.admin.dao.SysAdminUserMapper;
import com.shancha.admin.model.SysAdminUser;
import com.shancha.admin.util.EncryptUtil;
import com.shancha.admin.util.FastJsonUtils;
import tk.mybatis.mapper.common.Mapper;
@Service
public class SysAdminUserServiceImpl extends BaseServiceImpl<SysAdminUser> implements SysAdminUserService{
	@Autowired
	private SysAdminUserMapper sysAdminUserDao;
	
	@Override
	public Mapper<SysAdminUser> getMapper() {
		return sysAdminUserDao;
	}
	
	/**
	 * 修改密码
	 * @param currentUser 当前登录的用户信息
	 * @param old_pwd
	 * @param new_pwd
	 * @return 修改失败返回错误信息，修改成功返回authKey信息。
	 */
	public String setInfo(SysAdminUser currentUser, String old_pwd, String new_pwd) {
		if (currentUser == null){
			return FastJsonUtils.resultError(-400, "请先登录", null);
		}
		
		if (StringUtils.isNotBlank(old_pwd)) {
			return FastJsonUtils.resultError(-400, "旧密码必填", null);
		}
		
		if(StringUtils.isNotBlank(new_pwd)) {
			return FastJsonUtils.resultError(-400, "新密码必填", null);
		}
		
		if (old_pwd.equals(new_pwd)) {
			return FastJsonUtils.resultError(-400, "新旧密码不能一样", null);
		}
		
		if (!currentUser.getPassword().equals(DigestUtils.md5Hex(old_pwd))) {
			return FastJsonUtils.resultError(-400, "原密码错误", null);
		}
		
		if (!currentUser.getPassword().equals(DigestUtils.md5Hex(old_pwd))) {
			return FastJsonUtils.resultError(-400, "原密码错误", null);
		}
		SysAdminUser record = new SysAdminUser();
		record.setId(currentUser.getId());
		String md5NewPwd = DigestUtils.md5Hex(new_pwd);
		record.setPassword(md5NewPwd);
		sysAdminUserDao.updateByPrimaryKeySelective(record);
		String authKey = EncryptUtil.encryptBase64(currentUser.getUsername()+"|"+md5NewPwd, Constant.SECRET_KEY);
		//@TODO 更新缓存中auth_key
		return FastJsonUtils.resultError(200, "修改成功", authKey);
	}

	public PageInfo<SysAdminUser> getDataList(SysAdminUser record) {
		return super.selectPage(record.getPage(), record.getRows(), record);
	}

}
