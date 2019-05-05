package com.fuge.xyin.controller;

import com.fuge.xyin.domain.Video;
import com.fuge.xyin.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/**
 * 处理web界面操作视频部分
 */
@Controller
@RequestMapping(value = "/video")
public class VideoController {
    private static final String VIDEO_FORM_PATH_NAME = "VideoForm";
    private static final String VIDEO_LIST_PATH_NAME = "VideoList";
    private static final String REDIRECT_TO_VIDEO_URL = "redirect:/video";
    @Autowired
    VideoService videoService;

    /**
     * 获取Video 列表
     *      处理"/video/list"的请求，用于获取video列表
     * @param map
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    public String getVideoList(ModelMap map){
        map.addAttribute("videoList",videoService.findAll());
        return VIDEO_LIST_PATH_NAME;

    }

    /**
     * 获取创建 Video 表单
     * @param map
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String createVideo(ModelMap map){
        map.addAttribute("video",new Video());
        map.addAttribute("action","create");
        return VIDEO_FORM_PATH_NAME;
    }

    /**
     * 创建Video
     *      处理"/video/createVideo"的POST请求，用来创建 Video信息
     *      通过@ModelAttribute 绑定表单实体参数，也通过@RequestPara传递参数
     * @param video
     * @return
     */
    @RequestMapping(value = "/createVideo",method = RequestMethod.POST)
    public String postVideo(@ModelAttribute Video video){
        videoService.insertByVideo(video);
        return REDIRECT_TO_VIDEO_URL;
    }

    /**
     * 获取更新Video 表单
     *      处理"/video/update/{id}"的POSt请求，根据URL中的id 值获取Video信息
     *      URL中的 id,通过@PathVariable绑定参数
     * @param id
     * @param map
     * @return
     */

    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String getVideo(@PathVariable Long id,ModelMap map){
        map.addAttribute("video",videoService.findById(id));
        map.addAttribute("action","update");
        return VIDEO_FORM_PATH_NAME;
    }

    /**
     * 更新 Video
     *      处理"/update"的PUT请求，用来更新Video信息
     * @param video
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String putVideo(@ModelAttribute Video video){
        videoService.updata(video);
        return  REDIRECT_TO_VIDEO_URL;
    }

    /**
     * 删除 Video
     *      处理"/delete/{id}"的GET请求，用来删除Book信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.GET)
    public String deleteVideo(@PathVariable Long id){
        videoService.delete(id);
        return REDIRECT_TO_VIDEO_URL;
    }

}
