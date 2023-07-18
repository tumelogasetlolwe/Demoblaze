# healthF

NB:

-	Both project are selenium projects, created with IntelliJ.
-	The pom file and gecko driver are wrapped already in the project which should cause any issues in terms of running the project.
-	To run the project, make sure python is installed; then run python qa_interview.py to fire up the website on the server.
-	Build the framework project, then build the test cases project below.
-	Finally run the Angular_Test to execute the number calculations.
-	Enter an integer in the text field
-	Click Calculate button 


1.	public static void EnterNumber(String number) {
    
    Driver.getInstance().wait(5,
            ExpectedConditions.presenceOfElementLocated(By.cssSelector("#number"))).sendKeys(number);
}
 

2.
 

3. public class HomePage {
    public static void LoadWebsite() {
        Driver.getWebInstance().manage().window().maximize();
        Driver.getInstance().get(SeleniumUtil.BASE_URL_STRING);

        
    }
     public static void EnterNumber(String number) {

        Driver.getInstance().wait(5,
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("#number"))).sendKeys(number);
    }
    public static WebElement ClickCalculate() {
        return Driver.getInstance().wait(5, ExpectedConditions.
                presenceOfElementLocated(By.xpath("//*[@id=\"getFactorial\"]")));
    }
    
       public static void ClickOnCalculate() {
        ClickCalculate().click();
    }
}


    @Test
    public void execute() {
        try {
            HomePage.LoadWebsite();
            HomePage.EnterNumber("7");
            HomePage.ClickOnCalculate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
    @After
    public void cleanUp() {
       
    }

}



4. Theres GET api request and POST api request with interview css being sent as a header when making a call

5.	 A bug report will consist of a minimum of the listed below elements:

•	ID/name: ‘’test case ID; Integer field, not accepting digits’’
•	Description: ‘’Integer field not accepting digits, only taking in alphabets’’
•	Environment: QA, staging etc 
•	Console logs: Inspect the web element on console when a defect is experienced
•	Source URL: Make it easy for your developers spot the problem by including the URL of the page where you found the bug. Big time saver!
•	Visual proof: A picture is worth a thousand words. Although it might not be enough, a visual element like a screenshot or a video will help your developers understand the problem better and faster.
•	Steps to reproduce: A screenshot is a proof that you had a problem, but keep in mind that your developer might not be able to reproduce the bug. Make sure to describe, with as much detail as possible, the steps you took before you encountered the bug.
•	Expected result vs. actual result: Explaining what results you expected - be as specific as possible. Just saying "the app doesn’t work as expected" is not useful. It's also helpful to describe what you actually experienced.

6.	A test case will will consist of a minimum of the listed below elements:
-	Test case type; is it functionality, security etc
-	Test case ID; test cases identifier
-	Description; Describe the defect found
-	Steps to reproduce; outline how the defect was found step by step
-	Expected and actual results; show the expected behavior and the actual behavior found 
-	Screenshot; take a screenshots of proving what has been found
-	Status; did the pass or fail

7.	My test fully covered the positive scenario. With other tests are did, the web app handles some negative scenarios accordingly, but it does not alert the user which could also cause a confusion.


