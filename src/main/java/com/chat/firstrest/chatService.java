/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chat.firstrest;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;
/**
 *
 * @author ayman
 */
@Path("chater")
public class chatService {
    @GET
    @Path("hello")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String helloworld()
    {
        
        JSONObject obj = new JSONObject();
        obj.append("name", "foo");        
        obj.append("surname", "too");
        obj.append("age", "15");

        System.out.println(obj);
        return obj.toString();
    }
}
