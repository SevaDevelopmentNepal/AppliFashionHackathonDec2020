package applitoolstesting.CommonUtilities;

import com.applitools.eyes.BatchInfo;
import com.applitools.eyes.MatchLevel;
import com.applitools.eyes.selenium.BrowserType;
import com.applitools.eyes.selenium.Configuration;
import com.applitools.eyes.selenium.Eyes;
import com.applitools.eyes.visualgrid.model.DeviceName;
import com.applitools.eyes.visualgrid.model.ScreenOrientation;

public class BaseSetUp {
	
	CommonParameters setParameter = new CommonParameters();
	
	int viewPortWidth = 1200;
	int viewPortHeight = 800;
	
	public void browserConfigurationForChrome(Eyes eyes, BatchInfo batch) {
		
		// Initialize eyes Configuration
		Configuration config = new Configuration();
		
		// Add chrome browser while setting api-key, app-name and batch
		config.addBrowser(viewPortWidth, viewPortHeight, BrowserType.CHROME)
			.setEnvironmentName(setParameter.chromeBrowser)
			.setMatchLevel(MatchLevel.CONTENT)
			.setApiKey(setParameter.apiKey)
			.setAppName(setParameter.appName)
			.setBatch(batch);
		
		// Set the configuration object to eyes
		eyes.setConfiguration(config);
	}
	
	public void browserConfigurationsForAllBrowsers(Eyes eyes, BatchInfo batch) {
			
		Configuration config = new Configuration();
		
		// Add different browsers while setting api-key, app-name and batch
		config.addBrowser(viewPortWidth, viewPortHeight, BrowserType.CHROME)
			.addBrowser(viewPortWidth, viewPortHeight, BrowserType.FIREFOX)
			.addBrowser(viewPortWidth, viewPortHeight, BrowserType.EDGE_CHROMIUM)
			.addBrowser(viewPortWidth, viewPortHeight, BrowserType.SAFARI)
			.addDeviceEmulation(DeviceName.iPhone_X, ScreenOrientation.PORTRAIT)
			.setEnvironmentName("Cross platform")
			.setMatchLevel(MatchLevel.CONTENT)
			.setApiKey(setParameter.apiKey)
			.setAppName(setParameter.appName)
			.setBatch(batch);
		
		eyes.setConfiguration(config);
	}
}
