# Session 05 – Your first reusable check (a method)

## What you’ll get out of this

By the end of this session, you will be able to:

- write a method that returns `true`/`false` (hello, reusable validation)
- treat the method like a tiny “business rule” you can test with multiple inputs
- run the program and read the output as a mini test report

## Concepts (quick read, then do the TODOs)

Read this once, then go do the TODOs. You are not expected to memorize method syntax.
If IntelliJ gives a red underline, that just means "it can't run yet". Fix one thing and try again.

### A method = a reusable check you can run on many inputs

You're going to implement a method with this signature:

```java
static boolean isEligible(int age, String familyName)
```

Think of it like a mini test helper:

- Input: an `age` and a `familyName`
- Output: `true` or `false`

You don't need to fully understand `static` today. For now, it simply lets `main(...)` call this method directly.

### Returning `true/false` = returning a test result

- `true` means: eligible
- `false` means: not eligible

For this session, the rule you are implementing is:

- age must be **18+**
- family name must be **not null and not blank**

The safe pattern (so your test run doesn't crash on `null`) is:

```java
familyName != null && !familyName.isBlank()
```

## Start here

1. Open `S05_Assignment.java`.
2. Follow the TODO blocks **in order**.

## How to run (IntelliJ)

1. Uncomment (or write) the `isEligible(...)` method.
2. Uncomment the `System.out.println(...)` calls in `main`.
3. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside the file and choose **Run 'S05_Assignment.main()'**.

## What “success” looks like

You should see exactly:

```
true
false
false
false
```

## Troubleshooting

### “cannot resolve symbol isEligible”

- The method is still commented out, or the name/signature doesn’t match.
- Fix: ensure the method name is `isEligible` and it has `(int age, String familyName)`.

### Output doesn’t match

Sanity-check the rule:

- `age < 18` → `false`
- `familyName == null` → `false`
- `familyName.isBlank()` → `false`
