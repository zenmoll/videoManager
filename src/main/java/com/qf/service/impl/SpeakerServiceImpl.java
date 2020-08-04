package com.qf.service.impl;

import com.qf.dao.SpeakerMapper;
import com.qf.pojo.QueryVo;
import com.qf.pojo.Speaker;
import com.qf.service.SpeakerService;
import com.qf.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {
    @Autowired
    private SpeakerMapper speakerMapper;

    @Override
    public List<Speaker> selectAll() {
        return speakerMapper.selectAll();
    }

    @Override
    public Page<Speaker> selectSpeakerByQueryVo(QueryVo queryVo) {
        queryVo.setStart((queryVo.getPage() - 1) * queryVo.getSize());

        List<Speaker> speakerList = speakerMapper.selectSpeakerByQueryVo(queryVo);
        Integer total = speakerMapper.selectCountByQueryVo(queryVo);

        Page<Speaker> speakerPage = new Page<>();
        speakerPage.setRows(speakerList);
        speakerPage.setTotal(total);
        speakerPage.setPage(queryVo.getPage());
        speakerPage.setSize(queryVo.getSize());

        return speakerPage;
    }

    @Override
    public Boolean deleteById(String id) {
        return speakerMapper.deleteById(id);
    }

    @Override
    public Speaker selectSpeakerById(String id) {
        return speakerMapper.selectSpeakerById(id);
    }

    @Override
    public Boolean saveOrUpdate(Speaker speaker) {
        if (null == speaker.getId()) {
            return speakerMapper.insertSpeaker(speaker);
        } else {
            return speakerMapper.updateSpeaker(speaker);
        }
    }
}
