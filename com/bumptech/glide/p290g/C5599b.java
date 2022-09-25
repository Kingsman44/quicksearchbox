package com.bumptech.glide.p290g;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.C5955n;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bumptech.glide.g.b */
/* compiled from: PG */
public final class C5599b {

    /* renamed from: a */
    private static final ConcurrentMap f16936a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C5955n m14563a(Context context) {
        PackageInfo packageInfo;
        String str;
        String packageName = context.getPackageName();
        C5955n nVar = (C5955n) f16936a.get(packageName);
        if (nVar != null) {
            return nVar;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
            packageInfo = null;
        }
        if (packageInfo != null) {
            str = String.valueOf(packageInfo.versionCode);
        } else {
            str = UUID.randomUUID().toString();
        }
        C5602e eVar = new C5602e(str);
        C5955n nVar2 = (C5955n) f16936a.putIfAbsent(packageName, eVar);
        return nVar2 == null ? eVar : nVar2;
    }
}
