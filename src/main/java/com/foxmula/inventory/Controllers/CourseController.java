package com.foxmula.inventory.Controllers;

import com.foxmula.inventory.Model.Course;
import com.foxmula.inventory.Service.CourseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @RequestMapping(path = "/addCourse" , method = RequestMethod.POST)
    public Course addCourse(@RequestBody Course course){

        Course addedCourse = courseService.addCourse(course);
        if(addedCourse!=null){
            System.out.println("Added");
        }else{
            System.out.println("Not Added");
        }
        System.out.println("Added Course "+addedCourse);
        return addedCourse;
    }

    @RequestMapping(path = "/{courseId}" , method = RequestMethod.GET)
    public Course getCourse(@PathVariable String courseId){

        Course course = courseService.getCourse(Long.valueOf(courseId));
        System.out.println("Getted course "+course);
        return course;
    }

    @RequestMapping(path = "/{courseId}" , method = RequestMethod.PUT)
    public Course updateCourse(@RequestBody Course course, @PathVariable String courseId){
        Course updatedCourse = courseService.updateCourse(Long.valueOf(courseId),course);
        System.out.println("Updated Course is "+updatedCourse);
        return updatedCourse;
    }

    @RequestMapping(path = "/{courseId}" , method = RequestMethod.DELETE)
    public Boolean deleteCourse(@PathVariable String courseId){

        Boolean status = courseService.deleteCourse(Long.valueOf(courseId));
        System.out.println("Delete status "+status);
        return status;
    }
}
