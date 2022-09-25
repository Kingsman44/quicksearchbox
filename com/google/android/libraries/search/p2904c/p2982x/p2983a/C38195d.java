package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37418bw;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.d */
/* compiled from: PG */
final class C38195d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f101231a;

    /* renamed from: b */
    final /* synthetic */ int f101232b;

    /* renamed from: c */
    final /* synthetic */ int f101233c;

    public C38195d(C70862aj ajVar, int i, int i2) {
        this.f101231a = ajVar;
        this.f101232b = i;
        this.f101233c = i2;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52988)).mo56393w("#audio# Failed to get StopListeningStatus. clientToken: %d, sessionToken: %d", this.f101232b, this.f101233c);
        C70862aj ajVar = this.f101231a;
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS;
        ajVar.mo20123c(C37846as.m66799e(C37846as.m66801g(dsVar), C37565ef.CLIENT_REQUESTED));
        this.f101231a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f101231a.mo20123c((C37418bw) obj);
        this.f101231a.mo20121a();
    }
}
