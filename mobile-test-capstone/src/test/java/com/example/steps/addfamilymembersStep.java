package com.example.steps;
import com.example.app.page.addfamilymembersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import com.example.app.page.registerPage;

public class addfamilymembersStep {
    @Steps
    addfamilymembersPage Addfamilymemberspage;
    @When("I click profile menu")
    public void iClickProfileMenu() {
        Addfamilymemberspage.setTabProfile();
    }

    @And("I click anggota keluarga")
    public void iClickAnggotaKeluarga() {
        Addfamilymemberspage.setAnggotaKeluargamenu();
    }

    @And("I click tambah button")
    public void iClickTambahButton() {
        Addfamilymemberspage.setTambahButton();
    }

    @Then("I succes open tambah anggota keluarga")
    public void iSuccesOpenTambahAnggotaKeluarga() {
        Addfamilymemberspage.setAddMemberPage();
    }

    @And("I input email")
    public void iInputEmail() {
        Addfamilymemberspage.setfieldEmail("yusuf@gmail.com");
    }

    @And("I input password")
    public void iInputPassword() {
        Addfamilymemberspage.setfieldPassword("123456");
    }

    @And("I click login")
    public void iClickLogin() {
        Addfamilymemberspage.setLogin1();
    }
}
