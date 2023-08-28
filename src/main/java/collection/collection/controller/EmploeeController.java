package collection.collection.controller;

import collection.collection.CollectionApplication;
import collection.collection.model.Emploee;
import collection.collection.service.EmploeeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping ("/emploee")
public class EmploeeController {
    private final EmploeeService service;

    public EmploeeController(EmploeeService service) {
        this.service = service;
    }
    @GetMapping ("/add")
    public Emploee addEmploee(@RequestParam String firstName, @RequestParam String lastName) {
        return service.add(firstName, lastName);
    }
    @GetMapping ("/remove")
    public Emploee removeEmploee(@RequestParam String firstName, @RequestParam String lastName) {
        return service.remove(firstName, lastName);
    }
    @GetMapping ("/find")
    public Emploee findEmploee(@RequestParam String firstName, @RequestParam String lastName) {
        return service.find(firstName, lastName);
    }
    @GetMapping
    public Collection<Emploee> findAll() {
        return service.findAll();
    }

    }

