package com.android.launcher3;

import android.net.Uri;
import android.provider.BaseColumns;

/* compiled from: PG */
public final class LauncherSettings$Favorites implements BaseColumns {
    public static final Uri CONTENT_URI = Uri.parse("content://com.google.android.launcher.settings/favorites");

    static final String containerToString(int i) {
        if (i != -101) {
            return i != -100 ? String.valueOf(i) : "desktop";
        }
        return "hotseat";
    }

    public static Uri getContentUri(long j) {
        return Uri.parse("content://com.google.android.launcher.settings/favorites/" + j);
    }
}
