package collection.collection.service;

import collection.collection.model.Emploee;

import java.util.Collection;

public interface EmploeeService {
    Emploee add (String firstName, String lastName);
    Emploee remove (String firstName, String lastName);
    Emploee find (String firstName, String lastName);


    Collection<Emploee> findAll();
}
