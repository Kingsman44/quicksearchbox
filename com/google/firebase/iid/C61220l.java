package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.C61204g;
import java.util.List;

/* renamed from: com.google.firebase.iid.l */
/* compiled from: PG */
public final class C61220l {

    /* renamed from: a */
    private final Context f165602a;

    /* renamed from: b */
    private String f165603b;

    /* renamed from: c */
    private String f165604c;

    /* renamed from: d */
    private int f165605d;

    /* renamed from: e */
    private int f165606e = 0;

    public C61220l(Context context) {
        this.f165602a = context;
    }

    /* renamed from: e */
    public static String m93609e(C61204g gVar) {
        gVar.mo57770f();
        String str = gVar.f165557e.f165715c;
        if (str != null) {
            return str;
        }
        gVar.mo57770f();
        String str2 = gVar.f165557e.f165714b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: f */
    private final PackageInfo m93610f(String str) {
        try {
            return this.f165602a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseInstanceId", "Failed to find package ".concat(e.toString()));
            return null;
        }
    }

    /* renamed from: g */
    private final synchronized void m93611g() {
        PackageInfo f = m93610f(this.f165602a.getPackageName());
        if (f != null) {
            this.f165603b = Integer.toString(f.versionCode);
            this.f165604c = f.versionName;
        }
    }

    /* renamed from: a */
    public final synchronized int mo57789a() {
        PackageInfo f;
        if (this.f165605d == 0 && (f = m93610f("com.google.android.gms")) != null) {
            this.f165605d = f.versionCode;
        }
        return this.f165605d;
    }

    /* renamed from: b */
    public final synchronized int mo57790b() {
        int i = this.f165606e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f165602a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") != -1) {
            Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
            if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                this.f165606e = 2;
                return 2;
            }
            this.f165606e = 2;
            return 2;
        }
        Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
        return 0;
    }

    /* renamed from: c */
    public final synchronized String mo57791c() {
        if (this.f165603b == null) {
            m93611g();
        }
        return this.f165603b;
    }

    /* renamed from: d */
    public final synchronized String mo57792d() {
        if (this.f165604c == null) {
            m93611g();
        }
        return this.f165604c;
    }
}
