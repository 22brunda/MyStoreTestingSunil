$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signin.feature");
formatter.feature({
  "line": 2,
  "name": "As a end User I should able to Signin to the Application",
  "description": "",
  "id": "as-a-end-user-i-should-able-to-signin-to-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Signin"
    }
  ]
});
formatter.before({
  "duration": 3043794745,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Trying to Login to the Application",
  "description": "",
  "id": "as-a-end-user-i-should-able-to-signin-to-the-application;trying-to-login-to-the-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@ValidSignin"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Mystore Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I Enter Valid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should able to see the MyAddress page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.i_am_on_Mystore_Home_Page()"
});
formatter.result({
  "duration": 13971167772,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.i_Enter_Valid_Credentials()"
});
formatter.result({
  "duration": 49191349823,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"id\",\"selector\":\"email\"}\n  (Session info: chrome\u003d69.0.3497.92)\n  (Driver info: chromedriver\u003d2.38.552522 (437e6fbedfa8762dec75e2c5b3ddb86763dc9dcb),platform\u003dLinux 3.19.0-80-generic x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027qt\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00273.19.0-80-generic\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.38.552522 (437e6fbedfa876..., userDataDir: /tmp/.org.chromium.Chromium...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 69.0.3497.92, webStorageEnabled: true}\nSession ID: 6755fb0154e1cfcfcec1f4c01c95208e\n*** Element info: {Using\u003did, value\u003demail}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:317)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:363)\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:309)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.clear(Unknown Source)\n\tat com.qwinix.onlinetimesheet.qa.page.SignInPage.clearField(SignInPage.java:97)\n\tat com.qwinix.onlinetimesheet.qa.page.SignInPage.verifyLoginWithValidCred(SignInPage.java:73)\n\tat com.qwinix.onlinetimesheet.qa.steps.SignInSteps.i_Enter_Valid_Credentials(SignInSteps.java:26)\n\tat ✽.When I Enter Valid Credentials(signin.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "SignInSteps.i_should_able_to_see_the_MyAddress_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?controller\u003dmy-account");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 224669911,
  "status": "passed"
});
});