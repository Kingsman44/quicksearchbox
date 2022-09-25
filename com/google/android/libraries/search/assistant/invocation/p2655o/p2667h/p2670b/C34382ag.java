package com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2670b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.C34354a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2668a.p2669a.C34373s;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2667h.p2671c.C34421k;
import com.google.apps.tiktok.p3633d.p3634a.C46675m;
import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import com.google.common.p4522b.C58425eo;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Instant;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p3186j$.util.concurrent.ConcurrentMap;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.h.b.ag */
/* compiled from: PG */
public final class C34382ag implements C34421k, C46675m {

    /* renamed from: a */
    public final C21370a f91398a;

    /* renamed from: b */
    public final C71422aw f91399b;

    /* renamed from: c */
    public final C69585o f91400c;

    /* renamed from: d */
    public final ConcurrentMap f91401d = new ConcurrentHashMap();

    /* renamed from: e */
    public final C58425eo f91402e = new C58425eo(128);

    /* renamed from: f */
    public final ReentrantReadWriteLock f91403f = new ReentrantReadWriteLock();

    /* renamed from: g */
    public final C34373s f91404g;

    public C34382ag(C34373s sVar, C21370a aVar, C71422aw awVar, C69585o oVar) {
        C69664n.m101061g(sVar, "triggeringConnectionsAccessor");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(oVar, "lightweightContext");
        this.f91404g = sVar;
        this.f91398a = aVar;
        this.f91399b = awVar;
        this.f91400c = oVar;
    }

    /* renamed from: b */
    public static final void m63063b(C34382ag agVar, C34354a aVar, C69626l lVar) {
        C34384ai aiVar = (C34384ai) ConcurrentMap.EL.compute(agVar.f91401d, aVar.mo39322c(), new C34407w(lVar));
    }

    /* renamed from: d */
    public static final Instant m63064d(C21370a aVar) {
        return Instant.ofEpochMilli(aVar.mo26870b());
    }

    /* renamed from: a */
    public final C60870cx mo20647a(C46677o oVar) {
        C69664n.m101061g(oVar, "request");
        return C71663i.m104692e(this.f91399b, (C71424ay) null, new C34409y(oVar, this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo39256c() {
        return C71663i.m104692e(this.f91399b, (C71424ay) null, new C34381af(this, (C69577g) null), 3);
    }
}
