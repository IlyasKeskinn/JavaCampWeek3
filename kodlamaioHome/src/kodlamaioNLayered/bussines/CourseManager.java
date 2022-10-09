package kodlamaioNLayered.bussines;

import kodlamaioNLayered.core.logging.Logger;
import kodlamaioNLayered.dataAccess.interfaces.CourseDao;
import kodlamaioNLayered.entities.Course;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Course> courses;

    public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.courses = courses;
    }

    public void add(Course course) throws Exception {
        if (course.getUnitPrice() <= 0) {
            throw new Exception("course price cannot be less than zero");
        }
        for (Course c : courses){
            if (c.getCourseName().equals(course.getCourseName())){
                throw new Exception("Course name already registered in database.");
            }
        }

        courseDao.add(course);
        courses.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getCourseName());
        }
    }
}

