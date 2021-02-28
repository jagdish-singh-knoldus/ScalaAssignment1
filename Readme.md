# Reverse


## Introduction

This project is used to reverse the List and reverse the String in SBT using Scala programming Language.


## Technology
 
Reverse is implemented in Scala programming language. Scalatest was used for testing reverse's implementation and SBT for project building.


## Requirements

* Java 11
* Scala 2.13.5
* sbt 1.4.7


## Commands

###clean

This command cleans the sbt project by deleting the target directory. The command output relevant messages.

 ```
 sbt clean 
 ```

###compile
This command compiles the scala source classes of the sbt project.

```
 sbt compile 
 ```
###Run
Enter the project folder and type:
```
 sbt run 
 ```


### Tests

Code is developed by applying [TDD](https://en.wikipedia.org/wiki/Test-driven_development) and tests are located in
folder **/src/test/scala-2.13**,  For running all tests enter the project folder and type:

 ```
 sbt test
 ```

## Library dependencies

* scalatest - test driven development
* scoverage

More details about project libraraies (e.g. version etc..) can be found in file **build.sbt**




## Functionality


### Reverse


This functionality supports reversing of the List and Strings

e.g.

 ```
 Jagdish == hsidgaJ
 [1,2,3] == [3,2,1]
 ["Jagdish","Singh"]==["hgniS","hsidgaJ"]
 ```

A number of samples is given in test file **ReverseSpec**.


Source files that are implementing this functionality is **Reverse**
