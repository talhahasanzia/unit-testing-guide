
# Unit Testing CheatSheet

## What is Unit Testing?
- In its simplest term, unit testing is testing a small piece of code.
- A unit test usually targets a single method that perform a single task.
- Test ensures that the code is behaving as expected and that code has a deterministic outcome.

## When the Unit Tests are written?
There are generally 2 approaches when writing unit tests,
- One is test-driven-development, in which unit tests are written first, these tests specify requirements and at first they should fail because there is no code to produce required output, the code is then written around them to meet requirements and make tests pass.
- Other approach is retrospective testing, that is, after writing code, we write unit tests. This is more commonly used approach in practice (if there are unit tests written at all). We simply write code and then write unit tests after the code and validate code behaviours.

## Who writes Unit Tests?
- Developers. Period.

## Why should you write Unit Tests?
- Unit tests validate code for expected outcomes.
- Unit tests also make sure that the code is giving errors where expected, this way a lot of corner cases are covered.
- Allows identification of logical bugs in the code.
- If unit tests are written regugarly, they make code resist to changes that breaks the code. If a change in the code fails the unit test, either the code has issue or test is not updated, both ways, its a warning sign for developer to put an extra effort to investgate the issue before closing the development cycle.
- It seems waste of time and extra effort at the beginning, and it is, but few days effort of maintaining the code with meaningful unit tests saves months of refactoring later.
- It makes code cleaner - since the tests require certain level of abstraction and loose coupling which make code more cleaner.

## Writing Unit Tests - Cheat Sheet
### Intention
- The purpose of this writing is to promote the unit tests in software projects, specially those which are shaping the way we live, these projects can be related to finance, medicine, transport or online shopping.
- The bugs or problems in these softwares causes both customers and developers to lose their time and money.
- Promoting unit tests can save a lot of time in covering basic business logic validations and resulting a reliable software which can be fruitful for all the enities in the business.
- Writing unit test for the sake of unit tests or say achieving high code coverage is not a good idea. If the tests are not playing their part in verifying flows, they are of no value.
- In programming, every line of code generates a business value, no one likes to lose business, unit tests verify that the business value that code is providing is achieving its target.

### Writing Testable Code - A pre-requisite

### Writing Unit Tests

