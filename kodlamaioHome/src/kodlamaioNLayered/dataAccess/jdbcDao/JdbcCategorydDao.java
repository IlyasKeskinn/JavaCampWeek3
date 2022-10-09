package kodlamaioNLayered.dataAccess.jdbcDao;

import kodlamaioNLayered.dataAccess.interfaces.CategoryDao;
import kodlamaioNLayered.entities.Category;

public class JdbcCategorydDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına kategori eklendi");

    }
}
