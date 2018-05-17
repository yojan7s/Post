package com.example.aula7.post.interactor;

import com.example.aula7.post.model.Post;
import com.example.aula7.post.presenter.PostActivityPresenter;
import com.example.aula7.post.respository.PostActivityRepository;
import com.example.aula7.post.respository.PostActivityRepositoryImpl;

import java.util.List;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityInteractorImpl implements PostActivityInteractor {

    private PostActivityPresenter postActivityPresenter;
    private PostActivityRepository postActivityRepository;

    public PostActivityInteractorImpl(PostActivityPresenter postActivityPresenter) {
        this.postActivityPresenter = postActivityPresenter;
        postActivityRepository = new PostActivityRepositoryImpl(this);
    }

    @Override
    public void listData(List<Post>postList) {
        //

    }
    @Override
    public void validateData() {

    }

    @Override
    public void searchData() {

    }
}
