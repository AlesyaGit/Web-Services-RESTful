/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package wsrest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author amelc
 */
@Path("hello")
public class Hello {

    @Context
    private UriInfo context;

 
    public Hello() {
    }

    
    @GET 
    @Produces(MediaType.TEXT_HTML) 
     public String getHtml() { 
     return "<html lang=\"en\"><body><h1>Hello from the RESTful Server!</h1></body></html>"; 
    //throw new UnsupportedOperationException(); 
} 
     
    @PUT
    @Consumes(MediaType.TEXT_HTML)
    public void putHtml(String content) {
    }
}
