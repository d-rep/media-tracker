# Media Tracker

This is a simple web application, for tracking any media that you consume, such as books, TV shows, movies, or video games.

This is meant to illustrate how to build a classic, old school Java web application, using the [Spring] 3.1, [Struts] 2, & [Hibernate] 4 frameworks.  (Deliberately not using JPA annotations and instead doing things the hard way with hand-written Hibernate mapping XML.)

The Eclipse metadata is included, so the project can be imported into [Spring Tool Suite].

It is being actively developed and is unfinished.

Copyright &copy; 2012-, [Drew Repasky].  Licensed under [Apache License, Version 2.0]

## Prerequisites
This project requires a [Java Development Kit] v1.6 or newer and [Apache Maven] 3 to compile the source code.

If you simply want to test drive the application, it does not require a stand-alone database or Java application server.  

## Build
Download the latest and greatest source code:

    git clone git://github.com/d-rep/media-tracker.git

Build the code with the following commands:

    cd media-tracker/media-tracker-build
    mvn clean install

## Run
The above commands will produce a WAR file in the directory `media-tracker-web/target/` that can be deployed to any recent Java application server (Servlet 2.5 or greater).

Alternatively, you can simply run it like this from the command line, which uses embedded Tomcat 6.0.35:

    cd media-tracker-web
    mvn tomcat6:run

Then open your browser to this address: [http://localhost:8080/media-tracker-web/](http://localhost:8080/media-tracker-web/)

[Drew Repasky]: http://twitter.com/drewrepasky
[Apache License, Version 2.0]: http://www.apache.org/licenses/LICENSE-2.0.html
[Java Development Kit]: http://www.oracle.com/technetwork/java/javase/downloads/index.html
[Apache Maven]: http://maven.apache.org/download.html
[Spring Tool Suite]: http://www.springsource.org/downloads/sts-ggts
[Spring]: http://static.springsource.org/spring/docs/3.1.x/spring-framework-reference/html/
[Struts]: http://struts.apache.org/2.3.4.1/docs/home.html
[Hibernate]: http://www.hibernate.org/docs

