/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package REST;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alunoces
 */
@Path("/primeiro")
public class PrimeiroProjeto {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String primeiro(){
        return "Meu primeiro Webservice Rest!!!!!";
    }
}
