package org.ghosttrio;


import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

public class UserNameMatcher extends TypeSafeMatcher<User> {

    private final String name;

    public UserNameMatcher(String name) {
        this.name = name;
    }

    @Override
    protected boolean matchesSafely(User user) {
        return user.getName().equals(name);
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("유저 이름은 [").appendValue(name).appendText("] 이어야 한다.");
    }

    public static UserNameMatcher hasName(String name) {
        return new UserNameMatcher(name);
    }

}