package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class Login {

    public TextBox userTextBox;
    public TextBox passwordTextBox;
    public Button loginButton;
    public CheckBox checkBox;

    public Login(){
        loginButton = new Button(By.id("ctl00_MainContent_LoginControl1_ButtonLogin"));
        userTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail"));
        passwordTextBox = new TextBox(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword"));
        checkBox = new CheckBox(By.id("ctl00_MainContent_LoginControl1_CbRemember"));
    }
}
