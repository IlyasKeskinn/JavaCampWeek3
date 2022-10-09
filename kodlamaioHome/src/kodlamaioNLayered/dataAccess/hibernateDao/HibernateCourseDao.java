package kodlamaioNLayered.dataAccess.hibernateDao;

import kodlamaioNLayered.dataAccess.interfaces.CourseDao;
import kodlamaioNLayered.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanına kurs eklendi");

    }
}
