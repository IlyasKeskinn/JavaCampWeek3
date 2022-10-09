package kodlamaioNLayered.dataAccess.jdbcDao;

import kodlamaioNLayered.dataAccess.interfaces.CourseDao;
import kodlamaioNLayered.entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına kurs eklendi");

    }
}
