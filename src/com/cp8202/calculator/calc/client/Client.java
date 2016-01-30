# BY Syed Muhammad Ali - sm2ali@uwaterloo.ca

package com.cp8202.calculator.calc.client;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import com.cp8202.project.calc.CalculatorServiceStub;
import com.cp8202.project.calc.CalculatorServiceStub.Add;
import com.cp8202.project.calc.CalculatorServiceStub.AddResponse;
import com.cp8202.project.calc.ConverterServiceStub;
import com.cp8202.project.calc.ConverterServiceStub.CelsiusToFahrenheit;
import com.cp8202.project.calc.ConverterServiceStub.CelsiusToFahrenheitResponse;
import com.cp8202.project.calc.MemoryStoreServiceStub;
import com.cp8202.project.calc.MemoryStoreServiceStub.RetrieveMemory;
import com.cp8202.project.calc.MemoryStoreServiceStub.RetrieveMemoryResponse;
import com.cp8202.project.calc.MemoryStoreServiceStub.SaveMemory;

public class Client {

	public static void main(String[] args) throws Exception {
		
		System.out.println("CalculatorService Test");
		CalculatorServiceStub calc = new CalculatorServiceStub();
		Add add = new Add();
		add.setValue1(10);
		add.setValue2(9); 
		AddResponse addition = calc.add(add); 
		System.out.println("The answer of 10+9 is : "+addition.get_return());
		
		System.out.println("ConverterService Test");
		ConverterServiceStub conv = new ConverterServiceStub();
		CelsiusToFahrenheit ctf = new CelsiusToFahrenheit(); 
		ctf.setParam1(20);
		CelsiusToFahrenheitResponse conversion = conv.celsiusToFahrenheit(ctf);
		System.out.println("20 C is supposed to be 68 F, testing: "+conversion.get_return());
		
		System.out.println("MemoryStoreService Test");
		MemoryStoreServiceStub mem = new MemoryStoreServiceStub();
		System.out.println("Now storing 100 into memory.");
		SaveMemory save = new SaveMemory(); 
		save.setParam(100);
		System.out.println("Testing if 100 was really passed successfully to SaveMemory object: "+save.getParam());
		mem.saveMemory(save); 
		System.out.println("Now retrieving memory using retrieval method.");
		RetrieveMemory retr = new RetrieveMemory();
		RetrieveMemoryResponse retr_m = mem.retrieveMemory(retr); 
		System.out.println("Now retreiving from memory: "+retr_m.get_return()+" The code is technically correct because it works in a JSP setting as shown on the browser, however, it seems that the way Stubs are created the SaveMemoryStub is not saving to the same object where RetrieveMemoryStub is retrieving. ");
		
		System.out.println("End of tests.");
		
		
		
		
	}

}
