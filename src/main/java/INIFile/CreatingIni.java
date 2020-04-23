package INIFile;

import java.io.File;
import java.io.IOException;

import org.ini4j.Wini;

public class CreatingIni {
	
public CreatingIni() throws IOException {
	Wini ini = new Wini(new File("C:\\Users\\hp\\Documents\\HP eclipse workspace\\injectJS\\iniFolder\\myinifile.ini"));
    
    ini.put("Test Block", "Xpath", "//dev[2]");
    ini.put("Test Block", "ID", 45.6);
    ini.store();
	
}

}
