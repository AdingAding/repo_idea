package com.lagou.service;

import com.lagou.domain.Course;
import com.lagou.domain.CourseLesson;
import com.lagou.domain.CourseSection;

import java.util.List;

public interface CourseContentService {

    public List<CourseSection> findSectionAndLessonByCourseId(int courseId);

    public Course findCourseByCourseId(int courseId);

    /**
     * 新增章节信息
     */
    public void saveCourse(CourseSection courseSection);

    /**
     * 更新章节
     */
    public void updateCourse(CourseSection courseSection);

    /**
     * 章节状态
     */
    public void updateSectionStatus(int id, int status);

    /**
     * 新增课程
     */
    public void saveLesson(CourseLesson courseLesson);
}
