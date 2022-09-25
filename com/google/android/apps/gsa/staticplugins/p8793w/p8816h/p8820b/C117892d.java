package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b;

import com.google.android.apps.gsa.search.core.p6519al.p6741k.C85505a;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.libraries.search.p2904c.C37478d;
import com.google.android.libraries.search.p2904c.C37520e;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.b.d */
/* compiled from: PG */
public final /* synthetic */ class C117892d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C117893e f327220a;

    /* renamed from: b */
    public final /* synthetic */ long f327221b;

    public /* synthetic */ C117892d(C117893e eVar, long j) {
        this.f327220a = eVar;
        this.f327221b = j;
    }

    public final void run() {
        C117893e eVar = this.f327220a;
        long j = this.f327221b;
        if (eVar.f327223b.mo79746e(C90086ek.f250467dg) && eVar.f327227f) {
            eVar.f327227f = false;
            eVar.f327224c.mo79028c(j);
            eVar.f327224c.mo79033i(C37520e.ROUTE_NO_AUDIO, C37478d.CONNECTION_TYPE_NONE, (C85505a) null, true);
        }
    }
}
