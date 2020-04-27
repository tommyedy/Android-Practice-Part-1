package com.example.tessuitmediasatu;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIinterface {

    @GET("/api/users?page=1&per_page=10")
    Call<List<Guest>> getGuest();

}
