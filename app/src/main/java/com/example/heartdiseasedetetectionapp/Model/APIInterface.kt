package com.example.heartdiseasedetetectionapp.Model

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIInterface {
    @FormUrlEncoded
    @POST("predict")
    suspend fun predictDisease(
        @Field("age") age: Int,
        @Field("sex") sex: Int,
        @Field("cp") cp: Int,
        @Field("trestbps") trestbps: Int,
        @Field("chol") chol: Int,
        @Field("fbs") fbs: Int,
        @Field("restecg") restecg: Int,
        @Field("thalach") thalach: Int,
        @Field("exang") exang: Int,
        @Field("oldpeak") oldpeak: Float,
        @Field("slope") slope: Int,
        @Field("ca") ca: Int,
        @Field("thal") thal: Int,
    ): Response<ResponseDataClass>

}

data class ResponseDataClass(
    @SerializedName("target value")
    val targetValue: String
)