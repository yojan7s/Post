package com.example.aula7.post.interactor;

import com.example.aula7.post.model.Post;

import java.util.List;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public interface PostActivityInteractor {
    void  listData(List<Post>postList);
    void validateData();
    void  searchData();
}
