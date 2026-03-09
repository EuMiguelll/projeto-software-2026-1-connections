package br.insper.conexoes.connections;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class UserClient {


    public boolean userExists(String id) {
        try {
            RestTemplate restTemplate = new RestTemplate();
            ResponseEntity<UserResponse> user =
                    restTemplate.getForEntity("http://localhost:5001/users/"
                            + id, UserResponse.class);
            return true;
        } catch (HttpClientErrorException.NotFound e) {
            System.out.println("User not found");
            return false;
        } catch (Exception e) {
            System.out.println("Error inesperado");
            return false;
        }
    }

}
