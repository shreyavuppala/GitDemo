package Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
    @Parameters({"URL","APIKey/Username"})
    @Test
    public void WebloginHomeLoan(String uname,String key)
    {
        System.out.println("Web login home perosnal loan");
        System.out.println(uname);
        System.out.println(key);
    }
    @Test(groups={"Smoke"})
    public void MobileLoginHomeLoan()
    {
        System.out.println("mobile login home");
    }
    @Test
    public void LoginAPIHomeLoan(){
        System.out.println("API login home");
    }
}
