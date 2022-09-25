package com.google.android.apps.search.assistant.verticals.ambient.p9935m;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4580v.C60950i;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.m.bs */
/* compiled from: PG */
public final class C130934bs {

    /* renamed from: a */
    public final C39141kp f358267a;

    /* renamed from: b */
    public final C60950i f358268b;

    /* renamed from: c */
    public final Executor f358269c;

    /* renamed from: d */
    public final Executor f358270d;

    /* renamed from: e */
    public final C58974d f358271e;

    public C130934bs(C39141kp kpVar, C60950i iVar, Executor executor, Executor executor2, C130603a aVar) {
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(iVar, "timeSource");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(executor2, "backgroundExecutor");
        C69664n.m101061g(aVar, "loggerFactory");
        this.f358267a = kpVar;
        this.f358268b = iVar;
        this.f358269c = executor;
        this.f358270d = executor2;
        this.f358271e = aVar.mo109740b(this);
    }
}
