package cz.educanet.zoo;

import cz.educanet.zoo.models.Animal;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.core.Response;
import java.lang.reflect.Array;
import java.util.ArrayList;

@ApplicationScoped
public class animalManager {

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    public ArrayList<Animal> getAnimal(){
        return animals;
    }

    public void saveAnimal(Animal animal){
        animals.add(animal);
    }

}