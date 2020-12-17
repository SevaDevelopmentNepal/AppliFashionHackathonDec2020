# Applitools Holiday Shopping Hackathon 

This is my Submission for Applitools Holiday Shopping Hackathon using `Applitools Ultrafast Grid`
## Test Framework Architecture
<img title=“diagram1” alt=“framework1” src="https://github.com/suparna-khamaru/ApplitoolsHolidayShoppingHackathonDec2020/blob/main/images/architecture.png" />

### Components of Test Framework

- `Elements` (All the locators are placed in `Elements` classes for maintainability)
- `Actions` (All the resuable logics are added in `Action` classes which directly calls the locators from `Elements` classes)
  - `Common Actions` (Selenium related logics are placed here)
  - `Page Actions` (Web site related steps & logics are placed here)
- `Commmon Utilities` (Common libraries of the project are placed here)
- `Base Test` (Contains all the test methods for reusability in multiple cycles)
- `Test Runs` (Runs the same set of tests on different environments with different configurations on respective planned test cycles)  
  <img title=“diagram2” alt=“environments” src="https://github.com/suparna-khamaru/AppliFashionHackathonDec2020/blob/main/images/environments.png" />

## Primary Goal 

The purpose of this test framework is to test 3 different URL versions of the same Applifashion website in different SDLC stages before the public release, where the developed website is initially bug-free in "V1 production version" and is later found buggy when tested in "Dev-branch version (buggy)". Post fixing of the discovered bugs, our tests are reran to verify if the website is production-ready post testing in "Final production version"
 1. V1 production version (bug-free)
 2. Dev-branch version (buggy)
 3. Final production version (fixed & bug-free)

## Instructions

This test framework is developed on ***JRE SE 14*** and run using **Applitools Eyes** & ***Selenium WebDriver*** in ***Java*** language, and is primarily built on **Maven**, additionally using **Junit5** test framework on **Eclipse IDE**. 

#### Prerequisites
- Programming Language: Java 14
- Build Tool: Maven 4.0.0
- Test Runner: Junit5 (junit-jupiter-api 5.6.0)
- Other Dependencies:
    - selenium-java 4.0.0-alpha-5
    - selenium-chrome-driver 4.0.0-alpha-7
    - Applitools Eyes 3.178.0

### How to run the tests?

- Clone the above repository or Download as Zip and import as Maven project in preferred IDE
- Make sure to have maven configured in the machine and run the pom.xml file to install all dependencies into the test project
- Go to **TestRuns** package of the test project framework
- `Right click` on the test class ***Part1Tests***, Select `Run` as & Click on `Junit Test`
- When all tests in test class ***Part1Tests*** is run successfully, observe the test result in Applitools dashboard

  <img title=“diagram3” alt=“testrun” src="https://github.com/suparna-khamaru/ApplitoolsHolidayShoppingHackathonDec2020/blob/main/images/applitools-testrun.gif" />

- Similarly, `Right click` on the test class ***Part2Tests***, Select `Run` as & Click on `Junit Test`
- When all tests in test class ***Part2Tests*** is run successfully, observe the test result in Applitools dashboard
- Similarly, `Right click` on the test class ***Part3Tests***, Select `Run` as & Click on `Junit Test`
- When all tests in test class ***Part3Tests*** is run successfully, observe the test result in Applitools dashboard



## Test Results in Applitools Dashboard:

##### V1 Prod version URL
    https://eyes.applitools.com/app/test-results/00000251794078845021?accountId=dQ9sYE9DBkKu1ffPFyh7oA~~&display=details&top=00000251794068600374%284%29

##### Dev version URL
    Test 2 RCA
    https://eyes.applitools.com/app/test-results/00000251794073426466/00000251794073424605/steps/1/edit?accountId=dQ9sYE9DBkKu1ffPFyh7oA~~&diff=eyJub2RlMSI6eyJ0b3AiOjc2MSwibGVmdCI6MTA2NCwid2lkdGgiOjEyMSwiaGVpZ2h0Ijo0MH0sIm5vZGUxaGFzaCI6MTcxNTYzMjY0Nywibm9kZTIiOnsidG9wIjo3NTEsImxlZnQiOjEwNjQsIndpZHRoIjoxMjEsImhlaWdodCI6NDB9LCJub2RlMmhhc2giOjE3MTU2MzI2NDd9&mode=step-editor

##### Final Prod version URL
    https://eyes.applitools.com/app/test-results/00000251794068600374?accountId=dQ9sYE9DBkKu1ffPFyh7oA~~&display=details&top=00000251794068600374%284%29



## 📫 Find me

#### Suparna Khamaru

<a href="https://www.linkedin.com/in/suparnakhamaru/"><img src="https://github.com/suparna-khamaru/suparna-khamaru/blob/master/icons/linkedin.png" width="40"></a>|<a href="https://www.instagram.com/suparna.khamaru/"><img src="https://github.com/suparna-khamaru/suparna-khamaru/blob/master/icons/instagram.jpg" width="60"></a>|<a href="https://super-tester.medium.com/"><img src="https://github.com/suparna-khamaru/suparna-khamaru/blob/master/icons/medium.jpg" width="70"></a>
|--|--|--|
