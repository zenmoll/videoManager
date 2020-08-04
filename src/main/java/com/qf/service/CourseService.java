package com.qf.service;

import com.qf.pojo.Course;
import com.qf.pojo.QueryVo;
import com.qf.util.Page;

import java.util.List;

public interface CourseService {
    Course selectCourseById(String id);

    List<Course> selectAll();

    void deleteCourseById(String id);

    Page<Course> selectCourseByQueryVo(QueryVo queryVo);

    void updateCourse(Course course);
}
