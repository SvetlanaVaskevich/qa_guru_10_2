package bk.vaskevich.demoqa;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

public class OwnerTest {

    CredentialsConfig config = ConfigFactory.create(CredentialsConfig.class);

    @Test
    public void OwnerTests(){
        String login = config.login();
        String password = config.password();

        System.out.println("Login " + login);
        System.out.println("Password " + password);
    }
}
