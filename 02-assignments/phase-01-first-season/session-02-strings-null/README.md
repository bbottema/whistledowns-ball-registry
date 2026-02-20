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

You can read about the concepts introduced in this session in these files:

- [`/help me understand/What a method is.md`](/help%20me%20understand/What%20a%20method%20is.md)
- [`/help me understand/= vs ==.md`](/help%20me%20understand/%3D%20vs%20%3D%3D.md)
- [`/help me understand/equals vs == vs !=.md`](/help%20me%20understand/equals%20vs%20%3D%3D%20vs%20!%3D.md)

### The only rules you need for the TODOs

You are going to do three things in `S02_Assignment.java`:

1. Compare two pieces of text → use **`.equals(...)`**, not `==`
2. Call a few **String methods** like `contains(...)`, `startsWith(...)`, `replace(...)`, `trim()`
3. Do a **null-safe** check → check `!= null` before calling methods

If any of those lines feel unclear, use the explainers above.

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

Note: sample text like `"Status: OK"` is just regular text inside quotes (it is not a keyword).

If you can:
- explain why `==` is wrong for strings,
- write a null-safe check,
- and recognize a `NullPointerException`,

you’ve crossed one of the biggest early hurdles in Java.

## Troubleshooting

### `NullPointerException`

- You called a method on `null`. This is one of the most common beginner errors in Java. It does not mean you “broke Java.”
- Fix: check `!= null` *before* calling methods like `.isBlank()`.
- If you want a slower walkthrough: start with `help me understand/What a method is.md`, then read `equals vs == vs !=.md`.

### “Why does `==` fail for strings?”

- Because `==` is not a text comparison.
- Fix: use `.equals(...)`.
- Deeper explainer: `help me understand/equals vs == vs !=.md`

### If you accidentally ran the wrong thing

- If you see tooling output that looks unlike a normal program run, make sure you’re running S02_Assignment.java from 02-assignments
- For this course: run `S02_Assignment.java` as a normal program instead.