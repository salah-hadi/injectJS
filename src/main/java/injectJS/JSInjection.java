package injectJS;

import org.openqa.selenium.JavascriptExecutor;

public class JSInjection {

	public void inject() {
		JavascriptExecutor js=(JavascriptExecutor) Config.driver;
		js.executeScript("var s=window.document.createElement('script');" + 
				"s.src='http://127.0.0.1/index.js';" + 
				"window.document.head.appendChild(s);");
	}
	
}
