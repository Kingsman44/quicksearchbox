package com.android.launcher3.compat;

import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import com.android.launcher3.IconCache;
import com.android.launcher3.LauncherAppWidgetProviderInfo;
import com.android.launcher3.Utilities;
import com.android.launcher3.util.ComponentKey;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
class AppWidgetManagerCompatV16 extends AppWidgetManagerCompat {
    public AppWidgetManagerCompatV16(Context context) {
        super(context);
    }

    public boolean bindAppWidgetIdIfAllowed(int i, AppWidgetProviderInfo appWidgetProviderInfo, Bundle bundle) {
        if (Utilities.ATLEAST_JB_MR1) {
            return this.mAppWidgetManager.bindAppWidgetIdIfAllowed(i, appWidgetProviderInfo.provider, bundle);
        }
        return this.mAppWidgetManager.bindAppWidgetIdIfAllowed(i, appWidgetProviderInfo.provider);
    }

    public LauncherAppWidgetProviderInfo findProvider(ComponentName componentName, UserHandleCompat userHandleCompat) {
        for (AppWidgetProviderInfo next : this.mAppWidgetManager.getInstalledProviders()) {
            if (next.provider.equals(componentName)) {
                return LauncherAppWidgetProviderInfo.fromProviderInfo$ar$ds(next);
            }
        }
        return null;
    }

    public List getAllProviders() {
        return this.mAppWidgetManager.getInstalledProviders();
    }

    public HashMap getAllProvidersMap() {
        HashMap hashMap = new HashMap();
        UserHandleCompat myUserHandle = UserHandleCompat.myUserHandle();
        for (AppWidgetProviderInfo next : this.mAppWidgetManager.getInstalledProviders()) {
            hashMap.put(new ComponentKey(next.provider, myUserHandle), next);
        }
        return hashMap;
    }

    public Bitmap getBadgeBitmap(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, Bitmap bitmap, int i, int i2) {
        return bitmap;
    }

    public UserHandleCompat getUser(AppWidgetProviderInfo appWidgetProviderInfo) {
        return UserHandleCompat.myUserHandle();
    }

    public Drawable loadIcon(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo, IconCache iconCache) {
        return iconCache.getFullResIcon(launcherAppWidgetProviderInfo.provider.getPackageName(), launcherAppWidgetProviderInfo.icon);
    }

    public String loadLabel(LauncherAppWidgetProviderInfo launcherAppWidgetProviderInfo) {
        return Utilities.trim(launcherAppWidgetProviderInfo.label);
    }

    public Drawable loadPreview(AppWidgetProviderInfo appWidgetProviderInfo) {
        return this.mContext.getPackageManager().getDrawable(appWidgetProviderInfo.provider.getPackageName(), appWidgetProviderInfo.previewImage, (ApplicationInfo) null);
    }

    public void startConfigActivity(AppWidgetProviderInfo appWidgetProviderInfo, int i, Activity activity, AppWidgetHost appWidgetHost, int i2) {
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_CONFIGURE");
        intent.setComponent(appWidgetProviderInfo.configure);
        intent.putExtra("appWidgetId", i);
        Utilities.startActivityForResultSafely(activity, intent, i2);
    }
}
