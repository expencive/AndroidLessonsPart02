package ru.startandroid.k321sqlite.db;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ru.startandroid.k321sqlite.db.HotelContract.GuestEntry;

/**
 * Created by Настик on 25.09.2018.
 */

public class HotelDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = HotelDbHelper.class.getSimpleName();

    /**
     * РРјСЏ С„Р°Р№Р»Р° Р±Р°Р·С‹ РґР°РЅРЅС‹С…
     */
    private static final String DATABASE_NAME = "hotel.db";

    /**
     * Р’РµСЂСЃРёСЏ Р±Р°Р·С‹ РґР°РЅРЅС‹С…. РџСЂРё РёР·РјРµРЅРµРЅРёРё СЃС…РµРјС‹ СѓРІРµР»РёС‡РёС‚СЊ РЅР° РµРґРёРЅРёС†Сѓ
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * РљРѕРЅСЃС‚СЂСѓРєС‚РѕСЂ {@link HotelDbHelper}.
     *
     * @param context РљРѕРЅС‚РµРєСЃС‚ РїСЂРёР»РѕР¶РµРЅРёСЏ
     */
    public HotelDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Р’С‹Р·С‹РІР°РµС‚СЃСЏ РїСЂРё СЃРѕР·РґР°РЅРёРё Р±Р°Р·С‹ РґР°РЅРЅС‹С…
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        // РЎС‚СЂРѕРєР° РґР»СЏ СЃРѕР·РґР°РЅРёСЏ С‚Р°Р±Р»РёС†С‹
        String SQL_CREATE_GUESTS_TABLE = "CREATE TABLE " + GuestEntry.TABLE_NAME + " ("
                + HotelContract.GuestEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + GuestEntry.COLUMN_NAME + " TEXT NOT NULL, "
                + GuestEntry.COLUMN_CITY + " TEXT NOT NULL, "
                + GuestEntry.COLUMN_GENDER + " INTEGER NOT NULL DEFAULT 3, "
                + GuestEntry.COLUMN_AGE + " INTEGER NOT NULL DEFAULT 0);";

        // Р—Р°РїСѓСЃРєР°РµРј СЃРѕР·РґР°РЅРёРµ С‚Р°Р±Р»РёС†С‹
        db.execSQL(SQL_CREATE_GUESTS_TABLE);
    }

    /**
     * Р’С‹Р·С‹РІР°РµС‚СЃСЏ РїСЂРё РѕР±РЅРѕРІР»РµРЅРёРё СЃС…РµРјС‹ Р±Р°Р·С‹ РґР°РЅРЅРЅС‹С…
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
