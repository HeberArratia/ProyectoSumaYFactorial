/**
 * SumaYFactorialServicioServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Servicio;

public class SumaYFactorialServicioServiceLocator extends org.apache.axis.client.Service implements Servicio.SumaYFactorialServicioService {

    public SumaYFactorialServicioServiceLocator() {
    }


    public SumaYFactorialServicioServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SumaYFactorialServicioServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SumaYFactorialServicio
    private java.lang.String SumaYFactorialServicio_address = "http://localhost:8080/ProyectoSumaYFactorialAPI/services/SumaYFactorialServicio";

    public java.lang.String getSumaYFactorialServicioAddress() {
        return SumaYFactorialServicio_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SumaYFactorialServicioWSDDServiceName = "SumaYFactorialServicio";

    public java.lang.String getSumaYFactorialServicioWSDDServiceName() {
        return SumaYFactorialServicioWSDDServiceName;
    }

    public void setSumaYFactorialServicioWSDDServiceName(java.lang.String name) {
        SumaYFactorialServicioWSDDServiceName = name;
    }

    public Servicio.SumaYFactorialServicio getSumaYFactorialServicio() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SumaYFactorialServicio_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSumaYFactorialServicio(endpoint);
    }

    public Servicio.SumaYFactorialServicio getSumaYFactorialServicio(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Servicio.SumaYFactorialServicioSoapBindingStub _stub = new Servicio.SumaYFactorialServicioSoapBindingStub(portAddress, this);
            _stub.setPortName(getSumaYFactorialServicioWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSumaYFactorialServicioEndpointAddress(java.lang.String address) {
        SumaYFactorialServicio_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Servicio.SumaYFactorialServicio.class.isAssignableFrom(serviceEndpointInterface)) {
                Servicio.SumaYFactorialServicioSoapBindingStub _stub = new Servicio.SumaYFactorialServicioSoapBindingStub(new java.net.URL(SumaYFactorialServicio_address), this);
                _stub.setPortName(getSumaYFactorialServicioWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SumaYFactorialServicio".equals(inputPortName)) {
            return getSumaYFactorialServicio();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Servicio", "SumaYFactorialServicioService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Servicio", "SumaYFactorialServicio"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SumaYFactorialServicio".equals(portName)) {
            setSumaYFactorialServicioEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
