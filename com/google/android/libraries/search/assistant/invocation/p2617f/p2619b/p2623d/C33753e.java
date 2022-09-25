package com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.p2623d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2619b.C33733c;
import com.google.android.libraries.search.assistant.invocation.p2646l.p2648b.C33939f;
import com.google.assistant.p3897e.p3917i.p3918a.C51450id;
import com.google.common.p4522b.C58425eo;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p3186j$.time.Instant;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.b.d.e */
/* compiled from: PG */
public final class C33753e implements C33733c, C33939f {

    /* renamed from: a */
    public final AtomicReference f90137a;

    /* renamed from: b */
    private final C21370a f90138b;

    /* renamed from: c */
    private final ReentrantLock f90139c = new ReentrantLock();

    /* renamed from: d */
    private final C58425eo f90140d = new C58425eo(128);

    /* renamed from: e */
    private final String f90141e;

    public C33753e(C21370a aVar, C51450id idVar) {
        this.f90138b = aVar;
        this.f90137a = new AtomicReference(idVar);
        mo39061e(new C33749a(idVar));
        this.f90141e = "MediaContextResource";
    }

    /* renamed from: a */
    public final Object mo39054a(C69577g gVar) {
        return C69788q.f186170a;
    }

    /* renamed from: b */
    public final Object mo39055b(C69577g gVar) {
        this.f90137a.set((Object) null);
        mo39061e(C33752d.f90136a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final List mo39060c() {
        return C69540x.m100840V(this.f90140d);
    }

    /* renamed from: d */
    public final String mo39056d() {
        return this.f90141e;
    }

    /* renamed from: e */
    public final void mo39061e(C69626l lVar) {
        ReentrantLock reentrantLock = this.f90139c;
        reentrantLock.lock();
        try {
            C58425eo eoVar = this.f90140d;
            Instant ofEpochMilli = Instant.ofEpochMilli(this.f90138b.mo26870b());
            C69664n.m101060f(ofEpochMilli, "ofEpochMilli(clock.currentTimeMillis())");
            eoVar.add(lVar.mo5761a(ofEpochMilli));
        } finally {
            reentrantLock.unlock();
        }
    }
}
