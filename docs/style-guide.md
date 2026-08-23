# Nexus Test Repo — Coding Standards

## Null Handling
Public methods must never return `null`. Use `Optional<T>` instead, so
callers are forced to handle the absent case explicitly.

## Naming
Boolean-returning methods must be prefixed with `is`, `has`, or `can`
(e.g. `isActive()`, not `checkActive()` or `getActive()`).

## Test Coverage
Every new public method added to a class under `service/` must have a
corresponding unit test in the same pull request.
