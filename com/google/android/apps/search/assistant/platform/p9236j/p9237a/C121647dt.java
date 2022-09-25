package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.C33506c;
import com.google.android.libraries.search.assistant.invocation.android.voiceinteraction.session.compat.C33512a;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.p5574b.C71477ah;
import kotlinx.coroutines.p5574b.C71521by;
import kotlinx.coroutines.p5574b.C71536cm;
import kotlinx.coroutines.p5574b.C71548cy;
import kotlinx.coroutines.p5574b.C71553dc;
import kotlinx.coroutines.p5574b.C71562dl;
import kotlinx.coroutines.p5574b.C71570dt;
import kotlinx.coroutines.p5574b.C71574dx;
import kotlinx.coroutines.p5574b.C71587n;
import p5462h.p5463a.C69498ao;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.dt */
/* compiled from: PG */
public final class C121647dt {

    /* renamed from: a */
    public static final C59071e f337504a = C59071e.m91331h();

    /* renamed from: b */
    public final C33506c f337505b;

    /* renamed from: c */
    public final C71422aw f337506c;

    /* renamed from: d */
    public final C71548cy f337507d;

    /* renamed from: e */
    public final C121646ds f337508e = new C121646ds(this);

    /* renamed from: f */
    public final C71422aw f337509f;

    /* renamed from: g */
    public final Executor f337510g;

    /* renamed from: h */
    public final C71553dc f337511h;

    /* renamed from: i */
    public final C33512a f337512i;

    /* renamed from: j */
    private final C69585o f337513j;

    /* renamed from: k */
    private final Executor f337514k;

    public C121647dt(C33506c cVar, C33512a aVar, C69585o oVar, C71422aw awVar, Executor executor) {
        C69664n.m101061g(aVar, "mapper");
        C69664n.m101061g(oVar, "lightweightContext");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        this.f337505b = cVar;
        this.f337512i = aVar;
        this.f337513j = oVar;
        this.f337506c = awVar;
        this.f337514k = executor;
        C71548cy b = C71574dx.m104480b(C69498ao.f185920a);
        this.f337507d = b;
        C71422aw b2 = C71423ax.m104197b(oVar);
        this.f337509f = b2;
        this.f337510g = new C60904dr(executor);
        C71587n b3 = C71536cm.m104384b(C71477ah.m104295b(C71477ah.m104296c(b, new C121643dp(this, (C69577g) null)), new C121644dq(this, (C69577g) null)), new C121645dr((C69577g) null));
        int i = C71562dl.f190976a;
        this.f337511h = C71521by.m104364b(b3, b2, new C71570dt(0, 0), 1);
    }
}
