package com.dev.dino.workshopmongodb.services;

import com.dev.dino.workshopmongodb.entities.Post;
import com.dev.dino.workshopmongodb.entities.User;
import com.dev.dino.workshopmongodb.repositories.PostRepository;
import com.dev.dino.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;


    public Post findById(String id) {
        Optional<Post> user = postRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
