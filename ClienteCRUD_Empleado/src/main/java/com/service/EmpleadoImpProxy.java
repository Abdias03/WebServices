package com.service;

public class EmpleadoImpProxy implements com.service.EmpleadoImp {
  private String _endpoint = null;
  private com.service.EmpleadoImp empleadoImp = null;
  
  public EmpleadoImpProxy() {
    _initEmpleadoImpProxy();
  }
  
  public EmpleadoImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initEmpleadoImpProxy();
  }
  
  private void _initEmpleadoImpProxy() {
    try {
      empleadoImp = (new com.service.EmpleadoImpServiceLocator()).getEmpleadoImpPort();
      if (empleadoImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)empleadoImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)empleadoImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (empleadoImp != null)
      ((javax.xml.rpc.Stub)empleadoImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.EmpleadoImp getEmpleadoImp() {
    if (empleadoImp == null)
      _initEmpleadoImpProxy();
    return empleadoImp;
  }
  
  public void delete(int arg0) throws java.rmi.RemoteException{
    if (empleadoImp == null)
      _initEmpleadoImpProxy();
    empleadoImp.delete(arg0);
  }
  
  public void registro(com.service.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoImp == null)
      _initEmpleadoImpProxy();
    empleadoImp.registro(arg0);
  }
  
  public com.service.Empleado lectura(int arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (empleadoImp == null)
      _initEmpleadoImpProxy();
    return empleadoImp.lectura(arg0, arg1);
  }
  
  public void actualizar(com.service.Empleado arg0) throws java.rmi.RemoteException{
    if (empleadoImp == null)
      _initEmpleadoImpProxy();
    empleadoImp.actualizar(arg0);
  }
  
  
}