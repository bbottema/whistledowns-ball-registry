# Session 03 – Decisions & Loops (run a Java file)

This session is about turning “rules in your head” into code you can run.
You are not writing anything fancy here — just small, observable checks.

## What you’ll get out of this

By the end of this session, you will be able to:

- write an `if/else` rule (one check with two outcomes)
- run the same check for multiple test cases using a loop
- read the output as a quick “mini test report” (input → result)

## Concepts (quick read, then do the TODOs)

Read this once, then jump straight into the TODOs.
You are *not* expected to memorize loop syntax on sight. If you get a red underline or a compiler error, that's normal: read the message, fix one thing, and run again (that's testing).

### TODO 1: `if/else` = one rule, one printed result

An `if/else` picks one path or the other.
In this session you'll use it for a simple rule like "the age is at least 18".

When you run it, you should observe **one line printed**, either:

- `Eligible`
- `Not eligible`

(Tip: missing `{` or `}` is the #1 reason an `if/else` won't compile.)

### TODO 2: A `for` loop = run the same check for several test cases

Loops are how you avoid copy/pasting the same check 10 times.
You'll loop over several ages and print the result for each one.

You should observe multiple lines like:

- `16 -> false`
- `18 -> true`

Micro-translation: `(a >= 18)` is a yes/no expression, so it becomes `true` or `false`.

### TODO 3: `List` = another container for test cases (and it needs an import)

For the "family name" example, we use a `List` just to hold several sample inputs.

If IntelliJ shows an error like "cannot find symbol: List", make sure the file has this at the top:

```java
import java.util.List;
```

## Start here

1. Open `S03_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

## How to run (IntelliJ)

1. Open `S03_Assignment.java`.
2. Uncomment one TODO block at a time.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S03_Assignment.java` and choose **Run**.

## What “success” looks like

You should observe:

1. `Eligible` or `Not eligible` printed for the single-age rule
2. multiple lines like `16 -> false` and `18 -> true` from the ages loop
3. multiple lines mapping each family name to `true/false` for “respectable”

## Troubleshooting

### The output looks confusing

- Treat each printed line as a mini test result: **input → actual output**.
- If something looks wrong, add a `System.out.println(...)` for the input you think you’re testing.

### Syntax errors in a `for` loop

- Arrays: `for (int a : ages) { ... }`
- Lists: `for (String f : families) { ... }`

### “cannot find symbol: List”

- Make sure the file has `import java.util.List;` at the top.

### Code won’t compile

- Missing `{` or `}` is the most common issue in `if` and `for` blocks.
- Fix the red underline, then run again.