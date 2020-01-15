package exp.crew.ups.annot.dao;


import java.util.List;

public interface GenericDao<E> {

    public List<E> getAllPerson();

    public List<E> getAllPersonByName();

    public List<E> getAllPersonById();

}
