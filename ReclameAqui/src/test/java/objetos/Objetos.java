package objetos;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Objetos {
    WebDriver driver;

    @FindBy(xpath = "onetrust-accept-btn-handler")
    private WebElement botaoCokies;

    @FindBy(xpath = "//a[@class=\"login-ra\"]/span[2]")
    private WebElement botaoEntrar;

    @FindBy(id="username")
    private WebElement username;

    @FindBy(id="password")
    private WebElement senha;



    public void acessarPagina() {

        botaoCokies.submit();
        botaoEntrar.submit();

    }}

