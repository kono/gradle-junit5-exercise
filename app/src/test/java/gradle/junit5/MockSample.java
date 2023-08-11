package gradle.junit5;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class MockSample {
    @Test 
    @DisplayName("Mockのテスト")
    public void appMock(){
        App mockSample = mock(App.class);
        doReturn( "test").when(mockSample).getGreeting();
        assertEquals("test", mockSample.getGreeting());
    }
}
