package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class Controller {
    
    private Map<String, Login> db = new HashMap<>() {{
        put("1", new Login("123"));
    }};

    @GetMapping("/")
    public String hello() {
        return "Hey WiCS!";
    }

    @GetMapping("/login")
    public Collection<Login> get() {
        return db.values();
    }

    @GetMapping("/login/{id}")
    public Login get(@PathVariable String id) {
        Login login = db.get(id);
        if (login == null) {throw new ResponseStatusException(HttpStatus.NOT_FOUND);}
        return login;
    }

    @PostMapping("/login")
    public Login create(@RequestBody Login login) {
        login.setId(UUID.randomUUID().toString());
        db.put(login.getId(), login);
        return login;
    }


}
