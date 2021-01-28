package com.example.endhomework.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    //https://beiyou.bytedance.com/
    @GET("api/invoke/video/invoke/video")
    Call<List<Message>> getVideoMessages();

}
