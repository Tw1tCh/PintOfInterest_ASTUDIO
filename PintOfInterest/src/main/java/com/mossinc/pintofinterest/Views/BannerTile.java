package com.mossinc.pintofinterest.Views;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;

import com.mossinc.pintofinterest.R;

/**
 * Created by g74sx on 9/14/13.
 */
public class BannerTile extends LinearLayout {

    private ViewAnimator va;
    private Handler handler = new Handler();

    public BannerTile(Context context) {
        super(context);
        initView(context);
        va = (ViewAnimator) findViewById(R.id.viewAnimator);

        final Animation inAnim = AnimationUtils.loadAnimation(context, R.anim.push_left_in);
        final Animation outAnim = AnimationUtils.loadAnimation(context,R.anim.push_left_out);

        va.setInAnimation(inAnim);
        va.setOutAnimation(outAnim);

        handler.postDelayed(runnable, 5000);
    }

    private void initView(Context context){
        View.inflate(context, R.layout.banner_tile, this);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
      /* do what you need to do */
            va.showNext();
      /* and here comes the "trick" */
            handler.postDelayed(this, 5000);
        }
    };

}
