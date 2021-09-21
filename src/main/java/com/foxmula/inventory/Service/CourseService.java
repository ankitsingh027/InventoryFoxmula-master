package com.foxmula.inventory.Service;

import com.foxmula.inventory.Model.Course;

public interface CourseService{

    Course addCourse(Course course);

    Course getCourse(Long id);

    Course updateCourse(Long id, Course course);

    Boolean deleteCourse(Long id);
}
