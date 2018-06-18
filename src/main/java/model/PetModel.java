package model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by nehabansal on 6/18/18.
 */

public class PetModel {
    String id;
    String name;
    String birthDate;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getVeterinarianName() {
        return veterinarianName;
    }

    public void setVeterinarianName(String veterinarianName) {
        this.veterinarianName = veterinarianName;
    }

    public Map<String,String> getDoctorVisit() {
        return doctorVisit;
    }

    public void setDoctorVisit(Map<String,String> doctorVisit) {
        this.doctorVisit = doctorVisit;
    }

    public void setId(String id) {
        this.id = id;

    }

    String species;
    String veterinarianName;
    Map<String, String> doctorVisit= new HashMap<>();

}
