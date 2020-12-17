# Applitools Holiday Shopping Hackathon (December-2020)

This is my Submission for Applitools Holiday Shopping Hackathon using `Applitools Ultrafast Grid`

## Test Framework Architecture

<img title=“diagram” alt=“framework” src="https://github.com/suparna-khamaru/ApplitoolsHolidayShoppingHackathonDec2020/blob/main/images/architecture.png" />

### Components of Test Framework

- `Elements` (All the locators are placed for maintainability)
- `Actions` (All the resuable logics are added using the locators in Elements class)
  - `Common Actions` (Selenium related logics are placed)
  - `Page Actions` (Web site related steps & logics are placed)
- `Commmon Utilities` (Common libraries of the project are placed)
- `Base Test` (Contains all the test methods for reusability in multiple cycles)
- `Test Runs` (Runs the same set of tests on different environments with different configurations on respective planned test cycles)

## Goal 

The purpose of this test framework is to test 3 different URL versions of the same Applifashion website in different SDLC stages before the public release, where the developed website is initially bug-free in "V1 production version" and is later found buggy when tested in "Dev-branch version (buggy)". Post fixing of the discovered bugs, our tests are reran to verify if the website is production-ready post testing in "Final production version"
 1. V1 production version (bug-free)
 2. Dev-branch version (buggy)
 3. Final production version (fixed & bug-free)

## Instructions

### About Test Framework
This test framework is developed and run using `Applitools Eyes` & `Selenium WebDriver` in `Java` language, and is primarily built on Maven, additionally using Junit5 test framework on Eclipse IDE.


### How to run the tests?

