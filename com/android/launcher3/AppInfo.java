package com.android.launcher3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.util.Log;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.android.launcher3.util.ComponentKey;
import com.android.launcher3.util.PackageManagerHelper;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class AppInfo extends ItemInfo {
    public ComponentName componentName;
    int flags;
    public Bitmap iconBitmap;
    public Intent intent;
    int isDisabled;
    boolean usingLowResIcon;

    public AppInfo() {
        this.flags = 0;
        this.isDisabled = 0;
        this.itemType = 1;
    }

    public static void dumpApplicationInfoList$ar$ds(String str, ArrayList arrayList) {
        int size = arrayList.size();
        Log.d("Launcher.Model", str + " size=" + size);
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            AppInfo appInfo = (AppInfo) arrayList.get(i);
            String valueOf = String.valueOf(appInfo.title);
            String valueOf2 = String.valueOf(appInfo.iconBitmap);
            String packageName = appInfo.componentName.getPackageName();
            Log.d("Launcher.Model", "   title=\"" + valueOf + "\" iconBitmap=" + valueOf2 + " componentName=" + packageName);
        }
    }

    public static int initFlags(LauncherActivityInfoCompat launcherActivityInfoCompat) {
        int i = launcherActivityInfoCompat.getApplicationInfo().flags;
        if ((i & 1) == 0) {
            return (i & 128) == 0 ? 1 : 3;
        }
        return 0;
    }

    public static Intent makeLaunchIntent(Context context, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandleCompat userHandleCompat) {
        return new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(launcherActivityInfoCompat.getComponentName()).setFlags(270532608).putExtra("profile", UserManagerCompat.getInstance(context).getSerialNumberForUser(userHandleCompat));
    }

    public final Intent getIntent() {
        return this.intent;
    }

    public final boolean isDisabled() {
        return this.isDisabled != 0;
    }

    public final ComponentKey toComponentKey() {
        return new ComponentKey(this.componentName, this.user);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.title);
        long j = this.f16556id;
        int i = this.itemType;
        long j2 = this.container;
        long j3 = this.screenId;
        int i2 = this.cellX;
        int i3 = this.cellY;
        int i4 = this.spanX;
        int i5 = this.spanY;
        String arrays = Arrays.toString((int[]) null);
        String valueOf2 = String.valueOf(this.user);
        return "ApplicationInfo(title=" + valueOf + " id=" + j + " type=" + i + " container=" + j2 + " screen=" + j3 + " cellX=" + i2 + " cellY=" + i3 + " spanX=" + i4 + " spanY=" + i5 + " dropPos=" + arrays + " user=" + valueOf2 + ")";
    }

    public AppInfo(Context context, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandleCompat userHandleCompat, IconCache iconCache) {
        this(context, launcherActivityInfoCompat, userHandleCompat, iconCache, UserManagerCompat.getInstance(context).isQuietModeEnabled(userHandleCompat));
    }

    public AppInfo(Context context, LauncherActivityInfoCompat launcherActivityInfoCompat, UserHandleCompat userHandleCompat, IconCache iconCache, boolean z) {
        this.flags = 0;
        this.isDisabled = 0;
        this.componentName = launcherActivityInfoCompat.getComponentName();
        this.container = -1;
        this.flags = initFlags(launcherActivityInfoCompat);
        if (PackageManagerHelper.isAppSuspended(launcherActivityInfoCompat.getApplicationInfo())) {
            this.isDisabled |= 4;
        }
        if (z) {
            this.isDisabled |= 8;
        }
        iconCache.getTitleAndIcon(this, launcherActivityInfoCompat, true);
        this.intent = makeLaunchIntent(context, launcherActivityInfoCompat, userHandleCompat);
        this.user = userHandleCompat;
    }
}
