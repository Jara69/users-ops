package cz.educanet.zoo;

import cz.educanet.zoo.models.Animal;

import javax.inject.Inject;
import javax.validation.constraints.Positive;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;

@Path("animals")
@Produces(MediaType.APPLICATION_JSON)
public class animalResource {

    private ArrayList<Animal> animals = new ArrayList<Animal>();

    @Inject
    private AnimalManager animalManager;

    @GET
    public Response getAnimals(){
        return Response.ok(animals).build();
    }

    @POST
    public Response addAnimal(@FormParam("name") String name,
                              @FormParam("age") Integer age,
                              @FormParam("weight") Integer weight,
                              @FormParam("gender") String gender){

        Animal animal = new Animal(name, age, weight, gender);

        animalManager.saveAnimal(animal);
        return Response.ok("Zvíře přidáno").build();

    }


}