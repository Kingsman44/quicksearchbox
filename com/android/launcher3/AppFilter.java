package com.android.launcher3;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
public abstract class AppFilter {
    public static AppFilter loadByName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (AppFilter) Class.forName(str).newInstance();
        } catch (ClassNotFoundException e) {
            Log.e("AppFilter", "Bad AppFilter class", e);
            return null;
        } catch (InstantiationException e2) {
            Log.e("AppFilter", "Bad AppFilter class", e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("AppFilter", "Bad AppFilter class", e3);
            return null;
        } catch (ClassCastException e4) {
            Log.e("AppFilter", "Bad AppFilter class", e4);
            return null;
        }
    }

    public abstract boolean shouldShowApp$ar$ds();
}
