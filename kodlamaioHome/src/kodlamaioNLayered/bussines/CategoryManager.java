package kodlamaioNLayered.bussines;

import kodlamaioNLayered.core.logging.Logger;
import kodlamaioNLayered.dataAccess.interfaces.CategoryDao;
import kodlamaioNLayered.entities.Category;

import java.util.List;

public class CategoryManager  {

    private List<Category> categories;
    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(List<Category> categories,CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.categories = categories;
    }

    public void add(Category category) throws Exception {

        for (Category c: categories){
            if (c.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Course name already registered.");
            };
        }
        categoryDao.add(category);
        categories.add(category);


        for (Logger logger : loggers){
            logger.log(category.getCategoryName());
        }
    }


}
