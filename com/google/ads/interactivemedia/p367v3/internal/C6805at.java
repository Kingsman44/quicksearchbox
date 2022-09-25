package com.google.ads.interactivemedia.p367v3.internal;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.ads.interactivemedia.v3.internal.at */
/* compiled from: PG */
public final class C6805at {

    /* renamed from: a */
    private final BlockingQueue f21516a;

    /* renamed from: b */
    private final ThreadPoolExecutor f21517b;

    /* renamed from: c */
    private final ArrayDeque f21518c = new ArrayDeque();

    /* renamed from: d */
    private C6804as f21519d = null;

    public C6805at() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f21516a = linkedBlockingQueue;
        this.f21517b = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* renamed from: c */
    private final void m19548c() {
        C6804as asVar = (C6804as) this.f21518c.poll();
        this.f21519d = asVar;
        if (asVar != null) {
            asVar.executeOnExecutor(this.f21517b, new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo15385a(C6804as asVar) {
        asVar.mo15339b(this);
        this.f21518c.add(asVar);
        if (this.f21519d == null) {
            m19548c();
        }
    }

    /* renamed from: b */
    public final void mo15386b() {
        this.f21519d = null;
        m19548c();
    }
}
