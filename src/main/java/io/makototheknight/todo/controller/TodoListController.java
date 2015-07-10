package io.makototheknight.todo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/lists", produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoListController {

    @RequestMapping("/")
    public String displayLists() {

        return "{\"songThatNeverEnds\": \"this\"}";
    }

    @RequestMapping(value = "/create",
                    method = RequestMethod.POST,
                    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String createNewList() {
        return null;
    }

    @RequestMapping({"/{listName}", "/{listName}/entries"})
    public String displayListEntries(@PathVariable("listName") final String name) {
        return null;
    }

    @RequestMapping(value = "/{listName}/entries",
                    method = RequestMethod.POST,
                    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String createListEntry(@PathVariable("listName") final String name) {
        return null;
    }

    @RequestMapping(value = "/{listName}/entries/id/{id}",
                    method = RequestMethod.PATCH,
                    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String updateListEntry(@PathVariable("listName") final String name, @PathVariable("id") String id) {
        return null;
    }

    @RequestMapping(value = "/{listName}/entries/id/{id}",
                    method = RequestMethod.DELETE,
                    consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_FORM_URLENCODED_VALUE})
    public String deleteListEntry(@PathVariable("listName") final String name, @PathVariable("id") String id) {
        return null;
    }
}
