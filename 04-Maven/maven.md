# Maven

# **What is Maven?**

It's an open-source automation tool which is used for building java projects and create deployable binaries.Maven uses project object model (POM) to build java projects and create binaries.

In this class, We’ll try to explain the above statement with examples so that it becomes quite clear what maven is, and how to use it. First, we’ll see how we can manage a java project without any build tool, and then learn about maven and see how it makes the life of a java developer easy!

# **Building the old way**

Let’s consider we have to build a web application. We might have several dependencies such as web mvc, junits, etc. We need to manage all the dependencies, build WAR files, deploy, etc. All these steps take a lot of time.

Let us consider an example:We have two files: App.java and AppTest.java along with 2 jar files for writing JUnits.

![https://miro.medium.com/max/1120/1*j_mMmnRUCemVDbU4z-OYuA.png](https://miro.medium.com/max/1120/1*j_mMmnRUCemVDbU4z-OYuA.png)

We first need to compile App.java -> App.class

![https://miro.medium.com/max/1120/1*ecoTskNcm0-CmLWxgKk3kA.png](https://miro.medium.com/max/1120/1*ecoTskNcm0-CmLWxgKk3kA.png)

Then we need to compile AppTest.java → AppTest.class

![https://miro.medium.com/max/1120/1*tfuxI-vBnyAZ5Qv3_bG6kw.png](https://miro.medium.com/max/1120/1*tfuxI-vBnyAZ5Qv3_bG6kw.png)

Then we need to run the test cases and check if no tests are failing.

![https://miro.medium.com/max/1120/1*5ZKXHcenFj4Jnh32v_G1Sg.png](https://miro.medium.com/max/1120/1*5ZKXHcenFj4Jnh32v_G1Sg.png)

Then combine all classes to jar file:

![https://miro.medium.com/max/1120/1*Ganu8nfhvwBz5BXR_Lishw.png](https://miro.medium.com/max/1120/1*Ganu8nfhvwBz5BXR_Lishw.png)

As you can see, the steps are quite tedious and difficult to follow along, and if you have a huge project with a lot of dependencies to manage it becomes almost impossible. Developers used ANT before to solve and automate the above process, but for this, we had to write the long scripts. Maven came in as a solution for this.

# **Using Maven as a build tool**

Maven is an open-source project management build tool developed by Apache. It began as an attempt to simplify the build processes in the Jakarta Turbine project.

**Why use maven?**

1. It is a complete project management tool.
2. It makes the build process very easy (No need to write long scripts).
3. It provides a uniform build system. It has a standard directory structure which is followed.
4. It follows Convention over Configuration.
5. It has a remote maven repo which has all the dependencies in one place.
6. Can be used with other programming languages too, just not java.

Let us now see how maven helps us with the above project which we created. We will create a similar project, but now we’ll use Maven as the build tool.

For that first check if you have maven installed. If not please [install](http://maven.apache.org/install.html) it.

![https://miro.medium.com/max/1120/1*TJRBkQQ4rS81bs_xa0lfXQ.png](https://miro.medium.com/max/1120/1*TJRBkQQ4rS81bs_xa0lfXQ.png)

We will now create the same project using maven:

```
mvn archetype:generate -DgroupId=hussain -DartifactId=sample-mvn -DarchetypeArtifactId=maven-archetype-quickstart
```

![https://miro.medium.com/max/666/1*Dk1gEhZ8WNHLKRIq1IrVXA.jpeg](https://miro.medium.com/max/666/1*Dk1gEhZ8WNHLKRIq1IrVXA.jpeg)

![https://miro.medium.com/max/1110/1*1jqI5rOw02RYduvC5UPPmA.png](https://miro.medium.com/max/1110/1*1jqI5rOw02RYduvC5UPPmA.png)

As Maven follows convention over configuration. Therefore it defines some defaults (can be overridden):1. Src files should be in src/main/java2. Test files should be in src/test/java3. pom.xml should be in the root folder

When you run any maven command, the first thing it looks for is pom.xml. We will learn more about this later.

![https://miro.medium.com/max/1120/1*MaAtSGQ_5KpJhbdp_PxHvA.png](https://miro.medium.com/max/1120/1*MaAtSGQ_5KpJhbdp_PxHvA.png)

# **Maven build lifecycle**

Maven build lifecycle is a set of phases that is executed when a maven build is run. There are three build lifecycles: default, clean, and site. The default lifecycle comprises of the following phases:

- **validate** — validate the project is correct and all necessary information is available
- **compile** — compile the source code of the project
- **test** — test the compiled source code using a suitable unit testing framework. These tests should not require the code to be packaged or deployed
- **package** — take the compiled code and package it in its distributable format, such as a JAR.
- **verify** — run any checks on results of integration tests to ensure quality criteria are met
- **install** — install the package into the local repository, for use as a dependency in other projects locally
- **deploy** — done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

These lifecycle phases are executed sequentially to complete the default lifecycle. If any specified phase is executed, all the phases before it are executed first. Let’s run a few commands to make it more clear:

```
mvn validate
```

![https://miro.medium.com/max/1120/1*JDsHEZTFxymywLnBJWn1HA.png](https://miro.medium.com/max/1120/1*JDsHEZTFxymywLnBJWn1HA.png)

Right now we do not have any compiled files. To compile src code, try:

```
mvn compile
```

You will see that a new target folder is created with src files compiled in it.

![https://miro.medium.com/max/1120/1*HnUMsESHkq2vBwE_wRSS6w.png](https://miro.medium.com/max/1120/1*HnUMsESHkq2vBwE_wRSS6w.png)

![https://miro.medium.com/max/1120/1*u7Z5f2bgkMUdDiPAxLmnUw.png](https://miro.medium.com/max/1120/1*u7Z5f2bgkMUdDiPAxLmnUw.png)

To compile test classes too, try:

```
mvn test-compile
```

This command compiles src files as well as test files:

![https://miro.medium.com/max/1120/1*nNO-m2dWAc14d75F9hqHUg.png](https://miro.medium.com/max/1120/1*nNO-m2dWAc14d75F9hqHUg.png)

![https://miro.medium.com/max/1066/1*ggUYbmgcSGhiGZTDhoDX8w.png](https://miro.medium.com/max/1066/1*ggUYbmgcSGhiGZTDhoDX8w.png)

To delete the compiled classes, try:

```
mvn clean
```

![https://miro.medium.com/max/1120/1*gDBeQqClrci-1TRMDEHtEA.png](https://miro.medium.com/max/1120/1*gDBeQqClrci-1TRMDEHtEA.png)

This will delete the target folder altogether.

```
mvn verify
```

![https://miro.medium.com/max/1120/1*jdd25FJ_qyjTCksWGhxP7w.png](https://miro.medium.com/max/1120/1*jdd25FJ_qyjTCksWGhxP7w.png)

It compiles src and test files, runs the test, and verifies that quality criteria are met.

```
mvn install
```

![https://miro.medium.com/max/1120/1*4lfHz7KSfG1GC7M6t31c0g.png](https://miro.medium.com/max/1120/1*4lfHz7KSfG1GC7M6t31c0g.png)

In the install phase, maven first validates, compiles (src and test classes), packages, verifies, and then install the package into the local repository, for use as a dependency in other projects locally.

# **POM**

Project object model or pom is an XML file that contains information and configuration details used by maven to build the project. When executing a task or goal, Maven looks for the POM in the current directory. It reads the POM, gets the needed configuration information, then executes the goal.

**Elements of POM:**

1. project: root element of the XML file
2. modelVersion: should be set to 4.0.0
3. groupId: It specifies the id of the project’s group
4. artifactId: id of the project
5. version: Version of the artifact within the group

We have several other elements which include: packaging, dependencies, dependencyManagement, repositories, scm, modules, build, etc.

All the dependencies are downloaded from a remote repository into a local maven repository. This is why, while running any new project, it takes time for the project to load, as it is downloading the dependencies from remote to local.

![https://miro.medium.com/max/1120/1*FIpcltoe2n92xzUfI35_1g.png](https://miro.medium.com/max/1120/1*FIpcltoe2n92xzUfI35_1g.png)

# Building Some Maven Assignment projects

- Project 1
    
    

# More Reading Material

 [https://dev.to/saiupadhyayula/maven-complete-tutorial-for-beginners-1jek](https://dev.to/saiupadhyayula/maven-complete-tutorial-for-beginners-1jek)