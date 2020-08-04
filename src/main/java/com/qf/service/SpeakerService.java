package com.qf.service;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Speaker;
import com.qf.util.Page;

import java.util.List;

public interface SpeakerService {
    List<Speaker> selectAll();

    Page<Speaker> selectSpeakerByQueryVo(QueryVo queryVo);

    Boolean deleteById(String id);

    Speaker selectSpeakerById(String id);

    Boolean saveOrUpdate(Speaker speaker);
}
