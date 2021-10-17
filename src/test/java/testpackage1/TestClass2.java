//package testpackage1;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class TestClass2 {
//    public static WebDriver driver;
//
//    public void saveOktaPassengerDOB(String pax, int index) {
//
//        String actualVal = "";
//        String date = "";
//        String month = "";
//        String year = "";
////        String expectedVal = "";
//        waitImplicitlyForActionNano(1);
//        switch (pax) {
//            case "Lead Guest":
//                date = passengerDetailsElements.leadpaxDOB.getText();
//                month = passengerDetailsElements.leadpaxDOBmonth.getText();
//                year = passengerDetailsElements.leadpaxDOByear.getText();
//
//                baseTestCucumber.getCommonUtil().writeActual("LeadPaxDOB", date + month + year);
//                break;
//
//
//            case "Adult":
//                actualVal = passengerDetailsElements.adultDOB.get(index - 1).getText();
//
////                expectedVal = baseTestCucumber.getCommonUtil().readActual( pax + index + "DOB" );
//                baseTestCucumber.getCommonUtil().writeActual("AdultPaxDOB", actualVal);
//                break;
//
//            case "Teen":
//                actualVal = passengerDetailsElements.teenDOB.get(index - 1).getText();
////                expectedVal = baseTestCucumber.getCommonUtil().readActual( pax + index + "DOB" );
//                baseTestCucumber.getCommonUtil().writeActual("TeenPaxDOB", actualVal);
//                break;
//
//            case "Child":
//                actualVal = passengerDetailsElements.childDOB.get(index - 1).getText();
////                expectedVal = baseTestCucumber.getCommonUtil().readActual( pax + index + "DOB" );
//                baseTestCucumber.getCommonUtil().writeActual("ChildPaxDOB", actualVal);
//                break;
//
//            case "Infant":
//                actualVal = passengerDetailsElements.infantDOB.get(index - 1).getText();
////                expectedVal = baseTestCucumber.getCommonUtil().readActual( pax + index + "DOB" );
//                baseTestCucumber.getCommonUtil().writeActual("InfantPaxDOB", actualVal);
//                break;
//
//
//            default:
//                baseTestCucumber.assertFailure("passenger page ", null, "Given passenger type not found " + pax, "error");
//                break;
//
//        }
//
////        if( !actualVal.toLowerCase().contains( expectedVal.toLowerCase() ) )
////        {
////            baseTestCucumber.takeScreenShot();
////            baseTestCucumber.softAssertFailure( passengerDetailPage, null, pax + index + " DOB is Incorrect , Exp : " + expectedVal + " Actual : " + actualVal, "fail" );
////        }
//    }
//
//
//
//    public final String leadpaxDOBListLocator = "//div[@id='passenger-0']//div[@id='ageListLocator']//surf-ul-drop-down[1]";
//
//
//    @FindBy( how = How.XPATH, xpath = leadpaxDOBListLocator )
//    public WebElement leadpaxDOB;
//
//}
