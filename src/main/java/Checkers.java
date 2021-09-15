import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkers {


    private WebDriver driver;
    private int numOfMoves;

    public Checkers(){
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/kalebburd/Documents/Programs/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://cardgames.io/checkers/");
        numOfMoves = 0;
    }

    public boolean isGameOver(){
        WebElement box = driver.findElement(By.id("result-box"));
        return box.isDisplayed();
    }

    public void incrementNumberOfMoves(){
        numOfMoves++;
        System.out.println(numOfMoves);
    }

    public int getNumOfMoves() {
        return numOfMoves;
    }

    public void endGame(){
        driver.close();
    }

    public void makeMove(){
        // Your code here
    }





}
