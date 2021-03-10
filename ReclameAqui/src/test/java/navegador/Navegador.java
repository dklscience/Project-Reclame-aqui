package navegador;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.ScreenshotException;
import suporte.Generator;
import suporte.Screenshot;

import java.util.concurrent.TimeUnit;

public class Navegador {
    static WebDriver driver;

    @Rule
    public TestName test = new TestName();

    public static void executarChromedriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuário\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        String url = "https://www.reclameaqui.com.br/";
        driver.get(url);
        driver.manage().window().maximize();

    }

    public static void main(String[] args) {
        executarChromedriver();
    }

//    @FindBy(id = "onetrust-accept-btn-handler")
//    private static WebElement botaoCokies;
//
//    @FindBy(xpath = "//a[@class='login-ra']/span[2]")
//    private static WebElement botaoEntrar;
//
//    @FindBy(id="username")
//    private static WebElement username;
//
//    @FindBy(id="password")
//    private static WebElement senha;

@T01
    public static void acessarPagina() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//a[@class='login-ra']/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("username")).sendKeys("22781611808");
        driver.findElement(By.id("password")).sendKeys("clubbers88");
        driver.findElement(By.id("kc-login")).click();



            driver.findElement(By.id("password")).sendKeys("clubbers88");
            driver.findElement(By.id("kc-login")).click();

            String mensagem = driver.findElement(By.name("Ops! Alguma informação incorreta")).getText();

            Assert.assertEquals("Ops! Alguma informação incorreta", "Ops! Alguma informação incorreta");


        }
@T02
    public static void acessarsCPF() {

        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        driver.findElement(By.xpath("//a[@class='login-ra']/span[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("password")).sendKeys("clubbers88");
        driver.findElement(By.id("kc-login")).click();

        String mensagem = driver.findElement(By.name("Ops! Alguma informação incorreta")).getText();

        Assert.assertEquals("Ops! Alguma informação incorreta", "Ops! Alguma informação incorreta");

    String screenshotArquivo = "C:\\Projetos\\ReclameAqui" + Generator.dataHoraParaArquivo() + test.getMethodName() + ".png";
    Screenshot.tirar(driver, screenshotArquivo);

    }

   }
