package com.qf.service;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;
import com.qf.util.Page;

public interface VideoService {
    Video selectVideoById(String id);

    Boolean updateVideo(Video video);

    Page<Video> selectVideoByQueryVo(QueryVo queryVo);

    Boolean deleteById(String[] ids);
}
