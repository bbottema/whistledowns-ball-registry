# Session 04 – The “Start Button” (`main`)

In this session, we're leaving the friendly `main()` and you’ll run a traditional Java program.
Yes, it comes with the scary-looking `public static void main(String[] args)`.
No, you don’t need to understand the word in that line yet.

## What you’ll get out of this

By the end of this session you can:

- run a Java file using IntelliJ’s green run button
- recognise the `main` method as the program’s “start here” entry point
- intentionally create a tiny compile error, read the error signal, and fix it

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs. You do not need to understand every keyword yet.
For this session, your job is simply to (1) find where the program starts, (2) click Run, and (3) use any errors as clues.

### `main(...)` = where IntelliJ starts running

When you click Run, IntelliJ starts executing the code inside this method:

```java
public static void main(String[] args)
```

Today, treat `public static void` and `String[] args` as "the required shape" of a Java program. You'll learn what they mean later.

### Red underline = "it can't run yet" (and that's useful)

If IntelliJ underlines something in red, the program won't run *yet*.
That is not a personal failure - it's quick feedback.

What to do:

1. Read the message (hover the red underline).
2. Fix one small thing.
3. Run again.

## Start here

1. Open `S04_Assignment.java`.
2. Follow the TODO blocks **in order**.

## How to run (IntelliJ)

1. Uncomment the `System.out.println("Hello tester");` line.
2. Click the green ▶ next to `main(...)`.

## Plan B

If you can't find the green ▶:

1. Right-click inside `S04_Assignment.java`
2. Click **Run 'S04_Assignment.main()'**

## What “success” looks like

You should see:

```
Hello tester
```

## Troubleshooting

### "Cannot find or load main class"

- Make sure the file name and the `class` name match: `S04_Assignment`.
- Make sure you are running the file that actually contains `main(...)`.

### It can’t run after I renamed something

- In Java, the public class name and the file name must match.
- Fix: if you renamed the file, rename the `class` too (or undo the rename).

## Controlled error practice (optional, but recommended)

1. Remove the semicolon from the `println` line
2. Watch IntelliJ add a red underline
3. Hover it (or press Alt+Enter) and read what it says
4. Put the semicolon back and run again