package com.android.launcher3.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.android.launcher3.Utilities;

/* compiled from: PG */
public final class PackageManagerHelper {
    public static boolean hasPermissionForActivity(Context context, Intent intent, String str) {
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity == null) {
            return false;
        }
        if (TextUtils.isEmpty(resolveActivity.activityInfo.permission)) {
            return true;
        }
        if (TextUtils.isEmpty(str) || packageManager.checkPermission(resolveActivity.activityInfo.permission, str) != 0) {
            return false;
        }
        if (!Utilities.ATLEAST_MARSHMALLOW || TextUtils.isEmpty(AppOpsManager.permissionToOp(resolveActivity.activityInfo.permission))) {
            return true;
        }
        try {
            if (packageManager.getApplicationInfo(str, 0).targetSdkVersion >= 23) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean isAppEnabled(PackageManager packageManager, String str, int i) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, i);
            if (applicationInfo == null || !applicationInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean isAppSuspended(ApplicationInfo applicationInfo) {
        if (!Utilities.ATLEAST_NOUGAT || (applicationInfo.flags & 1073741824) == 0) {
            return false;
        }
        return true;
    }
}
