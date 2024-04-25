package dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Cart {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "/Gikart/edge/microsoft-edge-dev_119.0.2116.0-1_amd64.deb");

		WebDriver driver = new EdgeDriver();

        // Navigate to a website (e.g., Google)
        driver.get("https://www.gikart.in/");



}
}