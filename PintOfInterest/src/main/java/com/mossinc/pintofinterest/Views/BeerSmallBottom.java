package com.mossinc.pintofinterest.Views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.mossinc.pintofinterest.R;

/**
 * Created by g74sx on 9/14/13.
 */
public class BeerSmallBottom extends LinearLayout {
    public BeerSmallBottom(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context){
        View.inflate(context, R.layout.beer_small_bottom, this);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
