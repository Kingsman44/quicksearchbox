package com.google.android.libraries.p1963i;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* renamed from: com.google.android.libraries.i.an */
/* compiled from: PG */
public final class C23839an extends AbstractExecutorService {

    /* renamed from: a */
    public static final Object f65268a = new Object();

    /* renamed from: b */
    public static final Object f65269b = new Object();

    /* renamed from: c */
    public final ConcurrentLinkedQueue f65270c = new ConcurrentLinkedQueue();

    /* renamed from: d */
    public final AtomicInteger f65271d = new AtomicInteger();

    /* renamed from: e */
    public final AtomicInteger f65272e = new AtomicInteger();

    /* renamed from: f */
    public final AtomicInteger f65273f = new AtomicInteger();

    /* renamed from: g */
    public boolean f65274g;

    /* renamed from: h */
    public final AtomicBoolean f65275h = new AtomicBoolean();

    /* renamed from: i */
    public final ThreadFactory f65276i;

    /* renamed from: j */
    public final boolean f65277j;

    /* renamed from: k */
    public final Runnable f65278k;

    /* renamed from: l */
    public final Runnable f65279l;

    /* renamed from: m */
    public final C23837al[] f65280m;

    /* renamed from: n */
    public final C23837al[] f65281n;

    /* renamed from: o */
    public final CountDownLatch f65282o;

    /* renamed from: p */
    public final AtomicReference f65283p;

    /* renamed from: q */
    private final int f65284q;

    /* renamed from: r */
    private boolean f65285r;

    /* renamed from: s */
    private final boolean f65286s;

    /* renamed from: t */
    private final C23838am[] f65287t;

    public C23839an(int i, ThreadFactory threadFactory, Runnable runnable, Runnable runnable2) {
        if (i > 0) {
            this.f65284q = Integer.MAX_VALUE;
            this.f65276i = threadFactory;
            this.f65277j = true;
            this.f65278k = runnable;
            this.f65279l = runnable2;
            this.f65286s = true;
            this.f65282o = new CountDownLatch(i);
            int i2 = i + 1;
            C23837al[] alVarArr = new C23837al[i2];
            C23837al[] alVarArr2 = new C23837al[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                alVarArr[i4] = new C23837al(f65269b, i4);
                alVarArr2[i4] = new C23837al(f65268a, i4);
            }
            this.f65280m = alVarArr;
            this.f65281n = alVarArr2;
            C23838am[] amVarArr = new C23838am[i];
            C23837al alVar = alVarArr[0];
            while (i3 < i) {
                C23837al alVar2 = new C23837al(alVar, i3);
                amVarArr[i3] = new C23838am(this, i3);
                i3++;
                alVar = alVar2;
            }
            this.f65287t = amVarArr;
            this.f65283p = new AtomicReference(alVar);
            return;
        }
        throw new IllegalArgumentException("numThreads must be positive: " + i);
    }

    /* renamed from: b */
    private final void m44383b(boolean z) {
        C23837al alVar;
        this.f65285r = true;
        while (true) {
            C23837al alVar2 = (C23837al) this.f65283p.get();
            Object obj = alVar2.f65257a;
            if (obj != f65268a) {
                if (obj != f65269b || z) {
                    alVar = this.f65281n[0];
                } else {
                    alVar = this.f65281n[alVar2.f65258b];
                }
                if (C23836ak.m44378a(this.f65283p, alVar2, alVar)) {
                    while (alVar2.f65257a != f65269b) {
                        C23838am amVar = this.f65287t[alVar2.f65258b];
                        Thread thread = amVar.f65260b;
                        amVar.f65267i = 3;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                        } else {
                            amVar.mo29186a();
                        }
                        alVar2 = (C23837al) alVar2.f65257a;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo29190a() {
        if (this.f65286s) {
            this.f65271d.decrementAndGet();
        }
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f65282o.await(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        int i;
        runnable.getClass();
        if (!this.f65285r) {
            if (this.f65286s) {
                if (this.f65284q != Integer.MAX_VALUE) {
                    do {
                        i = this.f65271d.get();
                        if (i != this.f65284q) {
                        }
                    } while (!this.f65271d.compareAndSet(i, i + 1));
                } else {
                    this.f65271d.incrementAndGet();
                }
            }
            C23837al alVar = new C23837al(runnable, -1);
            this.f65270c.add(alVar);
            while (true) {
                C23837al alVar2 = (C23837al) this.f65283p.get();
                Object obj = alVar2.f65257a;
                if (obj == f65269b) {
                    int i2 = alVar2.f65258b;
                    int min = Math.min(i2 + 1, this.f65287t.length);
                    if (min == i2 || C23836ak.m44378a(this.f65283p, alVar2, this.f65280m[min])) {
                        return;
                    }
                } else if (obj != f65268a) {
                    int i3 = alVar2.f65258b;
                    if (C23836ak.m44378a(this.f65283p, alVar2, (C23837al) obj)) {
                        C23838am amVar = this.f65287t[i3];
                        Thread thread = amVar.f65260b;
                        amVar.f65267i = 1;
                        if (thread != null) {
                            LockSupport.unpark(thread);
                            return;
                        }
                        amVar.f65266h.f65272e.incrementAndGet();
                        amVar.mo29187b();
                        return;
                    }
                } else if (this.f65270c.remove(alVar)) {
                    mo29190a();
                    throw new RejectedExecutionException();
                } else {
                    return;
                }
            }
        }
        throw new RejectedExecutionException();
    }

    public final boolean isShutdown() {
        return ((C23837al) this.f65283p.get()).f65257a == f65268a;
    }

    public final boolean isTerminated() {
        return this.f65282o.getCount() == 0;
    }

    public final void shutdown() {
        m44383b(false);
    }

    public final List shutdownNow() {
        m44383b(true);
        ArrayList arrayList = new ArrayList();
        if (this.f65275h.compareAndSet(false, true)) {
            while (true) {
                C23837al alVar = (C23837al) this.f65270c.poll();
                if (alVar == null) {
                    break;
                }
                mo29190a();
                arrayList.add((Runnable) alVar.f65257a);
            }
            this.f65274g = true;
            for (C23838am amVar : this.f65287t) {
                Thread thread = amVar.f65261c;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        return arrayList;
    }
}
