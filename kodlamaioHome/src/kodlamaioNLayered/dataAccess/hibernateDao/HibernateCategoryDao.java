package kodlamaioNLayered.dataAccess.hibernateDao;

import kodlamaioNLayered.dataAccess.interfaces.CategoryDao;
import kodlamaioNLayered.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanına kategori eklendi");
    }
}
