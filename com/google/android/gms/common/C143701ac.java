package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import java.util.Set;

/* renamed from: com.google.android.gms.common.ac */
/* compiled from: PG */
public final class C143701ac {

    /* renamed from: b */
    private static C143701ac f389602b;

    /* renamed from: c */
    private static volatile Set f389603c;

    /* renamed from: a */
    public final Context f389604a;

    /* renamed from: d */
    private volatile String f389605d;

    public C143701ac(Context context) {
        this.f389604a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C143701ac m233450a(Context context) {
        C143919bh.m233958a(context);
        synchronized (C143701ac.class) {
            if (f389602b == null) {
                C143993r.m234175c(context);
                f389602b = new C143701ac(context);
            }
        }
        return f389602b;
    }

    /* renamed from: f */
    static final C143989n m233451f(PackageInfo packageInfo, C143989n... nVarArr) {
        if (packageInfo.signatures == null) {
            return null;
        }
        if (packageInfo.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        C143990o oVar = new C143990o(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < nVarArr.length; i++) {
            if (nVarArr[i].equals(oVar)) {
                return nVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: g */
    public static final boolean m233452g(PackageInfo packageInfo, boolean z) {
        C143989n nVar;
        if (z && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null || (applicationInfo.flags & 129) == 0) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                nVar = m233451f(packageInfo, C143992q.f390229a);
            } else {
                nVar = m233451f(packageInfo, C143992q.f390229a[0]);
            }
            if (nVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final C144020w m233453h(int i) {
        String[] packagesForUid = this.f389604a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid == null || (r0 = packagesForUid.length) == 0) {
            return C144020w.m234200b("no pkgs");
        }
        C144020w wVar = null;
        for (String e : packagesForUid) {
            wVar = mo119086e(e);
            if (wVar.f390258b) {
                return wVar;
            }
        }
        C143919bh.m233958a(wVar);
        return wVar;
    }

    /* renamed from: b */
    public final void mo119083b(int i) {
        try {
            m233453h(i).mo119529e();
        } catch (SecurityException e) {
            m233453h(i).mo119529e();
            Log.e("GoogleSignatureVerifier", "flaky result", e);
        }
    }

    /* renamed from: c */
    public final boolean mo119084c(String str) {
        C144020w e = mo119086e(str);
        e.mo119528d();
        return e.f390258b;
    }

    /* renamed from: d */
    public final boolean mo119085d(int i) {
        C144020w h = m233453h(i);
        h.mo119528d();
        return h.f390258b;
    }

    /* renamed from: e */
    public final C144020w mo119086e(String str) {
        C144020w wVar;
        if (str == null) {
            return C144020w.m234200b("null pkg");
        }
        if (str.equals(this.f389605d)) {
            return C144020w.f390257a;
        }
        if (C143993r.m234176d()) {
            wVar = C143993r.m234177e(str, C143700ab.m233444f(this.f389604a));
        } else {
            try {
                PackageInfo packageInfo = this.f389604a.getPackageManager().getPackageInfo(str, 64);
                boolean f = C143700ab.m233444f(this.f389604a);
                if (packageInfo == null) {
                    wVar = C144020w.m234200b("null pkg");
                } else if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
                    wVar = C144020w.m234200b("single cert required");
                } else {
                    C143990o oVar = new C143990o(packageInfo.signatures[0].toByteArray());
                    String str2 = packageInfo.packageName;
                    C144020w a = C143993r.m234173a(str2, oVar, f, false);
                    wVar = (!a.f390258b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !C143993r.m234173a(str2, oVar, false, true).f390258b) ? a : C144020w.m234200b("debuggable release cert app rejected");
                }
            } catch (PackageManager.NameNotFoundException e) {
                return C144020w.m234201c("no pkg ".concat(str), e);
            }
        }
        if (wVar.f390258b) {
            this.f389605d = str;
        }
        return wVar;
    }
}
