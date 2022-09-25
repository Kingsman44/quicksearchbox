package com.google.android.apps.search.assistant.surfaces.dictation.service.p9430b;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9448h.C125761aa;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.b.t */
/* compiled from: PG */
public final class C125290t {

    /* renamed from: a */
    public final C60888db f345631a;

    /* renamed from: b */
    public final Duration f345632b;

    /* renamed from: c */
    public final C60950i f345633c;

    /* renamed from: d */
    public final AtomicReference f345634d = new AtomicReference();

    /* renamed from: e */
    public final AtomicLong f345635e = new AtomicLong();

    /* renamed from: f */
    public final C125761aa f345636f;

    /* renamed from: g */
    private final C47632e f345637g = new C47632e();

    public C125290t(C60888db dbVar, Duration duration, C125761aa aaVar, C60950i iVar) {
        C69664n.m101061g(dbVar, "executor");
        C69664n.m101061g(duration, "timeout");
        C69664n.m101061g(iVar, "timeSource");
        this.f345631a = dbVar;
        this.f345632b = duration;
        this.f345636f = aaVar;
        this.f345633c = iVar;
    }

    /* renamed from: a */
    public final C60870cx mo106898a(Object obj, C60930r rVar) {
        C69664n.m101061g(obj, "input");
        C69664n.m101061g(rVar, "task");
        Instant a = this.f345633c.mo57444a();
        C69664n.m101060f(a, "timeSource.now()");
        this.f345635e.incrementAndGet();
        C60870cx b = this.f345637g.mo51512b(new C125287q(obj, this, rVar), this.f345631a);
        C69664n.m101060f(b, "submitAsync(task, executor)");
        C125288r rVar2 = new C125288r(this, a);
        C60870cx e = C126309ar.m206526e(b, this.f345632b, this.f345631a);
        C125289s sVar = new C125289s(rVar2);
        return C60846c.m92879h(e, TimeoutException.class, C47810es.m84966f(sVar), this.f345631a);
    }
}
