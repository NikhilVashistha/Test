package org.csitebooks.test.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.csitebooks.test.R;
import org.csitebooks.test.model.Feed;

import java.util.List;


/**
 * Created by Nikhil Vashistha.
 */
public class FeedsAdapter extends RecyclerView.Adapter<FeedsAdapter.FeedsViewHolder>{

    List<Feed> feeds;
    private Context mContext;
    private Activity activity;

    public FeedsAdapter(Context mContext, Activity activity, List<Feed> feeds) {
        this.mContext = mContext;
        this.activity = activity ;
        this.feeds = feeds;
    }

    public static class FeedsViewHolder extends RecyclerView.ViewHolder {

        private ImageView image;
        private ImageButton btnPanorma;
        private ImageButton btnArielView;
        private TextView tvAddress;
        private TextView tvPropertyName;
        private TextView tvForSale;
        private TextView tvDeveloperName;
        private TextView tvCommentCount;
        private TextView tvFavorCount;
        private ImageView imageIsStar;


        FeedsViewHolder(View itemView) {
            super(itemView);

            image = (ImageView)itemView.findViewById(R.id.image);
            btnPanorma = (ImageButton)itemView.findViewById(R.id.btn_panorma);
            btnArielView = (ImageButton)itemView.findViewById(R.id.btn_ariel_view);
            tvAddress = (TextView)itemView.findViewById(R.id.tv_address);
            tvPropertyName = (TextView)itemView.findViewById(R.id.tv_property_name);
            tvForSale = (TextView)itemView.findViewById(R.id.tv_for_sale);
            tvDeveloperName = (TextView)itemView.findViewById(R.id.tv_developer_name);
            tvCommentCount = (TextView)itemView.findViewById(R.id.tv_comment_count);
            tvFavorCount = (TextView)itemView.findViewById( R.id.tv_favor_count );
            imageIsStar = (ImageView)itemView.findViewById(R.id.image_is_star);

        }
    }
    @Override
    public int getItemCount() {
        return feeds.size();
    }

    @Override
    public FeedsViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_view_layout, viewGroup, false);
        FeedsViewHolder fvh = new FeedsViewHolder(v);
        return fvh;
    }

    @Override
    public void onBindViewHolder(final FeedsViewHolder feedViewHolder, final int position) {

        Feed feedItem = feeds.get(position);

        feedViewHolder.tvAddress.setText(feedItem.getAddress());
        feedViewHolder.tvPropertyName.setText(feedItem.getPropertyName());
        feedViewHolder.tvForSale.setText(feedItem.getSaleDate());
        if(feedItem.getDeveloperName()!=null && !feedItem.getDeveloperName().isEmpty()) {
            feedViewHolder.tvDeveloperName.setText("Developer: " + feedItem.getDeveloperName().get(0));
        }
        feedViewHolder.tvCommentCount.setText(feedItem.getCommentCount());
        feedViewHolder.tvFavorCount.setText(feedItem.getFavorCount());

        if (feedItem.getImage()!=null && !feedItem.getImage().isEmpty()) {
            Picasso.with(mContext).load(feedItem.getImage())
                    .into(feedViewHolder.image);
        }

        if(Integer.parseInt(feedItem.getIsStar()) == 1){
            feedViewHolder.imageIsStar.setVisibility(View.VISIBLE);
        }else {
            feedViewHolder.imageIsStar.setVisibility(View.GONE);
        }

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
}
