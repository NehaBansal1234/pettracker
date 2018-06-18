package service;

import model.PetModel;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

/**
 * Created by nehabansal on 6/18/18.
 */
@Service
public class PetService {
    Hashtable<String, PetModel> pets=new Hashtable<>();
    public PetService() {
        PetModel pm=new PetModel();
        pm.setId("1");
        pm.setName("Bruno");
        pm.setBirthDate("4/22/2014");
        pm.setSpecies("Dog");
        pm.setVeterinarianName("Neha");
        pm.getDoctorVisit().put("4/22/2014","BirthDay");
        pets.put("1",pm);

        PetModel pm1=new PetModel();
        pm1.setId("2");
        pm1.setName("Twinkle");
        pm1.setBirthDate("7/12/2016");
        pm1.setSpecies("Dog");
        pm1.setVeterinarianName("Prateek");
        pm1.getDoctorVisit().put("3/25/2016","HealthCheck");
        pm1.getDoctorVisit().put("5/14/2017","PrimaryCare");
        pets.put("2",pm);
    }

    public PetModel getPet(String id){
        if (pets.containsKey(id))
            return pets.get(id);
        else
            return null;
    }
    public Hashtable<String,PetModel> getAll() {
            return pets;
    }
}
