package org.csitebooks.test.retrofit;

/**
 * Created by Nikhil Vashistha .
 */

import org.csitebooks.test.model.FeedsModal;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitApi {


    @FormUrlEncoded
    @POST("property/feeds")
    Call<FeedsModal> loadFeedModel(@Field("lang") int lang);
}
