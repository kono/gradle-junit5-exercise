/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class AppTest {
    @Test
    @DisplayName("サンプルテスト") 
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
}
