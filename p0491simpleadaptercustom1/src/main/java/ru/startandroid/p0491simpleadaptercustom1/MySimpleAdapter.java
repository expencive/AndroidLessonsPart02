package ru.startandroid.p0491simpleadaptercustom1;

import android.content.Context;
import android.widget.SimpleAdapter;

import java.util.List;
import java.util.Map;

/**
 * Created by Настик on 18.10.2018.
 */

class MySimpleAdapter extends SimpleAdapter {

    public MySimpleAdapter(Context context,
                           List<? extends Map<String, ?>> data, int resource,
                           String[] from, int[] to) {
        super(context, data, resource, from, to);
    }
}

