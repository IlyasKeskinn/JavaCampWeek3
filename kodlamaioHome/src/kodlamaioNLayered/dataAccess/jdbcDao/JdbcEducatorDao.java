package kodlamaioNLayered.dataAccess.jdbcDao;

import kodlamaioNLayered.dataAccess.interfaces.EducatorDao;
import kodlamaioNLayered.entities.Educator;

public class JdbcEducatorDao implements EducatorDao {
    @Override
    public void add(Educator educator) {
        System.out.println("JDBC ile veritabanına eğitmen eklendi");

    }
}
