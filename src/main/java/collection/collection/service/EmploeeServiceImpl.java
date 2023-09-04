package collection.collection.service;

import collection.collection.EmploeeAlreadyAddedException;
import collection.collection.exception.EmploeeNofFoundException;
import collection.collection.model.Emploee;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class EmploeeServiceImpl implements EmploeeService {
    private final Map<String, Emploee> emploees;

    public EmploeeServiceImpl() {
        this.emploees = new HashMap<>();
    }

    @Override
    public Emploee add(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploees.containsKey(emploee.getFullName())) {
            throw new EmploeeAlreadyAddedException();
        }

        emploees.put(emploee.getFullName(), emploee);
        return emploee;
    }

    @Override
    public Emploee remove(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploees.containsKey(emploee.getFullName())) {
            emploees.remove(emploee.getFullName());
            return emploee;
        }
        throw new EmploeeNofFoundException();
    }

    @Override
    public Emploee find(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploees.containsKey(emploee.getFullName())) {
           return emploees.remove(emploee.getFullName());
        }
        throw new EmploeeNofFoundException();
    }

    @Override
    public Collection<Emploee> findAll() {
         return Collections.unmodifiableCollection(emploees.values());
    }
}
