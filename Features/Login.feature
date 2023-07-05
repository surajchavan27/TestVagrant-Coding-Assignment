Feature:-Login Module

Scenario:-verify login module with valid data

Given  user able to open browser
And user able to enter url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When user enter Username "Admin" & password "admin123"
And user able to click on Login Button
Then user is on HomePage "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"
And user is able to click on Logout Button
And user is on Login Page "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"