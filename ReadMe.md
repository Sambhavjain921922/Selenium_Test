
# Amazon Automation Testing

This automation suite test various functionality of [amazon](https://www.amazon.in/ "amazon.in") website.


## Run Tests

To run the [amazon](https://www.amazon.in/ "amazon.in") automation sutite from command line in the project folder.

```bash
  mvn clean test -Dsurefire.suiteXmlFiles=testng.xml
```
or

```bash
  mvn clean test
```
### Browser Available :
- Chrome Browser
- Edge Browser 
- FireFox Browser 


### Change Browser :
To run all the test cases in Chrome Browser use `browserName = Chrome`,  Edge Browser use `browserName = Edge`and Firefox Browser use `browserName = Gecko`in `config.properties` file.


### Headless Mode :
To run all the test cases in headless mode change `Headless = False` to `Headless = True` in `config.properties` file.

>**Note:**  Only you can run Chrome Browser in headless mode

## TestNG file Description

`testng.xml` - define the tests related to different pages across the site


## Packages Description
 
 |      Package with Description                             |
 | `com.Assignment.pages`   | Defining all the pages and the respective object repository.|
 | `com.Assignment.tests`   | Defining all the tests and assertions                       |
 | `com.Assignment.utils`   | Defining all the utilities needed for the test              |

### `com.Assignment.tests` Packages Description :

- `BaseTest.java` 
  - `@BeforeMethod` - Initialise driver, open url
  - `@AfterMethod` - Take screenshots
  - `@AfterSuite`- Close report
- `ChangeLanguageTest.java` 
  - `changeLanguage()` - Test the language change case
- `HomePageTest.java`
  - `searchProduct()` - Test the functionality to search a product
  - `MobileSearch()` - Test the functionality to search Mobiles category
- `LoginTest.java`
  - `NeedHelp()` - Test the NeedHelp functionality when click on NeedHelp Button.
  - `invalidLogin()` - Test the invalidLogin functionality with valid email and invalid password
  - `ConditionOfUse()` -Test the ConditionOfUse functionality When click on ConditionOfUse
  - `NoticePrivacy()` -Test the NoticePrivacy functionality when click on NoticePrivacy
  - `HelpsButton()` -Test the HelpsButton functionality when click on HelpsButton.

- `


### Other File Description :

- `Screenshots.java` - Take screenshots and save it in `\FailedScreenshots` folder
- `config.properties` - Have all the data regarding browser configurations
- `data.properties` - Have all the test data
- `pom.xml` - Have all the dependency

### Reports and Screenshots :

- Extent report gets generated after the run under `\Report\extentreport.html`
- TestNG report as `emailable-report.html` gets generated under `\test-output` folder
- Screenshots gets placed under `\FailedScreenshots` folder with test name 