package com.google.android.gms.gmscompliance.p10800a.p10801a.p10806e;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.gmscompliance.p10800a.p10801a.p10805d.C144253a;
import com.google.android.libraries.directboot.C20674d;
import com.google.android.p10905k.C146606e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.gms.gmscompliance.a.a.e.a */
/* compiled from: PG */
public final class C144255a {

    /* renamed from: a */
    private static final C144253a f390707a = new C144253a("AndroidIdProvider");

    /* renamed from: a */
    public static C58833ax m234500a(Context context) {
        if (C20674d.m38855d(context)) {
            f390707a.mo119307d("getAndroidId called in direct boot mode.", new Object[0]);
            return C58836b.f156633a;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        if (packageManager.checkPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", packageName) == 0) {
            return C58833ax.m90834k(Long.valueOf(C146606e.m238845g(context.getContentResolver(), 0)));
        }
        f390707a.mo119307d("app %s doesn't have gservice read permission", packageName);
        return C58836b.f156633a;
    }
}
