package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by chrismazza on 2018-12-28
 **/

@Profile("de")
@Primary
@Service
public class PrimaryGermanGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Primärer Grubdienst";
    }
}
