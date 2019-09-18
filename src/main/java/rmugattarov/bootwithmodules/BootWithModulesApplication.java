package rmugattarov.bootwithmodules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootWithModulesApplication {

	public static void main(String[] args) {
		var msg = "Howdy!";
		System.out.println(msg);
		SpringApplication.run(BootWithModulesApplication.class, args);
	}

}
