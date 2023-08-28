package collection.collection.service;

import collection.collection.EmploeeAlreadyAddedException;
import collection.collection.exception.EmploeeNofFoundException;
import collection.collection.model.Emploee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


@Service
public class EmploeeServiceImpl implements EmploeeService {
    private final List<Emploee> emploeeList;

    public EmploeeServiceImpl() {
        this.emploeeList = new ArrayList<>();
    }

    @Override
    public Emploee add(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploeeList.contains(emploee)) {
            throw new EmploeeAlreadyAddedException();
        }

        emploeeList.add(emploee);
        return emploee;
    }

    @Override
    public Emploee remove(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploeeList.contains(emploee)) {
            emploeeList.remove(emploee);
            return emploee;
        }
        throw new EmploeeNofFoundException();
    }

    @Override
    public Emploee find(String firstName, String lastName) {
        Emploee emploee = new Emploee(firstName, lastName);
        if (emploeeList.contains(emploee)) {
            emploeeList.remove(emploee);
            return emploee;
        }
        throw new EmploeeNofFoundException();
    }

    @Override
    public Collection<Emploee> findAll() {
        return new ArrayList<>(emploeeList);
    }
}
