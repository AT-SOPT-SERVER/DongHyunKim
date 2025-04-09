package org.sopt.service;

import org.sopt.domain.Post;
import org.sopt.repository.PostRepository;

import java.util.List;

public class PostService {

    // PostRepository의 기능을 사용하는 공간
    // 로직을 돌리는 공간
    private PostRepository postRepository = new PostRepository();

    // 2. 게시글 작성 -> service에서 정의해둔 save를 사용하는 부분
    public boolean createPost(String title){
        if(title == null || title.trim().isEmpty()){
            return false;
        }
        if(title.length()>30){
            System.out.println("제목은 30자 이하로 작성해주세요.");
            return false;
        }
        Post post = new Post(1, title);
        postRepository.save(post);
        return true;
    }

    // 3. 전체 포스트에 대한 값을 컨트롤러에 전달해줘야 함
    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    // 게시글
    public Post getPostById(int id) {
        return postRepository.getPostById(id);
    }

    // 게시글 제목 업데이트 기능
    public Post updatePostTitle(int updateId, String newTitle){
        return postRepository.updatePostTitle(updateId, newTitle);
    }
}

