package com.google.android.apps.search.transcription.p10670f;

import com.google.android.apps.search.transcription.p10666b.C141760s;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.speech.p5218j.C67087ko;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.transcription.f.ab */
/* compiled from: PG */
final class C141783ab implements C141848bp {

    /* renamed from: a */
    final /* synthetic */ C141784ac f384769a;

    public C141783ab(C141784ac acVar) {
        this.f384769a = acVar;
    }

    /* renamed from: j */
    private final void m230033j(C141924r rVar) {
        this.f384769a.f384770a.execute(C47810es.m84977q(new C141927u(this, rVar)));
    }

    /* renamed from: a */
    public final void mo116727a() {
        C141925s sVar = C141925s.END_OF_SPEECH;
        C141848bp bpVar = this.f384769a.f384771b;
        Objects.requireNonNull(bpVar);
        m230033j(new C141924r(sVar, new C141782aa(bpVar)));
    }

    /* renamed from: b */
    public final void mo116728b(C141760s sVar) {
        m230033j(new C141924r(C141925s.ERROR, new C141930x(this, sVar), sVar));
    }

    /* renamed from: c */
    public final void mo116729c(C141760s sVar) {
        throw new IllegalStateException("Unexpected #onFallback from ".concat(this == this.f384769a.f384774e ? "network" : "SODA"));
    }

    /* renamed from: d */
    public final void mo116730d() {
        C141925s sVar = C141925s.HEARTBEAT;
        Objects.requireNonNull(this.f384769a.f384771b);
        m230033j(new C141924r(sVar, new C141929w()));
    }

    /* renamed from: e */
    public final void mo116731e(C141806ay ayVar) {
        m230033j(new C141924r(C141925s.PARTIAL_RESULTS, new C141931y(this, ayVar)));
    }

    /* renamed from: f */
    public final void mo116732f() {
        C141925s sVar = C141925s.FINISHED;
        C141848bp bpVar = this.f384769a.f384771b;
        Objects.requireNonNull(bpVar);
        m230033j(new C141924r(sVar, new C141932z(bpVar)));
    }

    /* renamed from: g */
    public final void mo116733g(C141921o oVar) {
        m230033j(new C141924r(C141925s.RESULTS, new C141928v(this, oVar)));
    }

    /* renamed from: h */
    public final /* synthetic */ void mo116734h(C67087ko koVar) {
    }

    /* renamed from: i */
    public final void mo116735i() {
        C141925s sVar = C141925s.START_OF_SPEECH;
        C141848bp bpVar = this.f384769a.f384771b;
        Objects.requireNonNull(bpVar);
        m230033j(new C141924r(sVar, new C141926t(bpVar)));
    }
}
