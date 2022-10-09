package kodlamaioNLayered.dataAccess.hibernateDao;

import kodlamaioNLayered.dataAccess.interfaces.EducatorDao;
import kodlamaioNLayered.entities.Educator;

public class HibernateEducatorDao implements EducatorDao {
    @Override
    public void add(Educator educator) {
        System.out.println("Hibernate ile veritabanına eğitmen eklendi");

    }
}
