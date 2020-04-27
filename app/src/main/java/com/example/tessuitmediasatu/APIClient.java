package com.example.tessuitmediasatu;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIClient {
    //define base url
    public static String base_url = "https://reqres.in/";

    //retrofit
    public static Retrofit getClient(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static APIinterface apIinterface(){
        return getClient().create(APIinterface.class);

    }
}
