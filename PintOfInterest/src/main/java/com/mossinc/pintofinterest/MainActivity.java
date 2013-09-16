package com.mossinc.pintofinterest;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.mossinc.pintofinterest.Views.BannerTile;
import com.mossinc.pintofinterest.Views.BeerBig;
import com.mossinc.pintofinterest.Views.BeerSmallBottom;
import com.mossinc.pintofinterest.Views.BeerSmallTop;
import com.mossinc.pintofinterest.Views.VenueBig;
import com.mossinc.pintofinterest.Views.VenueSmallBottom;
import com.mossinc.pintofinterest.Views.VenueSmallTop;

public class MainActivity extends Activity {

    private Menu myMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        LinearLayout bannerTile = (LinearLayout) findViewById(R.id.banner_tile);
        LinearLayout beerBigTile = (LinearLayout) findViewById(R.id.beer_big);
        LinearLayout beerSmallTileTop = (LinearLayout) findViewById(R.id.beer_small_top);
        LinearLayout beerSmallTileBottom = (LinearLayout) findViewById(R.id.beer_small_bottom);
        LinearLayout venueBigTile = (LinearLayout) findViewById(R.id.venue_bit);
        LinearLayout venueSmallTileTop = (LinearLayout) findViewById(R.id.venue_small_top);
        LinearLayout venueSmallTileBottom = (LinearLayout) findViewById(R.id.venue_small_bottom);


        bannerTile.addView(new BannerTile(this));
        beerBigTile.addView(new BeerBig(this));
        beerSmallTileTop.addView(new BeerSmallTop(this));
        beerSmallTileBottom.addView(new BeerSmallBottom(this));
        venueBigTile.addView(new VenueBig(this));
        venueSmallTileTop.addView(new VenueSmallTop(this));
        venueSmallTileBottom.addView(new VenueSmallBottom(this));

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        myMenu = menu;
        getMenuInflater().inflate(R.menu.loggedin, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        Toast.makeText(this, "ID: " + item.getItemId() + " " + item.getTitle().toString(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId())
        {
            case R.id.action_add_beer:
                //Launch view for add beer
                break;
            case R.id.action_logout:
                checkLogin(item.getItemId());
                break;
            case R.id.action_settings:
                //Launch Settings view
                break;
        }
        return true;
    }

    private void checkLogin(int id) {

        final int tmp = id;
        Log.i("MainActivity", "Logging in... " + id);


        Intent myIntent = new Intent(MainActivity.this, FacebookActivity.class);
        Log.i("MainActivity", "Logging in...2 " + id);
        this.startActivity(myIntent);

        // start Facebook Login

    }

}
