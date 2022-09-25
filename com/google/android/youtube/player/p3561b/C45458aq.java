package com.google.android.youtube.player.p3561b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: com.google.android.youtube.player.b.aq */
public final class C45458aq {

    /* renamed from: a */
    private static final String[] f118869a = {"com.google.android.youtube", "com.google.android.youtube.tv", "com.google.android.youtube.googletv", "com.google.android.gms"};

    static {
        Uri.parse("https://play.google.com/store/apps/details");
    }

    /* renamed from: a */
    public static Context m81130a(Context context) {
        Context context2;
        try {
            context2 = context.createPackageContext(m81132c(context), 3);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e.getMessage());
            C45457ap.m81128a(valueOf.length() != 0 ? "NameNotFoundException ".concat(valueOf) : new String("NameNotFoundException "), new Object[0]);
            context2 = null;
        }
        if (context2 == null) {
            return null;
        }
        return context2;
    }

    /* renamed from: b */
    public static String m81131b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", e);
        }
    }

    /* renamed from: c */
    public static String m81132c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        String[] strArr = f118869a;
        int length = strArr.length;
        for (int i = 0; i < 4; i++) {
            ResolveInfo resolveService = packageManager.resolveService(new Intent("com.google.android.youtube.api.service.START").setPackage(strArr[i]), 0);
            if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.packageName != null) {
                return resolveService.serviceInfo.packageName;
            }
        }
        return !packageManager.hasSystemFeature("android.software.leanback") ? packageManager.hasSystemFeature("com.google.android.tv") ? "com.google.android.youtube.googletv" : "com.google.android.youtube" : "com.google.android.youtube.tv";
    }

    /* renamed from: d */
    public static boolean m81133d(Context context, String str) {
        try {
            Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(str);
            if (true == str.equals("com.google.android.youtube.googletvdev")) {
                str = "com.google.android.youtube.googletv";
            }
            int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", str);
            return identifier == 0 || resourcesForApplication.getInteger(identifier) / 100 < 113;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
