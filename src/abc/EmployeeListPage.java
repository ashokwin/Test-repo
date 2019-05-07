package abc;

import org.openqa.selenium.By;

import util.WebTestBase;

public class EmployeeListPage extends WebTestBase {

	public static void addEmployee(String fn, String mn, String ln)
	{
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys(fn);
		driver.findElement(By.id("middleName")).sendKeys(mn);
		driver.findElement(By.id("lastName")).sendKeys(ln);
		driver.findElement(By.id("btnSave")).click();
	}
	
	public static void searchEmployee(String sname) throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys(sname);
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
	}
	
	public static void deleteEmployee() throws InterruptedException
	{
		driver.findElement(By.id("ohrmList_chkSelectAll")).click();
		driver.findElement(By.id("btnDelete")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("dialogDeleteBtn")).click();
	}
}
