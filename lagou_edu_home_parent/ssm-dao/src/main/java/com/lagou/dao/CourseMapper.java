package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.Teacher;

import java.util.List;


public interface CourseMapper {

    /**
     * 多条件查询
     * @param courseVO
     * @return
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     * 添加课程信息
     */
    public void saveCourse(Course course);

    /**
     * 新增讲师信息
     */
    public void saveTeacher(Teacher teacher);

    /**
     * 根据id查询信息（回显）
     */
    public CourseVO findCourseById(Integer id);

    /**
     * 更新课程信息
     */
    public void updateCourse(Course course);

    /**
     * 更新讲师信息
     */
    public void updateTeacher(Teacher teacher);

    /**
     * 课程状态管理
     */
    public void updateCourseStatus(Course course);
}
