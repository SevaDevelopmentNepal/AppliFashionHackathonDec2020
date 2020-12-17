# Applitools Holiday Shopping Hackathon (December-2020)

This is my Submission for Applitools Holiday Shopping Hackathon using `Applitools Ultrafast Grid`

The purpose of this test framework is to test 3 different URL versions of the same Applifashion website in different SDLC stages before the public release, where the developed website is initially bug-free in "V1 production version" and is later found buggy when tested in "Dev-branch version (buggy)". Post fixing of the discovered bugs, our tests are reran to verify if the website is production-ready post testing in "Final production version"
 1. V1 production version (bug-free)
 2. Dev-branch version (buggy)
 3. Final production version (fixed & bug-free)

## Test Framework Architecture:

<img title=“diagram” alt=“framework” src="https://github.com/suparna-khamaru/ApplitoolsHolidayShoppingHackathonDec2020/blob/main/images/architecture.png" />

## Instructions: How to run the tests?

### About Test Framework
This test framework is developed and run using `Applitools Eyes` & `Selenium WebDriver` in `Java` language, and is primarily built on Maven, additionally using Junit5 test framework on Eclipse IDE.

