package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class DeferredLauncherActivityInfo extends LauncherActivityInfoCompat {
    private LauncherActivityInfoCompat mActualInfo;
    private final ComponentName mComponent;
    private final Context mContext;
    private final UserHandleCompat mUser;

    public DeferredLauncherActivityInfo(ComponentName componentName, UserHandleCompat userHandleCompat, Context context) {
        this.mComponent = componentName;
        this.mUser = userHandleCompat;
        this.mContext = context;
    }

    private synchronized LauncherActivityInfoCompat getActualInfo() {
        if (this.mActualInfo == null) {
            this.mActualInfo = LauncherAppsCompat.getInstance(this.mContext).resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(this.mComponent), this.mUser);
        }
        return this.mActualInfo;
    }

    public ApplicationInfo getApplicationInfo() {
        return getActualInfo().getApplicationInfo();
    }

    public ComponentName getComponentName() {
        return this.mComponent;
    }

    public long getFirstInstallTime() {
        return getActualInfo().getFirstInstallTime();
    }

    public Drawable getIcon(int i) {
        return getActualInfo().getIcon(i);
    }

    public CharSequence getLabel() {
        return getActualInfo().getLabel();
    }

    public UserHandleCompat getUser() {
        return this.mUser;
    }
}
