package exp.crew.ups.annot.dao.impl;

import exp.crew.ups.annot.dao.GenericDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenericDaoImpl<E> implements GenericDao {

    private Class<E> entityClass;

    public GenericDaoImpl(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public List getAllPerson() {
        return null;
    }

    public List getAllPersonByName() {
        return null;
    }

    public List getAllPersonById() {
        return null;
    }
}
