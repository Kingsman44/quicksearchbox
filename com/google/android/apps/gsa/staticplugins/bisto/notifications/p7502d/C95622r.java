package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58714pg;
import com.google.common.p4522b.C58717pj;
import com.google.common.p4522b.C58799sk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.r */
/* compiled from: PG */
public final class C95622r {

    /* renamed from: a */
    public final Object f267614a = new Object();

    /* renamed from: b */
    public final Map f267615b = new HashMap();

    /* renamed from: c */
    public final ScheduledExecutorService f267616c;

    /* renamed from: d */
    private final AtomicReference f267617d = new AtomicReference();

    /* renamed from: e */
    private final C21370a f267618e;

    /* renamed from: f */
    private Long f267619f;

    public C95622r(ScheduledExecutorService scheduledExecutorService, C21370a aVar) {
        this.f267616c = scheduledExecutorService;
        this.f267618e = aVar;
    }

    /* renamed from: a */
    public final long mo89575a() {
        return this.f267618e.mo26871c();
    }

    /* renamed from: b */
    public final void mo89576b() {
        this.f267619f = null;
        Future future = (Future) this.f267617d.getAndSet((Object) null);
        if (future != null) {
            future.cancel(false);
        }
        long j = Long.MAX_VALUE;
        for (C58717pj d : this.f267615b.values()) {
            for (C58714pg pgVar : d.mo55484d()) {
                j = Math.min(j, Math.max(((Long) pgVar.f156456b.mo55176b()).longValue(), ((Long) pgVar.f156457c.mo55176b()).longValue() - 10));
            }
        }
        if (j == Long.MAX_VALUE) {
            C58976aa aaVar = C58975e.f156826a;
            this.f267615b.clear();
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        Long valueOf = Long.valueOf(j);
        this.f267619f = valueOf;
        long longValue = valueOf.longValue() - mo89575a();
        C95619o oVar = new C95619o(this);
        if (longValue <= 0) {
            this.f267617d.set(this.f267616c.submit(oVar));
        } else {
            this.f267617d.set(this.f267616c.schedule(oVar, longValue, TimeUnit.MILLISECONDS));
        }
    }

    /* renamed from: c */
    public final void mo89577c(C95621q qVar, long j) {
        Long l;
        synchronized (this.f267614a) {
            long a = mo89575a();
            if (!this.f267615b.containsKey(qVar)) {
                this.f267615b.put(qVar, new C58799sk(new TreeMap()));
            }
            Long valueOf = Long.valueOf(a);
            long j2 = a + j;
            ((C58717pj) this.f267615b.get(qVar)).mo54980a(C58714pg.m90504g(valueOf, Long.valueOf(j2)));
            if (this.f267617d.get() == null || (l = this.f267619f) == null || l.longValue() > j2) {
                mo89576b();
            } else {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
    }
}
