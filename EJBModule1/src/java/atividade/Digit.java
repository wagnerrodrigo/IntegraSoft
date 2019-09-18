/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author alunoces
 */
@WebService(serviceName = "digitar")
@Stateless()
public class Digit {

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "digitarNumero")
    public int digitarNumero(@WebParam(name = "numero") int numero) {
        String text = "nao esta no intervao";
        System.out.println("O maior é: " + text);
        if(numero < 10)
            return numero;
        else
            return numero;
        
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "comparar")
    public int comparar(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
      if(numero1 < numero2)
               return numero2;
          return numero1;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "transformar")
    public float operação(@WebParam(name = "transfor") float transfor) {
        //TODO write your implementation code here:
      return (float) (5.0/9.0*(transfor-32));
    }
    
     @WebMethod(operationName = "tabuada")
    public String tabuada(@WebParam(name = "num") int num) {
        String resposta = "";
        System.out.println("Tabuda do numero " + num );
        for(int i = 1; i <= 10; i++){
            resposta =  i + " x " + num + " = " + i * num;
            System.out.println(resposta);            
        }
        return resposta;
        
        
    }

   
  
}

