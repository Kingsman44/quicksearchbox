package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.apps.tiktok.concurrent.C46459k;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.t */
/* compiled from: PG */
public final class C135200t {

    /* renamed from: a */
    public final C135155b f368287a;

    /* renamed from: b */
    public final C135183ca f368288b;

    /* renamed from: c */
    public final C135171bp f368289c;

    /* renamed from: d */
    public final C69585o f368290d;

    /* renamed from: e */
    public final C71422aw f368291e;

    /* renamed from: f */
    public final C135172bq f368292f;

    public C135200t(C135155b bVar, C135183ca caVar, C135171bp bpVar, C69585o oVar, C71422aw awVar, C135172bq bqVar) {
        C69664n.m101061g(bVar, "ephemeralChangeTracker");
        C69664n.m101061g(caVar, "userInteractionTracker");
        C69664n.m101061g(bpVar, "sessionManager");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f368287a = bVar;
        this.f368288b = caVar;
        this.f368289c = bpVar;
        this.f368290d = oVar;
        this.f368291e = awVar;
        this.f368292f = bqVar;
    }

    /* renamed from: a */
    public final Object mo112153a(C135182c cVar, C69577g gVar) {
        return C71803m.m105040a(this.f368290d, new C135189i(this, cVar, (C69577g) null), gVar);
    }

    /* renamed from: b */
    public final Object mo112154b(C134755f fVar, String str, List list, C69577g gVar) {
        return C71803m.m105040a(this.f368290d, new C135191k(this, fVar, str, list, (C69577g) null), gVar);
    }

    /* renamed from: c */
    public final Object mo112155c(C134755f fVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f368290d, new C135192l(this, fVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: d */
    public final Object mo112156d(C134755f fVar, C69577g gVar) {
        return C71803m.m105040a(this.f368290d, new C135194n(this, fVar, (C69577g) null), gVar);
    }

    /* renamed from: e */
    public final Object mo112157e(C134755f fVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f368290d, new C135199s(this, fVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: f */
    public final void mo112158f(String str, C134755f fVar) {
        C69664n.m101061g(str, "sessionId");
        C69664n.m101061g(fVar, "streamStorageKey");
        if (fVar instanceof C134752c) {
            C46459k.m82829b(C71663i.m104692e(this.f368291e, (C71424ay) null, new C135197q(this, str, (C69577g) null), 3), "Failed to record user interaction.", new Object[0]);
        }
    }
}
