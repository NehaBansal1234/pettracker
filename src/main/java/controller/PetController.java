package controller;

import model.PetModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PetService;

import java.util.Hashtable;

/**
 * Created by nehabansal on 6/18/18.
 */
@RestController
@RequestMapping("/")
public class PetController {
    @Autowired
    PetService ps;
    @RequestMapping("/all")
    public Hashtable<String, PetModel> getAll(){
        System.out.println("Hello Controller");

        return ps.getAll();
    }

    @RequestMapping("{id}")
    public  PetModel getPet(@PathVariable("id") String id){
        return ps.getPet(id);
    }


}
