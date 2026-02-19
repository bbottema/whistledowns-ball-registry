# Session 03 – Decisions & Loops (JShell)

## What you’ll get out of this

By the end of this session you can:

- write an `if/else` rule (a tiny decision engine)
- run the same check for multiple test cases using a loop
- read the output as a quick “mini test report” (input → result)

## Concepts (quick read, then do the TODOs)

### `if/else` is your branching rule

Think: “if the input matches the rule, pass; otherwise, fail.”

```java
if (age >= 18) {
	System.out.println("Eligible");
} else {
	System.out.println("Not eligible");
}
```

### Loops = data-driven testing

Instead of testing one age, you test a whole list of ages.

```java
for (int a : ages) {
	System.out.println(a + " -> " + (a >= 18));
}
```

That `a -> true/false` output is basically a tiny table of results.

### Imports (only for the List example)

JShell doesn’t automatically import everything.
If you use `List`, paste this first:

```java
import java.util.List;
```

## Start here

1. Open `S03_Assignment.java`.
2. Follow the `TODO` blocks **in order**.

## How to run (recommended: JShell Console)

1. Open JShell Console: **Tools → JShell Console...**
2. Copy snippet lines from `S03_Assignment.java`.
3. Paste them into JShell **without** the leading `//`.

## Plan B (no plugin): Java Scratch File

1. In the Project view: **Right-click → New → Scratch File → Java**
2. Paste the snippet lines (again: without `//`).
3. Run the scratch file.

## What “success” looks like

You should observe:

1. `Eligible` or `Not eligible` printed for the single-age rule
2. multiple lines like `16 -> false` and `18 -> true` from the ages loop
3. multiple lines mapping each family name to `true/false` for “respectable”

## Troubleshooting

### Syntax errors in a `for` loop

- Arrays: `for (int a : ages) { ... }`
- Lists: `for (String f : families) { ... }`

### “cannot find symbol: List”

- Paste `import java.util.List;` in JShell before the List snippet.

### JShell shows `...>` and won’t run yet

- You’re in a multi-line block.
- Paste/type the closing `}` and press Enter.
