# Session 06 – A class: your first “test data object”

## What you’ll get out of this

By the end of this session you can:

- group related data into one object (name + age + familyName)
- create objects using `new`
- run simple checks *on* that object (instead of passing 3 separate parameters everywhere)
- read constructor/method errors as useful signals (not blame)

## Concepts (quick read, then do the TODOs)

### A class is a little data container (with behaviour)

Test-analyst translation: you’re building a tiny **test data model**.
Instead of passing `name`, `age`, and `familyName` around separately, you pass **one** `S06_Socialite`.

### Constructor = “setup” for your object

This line:

```java
new S06_Socialite("Daphne", 21, "Bridgerton")
```

means: “Create an object and fill in its fields.”

### Methods = reusable checks

`isOfAge()` and `hasRespectableFamily()` are basically tiny reusable validations.

## Start here

1. Open `S06_Socialite.java`.
2. Follow the numbered TODOs.
3. Then open `S06_Assignment.java` and uncomment the TODOs to run the checks.

## How to run (IntelliJ)

Run the demo:

1. Open `S06_Assignment.java`.
2. Click the green ▶ next to `main(...)`.

## Plan B

Right-click inside `S06_Assignment.java` and choose **Run 'S06_Assignment.main()'**.

## What “success” looks like

When you run `S06_Assignment`, you should see:

```
true
false
true
```

## Troubleshooting

### “constructor S06_Socialite … cannot be applied”

- You called `new S06_Socialite(...)` with the wrong number/type of arguments.
- Fix: make sure your constructor parameters match the usage in `S06_Assignment.java`.

### `NullPointerException` in `hasRespectableFamily()`

- You probably did `familyName.isBlank()` without checking for `null`.
- Fix: use `familyName != null && !familyName.isBlank()`.
