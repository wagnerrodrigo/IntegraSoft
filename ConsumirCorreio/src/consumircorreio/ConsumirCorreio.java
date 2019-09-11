/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumircorreio;

import org.tempuri.CResultado;
import org.tempuri.CServico;
import java.util.List;

/**
 *
 * @author alunoces
 */
public class ConsumirCorreio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        CResultado res = calcPrazo("40010","36088000","36201502");
//        List<CServico> list = res.getServicos().getCServico();
//        for(CServico c: list){
//            if(c.getErro().equals("")){
//                System.out.println("Prazo de entrega " + c.getPrazoEntrega());
//                System.out.println("Entrega domicilio " + c.getEntregaDomiciliar());
//                System.out.println("Entrega no Sabado " + c.getEntregaSabado());
//            }else{
//                System.out.println("Erro da web serviso" + c.getMsgErro());
//            }
//        }

            CResultado calpd = calcPrazoData("40010","36088000","36201502","06/09/2019");
             List<CServico> list = calpd.getServicos().getCServico();
             for(CServico c: list){
                 if(c.getErro().equals("")){
                     System.out.println("Prazo de entrega " + c.getEntregaDomiciliar());
                     System.out.println("Entrega domicilio " + c.getEntregaDomiciliar());
                     System.out.println("Entrega no Sabado " + c.getEntregaSabado());
                     System.out.println("Entrega data de entrega " + c.getDataMaxEntrega());
                     
                 }
             }
        
    }

    private static CResultado calcPrazo(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino) {
        org.tempuri.CalcPrecoPrazoWS service = new org.tempuri.CalcPrecoPrazoWS();
        org.tempuri.CalcPrecoPrazoWSSoap port = service.getCalcPrecoPrazoWSSoap();
        return port.calcPrazo(nCdServico, sCepOrigem, sCepDestino);
    }

    private static CResultado calcPrazoData(java.lang.String nCdServico, java.lang.String sCepOrigem, java.lang.String sCepDestino, java.lang.String sDtCalculo) {
        org.tempuri.CalcPrecoPrazoWS service = new org.tempuri.CalcPrecoPrazoWS();
        org.tempuri.CalcPrecoPrazoWSSoap port = service.getCalcPrecoPrazoWSSoap();
        return port.calcPrazoData(nCdServico, sCepOrigem, sCepDestino, sDtCalculo);
    }
    
}
