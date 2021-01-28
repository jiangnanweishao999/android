package com.example.endhomework.model;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpsService {
    private List<Message> messages = new ArrayList<>();

    public List<Message> getMessages() {
        for (int i = 0; i < messages.size(); i++) {
            Log.d("https", messages.get(i).get_id());
        }
        return messages;
    }
}


