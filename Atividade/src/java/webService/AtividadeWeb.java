/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author alunoces
 */
@WebService(serviceName = "AtividadeWeb")
@Stateless()
public class AtividadeWeb {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "opera\u00e7\u00e3o")
    public int operação(@WebParam(name = "Valor1") int Valor1) {
        if(Valor1  <= 10){
            return Valor1;
        }
        return Valor1;
    }
     @WebMethod(operationName = "Valor_intervalo_entre 1 a 10")
    public int somar(@WebParam(name = "numero1") int numero1,  @WebParam(name = "numero2") String txt) {
     
        if(numero1 <= 10){
         return numero1;
        }
        return numero1 ;
    }

    /**
     * Operação de Web service
     */
//    @WebMethod(operationName = "comparar")
//    public Integer comparar(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
//        //TODO write your implementation code here:
//        String resp;
//        
//        if(numero1 == numero2)
//             System.out.println(" O Numero "+numero1+ "é iguial a " + numero2);
//        System.out.println(" O Numero "+numero1+ "não iguial a " + numero2);
//       return ;
//    }
    
}
