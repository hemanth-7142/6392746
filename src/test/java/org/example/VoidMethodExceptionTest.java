package org.example;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VoidMethodExceptionTest {

    interface Notifier {
        void sendNotification();
    }

    @Test
    void testVoidMethodThrowsException() {
        Notifier mockNotifier = mock(Notifier.class);

        doThrow(new RuntimeException("Error sending notification"))
                .when(mockNotifier).sendNotification();

        assertThrows(RuntimeException.class, () -> mockNotifier.sendNotification());

        verify(mockNotifier).sendNotification();
    }
}
