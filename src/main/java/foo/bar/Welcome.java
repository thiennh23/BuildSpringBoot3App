package foo.bar;

import org.springframework.stereotype.Component;

@Component
public class Welcome {
    public String getWelcomeMessage() {
        return "Welcome to Spring Boot!";
    }
}
