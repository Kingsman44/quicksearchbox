package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.p10782e.C143873c;
import java.util.List;

/* renamed from: com.google.android.gms.cloudmessaging.o */
/* compiled from: PG */
public final class C143688o {

    /* renamed from: a */
    private final Context f389548a;

    /* renamed from: b */
    private int f389549b;

    /* renamed from: c */
    private int f389550c = 0;

    public C143688o(Context context) {
        this.f389548a = context;
    }

    /* renamed from: a */
    public final synchronized int mo119060a() {
        PackageInfo packageInfo;
        if (this.f389549b == 0) {
            try {
                packageInfo = C143873c.f389983a.mo119351a(this.f389548a).mo119348b("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f389549b = packageInfo.versionCode;
            }
        }
        return this.f389549b;
    }

    /* renamed from: b */
    public final synchronized int mo119061b() {
        int i = this.f389550c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f389548a.getPackageManager();
        if (C143873c.f389983a.mo119351a(this.f389548a).f389982a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.isEmpty()) {
                Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
                this.f389550c = 2;
                return 2;
            }
            this.f389550c = 2;
            return 2;
        }
        Log.e("Metadata", "Google Play services missing or without correct permission.");
        return 0;
    }
}
