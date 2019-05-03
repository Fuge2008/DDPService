package com.fuge.xyin.controller;

import com.fuge.xyin.domain.VideoMb;
import com.fuge.xyin.service.VideoMrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class VideoMrRestController {

    @Autowired
    private VideoMrService videoMrService;


    @RequestMapping(value = "/api/video/{id}", method = RequestMethod.GET)
    public VideoMb findOneCity(@PathVariable("id") Long id) {
        return videoMrService.findVideoById(id);
    }

    @RequestMapping(value = "/api/video", method = RequestMethod.POST)
    public void createCity(@RequestBody VideoMb videoMb) {
        videoMrService.saveVideo(videoMb);
    }

    @RequestMapping(value = "/api/video", method = RequestMethod.PUT)
    public void modifyCity(@RequestBody VideoMb videoMb) {
        videoMrService.updateVideo(videoMb);
    }

    @RequestMapping(value = "/api/video/{id}", method = RequestMethod.DELETE)
    public void modifyVideo(@PathVariable("id") Long id) {
        videoMrService.delete(id);
    }
}
