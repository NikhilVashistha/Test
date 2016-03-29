package org.csitebooks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.csitebooks.test.model.FeedsModal;
import org.csitebooks.test.retrofit.RetrofitApi;
import org.csitebooks.test.retrofit.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitApi api = ServiceGenerator.createService(RetrofitApi.class);

        Call<FeedsModal> call = api.loadFeedModel(0);
        call.enqueue(new Callback<FeedsModal>() {
            @Override
            public void onResponse(Call<FeedsModal> call, Response<FeedsModal> response) {
                if (response.isSuccessful()) {
                    // tasks available

                    FeedsModal feedsModal = response.body();

                } else {
                    // error response, no access to resource?
                    Log.d(TAG, "onResponse() returned: " + "erorrrrrrrrrr");
                }
            }

            @Override
            public void onFailure(Call<FeedsModal> call, Throwable t) {
                // something went completely south (like no internet connection)
                Log.d("Error", t.getMessage());
            }
        });
    }
}
