package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.v */
/* compiled from: PG */
public final class C32326v implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C32849cq f86653a;

    /* renamed from: b */
    final /* synthetic */ Optional f86654b;

    public C32326v(C32849cq cqVar, Optional optional) {
        this.f86653a = cqVar;
        this.f86654b = optional;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C59052c cVar = (C59052c) C32327w.f86655a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(this.f86653a);
        Optional optional = this.f86654b;
        cVar.mo56379ah(new C59094n(52560));
        cVar.mo56354G("SODA speech biasing context update is complete. SessionToken: %s; RequestId: %s", b, optional);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) C32327w.f86655a.mo56225c();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        C59052c cVar2 = (C59052c) cVar.mo56382g(th);
        String b = C32941s.m60951b(this.f86653a);
        Optional optional = this.f86654b;
        cVar2.mo56379ah(new C59094n(52561));
        cVar2.mo56354G("SODA speech biasing context update error. SessionToken: %s; RequestId: %s", b, optional);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C69664n.m101061g((C67087ko) obj, "value");
        C59052c cVar = (C59052c) C32327w.f86655a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        String b = C32941s.m60951b(this.f86653a);
        Optional optional = this.f86654b;
        cVar.mo56379ah(new C59094n(52562));
        cVar.mo56354G("SODA speech biasing context update #onNext. SessionToken: %s; RequestId: %s", b, optional);
    }
}
