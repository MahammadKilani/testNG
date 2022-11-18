## Design of a Project for TestNG Framework with Data Driven Testing
### by Mohamed Kilany
<p> This project contains 4 Packages
<ol>
<li> Utils Package
<br>Contains >> Setup Class, each time you make a new Test Class it has to extend this class to access its methods
<br>Also Contains >> Data Provider Class, to pass any Data Driven Testing outputs</li>
<br>
<li> Pages Package
<br> Contains a class for each Page of the website
</li>
<br>
<li> Methods Package
<br> Contains Methods Classes for both Steps and Assertions
</li>
<br>
<li> Tests Package
<br> Contains a class for each feature under testing
</li>
</ol>

### How To Run it
<ul>
<li> Open CMD navigate to pom.xml file location 
<br> <i>cd C://location-to-your-project-where-pom.xml-is-found</i>
</li>
<br>
<li> Then simply run clean verify using Maven CLI
<br> <i>mvn clean verify</i>
</li>
</ul>
>> Note That Maven and Java should be properly defined in
<br>Environmental variables as JAVA_HOME and MAVEN_HOME
<br>
<br>
>> Also note that --headless mode is active to disable it
<br> Open Utils.package >> Setup.class >> Start.method comment ChromeOptions and remove options from <i>webDriver = new ChromeDriver(<b>options</b>)</i>

### How To Make Allure Report
<ul>
<li> Open PowerShell and Type the following commands to install Allure Reports 
<br> <i>Set-ExecutionPolicy RemoteSigned -Scope CurrentUser</i>
<br> Type "Y" and Hit Enter
<br> <i>irm get.scoop.sh | iex</i>
<br> <i>scoop install allure</i>
</li>
<br>
<li> Then simply run Allure sever with the target of allure-results folder of your project
<br> <i>allure server C:\location-to-your-project-where-pom.xml-is-found\allure-results</i>
</li>
</ul>
