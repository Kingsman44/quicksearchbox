package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b;

import com.google.common.base.C58872ci;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.b.n */
/* compiled from: PG */
final class C121506n extends C121509q {

    /* renamed from: a */
    final /* synthetic */ C58872ci f337192a;

    /* renamed from: b */
    final /* synthetic */ List f337193b;

    /* renamed from: c */
    final /* synthetic */ Instant f337194c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121506n(C121509q qVar, C121501i iVar, C58872ci ciVar, List list, Instant instant) {
        super(qVar, iVar);
        this.f337192a = ciVar;
        this.f337193b = list;
        this.f337194c = instant;
    }

    /* renamed from: a */
    public final void mo105206a() {
        this.f337192a.mo56162g();
        C121501i iVar = this.f337201g;
        List list = this.f337193b;
        Instant instant = this.f337194c;
        Duration ofNanos = Duration.ofNanos(this.f337192a.mo56159b());
        C121502j a = C121499g.m200775a(iVar, list);
        for (C121496d dVar : C121499g.f337177a) {
            if (dVar.mo105186g(C121500h.SPAN, iVar)) {
                dVar.mo105185f(a, instant, ofNanos);
            }
        }
    }
}
