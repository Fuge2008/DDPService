//package com.fuge.xyin.controller;
//
//import com.fuge.xyin.domain.VideoEs;
//import com.fuge.xyin.service.VideoEsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
///**
// * 视频 Controller 实现 Restful HTTP 服务
// */
//@RestController
//@RequestMapping(value = "/api/video")
//public class VideoEsController {
//    @Autowired
//    private VideoEsService videoEsService;
//
//    /**
//     * 插入 ES 新城市
//     * @param videoEs
//     * @return
//     */
//    @RequestMapping(value = "/insert",method = RequestMethod.POST)
//    public Long createVideo(@RequestBody VideoEs videoEs) {
//        return videoEsService.saveVideo(videoEs);
//    }
//
//    /**
//     * 搜索返回分页结果
//     *
//     * @param pageNumber 当前页码
//     * @param pageSize 每页大小
//     * @param searchContent 搜索内容
//     * @return
//     */
//    @RequestMapping(value = "/search",method = RequestMethod.GET)
//    @ResponseBody
//    public List<VideoEs> searchVideo(@RequestParam(value = "pageNumber") Integer pageNumber,
//                                   @RequestParam(value = "pageSize",required = false) Integer pageSize,
//                                   @RequestParam(value = "searchContent") String searchContent) {
//        return videoEsService.searchVideo(pageNumber,pageSize,searchContent);
//    }
//}
