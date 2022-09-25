package com.android.launcher3;

import android.app.AlertDialog;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.AsyncTask;
import com.google.android.googlequicksearchbox.R;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
public final class NycWallpaperUtils {
    public static void executeCropTaskAfterPrompt(Context context, final AsyncTask asyncTask, DialogInterface.OnCancelListener onCancelListener) {
        if (Utilities.ATLEAST_NOUGAT) {
            new AlertDialog.Builder(context).setTitle(R.string.wallpaper_instructions).setItems(R.array.which_wallpaper_options, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    asyncTask.execute(new Integer[]{Integer.valueOf(i == 0 ? 1 : i == 1 ? 2 : 3)});
                }
            }).setOnCancelListener(onCancelListener).show();
            return;
        }
        asyncTask.execute(new Integer[]{1});
    }

    public static void setStream$ar$ds(Context context, InputStream inputStream, Rect rect, int i) {
        WallpaperManager instance = WallpaperManager.getInstance(context);
        if (Utilities.ATLEAST_NOUGAT) {
            try {
                WallpaperManager.class.getMethod("setStream", new Class[]{InputStream.class, Rect.class, Boolean.TYPE, Integer.TYPE}).invoke(instance, new Object[]{inputStream, rect, true, Integer.valueOf(i)});
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        } else {
            instance.setStream(inputStream);
        }
    }
}
