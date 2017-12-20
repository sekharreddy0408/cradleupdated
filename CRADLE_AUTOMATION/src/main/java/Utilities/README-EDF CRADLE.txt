

CRADLE


It is Project used for disposing the Rad waste.


IDE - Eclipse
 
Build Tool - Maven

Framework - Cucumber


RUN FILE:

The project has a runner file from where all the feature files are run.(src/test/Resources) - Runnerpackage
It is the place where we define how the feature files need to run, which ones to run and change the specifications as per our needs.
All the feature files are defined  in the feature of Cucumber options and the Step definitions where the steps are defined for the feature file with it corresponding names (src/test/java(StepDefinitions)) 
Tags lets us define what scenario needs to run.It is done by placing a tag above the scenario as (@Test)


Features

All the features are located in src/test/Resources in folders of it.

In future if we need to add more scenarios we can add the scenarios in the respective feature files.


Step Definitions

All the Step Definitions are in the location src/test/java, in Step Definitions package


Methods

The actual implementations of methods are in location src/main/java in methods folder

Utilities 

It is a folder which has all the re usable methods in UtilFile. Location src/main/java/Utilities/UtilFile

It also contains a java class where the browser to run and webconnector for the methods are defined.


Results

The results are generated in the target file in location at the end of the project
it is in cucumber-html-report in index.html(double click on it to open or right click to open with browser)
To get the updated results refresh the project and navigate to the reports location as mentioned above.


all the dependencies needed for the project are defined in POM.xml which is the last file in the project.



note:

After each run of the project Delete all the contents in m3/kg and save it and verify the container shows in red. This is to be done for verifying the incomplete waste to submit. 


