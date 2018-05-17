package com.example.aula7.post.presenter;

import com.example.aula7.post.interactor.PostActivityInteractor;
import com.example.aula7.post.interactor.PostActivityInteractorImpl;
import com.example.aula7.post.view.PostActivityView;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityPresenterImpl implements PostActivityPresenter{

    private PostActivityView postActivityView;
    private PostActivityInteractor postActivityInteractor;

    public PostActivityPresenterImpl(PostActivityView postActivityView) {
        this.postActivityView = postActivityView;
        postActivityInteractor  = new PostActivityInteractorImpl(this);
    }

    @Override
    public void showData() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void showError() {

    }

    @Override
    public void listData() {

    }

    @Override
    public void validateData() {

    }

    @Override
    public void searchData() {

    }
}
