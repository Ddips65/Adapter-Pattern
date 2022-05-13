# Convert old interface to new interface and access the data

# Program Details

A company has two systems to access customer data. One is the new developed system and the other one is 
the old legacy system. The old system access the customer data using USB connection to get the customer
data from some binary files stored on external disk. The new system access the customer data using REST
API over HTTPS connection to an external server. Task is to implement a software system that can allow 
the interface of the old system to be used as the new interface and is able to convert these two
interfaces.

• How is the flexibility, of your implementation, e.g., how you add or remove in future new types?
    
    I used the adapter pattern because Adapter Pattern converts the interface of a class into another
    interface the clients expect. The client is able to access program as they were doing before. 
    Only change inside for adapting the old code to the new one.

• How is the simplicity and understandability of your implementation?
    
    With the help of the UML diagram where there are highlighted the methods which I used for the 
    adapter pattern. It is easy to follow the code while implementing adapter pattern.

• How you avoided duplicated code?
     
    I avoided duplicated code by the adapter pattern adapt and call the required methods without 
    disturbing the other implementations. An Adapter can add functionality to the Adaptees at once.

# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

# Run all the unit test classes.


```bash
mvn clean compile test checkstyle:check  spotbugs:check
```

# Using Spotbugs to find bugs in your project 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn spotbugs:gui 
```

or 


```bash
mvn spotbugs:spotbugs
```


```bash
mvn spotbugs:check 
```

check goal runs analysis like spotbugs goal, and make the build failed if it found any bugs. 


For more info see 
https://spotbugs.readthedocs.io/en/latest/maven.html


SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```




