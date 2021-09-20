package zura.pustota.dockerboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import zura.pustota.dockerboot.model.User;
import zura.pustota.dockerboot.repo.UserRepo;

@SpringBootApplication
public class DockerbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerbootApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(UserRepo userRepo){
        return args -> {
          userRepo.save(new User(null, "John"));
          userRepo.save(new User(null, "Ben"));
          userRepo.save(new User(null, "Roger"));
        };
    }

}
