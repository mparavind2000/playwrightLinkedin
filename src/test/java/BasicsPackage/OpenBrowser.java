package BasicsPackage;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		Browser browse= playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		Page page = browse.newPage();
		page.navigate("https://www.google.com/");
		
	}

}
