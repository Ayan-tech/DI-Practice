package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("en")
public class englishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting from English";
    }
}
