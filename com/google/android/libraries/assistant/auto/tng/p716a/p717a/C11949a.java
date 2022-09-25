package com.google.android.libraries.assistant.auto.tng.p716a.p717a;

import com.google.android.apps.auto.p450a.p451a.C8911d;
import com.google.android.apps.auto.p450a.p451a.C8912e;
import com.google.android.apps.auto.p450a.p451a.C8913f;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.C11525d;
import com.google.android.libraries.assistant.auto.jumpboost.p671g.p672a.C11476b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34043bf;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34075ck;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34076cl;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.a.a.a */
/* compiled from: PG */
public final class C11949a implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C11950b f38387a;

    public C11949a(C11950b bVar) {
        this.f38387a = bVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        this.f38387a.mo20324a();
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C69664n.m101061g(th, "ex");
        C59052c cVar = (C59052c) ((C59052c) C11950b.f38388a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(43905));
        cVar.mo56386p("Subscription failed.");
        this.f38387a.mo20324a();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C34039bb bbVar;
        C34076cl clVar = (C34076cl) obj;
        C69664n.m101061g(clVar, "serviceMessage");
        if (C34075ck.m62715a(clVar.f90799a) == C34075ck.INVOCATION) {
            if (clVar.f90799a == 1) {
                bbVar = (C34039bb) clVar.f90800b;
            } else {
                bbVar = C34039bb.f90716f;
            }
            C69664n.m101060f(bbVar, "serviceMessage.invocation");
            C34043bf a = C34043bf.m62692a(bbVar.f90719b);
            if (a == null) {
                a = C34043bf.UNRECOGNIZED;
            }
            int ordinal = a.ordinal();
            if (ordinal == 1) {
                C69664n.m101061g(bbVar, "invocation");
            } else if (ordinal == 2 || ordinal == 3) {
                C11476b bVar = this.f38387a.f38392e;
                C69664n.m101061g(bbVar, "invocation");
                C11525d dVar = bVar.f37279a;
                C8912e eVar = (C8912e) C8913f.f30923e.createBuilder();
                C69664n.m101060f(eVar, "newBuilder()");
                C8911d a2 = C69664n.m101061g(eVar, "builder");
                C63042fg i = C62953e.m95484i(bVar.f37280b.mo26871c());
                C69664n.m101060f(i, "fromMillis(clock.elapsedRealtime())");
                a2.mo17275b(i);
                a2.mo17276c();
                C46459k.m82829b(dVar.mo20027d(a2.mo17274a()), "Failed to start Assistant session", new Object[0]);
            } else if (ordinal == 4) {
                C69664n.m101061g(bbVar, "invocation");
            } else if (ordinal != 5) {
                C59052c cVar = (C59052c) C11950b.f38388a.mo56226d();
                C34043bf a3 = C34043bf.m62692a(bbVar.f90719b);
                if (a3 == null) {
                    a3 = C34043bf.UNRECOGNIZED;
                }
                String name = a3.name();
                cVar.mo56379ah(new C59094n(43906));
                cVar.mo56389s("Received invocation from unimplemented entrypoint: %s", name);
            } else {
                C69664n.m101061g(bbVar, "invocation");
            }
        } else {
            C59052c cVar2 = (C59052c) C11950b.f38388a.mo56224b();
            C34075ck a4 = C34075ck.m62715a(clVar.f90799a);
            cVar2.mo56379ah(new C59094n(43907));
            cVar2.mo56389s("Received unsupported service message(%s).", a4);
        }
    }
}
