package org.csitebooks.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.csitebooks.test.model.Feed;
import org.csitebooks.test.model.FeedsModal;
import org.csitebooks.test.retrofit.RetrofitApi;
import org.csitebooks.test.retrofit.ServiceGenerator;
import org.csitebooks.test.util.DeviceUtils;

import java.util.List;

import cn.yangbingqiang.android.parallaxviewpager.ParallaxViewPager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Nikhil Vashistha.
 */
public class PagerActivity extends AppCompatActivity{

    private ParallaxViewPager mParallaxViewPager;
    private ProgressBar mProgressBar;

    private static final String TAG = "PagerActivity";


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        if (getSupportActionBar() != null) {
                getSupportActionBar().setTitle("");
        }

        mParallaxViewPager = (ParallaxViewPager) findViewById(R.id.viewpager);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        if(DeviceUtils.checkNetworkState(PagerActivity.this)) {
            getFeedDataFromServer();
        }else{
            mProgressBar.setVisibility(View.GONE);
            DeviceUtils.showToast(PagerActivity.this, "Please Connect Internet");
        }
    }

    private void getFeedDataFromServer(){

        RetrofitApi api = ServiceGenerator.createService(RetrofitApi.class);

        Call<FeedsModal> call = api.loadFeedModel(0);
        call.enqueue(new Callback<FeedsModal>() {
            @Override
            public void onResponse(Call<FeedsModal> call, Response<FeedsModal> response) {

                mProgressBar.setVisibility(View.GONE);

                if (response.isSuccessful()) {
                    // feeds available
                    mParallaxViewPager.setVisibility(View.VISIBLE);

                    List<Feed> feeds = response.body().getFeeds();
                    initViewPager(feeds);

                } else {
                    // error response, no access to resource?
                    Log.d(TAG, "onResponse() returned: " + "erorrrrrrrrrr");
                }
            }

            @Override
            public void onFailure(Call<FeedsModal> call, Throwable t) {
                // something went completely south (like no internet connection)
                mProgressBar.setVisibility(View.GONE);

                DeviceUtils.showToast(PagerActivity.this, "Restart App");

                Log.d("Error", t.getMessage());
            }
        });
    }

    private void initViewPager(final List<Feed> feeds) {
        PagerAdapter adapter = new PagerAdapter() {

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {
                return arg0 == arg1;
            }

            @Override
            public void destroyItem(ViewGroup container, int position,
                                    Object obj) {
                container.removeView((View) obj);
            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View itemView = View.inflate(container.getContext(), R.layout.pager_item, null);

                ImageView image = (ImageView)itemView.findViewById(R.id.image);
                TextView tvAddress = (TextView)itemView.findViewById(R.id.tv_address);
                TextView tvPropertyName = (TextView)itemView.findViewById(R.id.tv_property_name);
                TextView tvForSale = (TextView)itemView.findViewById(R.id.tv_for_sale);
                TextView tvDeveloperName = (TextView)itemView.findViewById(R.id.tv_developer_name);
                TextView tvCommentCount = (TextView)itemView.findViewById(R.id.tv_comment_count);
                TextView tvFavorCount = (TextView)itemView.findViewById( R.id.tv_favor_count );
                ImageView imageIsStar = (ImageView)itemView.findViewById(R.id.image_is_star);

                Feed feedItem = feeds.get(position);

                tvAddress.setText(feedItem.getAddress());
                tvPropertyName.setText(feedItem.getPropertyName());
                tvForSale.setText(feedItem.getSaleDate());
                if(feedItem.getDeveloperName()!=null && !feedItem.getDeveloperName().isEmpty()) {
                    tvDeveloperName.setText("Developer: " + feedItem.getDeveloperName().get(0));
                }
                tvCommentCount.setText(feedItem.getCommentCount());
                tvFavorCount.setText(feedItem.getFavorCount());

                if (feedItem.getImage()!=null && !feedItem.getImage().isEmpty()) {
                    Picasso.with(getApplicationContext()).load(feedItem.getImage())
                            .into(image);
                }

                if(Integer.parseInt(feedItem.getIsStar()) == 1){
                    imageIsStar.setVisibility(View.VISIBLE);
                }else {
                    imageIsStar.setVisibility(View.GONE);
                }

                container.addView(itemView, ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.MATCH_PARENT);

                return itemView;
            }

            @Override
            public int getCount() {
                return feeds.size();
            }
        };
        adapter.notifyDataSetChanged();
        mParallaxViewPager.setAdapter(adapter);
    }
}
