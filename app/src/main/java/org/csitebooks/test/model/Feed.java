
package org.csitebooks.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Feed {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("property_name")
    @Expose
    private String propertyName;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("sale_date")
    @Expose
    private String saleDate;
    @SerializedName("district_name")
    @Expose
    private String districtName;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("sale_status")
    @Expose
    private String saleStatus;
    @SerializedName("is_star")
    @Expose
    private String isStar;
    @SerializedName("list_view_image")
    @Expose
    private String listViewImage;
    @SerializedName("comment_count")
    @Expose
    private String commentCount;
    @SerializedName("favor_count")
    @Expose
    private String favorCount;
    @SerializedName("developer_name")
    @Expose
    private List<String> developerName = new ArrayList<>();
    @SerializedName("nick_name")
    @Expose
    private String nickName;
    @SerializedName("indoor_360")
    @Expose
    private List<Indoor360> indoor360 = new ArrayList<>();
    @SerializedName("aerial_video")
    @Expose
    private List<AerialVideo> aerialVideo = new ArrayList<>();
    @SerializedName("img_name")
    @Expose
    private String imgName;
    @SerializedName("p_resize_url")
    @Expose
    private String pResizeUrl;
    @SerializedName("list_img_name")
    @Expose
    private String listImgName;
    @SerializedName("l_resize_url")
    @Expose
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
