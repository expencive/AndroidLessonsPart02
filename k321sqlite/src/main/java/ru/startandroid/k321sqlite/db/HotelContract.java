package ru.startandroid.k321sqlite.db;

import android.provider.BaseColumns;
import android.provider.Telephony;

/**
 * Created by Настик on 25.09.2018.
 */

public final class HotelContract {

    private HotelContract() {
    };

    public static final class GuestEntry implements BaseColumns {
        public final static String TABLE_NAME = "guests";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_NAME = "name";
        public final static String COLUMN_CITY = "city";
        public final static String COLUMN_GENDER = "gender";
        public final static String COLUMN_AGE = "age";

        public static final int GENDER_FEMALE = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_UNKNOWN = 2;
    }
}
