package com.google.android.libraries.search.p2904c.p2982x.p2983a;

import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.android.libraries.search.p2904c.C37666hm;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.c.x.a.f */
/* compiled from: PG */
final class C38197f implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f101239a;

    /* renamed from: b */
    final /* synthetic */ int f101240b;

    public C38197f(C70862aj ajVar, int i) {
        this.f101239a = ajVar;
        this.f101240b = i;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C38203l.f101252a.mo56226d()).mo56372aa(52989)).mo56387q("#audio# Failed to get HotwordStopListeningStatus. sessionToken: %d", this.f101240b);
        C70862aj ajVar = this.f101239a;
        C37512ds dsVar = C37512ds.FAILED_CLOSING_ERROR_IN_GETTING_AUDIO_SOURCE_CLOSING_STATUS;
        ajVar.mo20123c(C37846as.m66807m(C37846as.m66801g(dsVar), C37565ef.CLIENT_REQUESTED));
        this.f101239a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        this.f101239a.mo20123c((C37666hm) obj);
        this.f101239a.mo20121a();
    }
}
