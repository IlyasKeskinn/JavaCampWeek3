package kodlamaioNLayered.bussines;

import kodlamaioNLayered.core.logging.Logger;
import kodlamaioNLayered.dataAccess.interfaces.EducatorDao;
import kodlamaioNLayered.entities.Educator;


public class EducatorManager {

    private EducatorDao educatorDao;
    private Logger[] loggers;

    public EducatorManager(EducatorDao educatorDao, Logger[] loggers) {
        this.educatorDao = educatorDao;
        this.loggers = loggers;
    }

    public void add(Educator educator){
        educatorDao.add(educator);

        for (Logger logger:loggers){
            logger.log(educator.getFirstName() +" "+educator.getLastName());
        }
    }
}
