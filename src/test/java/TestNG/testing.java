package TestNG;

import java.io.IOException;

import org.ini4j.InvalidFileFormatException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import INIFile.CreatingIni;
import INIFile.ReadIni;
import injectJS.Config;
import injectJS.JSInjection;

public class testing {

//	Config con;
//  @BeforeTest
//  public void launchBrowser() {
//	 con=new Config();
//  }
//  
//  @Test
//  public void openWebsite() {
//	  con.openWebsite("https://www.google.com/");
//  }
  
//  @Test(dependsOnMethods = {"openWebsite"})
//  public void inject() {
//	  JSInjection js=new JSInjection();
//	  js.inject();
////	  js.anotherWay();
//  }
//  @Test
//  public void writeIn() throws IOException {
//	  CreatingIni create=new CreatingIni();
//	  
//  }
	@Test
	public void readIni() throws InvalidFileFormatException, IOException {
		ReadIni read=new ReadIni();
		
	}
}
