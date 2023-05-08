Feature: Login
 Scenario:  Successful Login with valid Credentials
 Given User launch chrome Browser
 When User open Url "https://demo.actitime.com/"
 And User enter username "admin" and password "manager"
 And click on login
 Then Page title should be "actiTIME - Enter Time-Track"
 And click on Reports
 Then page current url "https://demo.actitime.com/reports/reports.do"
 And page navigate back
 When user click on Logout page
 And Browser close
 

