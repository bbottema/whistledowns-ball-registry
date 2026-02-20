# Session 02 – Strings & Null (run a Java file)

## What you’ll get out of this

By the end of this session, you will be comfortable:

- compare text values safely (no more mysterious `==` surprises)
- do a few everyday string operations (contains / startsWith / replace / trim)
- write a null-safe check that won’t blow up your test run
- recognise the classic `NullPointerException` and know what it *usually* means

## Concepts (quick read, then do the TODOs)

Read this once, then jump straight into the TODOs.
You are *not* expected to memorize any of this. When something goes wrong, treat it as a clue you can investigate (that is the day-to-day job of testing).

### Strings: use `.equals(...)` (not `==`)

In the TODOs you'll compare two pieces of text.

- `==` answers: "are these two variables literally the same thing?"
- `.equals(...)` answers: "do these two strings have the same letters?"

For this course, when you mean **same text**, use:

```java
expected.equals(actual)
```

If two strings *look* the same but `==` returns `false`, that can be normal in Java.

### Null: it means "missing value"

In testing, `null` usually means: we never got a value (missing input, missing data, optional field).

The scary part: calling a method on `null` stops the program immediately with `NullPointerException`.
Example: `familyName.isBlank()` will crash if `familyName` is `null`.

The safe pattern you'll use in this session:

```java
familyName != null && !familyName.isBlank()
```

What this does (left to right):

1. First check: do we have a value (`familyName != null`)?
2. Only if yes, then check the text (`!familyName.isBlank()`).

That "only if" behavior is what keeps your test run from blowing up.

### Fail fast (optional)

Sometimes returning `false` is fine.
Other times (especially in tests) you want to stop immediately with a message that says "this input was invalid".

That's what the optional `IllegalArgumentException` example is: a deliberate, readable failure.

## Start here

1. Open `S02_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

## How to run (IntelliJ)

1. Open `S02_Assignment.java`.
2. Uncomment one TODO block at a time.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S02_Assignment.java` and choose **Run**.

## What “success” looks like

You should observe:

1. `true` printed for the `.equals(...)` check
2. several printed values from the string operations (`contains`, `startsWith`, `replace`, `toLowerCase`, `trim`)
3. `false` printed for the null-safe `respectable` check

If you can:
- explain why `==` is wrong for strings,
- write a null-safe check,
- and recognize a `NullPointerException`,

you’ve crossed one of the biggest early hurdles in Java.

## Troubleshooting

### `NullPointerException`

- You called a method on `null`. This is one of the most common beginner errors in Java. It does not mean you “broke Java.”
- Fix: check `!= null` *before* calling methods like `.isBlank()`.

### “Why does `==` fail for strings?”

- Because `==` is not a text comparison.
- Fix: use `.equals(...)`.

### If you accidentally ran the wrong thing

- If you see tooling output that looks unlike a normal program run, make sure you’re running S02_Assignment.java from 02-assignments
- For this course: run `S02_Assignment.java` as a normal program instead.