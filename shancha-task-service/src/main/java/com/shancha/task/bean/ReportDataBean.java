package com.shancha.task.bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

/**
 * Created by weiq on 2018/03/08.
 *
 * @author weiq
 */
@XmlRootElement
public class ReportDataBean implements Serializable {
    /**
     * url.
     */
    private String url;
    /**
     * 标题
     */
    private String title;
    /**
     * 开始拍卖时间
     */
    private String sellStart;
    /**
     * 结束拍卖时间
     */
    private String sellEnd;
    /**
     * 评估价
     */
    private String valuation;
    /**
     * 拍卖单位
     */
    private String sellOrg;
    /**
     * 位置
     */
    private String position;
    /**
     * 板块
     */
    private String plate;
    /**
     * 开发商
     */
    private String developeCompany;
    /**
     * 物业公司
     */
    private String propertyCompany;
    /**
     * 楼栋数/户数
     */
    private String countInfo;
    /**
     * 建成年代
     */
    private String buildingYear;
    /**
     * 建筑类型
     */
    private String buildingType;
    /**
     * 物业费
     */
    private String propertyPrice;
    /**
     * 电梯信息
     */
    private String elevator;
    /**
     * 车位信息
     */
    private String porking;
    /**
     * 容积率
     */
    private String plotRatio;
    /**
     * 绿化率
     */
    private String greeningRatio;
    private List<CommunityExtBean> kindergartens;
    private List<CommunityExtBean> primarySchools;
    private List<CommunityExtBean> secondarySchools;
    private List<CommunityExtBean> hospitals;
    private List<CommunityExtBean> busStations;
    private List<CommunityExtBean> subwayStations;
    private List<CommunityExtBean> shoppingMalls;
    private List<CommunityExtBean> parks;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellStart() {
        return sellStart;
    }

    public void setSellStart(String sellStart) {
        this.sellStart = sellStart;
    }

    public String getSellEnd() {
        return sellEnd;
    }

    public void setSellEnd(String sellEnd) {
        this.sellEnd = sellEnd;
    }

    public String getValuation() {
        return valuation;
    }

    public void setValuation(String valuation) {
        this.valuation = valuation;
    }

    public String getSellOrg() {
        return sellOrg;
    }

    public void setSellOrg(String sellOrg) {
        this.sellOrg = sellOrg;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getDevelopeCompany() {
        return developeCompany;
    }

    public void setDevelopeCompany(String developeCompany) {
        this.developeCompany = developeCompany;
    }

    public String getPropertyCompany() {
        return propertyCompany;
    }

    public void setPropertyCompany(String propertyCompany) {
        this.propertyCompany = propertyCompany;
    }

    public String getCountInfo() {
        return countInfo;
    }

    public void setCountInfo(String countInfo) {
        this.countInfo = countInfo;
    }

    public String getBuildingYear() {
        return buildingYear;
    }

    public void setBuildingYear(String buildingYear) {
        this.buildingYear = buildingYear;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public String getPropertyPrice() {
        return propertyPrice;
    }

    public void setPropertyPrice(String propertyPrice) {
        this.propertyPrice = propertyPrice;
    }

    public String getElevator() {
        return elevator;
    }

    public void setElevator(String elevator) {
        this.elevator = elevator;
    }

    public String getPorking() {
        return porking;
    }

    public void setPorking(String porking) {
        this.porking = porking;
    }

    public String getPlotRatio() {
        return plotRatio;
    }

    public void setPlotRatio(String plotRatio) {
        this.plotRatio = plotRatio;
    }

    public String getGreeningRatio() {
        return greeningRatio;
    }

    public void setGreeningRatio(String greeningRatio) {
        this.greeningRatio = greeningRatio;
    }

    public List<CommunityExtBean> getKindergartens() {
        return kindergartens;
    }

    public void setKindergartens(List<CommunityExtBean> kindergartens) {
        this.kindergartens = kindergartens;
    }

    public List<CommunityExtBean> getPrimarySchools() {
        return primarySchools;
    }

    public void setPrimarySchools(List<CommunityExtBean> primarySchools) {
        this.primarySchools = primarySchools;
    }

    public List<CommunityExtBean> getSecondarySchools() {
        return secondarySchools;
    }

    public void setSecondarySchools(List<CommunityExtBean> secondarySchools) {
        this.secondarySchools = secondarySchools;
    }

    public List<CommunityExtBean> getHospitals() {
        return hospitals;
    }

    public void setHospitals(List<CommunityExtBean> hospitals) {
        this.hospitals = hospitals;
    }

    public List<CommunityExtBean> getBusStations() {
        return busStations;
    }

    public void setBusStations(List<CommunityExtBean> busStations) {
        this.busStations = busStations;
    }

    public List<CommunityExtBean> getSubwayStations() {
        return subwayStations;
    }

    public void setSubwayStations(List<CommunityExtBean> subwayStations) {
        this.subwayStations = subwayStations;
    }

    public List<CommunityExtBean> getShoppingMalls() {
        return shoppingMalls;
    }

    public void setShoppingMalls(List<CommunityExtBean> shoppingMalls) {
        this.shoppingMalls = shoppingMalls;
    }

    public List<CommunityExtBean> getParks() {
        return parks;
    }

    public void setParks(List<CommunityExtBean> parks) {
        this.parks = parks;
    }
}
