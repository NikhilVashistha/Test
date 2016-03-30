
package org.csitebooks.test.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FeedsModal {

    @SerializedName("success")
    @Expose
    private Integer success;
    @SerializedName("msg")
    @Expose
    private String msg;
    @SerializedName("feeds")
    @Expose
    private List<Feed> feeds = new ArrayList<>();


    /**
     * 
     * @return
     *     The success
     */
    public Integer getSuccess() {
        return success;
    }

    /**
     * 
     * @param success
     *     The success
     */
    public void setSuccess(Integer success) {
        this.success = success;
    }

    /**
     * 
     * @return
     *     The msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 
     * @param msg
     *     The msg
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 
     * @return
     *     The feeds
     */
    public List<Feed> getFeeds() {
        return feeds;
    }

    /**
     * 
     * @param feeds
     *     The feeds
     */
    public void setFeeds(List<Feed> feeds) {
        this.feeds = feeds;
    }

}
