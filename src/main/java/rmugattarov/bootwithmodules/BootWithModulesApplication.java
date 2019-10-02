package rmugattarov.bootwithmodules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BootWithModulesApplication {

	public static void main(String[] args) {
		var msg = "Howdy!";
		System.out.println(msg);
		System.out.println(Arrays.toString(args));
		SpringApplication.run(BootWithModulesApplication.class, args);
	}

}
