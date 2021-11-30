/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.arquitectura.examen1cliente.service;

import ec.edu.espe.arquitectura.examen1cliente.wsdl.ComprarBoletoRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ComprarBoletoResponse;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ListarLocalidadesDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ListarLocalidadesResponse;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesRequest;
import ec.edu.espe.arquitectura.examen1cliente.wsdl.ObtenerPartidosDisponiblesResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Service
public class PartidoService extends WebServiceGatewaySupport {

    private String endpoint = "http://localhost:8080/ws/examen1.wsdl";

    public ListarLocalidadesResponse listarLocalidadesDisponibles(ListarLocalidadesDisponiblesRequest request) {

        ListarLocalidadesResponse response = (ListarLocalidadesResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }

    public ObtenerPartidosDisponiblesResponse listarPartidosDisponibles(ObtenerPartidosDisponiblesRequest request) {

        ObtenerPartidosDisponiblesResponse response = (ObtenerPartidosDisponiblesResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }

    public ComprarBoletoResponse comprarBoleto(ComprarBoletoRequest request) {

        ComprarBoletoResponse response = (ComprarBoletoResponse) getWebServiceTemplate().marshalSendAndReceive(endpoint, request);
        return response;
    }
}
