package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.android.libraries.search.p3055n.C39276az;
import com.google.android.libraries.search.p3055n.C39651ce;
import com.google.android.libraries.search.p3055n.C39652cf;
import com.google.android.libraries.search.p3055n.C39666ct;
import com.google.android.libraries.search.p3055n.C39669cw;
import com.google.android.libraries.search.p3055n.C39670cx;
import com.google.android.libraries.search.p3055n.C39672cz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.w */
/* compiled from: PG */
public final class C32327w {
    @Deprecated

    /* renamed from: a */
    public static final C59071e f86655a = C59071e.m91331h();

    /* renamed from: b */
    private final C39651ce f86656b;

    public C32327w(C39651ce ceVar) {
        C69664n.m101061g(ceVar, "sodaAsrFrontendServiceStub");
        this.f86656b = ceVar;
    }

    /* renamed from: a */
    public final void mo38040a(C39666ct ctVar, C32849cq cqVar, Optional optional) {
        C39669cw cwVar = (C39669cw) C39670cx.f104424a.createBuilder();
        C69664n.m101060f(cwVar, "newBuilder()");
        C39672cz a = C69664n.m101061g(cwVar, "builder");
        C62940bt btVar = C39666ct.f104416f;
        C69664n.m101060f(btVar, "requestId");
        a.mo41983b(btVar, ctVar);
        C39670cx a2 = a.mo41982a();
        C59052c cVar = (C59052c) f86655a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Sbcp");
        C39276az azVar = ctVar.f104421d;
        if (azVar == null) {
            azVar = C39276az.f103456b;
        }
        C62971cq cqVar2 = azVar.f103458a;
        String b = C32941s.m60951b(cqVar);
        cVar.mo56379ah(new C59094n(52563));
        cVar.mo56359L("Sending speech biasing context update to SODA with locale %s. SessionToken: %s; RequestId: %s", cqVar2, b, optional);
        C39651ce ceVar = this.f86656b;
        C70876o.m103763d(ceVar.f189039a.mo39510a(C39652cf.m69117a(), ceVar.f189040b), a2, new C32326v(cqVar, optional), false);
    }
}
