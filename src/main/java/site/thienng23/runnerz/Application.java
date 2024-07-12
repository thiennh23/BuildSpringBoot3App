package site.thienng23.runnerz;

import foo.bar.Welcome;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		var welcome = new Welcome();
		System.out.println(welcome.getWelcomeMessage());
	}

}
