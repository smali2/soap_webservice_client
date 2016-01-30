
/**
 * CalculatorServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.3  Built on : Jun 27, 2015 (11:17:49 BST)
 */

    package com.cp8202.project.calc;

    /**
     *  CalculatorServiceCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class CalculatorServiceCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public CalculatorServiceCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public CalculatorServiceCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for subtractNumbers method
            * override this method for handling normal response from subtractNumbers operation
            */
           public void receiveResultsubtractNumbers(
                    com.cp8202.project.calc.CalculatorServiceStub.SubtractNumbersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from subtractNumbers operation
           */
            public void receiveErrorsubtractNumbers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for multiplyNumbers method
            * override this method for handling normal response from multiplyNumbers operation
            */
           public void receiveResultmultiplyNumbers(
                    com.cp8202.project.calc.CalculatorServiceStub.MultiplyNumbersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from multiplyNumbers operation
           */
            public void receiveErrormultiplyNumbers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for add method
            * override this method for handling normal response from add operation
            */
           public void receiveResultadd(
                    com.cp8202.project.calc.CalculatorServiceStub.AddResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from add operation
           */
            public void receiveErroradd(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for divideNumbers method
            * override this method for handling normal response from divideNumbers operation
            */
           public void receiveResultdivideNumbers(
                    com.cp8202.project.calc.CalculatorServiceStub.DivideNumbersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from divideNumbers operation
           */
            public void receiveErrordivideNumbers(java.lang.Exception e) {
            }
                


    }
    