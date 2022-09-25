package com.android.launcher3.util;

import android.app.WallpaperManager;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public final class WallpaperUtils {
    private static Point sDefaultWallpaperSize;

    public static Point getDefaultWallpaperSize(Resources resources, WindowManager windowManager) {
        int i;
        if (sDefaultWallpaperSize == null) {
            Point point = new Point();
            Point point2 = new Point();
            windowManager.getDefaultDisplay().getCurrentSizeRange(point, point2);
            int max = Math.max(point2.x, point2.y);
            int max2 = Math.max(point.x, point.y);
            if (Utilities.ATLEAST_JB_MR1) {
                Point point3 = new Point();
                windowManager.getDefaultDisplay().getRealSize(point3);
                max = Math.max(point3.x, point3.y);
                max2 = Math.min(point3.x, point3.y);
            }
            if (resources.getConfiguration().smallestScreenWidthDp >= 720) {
                float f = (float) max;
                i = (int) (f * (((f / ((float) max2)) * 0.30769226f) + 1.0076923f));
            } else {
                float f2 = (float) max2;
                i = Math.max((int) (f2 + f2), max);
            }
            sDefaultWallpaperSize = new Point(i, max);
        }
        return sDefaultWallpaperSize;
    }

    public static void suggestWallpaperDimension(Resources resources, SharedPreferences sharedPreferences, WindowManager windowManager, WallpaperManager wallpaperManager, boolean z) {
        Point defaultWallpaperSize = getDefaultWallpaperSize(resources, windowManager);
        int i = sharedPreferences.getInt("wallpaper.width", -1);
        int i2 = sharedPreferences.getInt("wallpaper.height", -1);
        if (i == -1 || i2 == -1) {
            if (z) {
                i = defaultWallpaperSize.x;
                i2 = defaultWallpaperSize.y;
            } else {
                return;
            }
        }
        if (i > 0 && i2 > 0) {
            if (i != wallpaperManager.getDesiredMinimumWidth() || i2 != wallpaperManager.getDesiredMinimumHeight()) {
                wallpaperManager.suggestDesiredDimensions(i, i2);
            }
        }
    }
}
