package org.test1;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class EmployeeConversion {
	public static void main(String[] args) throws JAXBException {
		JAXBContext ja= JAXBContext.newInstance(employee.class);
		Unmarshaller un = ja.createUnmarshaller();
		File f=new File("C:\\Users\\jegan\\eclipse-workspace\\MavenSample\\src\\test\\java\\org\\test1\\Emp.xml");
		Object o = un.unmarshal(f);
		employee e=(employee)o;
		System.out.println("The Employee Name is "+e.getName());
		System.out.println("The Employee Id is "+e.getId());
		System.out.println("The Employee PhoneNumber is "+e.getPhno());
		System.out.println("The Employee City is "+e.getCity());
	}

}
