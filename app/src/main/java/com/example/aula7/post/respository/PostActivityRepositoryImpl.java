package com.example.aula7.post.respository;

import com.example.aula7.post.ApiRest.RestApiAdapter;
import com.example.aula7.post.ApiRest.Service;
import com.example.aula7.post.interactor.PostActivityInteractor;
import com.example.aula7.post.model.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class PostActivityRepositoryImpl implements PostActivityRepository {

    private PostActivityInteractor postActivityInteractor;
    List<Post>postList = new ArrayList<>();

    public PostActivityRepositoryImpl(PostActivityInteractor postActivityInteractor) {
        this.postActivityInteractor = postActivityInteractor;
    }

    @Override
    public void loadDataPost() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClienteService();
        Call<List<Post>> items = service.getDataPost();
        items.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                postList = response.body();
                postActivityInteractor.listData(postList);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                for (Post i:postList){
                    System.out.println("\n"+i.getTitle());
                }
            }
        });
    }
}
