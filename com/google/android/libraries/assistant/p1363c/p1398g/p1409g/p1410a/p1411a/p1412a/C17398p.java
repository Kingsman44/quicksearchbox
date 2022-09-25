package com.google.android.libraries.assistant.p1363c.p1398g.p1409g.p1410a.p1411a.p1412a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;
import com.google.speech.p5208h.C66611ci;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.c.g.g.a.a.a.p */
/* compiled from: PG */
final class C17398p extends C57987f implements C70862aj {

    /* renamed from: a */
    public final Executor f50289a;

    /* renamed from: b */
    private final C57981b f50290b;

    public C17398p(C57981b bVar, Executor executor) {
        this.f50290b = bVar;
        this.f50289a = executor;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C17396n nVar = new C17396n(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(nVar), this.f50289a), "#onCompleted processing failed.", new Object[0]);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C17395m mVar = new C17395m(this, th);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(mVar), this.f50289a), "#onError processing failed.", new Object[0]);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C17397o oVar = new C17397o(this, (C66611ci) obj);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(oVar), this.f50289a), "#onNext processing failed.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo23344d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f50290b.mo20388jK();
    }
}
