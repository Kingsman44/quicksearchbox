package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.C11791b;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p662i.C11443a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12986d;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.v */
/* compiled from: PG */
public final class C11786v implements C11791b {

    /* renamed from: a */
    public boolean f37936a = false;

    /* renamed from: b */
    public boolean f37937b = false;

    /* renamed from: c */
    public C13054p f37938c = C13054p.IDLE;

    /* renamed from: d */
    public C12986d f37939d = null;

    /* renamed from: e */
    private final Executor f37940e;

    /* renamed from: f */
    private final C11443a f37941f;

    public C11786v(Executor executor, C11443a aVar) {
        this.f37941f = aVar;
        this.f37940e = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo20148a() {
        C11778n nVar = new C11778n(this);
        return C60856cj.m92904m(C47810es.m84978r(nVar), this.f37940e);
    }

    /* renamed from: b */
    public final C60870cx mo20149b() {
        C11785u uVar = new C11785u(this);
        return C60856cj.m92904m(C47810es.m84978r(uVar), this.f37940e);
    }

    /* renamed from: c */
    public final C60870cx mo20150c() {
        C11784t tVar = new C11784t(this);
        return C60856cj.m92904m(C47810es.m84978r(tVar), this.f37940e);
    }

    /* renamed from: d */
    public final C60870cx mo20151d() {
        C11782r rVar = new C11782r(this);
        return C60856cj.m92904m(C47810es.m84978r(rVar), this.f37940e);
    }

    /* renamed from: e */
    public final void mo20152e(boolean z) {
        C11781q qVar = new C11781q(this, z);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(qVar), this.f37940e), "Failed to update fusionRequestInProgress: %s", Boolean.valueOf(z));
        this.f37941f.f37228a = z;
    }

    /* renamed from: f */
    public final void mo20153f(boolean z) {
        C11779o oVar = new C11779o(this, z);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(oVar), this.f37940e), "Failed to update voiceStopRequested: %s", Boolean.valueOf(z));
    }

    /* renamed from: g */
    public final void mo20154g(C13054p pVar) {
        C11780p pVar2 = new C11780p(this, pVar);
        C46459k.m82829b(C60856cj.m92904m(C47810es.m84978r(pVar2), this.f37940e), "Failed to update mediaRecSessionState: %s", pVar.name());
    }

    /* renamed from: h */
    public final void mo20155h(C60870cx cxVar) {
        C11783s sVar = new C11783s(this);
        C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(sVar), this.f37940e), "Failed to update queuedAssistantRequest", new Object[0]);
    }
}
