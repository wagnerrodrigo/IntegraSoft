/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicoREST;

import Escola.Aluno;
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
@Path("/aluno")
public class ServicoAluno {
   @GET
    @Produces(MediaType.APPLICATION_XML)
    public List <Aluno> getTimes(){
        List<Aluno> alunos = new ArrayList<Aluno>();
        alunos.add(new Aluno(1,"Wagner","Santa Cruz","AV Doutor simeao"));
        alunos.add(new Aluno(2,"Wagner","Santa Cruz","AV Doutor simeao"));
        
        return alunos;
    }
}
