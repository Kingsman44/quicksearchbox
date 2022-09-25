package com.google.android.setupcompat.p3549a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.google.android.setupcompat.a.d */
/* compiled from: PG */
public final class C45241d {

    /* renamed from: e */
    private static final String f118171e = "d";

    /* renamed from: a */
    public final String f118172a;

    /* renamed from: b */
    public final String f118173b;

    /* renamed from: c */
    public final int f118174c;

    /* renamed from: d */
    public final Resources f118175d;

    public C45241d(String str, String str2, int i, Resources resources) {
        this.f118172a = str;
        this.f118173b = str2;
        this.f118174c = i;
        this.f118175d = resources;
    }

    /* renamed from: a */
    public static C45241d m80593a(Context context, Bundle bundle) {
        if (bundle.containsKey("packageName") && bundle.containsKey("resourceName") && bundle.containsKey("resourceId")) {
            String string = bundle.getString("packageName");
            String string2 = bundle.getString("resourceName");
            int i = bundle.getInt("resourceId");
            try {
                PackageManager packageManager = context.getPackageManager();
                return new C45241d(string, string2, i, packageManager.getResourcesForApplication(packageManager.getApplicationInfo(string, 512)));
            } catch (PackageManager.NameNotFoundException unused) {
                Bundle bundle2 = bundle.getBundle("fallbackConfig");
                if (bundle2 != null) {
                    String str = f118171e;
                    Log.w(str, string + " not found, " + string2 + " fallback to default value");
                    return m80593a(context, bundle2);
                }
            }
        }
        return null;
    }
}
