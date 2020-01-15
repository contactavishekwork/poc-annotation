package exp.crew.ups.annot.dao;

import exp.crew.ups.annot.annotations.DataAccess;
import exp.crew.ups.annot.models.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {

    @DataAccess(personEntity = Person.class)
    private GenericDao<Person> personDao;
}
