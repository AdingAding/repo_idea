package com.lagou.dao;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentMapper {

    /**
     * 根据课程id查询章节信息和对应的课时信息
     */
    public List<CourseSection> findSectionAndLessonByCourseId(int courseId);

    /**
     * 根据id回显章节对应的课程信息
     */
    public Course findCourseByCourseId(int courseId);

    /**
     * 新增章节信息
     */
    public void saveCourse(CourseSection courseSection);

    /**
     * 更新章节信息
     */
    public void updateCourse(CourseSection courseSection);

    /**
     * 章节状态管理
     */
    public void updateSectionStatus(CourseSection courseSection);

    /**
     * 新增课时信息
     */
    public void saveLesson(CourseLesson courseLesson);

    /**
     * 更新课时信息
     */
    public void updateLesson(CourseLesson courseLesson);
}
