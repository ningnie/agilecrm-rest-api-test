package com.zuora.test.exam.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.zuora.test.exam.util.PropertiesUtil;
import com.zuora.test.exam.util.TestBase;



public class DealsTest extends TestBase {

    /**
     * This case is just an example on how to use Unirest to send Rest request, and get the Rest
     * response. However, Unirest is not the only choice. You can use any tool that you are 
     * familiar with, e.g. httpclient. pom.xml need to be updated accordingly when you changed tool.
     * 
     * @throws UnirestException
     */
	public static String getValue(String value)
	{
		return PropertiesUtil.getValue(value);
		
	}
	
	public String userName, passWordValid,passWordInValid;
	public String listDeals_getData,listDeals_url;
	public String createDeals_postData,createDeals_postDataWrongFormat,createDeals_url;
	public String updateDeals_putData,updateDeals_putDataWrongFormat,updateDeals_url;
	public String deleteDeals_deleteData,deleteDeals_deleteDataWrongFormat,deleteDeals_url;
	
	@BeforeTest
	public void testPrepares(){
		 //read property file 
		 PropertiesUtil.getTestProperties();
		 
		 //public data
		 passWordValid = getValue("passWordValid");
         passWordInValid = getValue("passWordInValid");
         userName = getValue("userName");
         
		 //listDeals data		 
		 listDeals_getData=getValue("listDeals.getDataTemp");
         listDeals_url = getValue("listDeals.url");

         //createDealsData
     	 createDeals_postData=getValue("createDeals.postData");
     	 createDeals_postDataWrongFormat=getValue("createDeals.postDataWrongFormat");
     	 createDeals_url = getValue("createDeals.url");
     	 //updateDealsData
     	 updateDeals_putData = getValue("updateDeals.putData");
     	 updateDeals_putDataWrongFormat = getValue("updateDeals.putDataWrongFormat");
     	 updateDeals_url = getValue("updateDeals.url");
     	 //deleteDealsData
     	 deleteDeals_url = getValue("deleteDeals.url");
     	 
	}
	
	    @Test(priority = 4)
	    public void testListDealsValid() throws UnirestException {
	
	
	        System.out.println("----listing Deals APIs:the first case: valid parameters are input----"+"\n");              
	        TestBase.executeGetCommonCases(listDeals_getData, userName, passWordValid, listDeals_url, 200);
	        
	    }
	    @Test(priority = 5)
	    public void testListDealsInValid() throws UnirestException {   	
	        System.out.println("----listing Deals APIs:the second case: invalid password is input----"+"\n");
	        TestBase.executeGetCommonCases(listDeals_getData, userName, passWordInValid, listDeals_url, 401);
	      
	    }
	    @Test(priority = 1)
	    	public void testCreateDealsValid() throws UnirestException {
	       	System.out.println("----Create Deals APIs:the first case: valid parameters are input----"+"\n");
	        TestBase.executePostCommonCases(createDeals_postData, createDeals_url,userName, passWordValid, 200);
	     }
	    @Test(priority = 2)
	    	public void testCreateDealsInvalid() throws UnirestException {
	
	        System.out.println("----Create Deals APIs:the second case: invalid password is input----"+"\n");
	        TestBase.executePostCommonCases(createDeals_postData, createDeals_url, userName, passWordInValid, 401);
	    }
	    @Test(priority = 3)
	    //if run the test cases continuously, the connections can't be connected, bug?
	    public void testCreateDealsWrongFormat() throws UnirestException {
	
	       System.out.println("----Create Deals APIs:the third case: wrong format data is input----"+"\n");
	       TestBase.executePostCommonCases(createDeals_postDataWrongFormat, createDeals_url,userName, passWordValid,  400);
	    }
	    @Test(priority = 6)
	    public void updateDealValid() throws UnirestException {
	        System.out.println("----update Deals APIs:the first case: valid parameters are input----"+"\n");
	        TestBase.executePutCommonCases(updateDeals_putData, userName, passWordValid, createDeals_url, 200);
	        /*since I input a valid deal ID which listed by another API, so I don't know why the update can't be executed.*/
	    } 
	    @Test(priority = 7)
	    public void updateDealInValid() throws UnirestException {
	        System.out.println("----update Deals APIs:the second case: invalid password is input----"+"\n");
	        TestBase.executePutCommonCases(updateDeals_putData, userName, passWordInValid, createDeals_url, 401);
	     
	    } 
	    @Test(priority = 8)
	    public void updateDealWrongFormat() throws UnirestException {
	        System.out.println("----update Deals APIs:the third case: wrong format data is input----"+"\n");
	        TestBase.executePutCommonCases(updateDeals_putDataWrongFormat, userName, passWordValid, createDeals_url, 400);      
	        System.out.println("here is a bug");
	        
	    }
	    @Test(priority = 10)
	    public void deleteDealValid() throws UnirestException {
	        System.out.println("----delete Deals APIs:the first case: valid parameters are input----"+"\n");
	        TestBase.executeDeleteCommonCases(deleteDeals_deleteData, userName, passWordValid, deleteDeals_url, 204);
	        
	    } 
	    @Test(priority = 9)
	    public void deleteDealInValid() throws UnirestException {
	        System.out.println("----delete Deals APIs:the first case: invalid password are input----"+"\n");
	        TestBase.executeDeleteCommonCases(deleteDeals_deleteData, userName, passWordInValid, deleteDeals_url, 401);
	    } 

}
    
    

