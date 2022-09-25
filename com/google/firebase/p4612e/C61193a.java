package com.google.firebase.p4612e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.core.content.C1879e;

/* renamed from: com.google.firebase.e.a */
/* compiled from: PG */
public final class C61193a {

    /* renamed from: a */
    private final Context f165539a;

    /* renamed from: b */
    private final SharedPreferences f165540b;

    /* renamed from: c */
    private final boolean f165541c;

    public C61193a(Context context, String str) {
        ApplicationInfo applicationInfo;
        Context a = C1879e.m5131a(context);
        this.f165539a = a;
        SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.common.prefs:".concat(str), 0);
        this.f165540b = sharedPreferences;
        boolean z = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
        } else {
            try {
                PackageManager packageManager = a.getPackageManager();
                if (!(packageManager == null || (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        this.f165541c = z;
    }

    /* renamed from: a */
    public final synchronized boolean mo57757a() {
        return this.f165541c;
    }
}
