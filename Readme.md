
# Unit Testing CheatSheet

## What is Unit Testing?
- In its simplest term, unit testing is testing a small piece of code.
- A unit test usually targets a single method that perform a single task.
- Test ensures that the code is behaving as expected and that code has a deterministic outcome.

## When the Unit Tests are written?
There are generally 2 approaches when writing unit tests,
- One is test-driven-development, in which unit tests are written first, they specify requirements and at first they fail, the code is then written around them to meet requirements and make tests pass.
- Other approach is retrospective testing, that is, after writing code, we write unit tests. This is more commonly used approach in practice (if there are unit tests written at all). We simply write code and then write unit tests after the code and validate code behaviours.

## Who writes Unit Tests?
- Developers. Period.

## Why you should write Unit Tests?
- Unit tests validate code for expected outcomes.
- Unit tests also make sure that the code is giving errors where expected, this way a lot of corner cases are covered.
- Allows identification of logical bugs in the code.
- If unit tests are written regugarly, they make code resist to changes that breaks the code. If a change in the code fails the unit test, either the code has issue or test is not updated, both ways, its a warning sign for developer to put an extra effort to investgate the issue before closing the development cycle.
- It seems waste of time and extra effort at the beginning, and it is, but few days effort of maintaining the code with meaningful unit tests saves months of refactoring later.
- It makes code cleaner - since the tests require certain level of abstraction and loose coupling which make code more cleaner.

