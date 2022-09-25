package com.google.android.apps.search.assistant.surfaces.voice.p9696m.p9708j;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.m.j.m */
/* compiled from: PG */
public final class C128361m {
    /* renamed from: a */
    public static boolean m209474a(PackageManager packageManager) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.deskclock", 0);
            if (packageInfo != null) {
                if (packageInfo.getLongVersionCode() >= 62000712) {
                    if (packageInfo.applicationInfo == null || !packageInfo.applicationInfo.enabled) {
                        return false;
                    }
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
