package com.google.android.apps.search.googleapp.discover.p10244v;

import com.google.android.apps.search.googleapp.discover.p10249z.p10251b.C135324d;
import com.google.android.apps.search.googleapp.discover.p10249z.p10252c.C135343f;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134750a;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134751b;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134752c;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134753d;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134754e;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69677g;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.v.bp */
/* compiled from: PG */
public final class C135171bp {

    /* renamed from: a */
    public final C69585o f368191a;

    /* renamed from: b */
    public final C71422aw f368192b;

    /* renamed from: c */
    public final C135183ca f368193c;

    /* renamed from: d */
    public final C135343f f368194d;

    /* renamed from: e */
    public final C135324d f368195e;

    /* renamed from: f */
    private final C135173br f368196f;

    /* renamed from: g */
    private final C135158bc f368197g;

    public C135171bp(C69585o oVar, C71422aw awVar, C135173br brVar, C135183ca caVar, C135343f fVar, C135324d dVar, C135158bc bcVar) {
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(caVar, "userInteractionTracker");
        this.f368191a = oVar;
        this.f368192b = awVar;
        this.f368196f = brVar;
        this.f368193c = caVar;
        this.f368194d = fVar;
        this.f368195e = dVar;
        this.f368197g = bcVar;
    }

    /* renamed from: a */
    public final C135173br mo112140a(C134755f fVar) {
        C69664n.m101061g(fVar, "streamStorageKey");
        if (fVar instanceof C134752c) {
            return this.f368196f;
        }
        if ((fVar instanceof C134753d) || (fVar instanceof C134751b) || (fVar instanceof C134754e) || (fVar instanceof C134750a)) {
            return this.f368197g.mo112136a(fVar);
        }
        throw new C69677g();
    }

    /* renamed from: b */
    public final Object mo112141b(C134755f fVar, String str, List list, C69577g gVar) {
        Object a = C71803m.m105040a(this.f368191a, new C135162bg(this, fVar, str, list, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: c */
    public final Object mo112142c(C134755f fVar, C69577g gVar) {
        return C71803m.m105040a(this.f368191a, new C135167bl(this, fVar, (C69577g) null), gVar);
    }

    /* renamed from: d */
    public final Object mo112143d(C134755f fVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f368191a, new C135168bm(fVar, this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
