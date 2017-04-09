package com.changja00.myapplication;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import static android.R.attr.name;

/**
 * Created by HYUN on 2017-04-09.
 */

public interface ApiService {

    public static final String API_URL = "http://kardoc.kr/";

    // 특정 유저 호출
    @GET("user/{id}")
    Call<ResponseBody> getUser(@Path("id") int userid);

    // 전체 유저 호출
    @GET("user/")
    Call<ResponseBody> getAllUser();

    // 유저 생성
    @FormUrlEncoded
    @POST("user/")
    Call<ResponseBody> createUser(
            @Field("customid") String customid,
            @Field("password") String password
//            @Field("name") String name,
//            @Field("phone") String phone,
//            @Field("gender") String gender,
//            @Field("email") String email,
//            @Field("birth") String birth
    );

    // 토큰 주워오기
    @FormUrlEncoded
    @POST("token-auth/")
    Call<ResponseBody> getToken(
            @Field("username") String userName,
            @Field("password") String password
    );


    @Headers("Authorization: Token 855403c2a6d9b7f43552ac14d7a3fa3a2e05c53c")
    @FormUrlEncoded
    @POST("shop/")
    Call<ResponseBody> createShop(
            @Field("shopname") String shopname
    );


}
