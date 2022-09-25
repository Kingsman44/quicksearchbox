package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37414bs;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70887z;

/* renamed from: com.google.android.libraries.search.c.x.a.h */
/* compiled from: PG */
final class C38199h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f101245a;

    /* renamed from: b */
    final /* synthetic */ int f101246b;

    public C38199h(C70862aj ajVar, int i) {
        this.f101245a = ajVar;
        this.f101246b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52991)).mo56387q("#audio# Failed to get client deactivation status. clientToken: %d", this.f101246b);
        if (!((C70887z) this.f101245a).f189070a.mo62063h()) {
            this.f101245a.mo20122b(th);
        }
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C37414bs bsVar = (C37414bs) obj;
        if (!((C70887z) this.f101245a).f189070a.mo62063h()) {
            this.f101245a.mo20123c(bsVar);
            this.f101245a.mo20121a();
        }
    }
}
