package com.google.android.libraries.performance.primes;

import com.google.android.libraries.performance.primes.p2398c.C31220b;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.performance.primes.am */
/* compiled from: PG */
public final class C31156am implements Executor {

    /* renamed from: a */
    public final C60888db f84020a;

    /* renamed from: b */
    private final ConcurrentLinkedQueue f84021b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private volatile boolean f84022c = false;

    /* renamed from: d */
    private final AtomicBoolean f84023d = new AtomicBoolean();

    public C31156am(C60888db dbVar, C31220b bVar) {
        this.f84020a = dbVar;
        C31191bj bjVar = new C31191bj(bVar);
        bVar.f84117a.mo36957a(bjVar);
        bjVar.execute(new C31154ak(this));
    }

    /* renamed from: b */
    private final void m58082b() {
        while (true) {
            Runnable runnable = (Runnable) this.f84021b.poll();
            if (runnable != null) {
                this.f84020a.execute(runnable);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo36891a() {
        this.f84022c = true;
        m58082b();
    }

    public final void execute(Runnable runnable) {
        if (this.f84022c) {
            this.f84020a.execute(runnable);
            return;
        }
        this.f84021b.add(runnable);
        if (this.f84022c) {
            m58082b();
        } else if (!this.f84023d.getAndSet(true)) {
            this.f84020a.mo29165e(new C31153aj(this), 7000, TimeUnit.MILLISECONDS);
        }
    }
}
