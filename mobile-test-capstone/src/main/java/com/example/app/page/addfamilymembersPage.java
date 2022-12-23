package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class addfamilymembersPage extends BasePageObject {

    private By fieldEmail = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]");

    private By fieldPassword = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]");

    private By anggotaKeluargamenu = By.xpath("//android.view.View[@content-desc=\"Anggota Keluarga\"]");

    private By tabProfile = By.xpath("//android.view.View[@content-desc=\"Profile Tab 4 of 4\"]");

    private By tambahButton = By.xpath("//android.widget.Button[@content-desc=\"Tambah\"]");

    private By addMemberPage = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View");

    private By login1 = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");


    public void setfieldEmail(String email){
        click(fieldEmail);
        inputText(fieldEmail, email);
    }

    public void setfieldPassword(String password){
        click(fieldPassword);
        inputText(fieldPassword, password);
    }

    public void setAnggotaKeluargamenu(){
        click(anggotaKeluargamenu);
    }

    public void setTabProfile(){
        click(tabProfile);
    }

    public void setTambahButton(){
        click(tambahButton);
    }

    public void setAddMemberPage(){
        isDisplayed(addMemberPage);
    }
    public void setLogin1(){
        click(login1);
    }
}
