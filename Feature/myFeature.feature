Feature: Login to WordPress

Scenario: Login to WordPress with Valid Credentials

Given User Launch Firefox Browser
When User Enters username as "myPractice123" and pwd as "Rhj18FoALxAPLe8i"
Then User Clicks on Submit Button
And Page Title Should be "Blog Tool, Publishing Platform, and CMS &mdash; WordPress.org"
Then User Hover over Support and Print All Its Items
And User Close Browser