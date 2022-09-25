package com.google.android.libraries.places.p2424a.p2425a;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: com.google.android.libraries.places.a.a.d */
/* compiled from: PG */
public abstract class C31773d {
    /* renamed from: d */
    public static C31772c m59126d(Context context) {
        String packageName = context.getPackageName();
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        C31770a aVar = new C31770a();
        if (packageName != null) {
            aVar.f85378a = packageName;
            aVar.f85379b = i;
            aVar.f85380c = 1;
            aVar.f85381d = 1;
            return aVar;
        }
        throw new NullPointerException("Null packageName");
    }

    /* renamed from: a */
    public abstract int mo37373a();

    /* renamed from: b */
    public abstract String mo37374b();

    /* renamed from: c */
    public abstract int mo37375c();
}
