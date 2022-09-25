package com.android.launcher3.util;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.launcher3.ShortcutInfo;
import com.android.launcher3.Utilities;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public final class CursorIconInfo {
    public final int iconIndex;
    public final int iconPackageIndex;
    public final int iconResourceIndex;
    private final Context mContext;
    public final int titleIndex;

    public CursorIconInfo(Context context, Cursor cursor) {
        this.mContext = context;
        cursor.getColumnIndexOrThrow("iconType");
        this.iconIndex = cursor.getColumnIndexOrThrow("icon");
        this.iconPackageIndex = cursor.getColumnIndexOrThrow("iconPackage");
        this.iconResourceIndex = cursor.getColumnIndexOrThrow("iconResource");
        this.titleIndex = cursor.getColumnIndexOrThrow("title");
    }

    public final String getTitle(Cursor cursor) {
        return TextUtils.isEmpty(cursor.getString(this.titleIndex)) ? BuildConfig.FLAVOR : Utilities.trim(cursor.getString(this.titleIndex));
    }

    public final Bitmap loadIcon(Cursor cursor) {
        return Utilities.createIconBitmap(cursor, this.iconIndex, this.mContext);
    }

    public final Bitmap loadIcon(Cursor cursor, ShortcutInfo shortcutInfo) {
        Bitmap bitmap;
        String string = cursor.getString(this.iconPackageIndex);
        String string2 = cursor.getString(this.iconResourceIndex);
        if (!TextUtils.isEmpty(string) || !TextUtils.isEmpty(string2)) {
            shortcutInfo.iconResource = new Intent.ShortcutIconResource();
            shortcutInfo.iconResource.packageName = string;
            shortcutInfo.iconResource.resourceName = string2;
            bitmap = Utilities.createIconBitmap(string, string2, this.mContext);
        } else {
            bitmap = null;
        }
        return bitmap == null ? loadIcon(cursor) : bitmap;
    }
}
