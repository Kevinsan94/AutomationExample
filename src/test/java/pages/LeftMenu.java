package pages;

import control.Button;
import control.Link;
import control.TextBox;
import org.openqa.selenium.By;

public class LeftMenu {

    public Link addProjectLink;
    public TextBox projectNameTextBox;
    public Button addProjectButton;

    public  LeftMenu(){
        addProjectLink = new Link(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div/table/tbody/tr/td[2]"));
        projectNameTextBox = new TextBox(By.id("NewProjNameInput"));
        addProjectButton = new Button(By.id("NewProjNameButton"));
    }
}
