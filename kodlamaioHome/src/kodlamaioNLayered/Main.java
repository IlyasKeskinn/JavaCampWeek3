package kodlamaioNLayered;

import kodlamaioNLayered.bussines.CategoryManager;
import kodlamaioNLayered.bussines.CourseManager;
import kodlamaioNLayered.bussines.EducatorManager;
import kodlamaioNLayered.core.logging.DatabaseLogger;
import kodlamaioNLayered.core.logging.FileLogger;
import kodlamaioNLayered.core.logging.Logger;
import kodlamaioNLayered.core.logging.MailLogger;
import kodlamaioNLayered.dataAccess.hibernateDao.HibernateCategoryDao;
import kodlamaioNLayered.dataAccess.hibernateDao.HibernateEducatorDao;
import kodlamaioNLayered.dataAccess.jdbcDao.JdbcCourseDao;
import kodlamaioNLayered.entities.Category;
import kodlamaioNLayered.entities.Course;
import kodlamaioNLayered.entities.Educator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Logger[] loggers = new Logger[]{new DatabaseLogger(), new FileLogger(), new MailLogger()};


        Category category1 = new Category();
        category1.setId(1);
        category1.setCategoryName("Java");

        Category category2 = new Category();
        category2.setId(2);
        category2.setCategoryName("JavaScript");


        List<Category> categoryList = new ArrayList<>();


        CategoryManager categoryManager = new CategoryManager(categoryList, new HibernateCategoryDao(), loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);

        System.out.println("-----------------------------------------------------------------------------------");

        List<Course> courseList = new ArrayList<>();


        Course course1 =new Course();
        course1.setId(1);
        course1.setCourseName("Java ile Programlamaya Giriş");
        course1.setUnitPrice(100);
        Course course2 =new Course();
        course2.setId(1);
        course2.setCourseName("JavaScript Web Programlama");
        course2.setUnitPrice(200);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers,courseList);
        courseManager.add(course1);
        courseManager.add(course2);

        System.out.println("-----------------------------------------------------------------------------------");

        Educator educator1 = new Educator();
        educator1.setId(1);
        educator1.setFirstName("Engin");
        educator1.setLastName("Demiroğ");

        EducatorManager educatorManager = new EducatorManager(new HibernateEducatorDao(),loggers);
        educatorManager.add(educator1);
    }

}
