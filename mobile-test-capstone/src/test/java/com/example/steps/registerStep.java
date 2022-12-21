package com.example.steps;
import com.example.app.page.registerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class registerStep {
    @Steps
    registerPage RegisterPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        RegisterPage.setstartPage();
    }

    @When("I click register button")
    public void iClickRegisterButton() {
        RegisterPage.setregisterButton();
    }

    @And("I input nama {string}")
    public void iInputNama(String arg0) {
        RegisterPage.setFieldNama(arg0);
    }

    @And("I input nik {string}")
    public void iInputNik(String arg0) {
        RegisterPage.setFieldNik(arg0);
    }

    @And("I input tanggal lahir {string}")
    public void iInputTanggalLahir(String arg0) {
        RegisterPage.setFieldBirthdate(arg0);
    }


    @And("I input alamat {string}")
    public void iInputAlamat(String arg0) {
        RegisterPage.setFieldAlamat(arg0);
    }

    @And("I input email {string}")
    public void iInputEmail(String arg0) {
        RegisterPage.setFieldEmail(arg0);
    }

    @And("I input jenis kelamin {string}")
    public void iInputJenisKelamin(String arg0) {
        RegisterPage.setFieldGender();
    }

    @And("I input password {string}")
    public void iInputPassword(String arg0) {
        RegisterPage.setFieldPassword(arg0);
    }

    @And("I click register")
    public void iClickRegister() {
        RegisterPage.setregisterButton();
    }

    @When("I click login button")
    public void iClickLoginButton() {
        RegisterPage.setLoginButton();
    }

    @And("I click daftar button")
    public void iClickDaftarButton() {
        RegisterPage.setDaftarButton();
    }

    @Then("I Succes open register page")
    public void iSuccesOpenRegisterPage() {
        RegisterPage.successOpen();
    }

    @Then("I get {string} result regist")
    public void iGetResultRegist(String result) {
        switch (result){
            case "can regis":
                RegisterPage.setCanRegis();
                break;
            case "cant regis":
                RegisterPage.setCantRegis();
                break;
        }
    }
}
