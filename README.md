Java Kata Seed
==============

This is a seed for working on Java katas.

Tasks
-----

[Gradle](http://www.gradle.org/) is used for execution of tasks.
gradlew (Linux) and gradlew.bat (Windows) scripts can be used to run Gradle if it is not already installed in the system.

IDE
---

Gradle comes with tasks to create IDEA and Eclipse project out of this code.

IDEA:

```bash
gradle idea
```

Eclipse:

```bash
gradle eclipse
```

Source Code
-----------

Code is located in standard directories:

* src/test/java: Directory with test packages and classes
* src/main/java: Directory with implementation packages and classes

Running Tests
-------------

[AssertJ](http://joel-costigliola.github.io/assertj/) dependency is provided for JUnit test asserts.

To run all tests:

```bash
gradle test # user gradlew or gradlew.bat if Gradle is not installed
```

Alternative to running tests using Gradle is to execute them through your favorite IDE. 



