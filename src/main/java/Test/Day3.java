package Test;

import org.testng.annotations.*;

public class Day3 {
    @BeforeClass
    public void beforeclass(){
        System.out.println("Beforee class");
    }
    @Parameters({"URL"})
    @Test
    public void WebloginLoan(String urlname)
    {
        System.out.println("Web login car");
        System.out.println(urlname);
    }
    @BeforeMethod
    public void Beforeevery(){
        System.out.println("Before methoddd");
    }
    @AfterMethod
    public void Afterevery(){
        System.out.println("Afterrrr methoddd");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("Afterr class");
    }
    @Test(groups={"Smoke"})
    public void MobileLoginLoan()
    {
        System.out.println("mobile login car");
    }
    @BeforeSuite
    public void Bfsuite()
    {
        System.out.println("I am no 1");
    }
    @Test(enabled = false)
    public void MobileLoginLoanSignin()
    {
        System.out.println("mobile login car sign in");
    }
    @Test(dataProvider = "getData")
    public void MobileLoginLoanSignout(String username,String password)
    {
        System.out.println("mobile login car sign out");
        System.out.println(username);
        System.out.println(password);

    }
    @Test(dependsOnMethods={"WebloginLoan","MobileLoginLoanSignout"} )
    public void LoginAPILoan(){
        System.out.println("API login car");
    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[3][2];
        data[0][0]="firstsetusername";
        data[0][1]="password";
        data[1][0]="secondsetusername";
        data[1][1]="secondpassword";
        data[2][0]="thirdsetusername";
        data[2][1]="thirdpassword";
        return data;

    }
}
