package com.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;
import static org.junit.Assert.assertThat;


public class BrowserTest {
	
	
	private WebDriver driver;
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:/ECLIPSE_WORKSPACE/chromedriver.exe");
		//String driverPath = System.getProperty("user.dir");
		
		ChromeOptions options = new ChromeOptions()
			.setHeadless(true);
		
		driver = new ChromeDriver(options);
	}
	

	@After
	public void tearDown()
	{
		driver.close();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testGooglePage()
	{
		
		/*
		 driver.get("http://150.238.42.188:32591/");
		 
		     String exp_text = "Guestbook - v4";
	         WebElement exp_value = driver.findElement(By.xpath(".//div[@id='header']/h1[1]"));
	         String screen_text = exp_value.getText();
	         //String screen_text = search_button.getAttribute("value");
             System.out.println(screen_text);
             
	         Assert.assertEquals("******** TEXT MISMATCH::  "+exp_text+" IS NOT EQUAL TO "+ screen_text+" ********",exp_text, screen_text);
	      */
		
		// OPENSHIFT-CANARY TESTING
				 driver.get("http://app-main-url-canarydeployment.apps.us-east-2.starter.openshift-online.com/");
				 
				     String exp_text = "Stable-Version";
			         WebElement exp_value = driver.findElement(By.xpath(".//html[1]/body[1]"));
			         String screen_text = exp_value.getText();
			         //String screen_text = search_button.getAttribute("value");
		             //System.out.println(screen_text);
		             
		             boolean b=false;
		             if(screen_text.contains(exp_text))
		             {
		            	 b=true;
		            
		             }
		           
				
		             String msg="******** TEXT COMPARISON UN-SUCCESSFULL ::  "+exp_text+" IS NOT PRESENT IN "+ screen_text+" ********";
		             Assert.assertTrue(msg,b );
	         /*
	      // Create object of Property file
	         Properties props = new Properties();
	         props.put("mail.smtp.host", "smtp.gmail.com");
	         props.put("mail.smtp.socketFactory.port", "465");
	         props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
	         props.put("mail.smtp.auth", "true");
	         props.put("mail.smtp.port", "465");

	         // This will handle the complete authentication
	         Session session = Session.getDefaultInstance(props,

	           new javax.mail.Authenticator() {

	            protected PasswordAuthentication getPasswordAuthentication() {

	            return new PasswordAuthentication("sayom4u@gmail.com", "calculas1");

	            }

	           });
	         
	         try {

	        	   // Create object of MimeMessage class
	        	   Message message = new MimeMessage(session);
	        	   message.setFrom(new InternetAddress("sayom4u@gmail.com"));
	        	   message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("sayom4u@gmail.com"));
	        	   message.setSubject("Test Report");

	        	   // Create object to add multimedia type content
	        	   BodyPart messageBodyPart1 = new MimeBodyPart();
	        	   messageBodyPart1.setText("Functional Test Report");

	        	   // Create another object to add another content
	        	   MimeBodyPart messageBodyPart2 = new MimeBodyPart();
	        	   String filename = "/target/site/surefire-report.html";

	        	   // Create data source and pass the filename
	        	   DataSource source = new FileDataSource(filename);

	        	   // set the handler
	        	   messageBodyPart2.setDataHandler(new DataHandler(source));

	        	   // set the file
	        	   messageBodyPart2.setFileName(filename);

	        	   // Create object of MimeMultipart class
	        	   Multipart multipart = new MimeMultipart();

	        	   // add body part 1
	        	   multipart.addBodyPart(messageBodyPart2);

	        	   // add body part 2
	        	   multipart.addBodyPart(messageBodyPart1);

	        	   // set the content
	        	   message.setContent(multipart);

	        	   // finally send the email
	        	   Transport.send(message);

	        	   System.out.println("=====Email Sent=====");
	                  } catch (MessagingException e) {

	        	   throw new RuntimeException(e);

	        	  }
	*/         
	}
	
	
	
}
