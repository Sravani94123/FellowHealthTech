Feature: Login feature of Amazon
  

	@SmokeTest
  Scenario Outline: multi user login validations
    Given user should be on Amazonlanding page
    When enter "<username>" and "<password>"
    Then user should be successfully login and home page should be displayed
 

    Examples: 
      | username  | password |
      | sravani94.gcr@gmail.com	|   Sravani@123  		 |
      | makireddy039@gmail.com	|   Sravani@123      |
      
      

  