package newpackage;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MyClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Utilitaire Selenium avec Java\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.seloger.com");
		WebElement champ_localite_Hp= driver.findElement(By.xpath("//input[@id='agatha_autocomplete_autocompleteUI__input']"));
		champ_localite_Hp.sendKeys("Nice");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver,20);
		List<WebElement> auto_complete_Hp=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='slam-aui-results']//child::span[@class='slam-aui-results-line' or @class='slam-aui-results-line focus']")));
		
		int i=0;
		WebElement localite_choisie=null;
		for (WebElement elmt:auto_complete_Hp)		
		{
			System.out.println("element: "+elmt.getText());
			if(elmt.getText().equals("Nice (06000, 06100, 06200, 06300)"))
				localite_choisie=elmt;
			else
				System.out.println("élément introuvable");
			i++;
		}
		localite_choisie.click();
		WebElement bouton_recherche_hp=driver.findElement(By.xpath("//a[starts-with(@class,'b-btn b-prime b-bow')]"));
		bouton_recherche_hp.click();
		WebElement bouton_ali_pdl=driver.findElement(By.xpath("//span[@class='Button__ButtonText-fl6j-1 gdQzAO']"));
		bouton_ali_pdl.click();
		//driver.close();	
	    }
}
