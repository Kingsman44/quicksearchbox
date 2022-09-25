package com.google.android.apps.search.assistant.surfaces.voice.titan.p9752ui.p9755b.p9756a;

import com.google.android.apps.search.assistant.surfaces.voice.p9673j.p9674a.p9675a.p9677b.C128101bw;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71361ao;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.titan.ui.b.a.ao */
/* compiled from: PG */
public final class C128706ao implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C71361ao f353809a;

    public C128706ao(C71361ao aoVar) {
        this.f353809a = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f353809a.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128735bq.f353881a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(37995));
        cVar.mo56386p("Connection stream error");
        this.f353809a.mo62727D(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C128101bw bwVar = (C128101bw) obj;
        C69664n.m101061g(bwVar, "response");
        C71348ab.m103986d(this.f353809a.mo62730w(bwVar));
    }
}
