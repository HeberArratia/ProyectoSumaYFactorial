package Servicio;

public class SumaYFactorialServicioProxy implements Servicio.SumaYFactorialServicio {
  private String _endpoint = null;
  private Servicio.SumaYFactorialServicio sumaYFactorialServicio = null;
  
  public SumaYFactorialServicioProxy() {
    _initSumaYFactorialServicioProxy();
  }
  
  public SumaYFactorialServicioProxy(String endpoint) {
    _endpoint = endpoint;
    _initSumaYFactorialServicioProxy();
  }
  
  private void _initSumaYFactorialServicioProxy() {
    try {
      sumaYFactorialServicio = (new Servicio.SumaYFactorialServicioServiceLocator()).getSumaYFactorialServicio();
      if (sumaYFactorialServicio != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)sumaYFactorialServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)sumaYFactorialServicio)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (sumaYFactorialServicio != null)
      ((javax.xml.rpc.Stub)sumaYFactorialServicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Servicio.SumaYFactorialServicio getSumaYFactorialServicio() {
    if (sumaYFactorialServicio == null)
      _initSumaYFactorialServicioProxy();
    return sumaYFactorialServicio;
  }
  
  public int factorial(int a) throws java.rmi.RemoteException{
    if (sumaYFactorialServicio == null)
      _initSumaYFactorialServicioProxy();
    return sumaYFactorialServicio.factorial(a);
  }
  
  public int sumaNumeros(int a, int b) throws java.rmi.RemoteException{
    if (sumaYFactorialServicio == null)
      _initSumaYFactorialServicioProxy();
    return sumaYFactorialServicio.sumaNumeros(a, b);
  }
  
  
}