package com.nexustest.service;

import java.util.Optional;

public class AccountService {

    private boolean active = true;
    private boolean locked = false;

    public Optional<String> findAccountName(String id) {
        if (id == null || id.isBlank()) {
            return Optional.empty();
        }
        return Optional.of("account-" + id);
    }

    public boolean isActive() {
        return active;
    }

    public boolean isLocked() {
        return locked;
    }

    public Optional<String> findAccountStatus(String id) {
        if (id == null || id.isBlank()) {
            return Optional.empty();
        }
        return Optional.of(isLocked() ? "locked" : "open");
    }
}
