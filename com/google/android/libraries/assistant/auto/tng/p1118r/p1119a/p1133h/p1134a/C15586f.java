package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1133h.p1134a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122472a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122549e;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1133h.C15580a;
import com.google.android.libraries.assistant.auto.tng.p1322v.p1330d.p1331a.C16850a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.h.a.f */
/* compiled from: PG */
public final class C15586f implements C15580a {

    /* renamed from: a */
    public final boolean f46608a;

    /* renamed from: b */
    public final boolean f46609b;

    /* renamed from: c */
    public final C122472a f46610c;

    /* renamed from: d */
    public final Executor f46611d;

    /* renamed from: e */
    public final C69464a f46612e;

    /* renamed from: f */
    public final C16850a f46613f;

    /* renamed from: g */
    public final C60888db f46614g;

    /* renamed from: h */
    public C122549e f46615h = null;

    /* renamed from: i */
    private final Executor f46616i;

    /* renamed from: j */
    private C60870cx f46617j = C60856cj.m92899h(new IllegalStateException("Prewarm hasn't been started"));

    public C15586f(boolean z, C122472a aVar, Executor executor, boolean z2, C69464a aVar2, C16850a aVar3, C60888db dbVar) {
        this.f46608a = z;
        this.f46610c = aVar;
        this.f46616i = executor;
        this.f46609b = z2;
        this.f46611d = new C60904dr(executor);
        this.f46612e = aVar2;
        this.f46613f = aVar3;
        this.f46614g = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo22403a() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = this.f46617j;
        if (cxVar == null) {
            return C60856cj.m92900i(C58836b.f156633a);
        }
        C15581a aVar = new C15581a(this);
        C60870cx g = C60922j.m93044g(cxVar, C47810es.m84963c(aVar), this.f46611d);
        C15582b bVar = C15582b.f46603a;
        return C60846c.m92878g(g, Exception.class, C47810es.m84963c(bVar), this.f46614g);
    }

    /* renamed from: b */
    public final void mo22404b(C60870cx cxVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar2 = this.f46617j;
        if (cxVar2 != null && !cxVar2.isDone()) {
            this.f46617j.cancel(false);
            this.f46617j = null;
        }
        C15583c cVar = new C15583c(this);
        this.f46617j = C60922j.m93044g(cxVar, C47810es.m84963c(cVar), this.f46616i);
    }
}
