package com.google.android.gms.common.p10782e;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;

/* renamed from: com.google.android.gms.common.e.b */
/* compiled from: PG */
public final class C143872b {

    /* renamed from: a */
    public final Context f389982a;

    public C143872b(Context context) {
        this.f389982a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo mo119347a(String str, int i) {
        return this.f389982a.getPackageManager().getApplicationInfo(str, i);
    }

    /* renamed from: b */
    public final PackageInfo mo119348b(String str, int i) {
        return this.f389982a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: c */
    public final boolean mo119349c() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C143871a.m233880a(this.f389982a);
        }
        String nameForUid = this.f389982a.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return this.f389982a.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo119350d(int i, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f389982a.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }
}
