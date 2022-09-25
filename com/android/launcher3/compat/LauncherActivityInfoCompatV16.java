package com.android.launcher3.compat;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.evernote.android.state.BuildConfig;

/* compiled from: PG */
public class LauncherActivityInfoCompatV16 extends LauncherActivityInfoCompat {
    private final ActivityInfo mActivityInfo;
    private final ComponentName mComponentName;
    private final PackageManager mPm;
    private final ResolveInfo mResolveInfo;

    public LauncherActivityInfoCompatV16(Context context, ResolveInfo resolveInfo) {
        this.mResolveInfo = resolveInfo;
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        this.mActivityInfo = activityInfo;
        this.mComponentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        this.mPm = context.getPackageManager();
    }

    public ApplicationInfo getApplicationInfo() {
        return this.mActivityInfo.applicationInfo;
    }

    public ComponentName getComponentName() {
        return this.mComponentName;
    }

    public long getFirstInstallTime() {
        try {
            PackageInfo packageInfo = this.mPm.getPackageInfo(this.mActivityInfo.packageName, 0);
            if (packageInfo != null) {
                return packageInfo.firstInstallTime;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public Drawable getIcon(int i) {
        int iconResource = this.mResolveInfo.getIconResource();
        Drawable drawable = null;
        if (!(i == 0 || iconResource == 0)) {
            try {
                drawable = this.mPm.getResourcesForApplication(this.mActivityInfo.applicationInfo).getDrawableForDensity(iconResource, i);
            } catch (PackageManager.NameNotFoundException | Resources.NotFoundException unused) {
            }
        }
        if (drawable == null) {
            drawable = this.mResolveInfo.loadIcon(this.mPm);
        }
        return drawable == null ? Resources.getSystem().getDrawableForDensity(17629184, i) : drawable;
    }

    public CharSequence getLabel() {
        try {
            return this.mResolveInfo.loadLabel(this.mPm);
        } catch (SecurityException e) {
            Log.e("LAInfoCompat", "Failed to extract app display name from resolve info", e);
            return BuildConfig.FLAVOR;
        }
    }

    public String getName() {
        return this.mActivityInfo.name;
    }

    public UserHandleCompat getUser() {
        return UserHandleCompat.myUserHandle();
    }
}
