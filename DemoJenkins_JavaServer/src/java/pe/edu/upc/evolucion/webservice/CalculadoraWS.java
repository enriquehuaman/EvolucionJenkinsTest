/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upc.evolucion.webservice;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upc.evolucion.logica.Calculadora;

/**
 *
 * @author ehaquique
 */
@WebService(serviceName = "CalculadoraWS")
public class CalculadoraWS {

    /**
     * This is a sample web service operation
     */
    

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Suma")
    public int Suma(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        return Calculadora.suma(x, y);        
    }
    
    @WebMethod(operationName = "Resta")
    public int Resta(@WebParam(name = "x") int x, @WebParam(name = "y") int y) {
        //TODO write your implementation code here:
        return Calculadora.resta(x, y);
        
    }
}
