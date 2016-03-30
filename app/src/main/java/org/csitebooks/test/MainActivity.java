package org.csitebooks.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import org.csitebooks.test.adapter.FeedsAdapter;
import org.csitebooks.test.model.Feed;
import org.csitebooks.test.model.FeedsModal;
import org.csitebooks.test.retrofit.RetrofitApi;
import org.csitebooks.test.retrofit.ServiceGenerator;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar mProgressBar;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);


        RetrofitApi api = ServiceGenerator.createService(RetrofitApi.class);

        Call<FeedsModal> call = api.loadFeedModel(0);
        call.enqueue(new Callback<FeedsModal>() {
            @Override
            public void onResponse(Call<FeedsModal> call, Response<FeedsModal> response) {

                mProgressBar.setVisibility(View.GONE);

                if (response.isSuccessful()) {
                    // feeds available
                    mRecyclerView.setVisibility(View.VISIBLE);

                    List<Feed> feeds = response.body().getFeeds();

                    mAdapter = new FeedsAdapter(getApplicationContext(), MainActivity.this ,feeds);
                    mAdapter.notifyDataSetChanged();
                    mRecyclerView.setAdapter(mAdapter);

                } else {
                    // error response, no access to resource?
                    Log.d(TAG, "onResponse() returned: " + "erorrrrrrrrrr");
                }
            }

            @Override
            public void onFailure(Call<FeedsModal> call, Throwable t) {
                // something went completely south (like no internet connection)
                mProgressBar.setVisibility(View.GONE);
                Log.d("Error", t.getMessage());
            }
        });
    }
}
