package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import androidx.p104d.p105a.C2169h;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122554d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.C122828c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5030q.C65191ey;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.m */
/* compiled from: PG */
final class C123081m implements C17597g {

    /* renamed from: a */
    public final C17597g f340651a;

    /* renamed from: b */
    public final Executor f340652b;

    /* renamed from: c */
    public final C122828c f340653c;

    /* renamed from: d */
    public final C122859d f340654d;

    /* renamed from: e */
    public final C122561k f340655e;

    /* renamed from: f */
    private final C123001av f340656f;

    /* renamed from: g */
    private final AtomicBoolean f340657g = new AtomicBoolean(false);

    /* renamed from: h */
    private Optional f340658h = Optional.empty();

    public C123081m(C122554d dVar, C17597g gVar, C122859d dVar2, C122828c cVar, C123002aw awVar, C60887da daVar) {
        this.f340651a = gVar;
        this.f340652b = new C60904dr(daVar);
        this.f340653c = cVar;
        C123001av a = awVar.mo105822a();
        this.f340656f = a;
        this.f340654d = dVar2;
        this.f340655e = dVar.mo105669a(0, a, dVar2);
    }

    /* renamed from: d */
    private final synchronized C60870cx m202421d(C65191ey eyVar) {
        if (!this.f340657g.getAndSet(true)) {
            this.f340658h = Optional.m71637of(C2169h.m6027a(new C122966i(this, eyVar)));
        }
        return (C60870cx) this.f340658h.get();
    }

    /* renamed from: a */
    public final void mo20121a() {
        synchronized (this) {
            C122891h hVar = new C122891h(this);
            C123064l.m202406a(C60922j.m93045h((C60870cx) this.f340658h.get(), C47810es.m84966f(hVar), this.f340652b), this.f340651a, "onCompleted");
        }
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        synchronized (this) {
            C122793d dVar = new C122793d(this);
            C123064l.m202406a(C60922j.m93045h((C60870cx) this.f340658h.get(), C47810es.m84966f(dVar), this.f340652b), this.f340651a, "onError");
        }
        this.f340651a.mo20122b(th);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C65191ey eyVar = (C65191ey) obj;
        C60870cx d = m202421d(eyVar);
        C123079k kVar = new C123079k(eyVar);
        C123064l.m202406a(C60922j.m93045h(d, C47810es.m84966f(kVar), this.f340652b), this.f340651a, "onNext");
    }
}
