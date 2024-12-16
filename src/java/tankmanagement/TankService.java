/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package tankmanagement;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

/**
 * REST Web Service
 *
 * @author amelc
 */
@Path("tanks")
public class TankService {

    @Context
    private UriInfo context;

    
    private static List<Tank> tanks = new ArrayList<>();

    public TankService() {
       
        if (tanks.isEmpty()) {
            tanks.add(new Tank("T-34", "USSR", 76.2, 45, 55, 5, null));
            tanks.add(new Tank("Panther", "Germany", 75.0, 85, 46, 5, null));
        }
    }

   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Tank> getAllTanks() {
        return tanks; 
    }

   
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTank(Tank tank) {
        tanks.add(tank);
        return Response.status(Response.Status.CREATED).entity("Tank added successfully").build();
    }

    @Path("/{name}")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    
    public Response updateTank(@PathParam("name") String name, Tank updatedTank) {
        for (Tank tank : tanks) {
            if (tank.getName().equalsIgnoreCase(name)) {
                tank.setCountry(updatedTank.getCountry());
                tank.setGunCaliber(updatedTank.getGunCaliber());
                tank.setFrontArmor(updatedTank.getFrontArmor());
                tank.setSpeed(updatedTank.getSpeed());
                tank.setCrew(updatedTank.getCrew());
                tank.setPicture(updatedTank.getPicture());
                return Response.ok("Tank updated successfully").build();
            }
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Tank not found").build();
    }


    @DELETE
    @Path("/{name}")
    public Response deleteTank(@PathParam("name") String name) {
        boolean removed = tanks.removeIf(tank -> tank.getName().equalsIgnoreCase(name));
        if (removed) {
            return Response.ok("Tank deleted successfully").build();
        }
        return Response.status(Response.Status.NOT_FOUND).entity("Tank not found").build();
    }
}

