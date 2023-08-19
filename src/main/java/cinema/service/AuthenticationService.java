package cinema.service;

import cinema.model.User;
import java.util.Set;

public interface AuthenticationService {
    User register(String email, String password, Set<String> roles);
}
