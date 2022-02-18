package testJunitWithAnt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMessageUtil {

	String message = "Robert";	

   @Test
   public void testPrintMessage() {	
	   MessageUtil messageUtil = new MessageUtil(message);
	   
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message,messageUtil.printMessage());
   }

   @Test
   public void testSalutationMessage() {
	   MessageUtil messageUtil = new MessageUtil(message);
	   
      System.out.println("Inside testSalutationMessage()");
      message = "Hi!" + "Robert";
      assertEquals(message,messageUtil.salutationMessage());
   }
}
