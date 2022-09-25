package com.google.android.apps.gsa.searchbox.p6944c;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.c.c */
/* compiled from: PG */
public final class C88584c {

    /* renamed from: a */
    public final LruCache f239426a = new LruCache(100);

    /* renamed from: b */
    public final PackageManager f239427b;

    /* renamed from: c */
    private final LruCache f239428c = new LruCache(100);

    public C88584c(PackageManager packageManager) {
        this.f239427b = packageManager;
    }

    /* renamed from: a */
    public static int m143161a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                return applicationInfo.icon;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return 0;
        }
    }

    /* renamed from: b */
    public static long m143162b(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return 0;
        }
    }

    /* renamed from: c */
    public final C88548b mo82253c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C88548b bVar = (C88548b) this.f239428c.get(str);
        if (bVar == null) {
            C88548b bVar2 = new C88548b(m143161a(this.f239427b, str), m143162b(this.f239427b, str));
            C58976aa aaVar = C58975e.f156826a;
            this.f239428c.put(str, bVar2);
            return bVar2;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        return bVar;
    }
}
