package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9235d;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121494b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121495c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121496d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121501i;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p4001w.p4002a.C53503j;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.d.h */
/* compiled from: PG */
public final class C121534h implements C121496d {

    /* renamed from: a */
    public final C68214a f337264a;

    /* renamed from: b */
    private final Executor f337265b;

    /* renamed from: c */
    private final C121529c f337266c = new C121529c("all");

    public C121534h(C68214a aVar, Executor executor) {
        this.f337264a = aVar;
        this.f337265b = executor;
    }

    /* renamed from: b */
    private final void m200831b(Runnable runnable) {
        this.f337265b.execute(runnable);
    }

    /* renamed from: a */
    public final /* synthetic */ C121495c mo105181a() {
        return C121495c.OFF;
    }

    /* renamed from: c */
    public final void mo105182c(C121502j jVar, Instant instant, Duration duration, String str) {
        if (this.f337266c.mo105226a(C121500h.ASYNC_SPAN, ((C121494b) jVar).f337167a)) {
            m200831b(C47810es.m84977q(new C121532f(this, duration, jVar, str)));
        }
    }

    /* renamed from: d */
    public final void mo105183d(C121502j jVar, Instant instant) {
        if (this.f337266c.mo105226a(C121500h.EVENT, ((C121494b) jVar).f337167a)) {
            m200831b(C47810es.m84977q(new C121531e(this, jVar)));
        }
    }

    /* renamed from: e */
    public final void mo105184e(C121502j jVar, long j) {
        if (this.f337266c.mo105226a(C121500h.QUANTITY, ((C121494b) jVar).f337167a)) {
            m200831b(C47810es.m84977q(new C121533g(this, j, jVar)));
        }
    }

    /* renamed from: f */
    public final void mo105185f(C121502j jVar, Instant instant, Duration duration) {
        if (this.f337266c.mo105226a(C121500h.SPAN, ((C121494b) jVar).f337167a)) {
            m200831b(C47810es.m84977q(new C121530d(this, duration, jVar)));
        }
    }

    /* renamed from: g */
    public final boolean mo105186g(C121500h hVar, C121501i iVar) {
        return this.f337266c.mo105226a(hVar, iVar);
    }

    /* renamed from: h */
    public final /* synthetic */ void mo105187h(Instant instant, Duration duration, C53503j jVar) {
    }
}
