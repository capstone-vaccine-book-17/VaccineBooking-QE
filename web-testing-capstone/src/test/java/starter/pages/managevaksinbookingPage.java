package starter.pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class managevaksinbookingPage extends PageObject {

    private By Username() {return  By.xpath("//div[label[text() = 'Username']]/input");}

    private By Password() {return By.xpath("//div[label[text() = 'Password']]/input");}

    private By LoginButton() {return By.xpath("//button[text() = 'Login']");}

    private By manageBookingbutton() {return By.xpath("//div/h1[text() = 'Manage Booking']");}

    public void openUrl() {openAt("/login");}

    public void inputUsername(String username) {$(Username()).type(username);}

    public void inputPassword(String password) {$(Password()).type(password);}

    public void loginButton() {$(LoginButton()).click();}

    public void managebookingButton() {$(manageBookingbutton()).click();}

    public void successBookingpage(){}
}
