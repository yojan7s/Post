package com.example.aula7.post.ApiRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by AULA 7 on 17/05/2018.
 */

public class RestApiAdapter {


    public Service getClienteService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(Service.class);
    }
}
