package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4566l.C60129au;
import com.google.common.p4552o.p4566l.C60180cr;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.mdi.download.d.e.v */
/* compiled from: PG */
final class C29055v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C60129au f78857a;

    /* renamed from: b */
    final /* synthetic */ long f78858b;

    /* renamed from: c */
    final /* synthetic */ C29056w f78859c;

    /* renamed from: d */
    final /* synthetic */ int f78860d;

    public C29055v(C29056w wVar, int i, C60129au auVar, long j) {
        this.f78859c = wVar;
        this.f78860d = i;
        this.f78857a = auVar;
        this.f78858b = j;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C29045l.m53938j(th, "%s: failure when sampling log!", "MddEventLogger");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            this.f78859c.mo34559m(this.f78860d, this.f78857a, this.f78858b, (C60180cr) axVar.mo56107c());
        }
    }
}
