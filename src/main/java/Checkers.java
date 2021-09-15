import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class Checkers {


    private WebDriver driver;
    private int numOfMoves;

    public Checkers(){
//        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        System.setProperty("webdriver.chrome.driver", "/Users/deshawnwallace/Documents/Programs/chromedriver");
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

        Random random = new Random();

//        WebElement s1 = driver.findElement(By.className("s1"));
//        WebElement s2 = driver.findElement(By.className("s2"));
//        WebElement s3 = driver.findElement(By.className("s3"));
//        WebElement s4 = driver.findElement(By.className("s4"));
//        WebElement s5 = driver.findElement(By.className("s5"));
//        WebElement s6 = driver.findElement(By.className("s6"));
//        WebElement s7 = driver.findElement(By.className("s7"));
//        WebElement s8 = driver.findElement(By.className("s8"));
//
//        WebElement s9 = driver.findElement(By.className("s9"));
//        WebElement s10 = driver.findElement(By.className("s10"));
//        WebElement s11 = driver.findElement(By.className("s11"));
//        WebElement s12 = driver.findElement(By.className("s12"));


        List<WebElement> startMove = driver.findElements(By.className("active"));
        int randomStartMove = random.nextInt(startMove.size());
        startMove.get(randomStartMove).click();

        List<WebElement> makeMove = driver.findElements(By.className("move"));
        int randomMakeMove = random.nextInt(makeMove.size());
        makeMove.get(randomMakeMove).click();



    }
}
