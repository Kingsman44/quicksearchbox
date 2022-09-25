package com.google.android.apps.gsa.search.core.p6513aj;

import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.search.core.aj.z */
/* compiled from: PG */
public final class C84566z {

    /* renamed from: a */
    private final C69464a f230147a;

    /* renamed from: b */
    private final PackageManager f230148b;

    public C84566z(C69464a aVar, PackageManager packageManager) {
        this.f230147a = aVar;
        this.f230148b = packageManager;
    }

    /* renamed from: a */
    public final void mo78317a(int i) {
        if (!mo78319c(i, "com.google.android.apps.maps") && !mo78319c(i, "com.google.android.apps.gmm") && !mo78319c(i, "com.google.android.apps.gmm.fishfood") && !mo78319c(i, "com.google.android.apps.gmm.dev") && !mo78319c(i, "com.google.android.apps.gmm.qp")) {
            throw new SecurityException("Operation not supported for this client.");
        }
    }

    /* renamed from: b */
    public final void mo78318b(int i) {
        if (i != Process.myUid()) {
            ((C21560e) this.f230147a.mo17428b()).f59951a.mo119083b(i);
        }
    }

    /* renamed from: c */
    public final boolean mo78319c(int i, String str) {
        String[] packagesForUid = this.f230148b.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0 || !str.equals(packagesForUid[0])) {
            return false;
        }
        return ((C21560e) this.f230147a.mo17428b()).f59951a.mo119084c(str);
    }
}
