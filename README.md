# nexus-test-repo

Disposable test repo for exercising the Nexus AI code review agent and
DORA metrics pipeline. Not a real application — just enough Java to
generate diffs.

Style guide the review agent checks PRs against: `docs/style-guide.md`

## Branches to open as PRs

- `pr/1-null-return` — violates the null-handling rule (should-fix)
- `pr/2-bad-naming` — violates the boolean-naming rule (suggestion)
- `pr/3-missing-test` — violates the test-coverage rule (must-fix)
- `pr/4-clean` — follows all three rules (confirms the agent doesn't
  hallucinate findings when there's nothing to flag)

Open each as its own PR against `main`, one at a time, so each review
pass is easy to attribute to a single rule.
