package com.example.aula7.post.ApiRest;

import com.example.aula7.post.model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public interface Service {
    @GET("posts")
    Call<List<Post>> getDataPost();
}
