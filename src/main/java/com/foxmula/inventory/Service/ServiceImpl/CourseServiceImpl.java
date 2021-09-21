package com.foxmula.inventory.Service.ServiceImpl;

import com.foxmula.inventory.Model.Course;
import com.foxmula.inventory.Repository.CourseRepository;
import com.foxmula.inventory.Service.CourseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course addCourse(Course course) {
        try{
            Course addedCourse = courseRepository.save(course);
            return addedCourse;
        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
        return null;
    }

    @Override
    public Course getCourse(Long id) {
        try {
            Optional<Course> optionalCourse = courseRepository.findById(id);
            if (optionalCourse.isPresent()){
                return optionalCourse.get();
            }else {
                return null;
            }
        }catch (Exception e){
            System.out.println("Exception "+e.getMessage());
        }
        return null;
    }

    @Override
    public Course updateCourse(Long id, Course course) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()){
            course.setId(optionalCourse.get().getId());
            Course updatedCourse = courseRepository.save(course);
            return updatedCourse;
        }
        return null;
    }

    @Override
    public Boolean deleteCourse(Long id) {
        Optional<Course> optionalCourse = courseRepository.findById(id);
        if (optionalCourse.isPresent()){
            courseRepository.deleteById(id);
            System.out.println("Course to delete is "+optionalCourse.get());
            return true;
        }
        return null;
    }
}
