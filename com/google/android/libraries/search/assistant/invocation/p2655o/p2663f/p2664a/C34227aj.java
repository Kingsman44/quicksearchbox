package com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.p2664a;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2663f.C34330o;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.base.C58889cz;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4548e.p4549a.C59425c;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.f.a.aj */
/* compiled from: PG */
public final class C34227aj {

    /* renamed from: a */
    public static final C59071e f91065a = C59071e.m91331h();

    /* renamed from: b */
    public final C34330o f91066b;

    /* renamed from: c */
    public final C39141kp f91067c;

    /* renamed from: d */
    public final C58889cz f91068d;

    /* renamed from: e */
    public final C21370a f91069e;

    /* renamed from: f */
    public final C71422aw f91070f;

    /* renamed from: g */
    public final Executor f91071g;

    /* renamed from: h */
    public final C47632e f91072h = new C47632e();

    /* renamed from: i */
    public final C69626l f91073i;

    public C34227aj(C34296f fVar, C34330o oVar, C39141kp kpVar, C58889cz czVar, C21370a aVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(fVar, "enabledInvocationSources");
        C69664n.m101061g(oVar, "invocationOrchestrator");
        C69664n.m101061g(kpVar, "clientStreamz");
        C69664n.m101061g(czVar, "ticker");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f91066b = oVar;
        this.f91067c = kpVar;
        this.f91068d = czVar;
        this.f91069e = aVar;
        this.f91070f = awVar;
        this.f91071g = executor;
        this.f91073i = new C59425c(new C34224ag(fVar, (C69577g) null));
    }
}
