package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.p5208h.C66611ci;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70877p;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.u */
/* compiled from: PG */
final class C15526u extends C57987f implements C70877p {

    /* renamed from: a */
    public final ArrayDeque f46496a;

    /* renamed from: b */
    public final Executor f46497b;

    /* renamed from: c */
    public final Executor f46498c;

    /* renamed from: d */
    public final C15481g f46499d;

    /* renamed from: g */
    private final C57981b f46500g;

    public C15526u(C57981b bVar, ArrayDeque arrayDeque, C60887da daVar, Executor executor, C15481g gVar) {
        this.f46500g = bVar;
        this.f46496a = arrayDeque;
        this.f46497b = new C60904dr(daVar);
        this.f46498c = executor;
        this.f46499d = gVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C15522q qVar = new C15522q(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(qVar), this.f46497b), "#onCompleted processing failed.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C15524s sVar = new C15524s(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(sVar), this.f46497b), "#onError processing failed.", new Object[0]);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C15523r rVar = new C15523r(this, (C66611ci) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(rVar), this.f46497b), "#onNext processing failed.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo22390d(C70868g gVar) {
        C58976aa aaVar = C58975e.f156826a;
        gVar.mo62578d(new C15525t(this, gVar));
    }

    /* renamed from: e */
    public final void mo22391e() {
        C58976aa aaVar = C58975e.f156826a;
        this.f46500g.mo20388jK();
    }
}
