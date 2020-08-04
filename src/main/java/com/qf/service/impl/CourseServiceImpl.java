package com.qf.service.impl;

import com.qf.dao.CourseMapper;
import com.qf.pojo.Course;
import com.qf.pojo.QueryVo;
import com.qf.service.CourseService;
import com.qf.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseMapper courseMapper;


    @Override
    public Course selectCourseById(String id) {
        return courseMapper.selectCourseById(id);
    }

    @Override
    public List<Course> selectAll() {
        return courseMapper.selectAll();
    }

    @Override
    public void deleteCourseById(String id) {
        courseMapper.deleteCourseById(id);
    }


    @Override
    public Page<Course> selectCourseByQueryVo(QueryVo queryVo) {
        return courseMapper.selectCourseByQueryVo(queryVo);
    }

    @Override
    public void updateCourse(Course course) {
        courseMapper.updateCourse(course);
    }
}
