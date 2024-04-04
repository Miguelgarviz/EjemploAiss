package aiss.restclient.service;

import aiss.restclient.model.User;
import aiss.restclient.model.UserList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    public List<User> findAllUsers() {
        List<User> users = null;
        String uri = "https://reqres.in/api/users";
        UserList userList = restTemplate.getForObject(uri, UserList.class);
        users = userList.getData();
        return users;
    }
}
