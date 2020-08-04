package com.qf.dao;

import com.qf.pojo.Course;
import com.qf.pojo.QueryVo;
import com.qf.util.Page;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseMapper {
    Course selectCourseById(String id);

    List<Course> selectAll();

    Page<Course> selectCourseByQueryVo(QueryVo queryVo);
    void deleteCourseById(String id);

    boolean insertCourse(Course course);

    void updateCourse(Course course);
}
