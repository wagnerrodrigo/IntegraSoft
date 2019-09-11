
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalcPrecoPrazoWSHttpPost", targetNamespace = "http://tempuri.org/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalcPrecoPrazoWSHttpPost {


    /**
     * Calcula o preço e o prazo com a data atual
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazo")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrecoPrazo(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdEmpresa")
        String nCdEmpresa,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDsSenha")
        String sDsSenha,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdFormato")
        String nCdFormato,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlComprimento")
        String nVlComprimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlAltura")
        String nVlAltura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlLargura")
        String nVlLargura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlDiametro")
        String nVlDiametro,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdMaoPropria")
        String sCdMaoPropria,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlValorDeclarado")
        String nVlValorDeclarado,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdAvisoRecebimento")
        String sCdAvisoRecebimento);

    /**
     * Calcula o preço e o prazo com uma data especificada
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazoData")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrecoPrazoData(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdEmpresa")
        String nCdEmpresa,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDsSenha")
        String sDsSenha,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdFormato")
        String nCdFormato,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlComprimento")
        String nVlComprimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlAltura")
        String nVlAltura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlLargura")
        String nVlLargura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlDiametro")
        String nVlDiametro,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdMaoPropria")
        String sCdMaoPropria,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlValorDeclarado")
        String nVlValorDeclarado,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdAvisoRecebimento")
        String sCdAvisoRecebimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDtCalculo")
        String sDtCalculo);

    /**
     * Calcula o preço e o prazo considerando as restrições de entrega
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrecoPrazoRestricao")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrecoPrazoRestricao(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdEmpresa")
        String nCdEmpresa,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDsSenha")
        String sDsSenha,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdFormato")
        String nCdFormato,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlComprimento")
        String nVlComprimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlAltura")
        String nVlAltura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlLargura")
        String nVlLargura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlDiametro")
        String nVlDiametro,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdMaoPropria")
        String sCdMaoPropria,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlValorDeclarado")
        String nVlValorDeclarado,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdAvisoRecebimento")
        String sCdAvisoRecebimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDtCalculo")
        String sDtCalculo);

    /**
     * Calcula somente o preço com a data atual
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPreco")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPreco(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdEmpresa")
        String nCdEmpresa,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDsSenha")
        String sDsSenha,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdFormato")
        String nCdFormato,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlComprimento")
        String nVlComprimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlAltura")
        String nVlAltura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlLargura")
        String nVlLargura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlDiametro")
        String nVlDiametro,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdMaoPropria")
        String sCdMaoPropria,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlValorDeclarado")
        String nVlValorDeclarado,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdAvisoRecebimento")
        String sCdAvisoRecebimento);

    /**
     * Calcula somente o preço com uma data especificada
     * 
     * @param nCdEmpresa
     * @param nVlDiametro
     * @param sCdMaoPropria
     * @param sCepDestino
     * @param nCdFormato
     * @param nVlPeso
     * @param nVlLargura
     * @param nVlComprimento
     * @param sCdAvisoRecebimento
     * @param nCdServico
     * @param sCepOrigem
     * @param nVlValorDeclarado
     * @param sDtCalculo
     * @param sDsSenha
     * @param nVlAltura
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrecoData")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrecoData(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdEmpresa")
        String nCdEmpresa,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDsSenha")
        String sDsSenha,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdFormato")
        String nCdFormato,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlComprimento")
        String nVlComprimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlAltura")
        String nVlAltura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlLargura")
        String nVlLargura,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlDiametro")
        String nVlDiametro,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdMaoPropria")
        String sCdMaoPropria,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlValorDeclarado")
        String nVlValorDeclarado,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCdAvisoRecebimento")
        String sCdAvisoRecebimento,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDtCalculo")
        String sDtCalculo);

    /**
     * Calcula somente o prazo com a data atual
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrazo")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrazo(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino);

    /**
     * Calcula somente o prazo com uma data especificada
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @param sDtCalculo
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrazoData")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrazoData(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDtCalculo")
        String sDtCalculo);

    /**
     * Calcula o prazo considerando restrição de entrega
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @param sDtCalculo
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrazoRestricao")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrazoRestricao(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sDtCalculo")
        String sDtCalculo);

    /**
     * Calcula os preços dos serviços FAC
     * 
     * @param nVlPeso
     * @param strDataCalculo
     * @param nCdServico
     * @return
     *     returns org.tempuri.CResultado
     */
    @WebMethod(operationName = "CalcPrecoFAC")
    @WebResult(name = "cResultado", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultado calcPrecoFAC(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nVlPeso")
        String nVlPeso,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "strDataCalculo")
        String strDataCalculo);

    /**
     * Calcula a data máxima de entrega de determinado objeto
     * 
     * @param codigoObjeto
     * @return
     *     returns org.tempuri.CResultadoObjeto
     */
    @WebMethod(operationName = "CalcDataMaxima")
    @WebResult(name = "cResultadoObjeto", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultadoObjeto calcDataMaxima(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "codigoObjeto")
        String codigoObjeto);

    /**
     * Lista os serviços que estão disponíveis para cálculo de preço e/ou prazo
     * 
     * @return
     *     returns org.tempuri.CResultadoServicos
     */
    @WebMethod(operationName = "ListaServicos")
    @WebResult(name = "cResultadoServicos", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultadoServicos listaServicos();

    /**
     * Lista os serviços que são calculados pelo STAR
     * 
     * @return
     *     returns org.tempuri.CResultadoServicos
     */
    @WebMethod(operationName = "ListaServicosSTAR")
    @WebResult(name = "cResultadoServicos", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultadoServicos listaServicosSTAR();

    /**
     * Método para mostrar se o trecho consultado utiliza modal aéreo ou terrestre
     * 
     * @param nCdServico
     * @param sCepDestino
     * @param sCepOrigem
     * @return
     *     returns org.tempuri.CResultadoModal
     */
    @WebMethod(operationName = "VerificaModal")
    @WebResult(name = "cResultadoModal", targetNamespace = "http://tempuri.org/", partName = "Body")
    public CResultadoModal verificaModal(
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "nCdServico")
        String nCdServico,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepOrigem")
        String sCepOrigem,
        @WebParam(name = "string", targetNamespace = "http://www.w3.org/2001/XMLSchema", partName = "sCepDestino")
        String sCepDestino);

    /**
     * Retorna a versão atual do componente
     * 
     * @return
     *     returns org.tempuri.Versao
     */
    @WebMethod
    @WebResult(name = "versao", targetNamespace = "http://tempuri.org/", partName = "Body")
    public Versao getVersao();

}
