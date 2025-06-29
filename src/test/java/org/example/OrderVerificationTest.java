package org.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

public class OrderVerificationTest {

    interface ExternalApi {
        void firstMethod();
        void secondMethod();
    }

    @Test
    void testMethodCallOrder() {
        ExternalApi mockApi = mock(ExternalApi.class);

        mockApi.firstMethod();
        mockApi.secondMethod();

        InOrder inOrder = inOrder(mockApi);
        inOrder.verify(mockApi).firstMethod();
        inOrder.verify(mockApi).secondMethod();
    }
}
