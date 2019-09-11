/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author alunoces
 */
@WebService(serviceName = "Soma")
@Stateless()
public class Soma {

        /**
     * Operação de Web service
     */
    @WebMethod(operationName = "somar")
    public int somar(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
       int resultado = numero1 + numero2;
               
        return resultado;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "subtracao")
    public int operação(@WebParam(name = "numero3") int numero3, @WebParam(name = "numero4") int numero4) {
        int sub = numero3 - numero4;
        return sub;
    }
    
    @WebMethod(operationName = "multiplicacao")
    public int multiplicacao(@WebParam(name = "numero5")int numero5, @WebParam(name = "numero6") int numero6){
        int mult = numero5 * numero6;
        return mult;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "divisao")
    public Float divisao(@WebParam(name = "numero7") float numero7, @WebParam(name = "numero8") float numero8) {
       float div = numero7 / numero8;
        return div;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "resto")
    public Double resto(@WebParam(name = "numero9") double numero9, @WebParam(name = "numero10") double numero10) {
        double res = numero9 % numero10;
        return res;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "Media")
    public float Media(@WebParam(name = "num1") float num1, @WebParam(name = "num2") float num2, @WebParam(name = "num3") float num3) {
        float media = (num1 + num2 + num3) / 3;
        return media;
    }

    /**
     * Operação de Web service
     */
    @WebMethod(operationName = "conversao")
    public int conversao(@WebParam(name = "tipo1") String tipo1, @WebParam(name = "tipo2") String tipo2) {
        int convert  = Integer.parseInt(tipo1) + Integer.parseInt(tipo2);
        return convert;
    }
    
    
    
    
}
