package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
public abstract class LauncherActivityInfoCompat {
    public static LauncherActivityInfoCompat fromResolveInfo(ResolveInfo resolveInfo, Context context) {
        return new LauncherActivityInfoCompatV16(context, resolveInfo);
    }

    public abstract ApplicationInfo getApplicationInfo();

    public abstract ComponentName getComponentName();

    public abstract long getFirstInstallTime();

    public abstract Drawable getIcon(int i);

    public abstract CharSequence getLabel();

    public abstract UserHandleCompat getUser();
}
