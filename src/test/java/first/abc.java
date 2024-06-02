package first;


	
	import static org.testng.Assert.*;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	public class abc {
		
		String expectedTitle="Google";
		
		@Test
		public void test() {
			
			
			WebDriver d=new ChromeDriver();
			d.get("https://www.google.com/");
			System.out.println(d.getTitle());
			assertEquals(d.getTitle(), expectedTitle,"failed bcz the title dint match");
			System.out.println(d.getTitle());
			d.quit();
			
			
		}

}
