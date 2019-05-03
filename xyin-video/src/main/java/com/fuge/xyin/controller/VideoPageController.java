package com.fuge.xyin.controller;

import com.fuge.xyin.domain.Video;
import com.fuge.xyin.service.VideoPageServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/videopage")
public class VideoPageController {
    @Autowired
    VideoPageServie videoPageServie;

    /**
     * 获取视频分页列表
     *      处理"/pages"的GET请求，用于获取视频分页列表
     *      通过@RequestPara传递参数，进一步实现条件查询或者分页查询
     *
     *      Pageable 支持的分页参数如下
     *      page - 当前页从0开始
     *      size - 每页大小 默认值在application.properties配置
     * @param pageable
     * @return
     */
    @RequestMapping(value = "/pages",method = RequestMethod.GET)
    public Page<Video> getVideorPage(Pageable pageable){
        return videoPageServie.findByPage(pageable);
    }

    /**
     * 创建 Video
     *      处理"/create"的POST请求，用来获取用户列表
     *      通过@RequestBody绑定实体类参数
     * @param video
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public Video postVideo(@RequestBody Video video){
        return videoPageServie.insertByVideo(video);
    }
}
