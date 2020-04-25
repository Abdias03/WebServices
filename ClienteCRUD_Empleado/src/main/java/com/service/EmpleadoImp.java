/**
 * EmpleadoImp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public interface EmpleadoImp extends java.rmi.Remote {
    public void delete(int arg0) throws java.rmi.RemoteException;
    public void registro(com.service.Empleado arg0) throws java.rmi.RemoteException;
    public com.service.Empleado lectura(int arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public void actualizar(com.service.Empleado arg0) throws java.rmi.RemoteException;
}
