# Session 10 – JUnit preview (read-only)

This session is a preview. We’re **not** setting up JUnit in this warmup repo.
The goal is simply: when you meet JUnit in the real course, it won’t feel like a foreign language.

## What you’ll get out of this

By the end of this session you can:

- recognise the basic shape of a JUnit test
- map it to a testing workflow you already know (Arrange → Act → Assert)
- recognise the most common annotations and assertions (`@Test`, `assertTrue`, `assertFalse`)

## Concepts (quick read)

Read this once, then open `S10_Assignment.java`.
This session is about "recognising the shapes" so they don't feel scary later.

### `@Test` = "this method is a test"

In the example file, look for methods annotated with `@Test`.
That annotation is how JUnit knows what to run.

### Assertions are built in

Where you previously wrote your own `MiniAsserts`, JUnit provides ready-made checks such as:

```java
assertTrue(...)
assertFalse(...)
assertEquals(...)
```

### Arrange → Act → Assert = a familiar testing workflow

In the example, try to label each section:

- Arrange: set up inputs/test data
- Act: call the code under test
- Assert: check the result

### Tests are independent (one failure shouldn't hide the others)

Each test sets up its own data.
If one test fails, that is useful information, and the rest should still be runnable.

## Start here

Open `S10_Assignment.java` and read the example.
That file is the entry point for this session.

## How to run

You don’t run this session inside this warmup project.
It’s intentionally read-only.

## Plan B

If you’re feeling impatient (very normal):

- treat this as a 10-minute reading session
- then jump straight to Session 11 (back to running code)

## What “success” looks like

Success is: you can look at the code and label the parts correctly:

- “Ah, this is a test method.”
- “This part is setup (arrange).”
- “This is the check (assert).”

## Troubleshooting

### “But I want to run it!”

Totally fair.
You’ll run JUnit for real in the course project where it’s properly configured.
