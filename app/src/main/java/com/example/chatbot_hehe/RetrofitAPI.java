package com.example.chatbot_hehe;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {

    @GET
    //get query; ~ postman
    Call<MsgModal> getMessage(@Url String url);
//Store resp in msgModal class
}
