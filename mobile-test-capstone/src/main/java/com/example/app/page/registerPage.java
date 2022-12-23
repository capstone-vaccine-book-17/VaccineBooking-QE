package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class registerPage extends BasePageObject {

    private By startPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");

    private By registerButton = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");

    private By fieldNama = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");

    private By fieldNik = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");

    private By fieldAlamat = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");

    private By fieldGender = By.xpath("//android.widget.Button[@content-desc=\"Pilih jenis kelamin\"]");

    private By fieldBirthdate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[7]");

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");

    private By fieldEmail2 = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");

    private By fieldPassword = By.xpath("\t\n" +
            "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");

    private By inputDob = By.xpath("//android.view.View/android.widget.Button[1]");

    private By fieldinputDob = By.xpath("//android.view.View/android.widget.EditText");

    private By clickGender = By.xpath("//android.view.View[@content-desc=\"laki-laki\"]");

    private By loginButton = By.xpath("//android.widget.Button[@content-desc=\"Masuk\"]");

    private By buttonDaftar = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");

    private By registerPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView");

    private By okButton = By.xpath("//android.widget.Button[@content-desc=\"OK\"]");

    private By canRegis = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");

    private By cantRegis = By.xpath("//android.view.View[@content-desc=\"Invalid format.\"]");

    public void setstartPage(){isDisplayed(startPage);}

    public void setregisterButton(){click(registerButton);}

    public void setFieldNama(String nama){
        click(fieldNama);
        inputText(fieldNama, nama);
    }

    public void setFieldNik(String nik){
        click(fieldNik);
        inputText(fieldNik, nik);
    }

    public void setFieldAlamat(String alamat){
        click(fieldAlamat);
        inputText(fieldAlamat, alamat);
    }

    public void setFieldGender(){
        click(fieldGender);
        click(clickGender);
    }

    public void setFieldBirthdate(String dob){
        click(fieldBirthdate);
        click(inputDob);
        inputText(fieldinputDob, dob);
        click(okButton);
    }

    public void setFieldEmail(String email){
        click(fieldEmail);
        driver.hideKeyboard();
        inputText(fieldEmail2, email);
        driver.hideKeyboard();
    }

    public void setFieldPassword(String password){
        click(fieldPassword);
        driver.hideKeyboard();
        inputText(fieldPassword, password);
        driver.hideKeyboard();
    }

    public void setDaftarButton(){click(buttonDaftar);}

    public void setCanRegis(){isDisplayed(canRegis);}

    public void setCantRegis(){isDisplayed(cantRegis);}

    public void setLoginButton(){click(loginButton);}

    public void successOpen(){isDisplayed(registerPage);}

}
