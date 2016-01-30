
/**
 * ConverterServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package com.cp8202.project.calc;

    /**
     *  ConverterServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ConverterServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ConverterServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ConverterServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for yardToMetre method
            * override this method for handling normal response from yardToMetre operation
            */
           public void receiveResultyardToMetre(
                    com.cp8202.project.calc.ConverterServiceStub.YardToMetreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from yardToMetre operation
           */
            public void receiveErroryardToMetre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for metreToFeet method
            * override this method for handling normal response from metreToFeet operation
            */
           public void receiveResultmetreToFeet(
                    com.cp8202.project.calc.ConverterServiceStub.MetreToFeetResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from metreToFeet operation
           */
            public void receiveErrormetreToFeet(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for fahrenheitToCelsius method
            * override this method for handling normal response from fahrenheitToCelsius operation
            */
           public void receiveResultfahrenheitToCelsius(
                    com.cp8202.project.calc.ConverterServiceStub.FahrenheitToCelsiusResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from fahrenheitToCelsius operation
           */
            public void receiveErrorfahrenheitToCelsius(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for metreToYard method
            * override this method for handling normal response from metreToYard operation
            */
           public void receiveResultmetreToYard(
                    com.cp8202.project.calc.ConverterServiceStub.MetreToYardResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from metreToYard operation
           */
            public void receiveErrormetreToYard(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for feetToMetre method
            * override this method for handling normal response from feetToMetre operation
            */
           public void receiveResultfeetToMetre(
                    com.cp8202.project.calc.ConverterServiceStub.FeetToMetreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from feetToMetre operation
           */
            public void receiveErrorfeetToMetre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for kilogramtoPound method
            * override this method for handling normal response from kilogramtoPound operation
            */
           public void receiveResultkilogramtoPound(
                    com.cp8202.project.calc.ConverterServiceStub.KilogramtoPoundResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from kilogramtoPound operation
           */
            public void receiveErrorkilogramtoPound(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mileToKilometre method
            * override this method for handling normal response from mileToKilometre operation
            */
           public void receiveResultmileToKilometre(
                    com.cp8202.project.calc.ConverterServiceStub.MileToKilometreResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mileToKilometre operation
           */
            public void receiveErrormileToKilometre(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for poundToKilogram method
            * override this method for handling normal response from poundToKilogram operation
            */
           public void receiveResultpoundToKilogram(
                    com.cp8202.project.calc.ConverterServiceStub.PoundToKilogramResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from poundToKilogram operation
           */
            public void receiveErrorpoundToKilogram(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for celsiusToFahrenheit method
            * override this method for handling normal response from celsiusToFahrenheit operation
            */
           public void receiveResultcelsiusToFahrenheit(
                    com.cp8202.project.calc.ConverterServiceStub.CelsiusToFahrenheitResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from celsiusToFahrenheit operation
           */
            public void receiveErrorcelsiusToFahrenheit(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for kilometreToMile method
            * override this method for handling normal response from kilometreToMile operation
            */
           public void receiveResultkilometreToMile(
                    com.cp8202.project.calc.ConverterServiceStub.KilometreToMileResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from kilometreToMile operation
           */
            public void receiveErrorkilometreToMile(java.lang.Exception e) {
            }
                


    }
    