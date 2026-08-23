package com.nexustest.service;

import java.util.Optional;

public class AccountService {

    private boolean active = true;

    public Optional<String> findAccountName(String id) {
        if (id == null || id.isBlank()) {
            return Optional.empty();
        }
        return Optional.of("account-" + id);
    }

    public boolean isActive() {
        return active;
    }

    public Optional<String> findAccountTier(String id) {
        if (id == null || id.isBlank()) {
            return Optional.empty();
        }
        return Optional.of("tier-standard");
    }
}
