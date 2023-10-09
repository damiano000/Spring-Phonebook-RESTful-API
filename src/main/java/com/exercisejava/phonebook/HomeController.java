package com.exercisejava.phonebook;

import com.exercisejava.phonebook.model.Contact;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class HomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public HashMap<String, String> prima() {
        HashMap<String, String> result = new HashMap<>();
        result.put("valore 1", "ciao");
        result.put("valore 2", "ciao di nuovo");

        return result;
    }

    @GetMapping("/contatto")
    public Contact seconda() {
        return new Contact("Franco", "Rossi", "3323432");
    }

    //elenco di valori
    @GetMapping("/contatto/contatti")
    public List<Contact> terza() {
        List<Contact> result = new ArrayList<>();
        result.add(new Contact("Franco", "Rossi", "3323432"));
        result.add(new Contact("Giuseppe", "Verdi", "2737284"));
        result.add(new Contact("Roberto", "Bianchi", "3299649"));

        return result;
    }
}
