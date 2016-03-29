
package org.csitebooks.test.model;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    private String id;
    private String propertyName;
    private String image;
    private String video;
    private String saleDate;
    private String districtName;
    private String address;
    private String saleStatus;
    private String isStar;
    private String listViewImage;
    private String commentCount;
    private String favorCount;
    private List<String> developerName = new ArrayList<String>();
    private String nickName;
    private List<Indoor360> indoor360 = new ArrayList<Indoor360>();
    private List<AerialVideo> aerialVideo = new ArrayList<AerialVideo>();
    private String imgName;
    private String pResizeUrl;
    private String listImgName;
    private String lResizeUrl;

    /**
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The propertyName
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 
     * @param propertyName
     *     The property_name
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * 
     * @return
     *     The image
     */
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The video
     */
    public String getVideo() {
        return video;
    }

    /**
     * 
     * @param video
     *     The video
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     * 
     * @return
     *     The saleDate
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * 
     * @param saleDate
     *     The sale_date
     */
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    /**
     * 
     * @return
     *     The districtName
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * 
     * @param districtName
     *     The district_name
     */
    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    /**
     * 
     * @return
     *     The address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 
     * @param address
     *     The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @return
     *     The saleStatus
     */
    public String getSaleStatus() {
        return saleStatus;
    }

    /**
     * 
     * @param saleStatus
     *     The sale_status
     */
    public void setSaleStatus(String saleStatus) {
        this.saleStatus = saleStatus;
    }

    /**
     * 
     * @return
     *     The isStar
     */
    public String getIsStar() {
        return isStar;
    }

    /**
     * 
     * @param isStar
     *     The is_star
     */
    public void setIsStar(String isStar) {
        this.isStar = isStar;
    }

    /**
     * 
     * @return
     *     The listViewImage
     */
    public String getListViewImage() {
        return listViewImage;
    }

    /**
     * 
     * @param listViewImage
     *     The list_view_image
     */
    public void setListViewImage(String listViewImage) {
        this.listViewImage = listViewImage;
    }

    /**
     * 
     * @return
     *     The commentCount
     */
    public String getCommentCount() {
        return commentCount;
    }

    /**
     * 
     * @param commentCount
     *     The comment_count
     */
    public void setCommentCount(String commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * 
     * @return
     *     The favorCount
     */
    public String getFavorCount() {
        return favorCount;
    }

    /**
     * 
     * @param favorCount
     *     The favor_count
     */
    public void setFavorCount(String favorCount) {
        this.favorCount = favorCount;
    }

    /**
     * 
     * @return
     *     The developerName
     */
    public List<String> getDeveloperName() {
        return developerName;
    }

    /**
     * 
     * @param developerName
     *     The developer_name
     */
    public void setDeveloperName(List<String> developerName) {
        this.developerName = developerName;
    }

    /**
     * 
     * @return
     *     The nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * 
     * @param nickName
     *     The nick_name
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * 
     * @return
     *     The indoor360
     */
    public List<Indoor360> getIndoor360() {
        return indoor360;
    }

    /**
     * 
     * @param indoor360
     *     The indoor_360
     */
    public void setIndoor360(List<Indoor360> indoor360) {
        this.indoor360 = indoor360;
    }

    /**
     * 
     * @return
     *     The aerialVideo
     */
    public List<AerialVideo> getAerialVideo() {
        return aerialVideo;
    }

    /**
     * 
     * @param aerialVideo
     *     The aerial_video
     */
    public void setAerialVideo(List<AerialVideo> aerialVideo) {
        this.aerialVideo = aerialVideo;
    }

    /**
     * 
     * @return
     *     The imgName
     */
    public String getImgName() {
        return imgName;
    }

    /**
     * 
     * @param imgName
     *     The img_name
     */
    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    /**
     * 
     * @return
     *     The pResizeUrl
     */
    public String getPResizeUrl() {
        return pResizeUrl;
    }

    /**
     * 
     * @param pResizeUrl
     *     The p_resize_url
     */
    public void setPResizeUrl(String pResizeUrl) {
        this.pResizeUrl = pResizeUrl;
    }

    /**
     * 
     * @return
     *     The listImgName
     */
    public String getListImgName() {
        return listImgName;
    }

    /**
     * 
     * @param listImgName
     *     The list_img_name
     */
    public void setListImgName(String listImgName) {
        this.listImgName = listImgName;
    }

    /**
     * 
     * @return
     *     The lResizeUrl
     */
    public String getLResizeUrl() {
        return lResizeUrl;
    }

    /**
     * 
     * @param lResizeUrl
     *     The l_resize_url
     */
    public void setLResizeUrl(String lResizeUrl) {
        this.lResizeUrl = lResizeUrl;
    }

}
