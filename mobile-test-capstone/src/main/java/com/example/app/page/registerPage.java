package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class registerPage extends BasePageObject {

    private By startPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");

    private By registerButton = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");

    private By fieldNama = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[1]");

    private By fieldNik = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[2]");

    private By fieldAlamat = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[3]");

    private By fieldGender = By.xpath("//android.widget.Button[@content-desc=\"Pilih jenis kelamin\"]");

    private By fieldBirthdate = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[5]");

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[4]");

    private By fieldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText[5]");

    private By daftarButton = By.xpath("//android.widget.Button[@content-desc=\"Daftar\"]");

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

    public void setFieldGender(String gender){
        click(fieldGender);
        inputText(fieldGender, gender);
    }

    public void setFieldBirthdate(String dob){
        click(fieldBirthdate);
        inputText(fieldBirthdate, dob);
    }

    public void setFieldEmail(String email){
        click(fieldEmail);
        inputText(fieldEmail, email);
    }

    public void setFieldPassword(String password){
        click(fieldPassword);
        inputText(fieldPassword, password);
    }

    public void setDaftarButton(){click(daftarButton);}

}
