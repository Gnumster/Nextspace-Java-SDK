# Nextspace-Java-SDK

This is Java / Maven application that contains a number of examples of interaction with Nextspace API (also known as "Bruce API").

This application is based on the Nextspace Client Library, which is distributed via Maven Central Repository as .jar

Following is the key part required in the pom.xml to enable Nextspace Client library:

        <dependency>
            <groupId>com.nextspace</groupId>
            <artifactId>NextspaceClient</artifactId>
            <version>1.0.1</version>
        </dependency>

Following is the Nextspace library published on Maven central repository:

https://mvnrepository.com/artifact/com.nextspace/NextspaceClient



This application requires the following prerequisites:

  1. Client Account identified by the subdomain associated with it. You will find this in the URL by which you access your Nextspace account via Web Browser.
  2. User Login and Password for authentication of the User on behalf of which the communication with Nextspace API will take place.
  3. Which hosting environment we will operate within (PROD by default).


When this application is successfully compiled, you can execute this Java Application .jar using the following command line:

java -jar ./JavaConsoleNextspaceClientApplicationExample/target/JavaConsoleNextspaceClientApplicationExample-1.0.1.jar




