package com.nexustest.service;

import java.util.Optional;

public class AccountService {

    private boolean active = true;
    private boolean verified = false;

    public Optional<String> findAccountName(String id) {
        if (id == null || id.isBlank()) {
            return Optional.empty();
        }
        return Optional.of("account-" + id);
    }

    public boolean isActive() {
        return active;
    }

    public boolean checkVerified() {
        return verified;
    }
}
