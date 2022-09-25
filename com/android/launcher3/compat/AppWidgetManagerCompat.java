package com.android.launcher3.compat;

import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.android.launcher3.IconCache;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
public abstract class AppWidgetManagerCompat {
    private static AppWidgetManagerCompat sInstance;
    private static final Object sInstanceLock = new Object();
    final AppWidgetManager mAppWidgetManager;
    final Context mContext;

    public AppWidgetManagerCompat(Context context) {
        this.mContext = context;
        this.mAppWidgetManager = AppWidgetManager.getInstance(context);
    }

    public static AppWidgetManagerCompat getInstance(Context context) {
        AppWidgetManagerCompat appWidgetManagerCompat;
        synchronized (sInstanceLock) {
            if (sInstance == null) {
                if (Utilities.ATLEAST_LOLLIPOP) {
                    sInstance = new AppWidgetManagerCompatVL(context.getApplicationContext());
                } else {
                    sInstance = new AppWidgetManagerCompatV16(context.getApplicationContext());
                }
            }
            appWidgetManagerCompat = sInstance;
        }
        return appWidgetManagerCompat;
    }

    public abstract boolean bindAppWidgetIdIfAllowed(int i, AppWidgetProviderInfo appWidgetProviderInfo, Bundle bundle);

    public abstract LauncherAppWidgetProviderInfo findProvider(ComponentName componentName, UserHandleCompat userHandleCompat);

    public abstract List getAllProviders();

    public abstract HashMap getAllProvidersMap();

    public AppWidgetProviderInfo getAppWidgetInfo(int i) {
        return this.mAppWidgetManager.getAppWidgetInfo(i);
    }

    public abstract Bitmap getBadgeBitmap(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, Bitmap bitmap, int i, int i2);

    public LauncherAppWidgetProviderInfo getLauncherAppWidgetInfo(int i) {
        AppWidgetProviderInfo appWidgetInfo = getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return null;
        }
        return LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(appWidgetInfo);
    }

    public abstract UserHandleCompat getUser(AppWidgetProviderInfo appWidgetProviderInfo);

    public abstract Drawable loadIcon(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, IconCache iconCache);

    public abstract String loadLabel(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo);

    public abstract Drawable loadPreview(AppWidgetProviderInfo appWidgetProviderInfo);

    public abstract void startConfigActivity(AppWidgetProviderInfo appWidgetProviderInfo, int i, Activity activity, AppWidgetHost appWidgetHost, int i2);
}
