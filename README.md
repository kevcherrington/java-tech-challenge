# STG Java Technical Challenge #1

## _Message Relay_
### The Challenge

You are to build an application that uses core technologies that are part of STG’s Java Practice technology stack.  The challenge is to produce a working app, or as much as possible, in the time given.

### Functional Requirements

Develop a single-page web application, backed by a ReST API, that allows the sending and display of messages to and from a user.  The interface should support the following features:

1. Add a new user
2. Send a message to an existing user
3. List messages sent to a user
4. List all messages sent through the system, in some kind of paged fashion

### Development Requirements

1. Include Unit Tests
2. Include Integration Tests
3. Commit the code to some SCM system that can be accessed by a reviewer.
4. Include documentation on how to setup and run the project

### Technology Requirements

You **MUST** use a subset of the following technologies.  Where more than one related technology is acceptable, you can choose one of the given options.

Remember, this is a challenge to use the core technology stack.  You may be familiar with other technologies that do the same thing, but don’t use them.  Mention it to the practice leadership and it may be added to the list of core technologies.


1. Build
    1. Maven
    1. Gradle
1. Spring
    1. Core
    1. MVC
    1. Boot
    1. Data JPA
    1. Data ReST (optional)
1. JPA
    1. Hibernate
    1. EclipseLink
    1. Any other JPA provider
1. Front End
    1. Angular 2/4
    1. ReactJS
    1. jQuery
1. Database
    1. MySQL
    1. PostgeSQL
    1. MariaDB
    1. MS SQLServer
1. Database Migration
    1. Liquibase
    1. Flyway
1. Testing
    1. JUnit (required)
    1. Mock Frameworks
        1. Mockito
        1. jMockit
    1. Hamcrest Matchers
    1. Spring Test
    1. DBUnit (optional, but some kind of integration tests should include the data store)


## Bonus


Use some or all of the following technologies:

Docker
Websockets
NoSQL store (only __after__ using an RDBMS)
Spring Cloud
Achieve 80% code coverage
