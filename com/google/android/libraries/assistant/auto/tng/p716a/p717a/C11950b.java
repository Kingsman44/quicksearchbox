package com.google.android.libraries.assistant.auto.tng.p716a.p717a;

import com.google.android.libraries.assistant.auto.jumpboost.p671g.p672a.C11476b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34091d;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.a.a.b */
/* compiled from: PG */
public final class C11950b {

    /* renamed from: a */
    public static final C59071e f38388a = C59071e.m91331h();

    /* renamed from: b */
    public final C34091d f38389b;

    /* renamed from: c */
    public final C34037b f38390c;

    /* renamed from: d */
    public C70868g f38391d;

    /* renamed from: e */
    public final C11476b f38392e;

    public C11950b(C34091d dVar, C34037b bVar, C11476b bVar2) {
        C69664n.m101061g(dVar, "triggeringServiceStub");
        C69664n.m101061g(bVar, "apaClient");
        this.f38389b = dVar;
        this.f38390c = bVar;
        this.f38392e = bVar2;
    }

    /* renamed from: a */
    public final void mo20324a() {
        C70868g gVar = this.f38391d;
        if (gVar == null) {
            C69664n.m101065k("clientObserver");
            gVar = null;
        }
        ((C70869h) gVar).f189042b.mo27480d("Disconnect from APA Triggering Service", (Throwable) null);
    }
}
