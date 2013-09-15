package com.mossinc.pintofinterest.Views;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.mossinc.pintofinterest.R;

/**
 * Created by g74sx on 9/14/13.
 */
public class VenueSmallTop extends LinearLayout {
    public VenueSmallTop(Context context) {
        super(context);
        initView(context);
    }

    private void initView(Context context){
        View.inflate(context, R.layout.venue_small_top, this);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }
}
