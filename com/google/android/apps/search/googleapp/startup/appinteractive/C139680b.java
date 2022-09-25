package com.google.android.apps.search.googleapp.startup.appinteractive;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.p4522b.C58758qx;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.startup.appinteractive.b */
/* compiled from: PG */
public final class C139680b {

    /* renamed from: a */
    public final C139685g f379667a = new C139685g();

    /* renamed from: b */
    public final Set f379668b = new HashSet();

    /* renamed from: c */
    public final Map f379669c = new HashMap();

    /* renamed from: d */
    public final C60887da f379670d;

    public C139680b(C60887da daVar) {
        this.f379670d = daVar;
    }

    /* renamed from: a */
    public final void mo115163a() {
        C19559g.m37304c();
        C139685g gVar = this.f379667a;
        if (!gVar.f379677a) {
            gVar.f379677a = true;
            HashSet<C139682d> f = C58758qx.m90648f(this.f379668b);
            this.f379668b.clear();
            for (C139682d a : f) {
                a.mo115165a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo115164b(C139682d dVar) {
        C19559g.m37304c();
        this.f379668b.remove(dVar);
        C60870cx cxVar = (C60870cx) this.f379669c.remove(dVar);
        if (cxVar != null) {
            cxVar.cancel(false);
        }
    }
}
