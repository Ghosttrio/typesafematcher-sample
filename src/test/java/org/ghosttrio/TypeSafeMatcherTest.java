package org.ghosttrio;

import org.junit.jupiter.api.Test;

import static org.ghosttrio.UserNameMatcher.hasName;
import static org.hamcrest.MatcherAssert.assertThat;

public class TypeSafeMatcherTest {

    @Test
    public void testNameMatch() {
        User user = new User("test");

        assertThat(user, hasName("test"));
    }
}
