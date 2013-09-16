package com.mossinc.pintofinterest.data;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by g74sx on 9/15/13.
 */
public class SQLiteHelper extends SQLiteOpenHelper {

    //BEER TABLE AND COLUMNS
    public static final String TABLE_BEER = "beers";
    public static final String BEER_ID = "_id";
    public static final String BEER_NAME = "name";
    public static final String BEER_DESC = "desc";
    public static final String BEER_STYLE = "style";
    public static final String BEER_RATING = "rating";
    public static final String BEER_ADDED_BY = "addedby";
    public static final String BEER_ADDED_DATE = "addeddate";

    //USER TABLE AND COLUMNS
    public static final String TABLE_USER = "users";
    public static final String USER_ID = "_id";
    public static final String USER_FNAME = "fname";
    public static final String USER_LNAME = "lname";
    public static final String USER_EMAIL = "email";
    public static final String USER_PHOTO = "photo";
    public static final String USER_REP = "reputation";
    public static final String USER_JOIN_DATE = "joindate";
    public static final String USER_HASH = "hash";

    //VENUE TABLE AND COLUMNS
    public static final String TABLE_VENUE = "venues";
    public static final String VENUE_ID = "_id";
    public static final String VENUE_NAME = "name";
    public static final String VENUE_DESC = "desc";
    public static final String VENUE_ADDRESS = "address";
    public static final String VENUE_LAT = "lat";
    public static final String VENUE_LNG = "lng";
    public static final String VENUE_ADDED_BY = "addedby";
    public static final String VENUE_ADDED_DATE = "addeddate";
    public static final String VENUE_RATING = "rating";

    //VENUE_BEER RELATION TABLE AND COLUMNS
    public static final String TABLE_REL_BEER_VENUE = "beer_venue";
    public static final String REL_BEER_ID = "beer_id";
    public static final String REL_VENUE_ID = "venue_id";
    public static final String REL_ADDED_DATE = "addeddate";

    //BEER RATING TABLE AND COLUMNS
    public static final String TABLE_BEER_RATINGS = "beer_ratings";
    public static final String RAT_BEER_ID = "_id";
    public static final String RAT_BEER_RATING = "rating";
    public static final String RAT_BEER_USER_ID = "userid";
    public static final String RAT_BEER_DATE = "ratedate";

    //VENUE RATING TABLE AND COLUMNS
    public static final String TABLE_VENUE_RATINGS = "beer_ratings";
    public static final String RAT_VENUE_ID = "_id";
    public static final String RAT_VENUE_RATING = "rating";
    public static final String RAT_VENUE_USER_ID = "userid";
    public static final String RAT_VENUE_DATE = "ratedate";


    private static final String DATABASE_NAME = "pintofinterest.db";
    private static final int DATABASE_VERSION = 1;

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public SQLiteHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
//        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int i, int i2) {

    }

    private void createBeerTable(SQLiteDatabase db)
    {
        /*
        public static final String TABLE_BEER = "beers";
        public static final String BEER_ID = "_id";
        public static final String BEER_NAME = "name";
        public static final String BEER_DESC = "desc";
        public static final String BEER_STYLE = "style";
        public static final String BEER_RATING = "rating";
        public static final String BEER_ADDED_BY = "addedby";
        public static final String BEER_ADDED_DATE = "addeddate";
         */

        String CREATE_BEERS_TABLE = "CREATE TABLE " + TABLE_BEER + "("
                + BEER_ID + " INTEGER PRIMARY KEY," + BEER_NAME + " TEXT,"
                + BEER_DESC + " TEXT," + BEER_STYLE + " INTEGER," +
                BEER_RATING + " INTEGER," + BEER_ADDED_BY + " INTEGER,"
                + BEER_ADDED_DATE + " TEXT" +  ")";
        db.execSQL(CREATE_BEERS_TABLE);
    }

    private void createVenuesTable(SQLiteDatabase db)
    {
        /*
        public static final String TABLE_VENUE = "venues";
        public static final String VENUE_ID = "_id";
        public static final String VENUE_NAME = "name";
        public static final String VENUE_DESC = "desc";
        public static final String VENUE_ADDRESS = "address";
        public static final String VENUE_LAT = "lat";
        public static final String VENUE_LNG = "lng";
        public static final String VENUE_ADDED_BY = "addedby";
        public static final String VENUE_ADDED_DATE = "addeddate";
        public static final String VENUE_RATING = "rating";
         */

        String CREATE_VENUES_TABLE = "CREATE TABLE " + TABLE_VENUE + "("
                + VENUE_ID + " INTEGER PRIMARY KEY," + VENUE_NAME + " TEXT,"
                + VENUE_DESC + " TEXT," + VENUE_ADDRESS + " TEXT," +
                VENUE_LAT + " REAL," + VENUE_LNG + " REAL,"
                + VENUE_ADDED_BY + " INTEGER, " + VENUE_ADDED_DATE + " TEXT,"
                + VENUE_RATING + " INTEGER" +  ")";
        db.execSQL(CREATE_VENUES_TABLE);
    }

    private void createUserTable(SQLiteDatabase db)
    {
        /*
        public static final String TABLE_USER = "users";
        public static final String USER_ID = "_id";
        public static final String USER_FNAME = "fname";
        public static final String USER_LNAME = "lname";
        public static final String USER_EMAIL = "email";
        public static final String USER_PHOTO = "photo";
        public static final String USER_REP = "reputation";
        public static final String USER_JOIN_DATE = "joindate";
        public static final String USER_HASH = "hash";
         */

        String CREATE_USERS_TABLE = "CREATE TABLE " + TABLE_USER + "("
                + USER_ID + " INTEGER PRIMARY KEY," + USER_FNAME + " TEXT,"
                + USER_LNAME + " TEXT," + USER_EMAIL + " TEXT," +
                USER_PHOTO + " TEXT," + USER_REP + " INTEGER,"
                + USER_JOIN_DATE + " TEXT," + USER_HASH + " TEXT" + ")";
        db.execSQL(CREATE_USERS_TABLE);
    }

    private void createVenuBeerRelTable(SQLiteDatabase db)
    {
        /*
        public static final String TABLE_REL_BEER_VENUE = "beer_venue";
        public static final String REL_BEER_ID = "beer_id";
        public static final String REL_VENUE_ID = "venue_id";
        public static final String REL_ADDED_DATE = "addeddate";
        */

        String CREATE_VENUE_BEER_TABLE = "CREATE TABLE " + TABLE_REL_BEER_VENUE + "("
                + USER_ID + " INTEGER PRIMARY KEY," + USER_FNAME + " TEXT,"
                + USER_LNAME + " TEXT," + USER_EMAIL + " TEXT," +
                USER_PHOTO + " TEXT," + USER_REP + " INTEGER,"
                + USER_JOIN_DATE + " TEXT," + USER_HASH + " TEXT" + ")";
        db.execSQL(CREATE_VENUE_BEER_TABLE);
    }
}
