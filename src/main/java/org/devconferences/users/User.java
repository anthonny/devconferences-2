package org.devconferences.users;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chris on 05/06/15.
 */
public class User implements net.codestory.http.security.User {
    public static final String ADMIN = "ADMIN";
    public static final String EVENT_MANAGER = "EVENT_MANAGER";

    public String id;
    public String login;
    public String email;
    public String avatarURL;
    public final List<String> roles = new ArrayList<>();
    public final List<String> events = new ArrayList<>();

    public User(String login, String id, String email, String avatarURL) {
        this.login = login;
        this.id = id;
        this.avatarURL = avatarURL;
        this.email = email;
    }

    @Override
    public String name() {
        return login;
    }

    @Override
    public String login() {
        return login;
    }

    @Override
    public String[] roles() {
        return roles.toArray(new String[roles.size()]);
    }

    @Override
    public boolean isInRole(String expectedRole) {
        return roles.contains(expectedRole);
    }
}
