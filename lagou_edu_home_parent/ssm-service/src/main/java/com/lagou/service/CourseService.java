package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public interface CourseService {
    /**
     * 多条件查询
     */
    public List<Course> findCourseByCondition(CourseVO courseVO);

    /**
     * 新建修改课程
     */
    public void saveCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 根据id查询信息（回显）
     */
    public CourseVO findCourseById(Integer id);

    /**
     * 更新课程信息
     */
    public void updateCourseOrTeacher(CourseVO courseVO) throws InvocationTargetException, IllegalAccessException;

    /**
     * 课程状态管理
     */
    public void updateCourseStatus(int id, int status);
}
