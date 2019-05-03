package com.fuge.xyin.domain;

import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

/**
 * 视频实体类，用于 ES 操作
 */
@Document(indexName = "videotitle",type = "videocontent")
public class VideoEs implements Serializable {
    private static final long serialVersionUID = -1L;

    private Long id;
    private String videotitle;
    private String videoname;
    private String videocontent;
    private String videourl;
    private String userid;
    private String updatetime;
    private String browernum;
    private String province;
    private String city;
    private String universityid;
    private String videopic;
    private String praisenum;
    private String favoritenum;
    private String score;
    private String videoclass;
    private String videoduration;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVideotitle() {
        return videotitle;
    }

    public void setVideotitle(String videotitle) {
        this.videotitle = videotitle;
    }

    public String getVideoname() {
        return videoname;
    }

    public void setVideoname(String videoname) {
        this.videoname = videoname;
    }

    public String getVideocontent() {
        return videocontent;
    }

    public void setVideocontent(String videocontent) {
        this.videocontent = videocontent;
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getBrowernum() {
        return browernum;
    }

    public void setBrowernum(String browernum) {
        this.browernum = browernum;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUniversityid() {
        return universityid;
    }

    public void setUniversityid(String universityid) {
        this.universityid = universityid;
    }

    public String getVideopic() {
        return videopic;
    }

    public void setVideopic(String videopic) {
        this.videopic = videopic;
    }

    public String getPraisenum() {
        return praisenum;
    }

    public void setPraisenum(String praisenum) {
        this.praisenum = praisenum;
    }

    public String getFavoritenum() {
        return favoritenum;
    }

    public void setFavoritenum(String favoritenum) {
        this.favoritenum = favoritenum;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getVideoclass() {
        return videoclass;
    }

    public void setVideoclass(String videoclass) {
        this.videoclass = videoclass;
    }

    public String getVideoduration() {
        return videoduration;
    }

    public void setVideoduration(String videoduration) {
        this.videoduration = videoduration;
    }

}
