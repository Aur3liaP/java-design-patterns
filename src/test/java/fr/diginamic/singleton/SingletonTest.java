package fr.diginamic.singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testSingletonReturnsSameInstance() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        assertSame(instance1, instance2, "Les deux instances doivent être identiques (singleton)");
    }

    @Test
    void testConfigurationProperties() {
        Singleton config = Singleton.getInstance();
        assertEquals("jdbc:mysql://localhost:3306/mabase", config.getProperty("db.url"));
        assertEquals("root", config.getProperty("db.user"));
        assertEquals("1234", config.getProperty("db.password"));
    }

}