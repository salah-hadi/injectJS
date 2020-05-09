package INIFile;

import java.io.File;
import java.io.IOException;

import org.ini4j.Wini;

public class CreatingIni {
	
public CreatingIni() throws IOException {
	Wini ini = new Wini(new File("C:\\Users\\hp\\Documents\\HP eclipse workspace\\injectJS\\iniFolder\\update.ini"));
    
    ini.put("Update", "Version", "v 1.2.3");
    ini.put("Update", "Build", "1.2.3");
    ini.store();
	
}

}
