package io.makototheknight.todo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoListController {

    @RequestMapping("/lists")
    public String displayLists() {

        return "{\"songThatNeverEnds\": \"this\"}";
    }
}
