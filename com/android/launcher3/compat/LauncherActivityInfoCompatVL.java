package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.pm.ApplicationInfo;
import android.content.pm.LauncherActivityInfo;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public class LauncherActivityInfoCompatVL extends LauncherActivityInfoCompat {
    private LauncherActivityInfo mLauncherActivityInfo;

    public LauncherActivityInfoCompatVL(LauncherActivityInfo launcherActivityInfo) {
        this.mLauncherActivityInfo = launcherActivityInfo;
    }

    public ApplicationInfo getApplicationInfo() {
        return this.mLauncherActivityInfo.getApplicationInfo();
    }

    public ComponentName getComponentName() {
        return this.mLauncherActivityInfo.getComponentName();
    }

    public long getFirstInstallTime() {
        return this.mLauncherActivityInfo.getFirstInstallTime();
    }

    public Drawable getIcon(int i) {
        return this.mLauncherActivityInfo.getIcon(i);
    }

    public CharSequence getLabel() {
        return this.mLauncherActivityInfo.getLabel();
    }

    public UserHandleCompat getUser() {
        return UserHandleCompat.fromUser(this.mLauncherActivityInfo.getUser());
    }
}
