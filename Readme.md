
# Unit Testing CheatSheet

## What is Unit Testing?
- In its simplest term, unit testing is testing a small piece of code.
- A unit test usually targets a single method that perform a single task.
- Test ensures that the code is behaving as expected and that code has a deterministic outcome.

## When the Unit Tests are written/ran?
There are generally 2 approaches when writing unit tests,
- One is test-driven-development, in which unit tests are written first, these tests specify requirements and at first they should fail because there is no code to produce required output, the code is then written around them to meet requirements and make tests pass.
- Other approach is retrospective testing, that is, after writing code, we write unit tests. This is more commonly used approach in practice (if there are unit tests written at all). We simply write code and then write unit tests after the code and validate code behaviours.
- With both approaches, it is a good practice to run unit tests as often as you can, after every code change, this will result in early identificaion of flaws in the system.

## Who writes Unit Tests?
- Developers. Period.

## Why should you write Unit Tests?
- Unit tests validate small pieces code for expected outcomes and .
- Unit tests also make sure that the code is giving errors where expected, this way a lot of corner cases are covered.
- Allows identification of logical bugs in the code.
- If unit tests are written regugarly, they make code resist to changes that breaks the code. If a change in the code fails the unit test, either the code has issue or test is not updated, both ways, its a warning sign for developer to put an extra effort to investgate the issue before closing the development cycle.
- It seems waste of time and extra effort at the beginning, and it is, but few days effort of maintaining the code with meaningful unit tests saves months of refactoring later.
- It makes code cleaner - since the tests require certain level of abstraction and loose coupling which make code more cleaner.

## Writing Unit Tests
In the following discussion I will be using Java as the example language and some references from Android Framework. Regardless of this fact, the general guidelines and good practices will apply to any OOP based framework.

### Intention
- The purpose of this writing is to promote the unit tests in software projects, specially those which are shaping the way we live, these projects can be related to finance, medicine, transport or online shopping.
- The bugs or problems in these softwares causes both customers and developers to lose their time and money.
- Promoting unit tests can save a lot of time in covering basic business logic validations and resulting a reliable software which can be fruitful for all the enities in the business.
- Writing unit test for the sake of unit tests or say achieving high code coverage is not a good idea. If the tests are not playing their part in verifying business flows, they are of no value.
- In programming, every line of code generates a business value, no one likes to lose business, unit tests verify that the business value that code aims to provide is on the spot.

### Writing Testable Code - A pre-requisite
- First and foremost thing is seprating the dependencies from the code. For this you should be able to recognize what are the dependencies and what is the actual code that needs to be tested.
- In terms of Java and Android, if you are working in Android, your business layer should be testable without any Android dependencies.
- Continuing on Android as example, for the business layer (and unit tests themselves), most of the Android framework stuff will be dependencies for code. Like network library, Retrofit.
- Creation of objects should be delegated to upper level, like dependency manager. If a class that needs to be tested is creating its own objects inside, we cannot control data in those objects to test.
- Separate creation logic from business logic, thats what dependency managers do, if this is not the case, we might miss some business logic to test which was ran during creation of objects. Since tests and business classes should not be responsible for creating objects involved in a business logic flow.
- Unit tests usually targets business layer, so regardless of any framework you are, your code that needs to be tested must be using the core language libraries.
- Its nice to have to follow an architectural pattern to manage code, whether it be MVVP, MVP, VIPER or any other, primary goal is to make code clean, maintainable and testable, which makes it helpful to work with such codebase in the longer run.
- The implementation of architecture doesnt really provide all the solutions, so there are still few things that needs to be decoupled, like networking and UI stuff. 
- Generally, we dont need network or UI when writing unit tests, so if there is a good abstraction layer between the business logic layers and UI or Network etc, it will help us mock these entities and validate the actual business logic in tests.
- Static methods makes it hard to test unless they are pure methods and donot use or create any dependency objects in their execution, moreover these static methods or objects cannot be mocked easily which are blocker in unit testing.
- Tests are written for public methods. Because other classes or layers call public methods of classes that provide business logics. These methods in turn, call private methods which itself covers these private methods. DONT make private methods public for just writing TESTS.
- Always use interfaces (in java atleast the interface is available) while calling public methods, this ensures the implementation is hidden and can be mocked easily.
- When writing a test for a class, the target class should be instantiated as a concrete implementation, so the real code is ran, and all other participating objects are mocked. If the participating objects have abstraction (they are interface objects), mocking becomes so easy.
### Writing Unit Tests

