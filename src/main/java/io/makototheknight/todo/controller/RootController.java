package io.makototheknight.todo.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
public class RootController {

    @RequestMapping("/")
    public ResponseEntity<Void> redirect(final UriComponentsBuilder builder) {
        final UriComponents uriComponents = builder.path("/lists").build();
        final HttpHeaders headers = new HttpHeaders();
        headers.setLocation(uriComponents.toUri());
        return new ResponseEntity<>(headers, HttpStatus.PERMANENT_REDIRECT);
    }

}
