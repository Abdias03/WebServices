/**
 * Empleado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public class Empleado  implements java.io.Serializable {
    private java.lang.String departamento;

    private java.lang.String edad;

    private java.lang.String nombre;

    private int numeroid;

    public Empleado() {
    }

    public Empleado(
           java.lang.String departamento,
           java.lang.String edad,
           java.lang.String nombre,
           int numeroid) {
           this.departamento = departamento;
           this.edad = edad;
           this.nombre = nombre;
           this.numeroid = numeroid;
    }


    /**
     * Gets the departamento value for this Empleado.
     * 
     * @return departamento
     */
    public java.lang.String getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this Empleado.
     * 
     * @param departamento
     */
    public void setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the edad value for this Empleado.
     * 
     * @return edad
     */
    public java.lang.String getEdad() {
        return edad;
    }


    /**
     * Sets the edad value for this Empleado.
     * 
     * @param edad
     */
    public void setEdad(java.lang.String edad) {
        this.edad = edad;
    }


    /**
     * Gets the nombre value for this Empleado.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Empleado.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numeroid value for this Empleado.
     * 
     * @return numeroid
     */
    public int getNumeroid() {
        return numeroid;
    }


    /**
     * Sets the numeroid value for this Empleado.
     * 
     * @param numeroid
     */
    public void setNumeroid(int numeroid) {
        this.numeroid = numeroid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Empleado)) return false;
        Empleado other = (Empleado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.edad==null && other.getEdad()==null) || 
             (this.edad!=null &&
              this.edad.equals(other.getEdad()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            this.numeroid == other.getNumeroid();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getEdad() != null) {
            _hashCode += getEdad().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        _hashCode += getNumeroid();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Empleado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.com/", "empleado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
