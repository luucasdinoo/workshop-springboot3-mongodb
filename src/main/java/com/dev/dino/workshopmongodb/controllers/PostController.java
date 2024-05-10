package com.dev.dino.workshopmongodb.controllers;

import com.dev.dino.workshopmongodb.controllers.util.URL;
import com.dev.dino.workshopmongodb.entities.Post;
import com.dev.dino.workshopmongodb.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }
    @GetMapping(value = "/titlesearch")
    public ResponseEntity<List<Post>> findByTitle(@RequestParam(value = "text",defaultValue = "") String text){
        text = URL.decodParam(text);
        List<Post> list  = service.findByTitle(text);
        return ResponseEntity.ok().body(list);
    }

}
