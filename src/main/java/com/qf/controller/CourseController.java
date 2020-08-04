package com.qf.controller;

import com.qf.pojo.*;
import com.qf.service.CourseService;
import com.qf.service.SubjectService;
import com.qf.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/course/{subjectId}")
    public String course(@PathVariable String subjectId, Model model) {
        Subject subject = subjectService.selectSubjectById(subjectId);
        model.addAttribute("subject", subject);
        return "/before/course";
    }
    @RequestMapping("deleteCourseById")
    public String deleteCourseById(String id) {
        courseService.deleteCourseById(id);
        return "before/course";
    }
    @RequestMapping("/addCourse")
    public String addCourse(Model model) {
        List<Course> courseList = courseService.selectAll();
        model.addAttribute("courseList", courseList);
        List<Subject> subjectList = subjectService.selectAll();
        model.addAttribute("subjectList", subjectList);
        return "/before/course";
    }
    @RequestMapping("/showCourseList")
    public String showCourseList(QueryVo queryVo, Model model) {
        model.addAttribute("queryVo", queryVo);
        Page<Course> page = courseService.selectCourseByQueryVo(queryVo);
        model.addAttribute("page", page);
        return "/behind/courseList";
    }
    @RequestMapping("/edit")
    public String edit(String id, Model model) {
        Course course = courseService.selectCourseById(id);
        model.addAttribute("course", course);
        return "/behind/addCourse";
    }
    @RequestMapping("/saveOrUpdate")
    public String saveOrUpdate(Course course) {
        courseService.updateCourse(course);
        return "redirect:showCourseList";
    }

}
