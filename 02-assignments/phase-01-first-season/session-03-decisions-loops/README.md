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
You are *not* expected to memorize syntax on sight. If you get a red underline or a compiler error, that's normal: read the message, fix one thing, and run again.

You can read about the concepts introduced in this session in these files:

- [`help me understand/If-else for testers.md`](help%20me%20understand/If-else%20for%20testers.md)
- [`help me understand/Loops and test cases.md`](help%20me%20understand/Loops%20and%20test%20cases.md)
- [`help me understand/Imports and List.of.md`](help%20me%20understand/Imports%20and%20List.of.md)

### The only rules you need for the TODOs

You are going to do three things in `S03_Assignment.java`:

1. Write one `if/else` rule and print one result
2. Loop over multiple inputs and print `input -> result`
3. Use a `List` of text test cases (and add `import java.util.List;` when you reach that TODO)

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