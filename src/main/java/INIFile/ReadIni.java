package INIFile;

import java.io.File;
import java.io.IOException;

import org.ini4j.InvalidFileFormatException;
import org.ini4j.Wini;

public class ReadIni {
	public ReadIni() throws InvalidFileFormatException, IOException {
		Wini ini = new Wini(new File("C:\\Users\\hp\\Documents\\HP eclipse workspace\\injectJS\\iniFolder\\myinifile.ini"));
		
        double id = ini.get("Test Block", "ID", double.class);
        String xpath = ini.get("Test Block", "Xpath", String.class);
        
        
        System.out.print("Age: " + id + "\n");
        System.out.print("Xpath: " + xpath + "\n");
	}

}
