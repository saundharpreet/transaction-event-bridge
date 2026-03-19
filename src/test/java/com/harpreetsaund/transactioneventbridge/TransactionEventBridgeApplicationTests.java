package com.harpreetsaund.transactioneventbridge;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ActiveProfiles("test")
class TransactionEventBridgeApplicationTests {

    @Test
    void contextLoads() {
        String contextLoadsMessage = "Application context loaded successfully.";
        assertNotNull(contextLoadsMessage);
    }
}
