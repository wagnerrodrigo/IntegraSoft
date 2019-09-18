/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoREST;

import Agremiacao.Time;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author alunoces
 */
@Path("/times")
public class ServicoTime {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List <Time> getTimes(){
        List<Time> times = new ArrayList<Time>();
        times.add(new Time(1,"Flamengo","RJ"));
        times.add(new Time(2,"Cruzeiro","MG"));
        times.add(new Time(3,"Sao Paulo","SP"));
        return times;
    }
}
