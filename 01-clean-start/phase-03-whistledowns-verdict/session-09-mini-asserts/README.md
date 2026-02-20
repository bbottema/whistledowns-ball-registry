# Session 09 – Mini asserts (a tiny test helper)

## What you’ll get out of this

By the end of this session you can:

- write a tiny `assertTrue` that fails with a useful message
- use those asserts to check expectations against real code
- treat `AssertionError` as a test signal (expected vs actual didn’t match)

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs.

The goal of this session is simple: instead of reading a bunch of `true/false` prints and guessing,
you will make the program say exactly what was expected when something is wrong.

### An "assert" = a check with an expectation

In `S09_Assignment.java` you'll call your helper like this:

```java
S09_MiniAsserts.assertTrue(ball.mayAttend(simon), "Simon should be invited");
```

Read it as:

- we expect this to be `true`
- and if it isn't, show this message

### `AssertionError` = a test failure signal (not "you broke Java")

When an assertion fails, we throw an `AssertionError` on purpose.
That's useful because it stops the run right at the first failing check, with a message you wrote.

In tester terms: it's a clear FAIL result.

### Optional: `assertEquals`

If you implement `assertEquals`, use `Objects.equals(expected, actual)` so `null` is handled safely.

## Start here

1. Open `S09_MiniAsserts.java` and implement the TODOs.
2. Open `S09_Assignment.java` and uncomment the TODOs.
3. Run the assignment.

## How to run (IntelliJ)

1. Open `S09_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S09_Assignment.java` and choose **Run 'S09_Assignment.main()'**.

## What “success” looks like

When everything is correct, you should see:

```
All checks passed
```

## Controlled failure practice (recommended)

After you get a passing run:

1. Flip one expectation (e.g., remove the `!` from `!ball.mayAttend(penelope)`)
2. Run again
3. Read the `AssertionError` message like a test report
4. Undo your change

## Troubleshooting

### `AssertionError`

- This means a check failed.
- Read the message — it tells you what the test *expected*.

### Nothing prints

- The TODO blocks in `S09_Assignment.java` are still commented out.
