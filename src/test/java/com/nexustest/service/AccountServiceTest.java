package com.nexustest.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountServiceTest {

    private final AccountService service = new AccountService();

    @Test
    void findAccountName_returnsEmptyForBlankId() {
        assertTrue(service.findAccountName("").isEmpty());
    }

    @Test
    void findAccountName_returnsValueForValidId() {
        assertEquals("account-42", service.findAccountName("42").get());
    }

    @Test
    void isActive_defaultsTrue() {
        assertTrue(service.isActive());
    }
}
