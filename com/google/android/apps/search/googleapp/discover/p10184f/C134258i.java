package com.google.android.apps.search.googleapp.discover.p10184f;

import com.google.android.apps.search.googleapp.discover.p10173aa.C134074r;
import com.google.android.apps.search.googleapp.discover.p10214s.C134587e;
import com.google.android.libraries.storage.protostore.C42876ab;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.f.i */
/* compiled from: PG */
public final class C134258i {

    /* renamed from: a */
    public final C42876ab f365740a;

    /* renamed from: b */
    public final C134074r f365741b;

    /* renamed from: c */
    public final Executor f365742c;

    /* renamed from: d */
    private final C69585o f365743d;

    public C134258i(C42876ab abVar, C134074r rVar, Executor executor, C69585o oVar) {
        C69664n.m101061g(abVar, "backgroundRefreshScheduleProtoDataStore");
        C69664n.m101061g(rVar, "feedSyncController");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f365740a = abVar;
        this.f365741b = rVar;
        this.f365742c = executor;
        this.f365743d = oVar;
    }

    /* renamed from: a */
    public final Object mo111663a(C134587e eVar, C69577g gVar) {
        Object a = C71803m.m105040a(this.f365743d, new C134255f(this, eVar, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo111664b(C69577g gVar) {
        Object a = C71803m.m105040a(this.f365743d, new C134257h(this, (C69577g) null), gVar);
        return a == C69554a.COROUTINE_SUSPENDED ? a : C69788q.f186170a;
    }
}
