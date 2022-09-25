package com.google.common.p4520a;

import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60917ed;
import java.lang.ref.ReferenceQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* renamed from: com.google.common.a.aq */
/* compiled from: PG */
final class C58210aq extends ReentrantLock {

    /* renamed from: a */
    final C58234bn f155668a;

    /* renamed from: b */
    volatile int f155669b;

    /* renamed from: c */
    long f155670c;

    /* renamed from: d */
    int f155671d;

    /* renamed from: e */
    int f155672e;

    /* renamed from: f */
    volatile AtomicReferenceArray f155673f;

    /* renamed from: g */
    final long f155674g;

    /* renamed from: h */
    final ReferenceQueue f155675h;

    /* renamed from: i */
    final ReferenceQueue f155676i;

    /* renamed from: j */
    final Queue f155677j;

    /* renamed from: k */
    final AtomicInteger f155678k = new AtomicInteger();

    /* renamed from: l */
    final Queue f155679l;

    /* renamed from: m */
    final Queue f155680m;

    /* renamed from: n */
    final C58220b f155681n;

    public C58210aq(C58234bn bnVar, int i, long j, C58220b bVar) {
        Queue queue;
        Queue queue2;
        this.f155668a = bnVar;
        this.f155674g = j;
        bVar.getClass();
        this.f155681n = bVar;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        this.f155672e = (atomicReferenceArray.length() * 3) / 4;
        if (!bnVar.mo54794m()) {
            int i2 = this.f155672e;
            if (((long) i2) == j) {
                this.f155672e = i2 + 1;
            }
        }
        this.f155673f = atomicReferenceArray;
        ReferenceQueue referenceQueue = null;
        this.f155675h = bnVar.mo54801t() ? new ReferenceQueue() : null;
        this.f155676i = bnVar.mo54802u() ? new ReferenceQueue() : referenceQueue;
        if (bnVar.mo54800s()) {
            queue = new ConcurrentLinkedQueue();
        } else {
            queue = C58234bn.f155733c;
        }
        this.f155677j = queue;
        if (bnVar.mo54797p()) {
            queue2 = new C58232bl();
        } else {
            queue2 = C58234bn.f155733c;
        }
        this.f155679l = queue2;
        this.f155680m = bnVar.mo54800s() ? new C58266u() : C58234bn.f155733c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final C58241bu mo54735A(C58241bu buVar, C58241bu buVar2, Object obj, Object obj2, C58219az azVar, int i) {
        mo54762z(obj, obj2, azVar.mo54700a(), i);
        this.f155679l.remove(buVar2);
        this.f155680m.remove(buVar2);
        if (!azVar.mo54706g()) {
            return mo54741e(buVar, buVar2);
        }
        azVar.mo54704e((Object) null);
        return buVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final void mo54736B(C58241bu buVar, Object obj, long j) {
        C58219az azVar;
        C58219az d = buVar.mo54720d();
        int a = this.f155668a.f155744m.mo54816a();
        C58838bb.m90884s(a >= 0, "Weights must be non-negative");
        int ordinal = this.f155668a.f155742k.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    throw null;
                } else if (a == 1) {
                    azVar = new C58225be(this.f155676i, obj, buVar);
                } else {
                    azVar = new C58229bi(this.f155676i, obj, buVar, a);
                }
            } else if (a == 1) {
                azVar = new C58211ar(this.f155676i, obj, buVar);
            } else {
                azVar = new C58227bg(this.f155676i, obj, buVar, a);
            }
        } else if (a == 1) {
            azVar = new C58216aw(obj);
        } else {
            azVar = new C58228bh(obj, a);
        }
        buVar.mo54732p(azVar);
        mo54748l();
        this.f155670c += (long) a;
        if (this.f155668a.mo54796o()) {
            buVar.mo54727k(j);
        }
        if (this.f155668a.mo54799r()) {
            buVar.mo54733q(j);
        }
        this.f155680m.add(buVar);
        this.f155679l.add(buVar);
        d.mo54704e(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58241bu mo54737a(C58241bu buVar, C58241bu buVar2) {
        if (buVar.mo54726j() == null) {
            return null;
        }
        C58219az d = buVar.mo54720d();
        Object obj = d.get();
        if (obj == null && d.mo54705f()) {
            return null;
        }
        C58241bu a = this.f155668a.f155750s.mo54686a(this, buVar, buVar2);
        a.mo54732p(d.mo54701b(this.f155676i, obj, a));
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58241bu mo54738b(Object obj, int i) {
        AtomicReferenceArray atomicReferenceArray = this.f155673f;
        for (C58241bu buVar = (C58241bu) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); buVar != null; buVar = buVar.mo54721e()) {
            if (buVar.mo54717a() == i) {
                Object j = buVar.mo54726j();
                if (j == null) {
                    mo54759w();
                } else if (this.f155668a.f155739h.mo56077d(obj, j)) {
                    return buVar;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C58241bu mo54739c(Object obj, int i, long j) {
        C58241bu b = mo54738b(obj, i);
        if (b == null) {
            return null;
        }
        if (!this.f155668a.mo54798q(b, j)) {
            return b;
        }
        mo54760x(j);
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C58241bu mo54740d(Object obj, int i, C58241bu buVar) {
        return this.f155668a.f155750s.mo54687c(this, obj, i, buVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C58241bu mo54741e(C58241bu buVar, C58241bu buVar2) {
        int i = this.f155669b;
        C58241bu e = buVar2.mo54721e();
        while (buVar != buVar2) {
            C58241bu a = mo54737a(buVar, e);
            if (a == null) {
                mo54756t(buVar);
                i--;
            } else {
                e = a;
            }
            buVar = buVar.mo54721e();
        }
        this.f155669b = i;
        return e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final Object mo54742f(Object obj, int i) {
        try {
            if (this.f155669b != 0) {
                long a = this.f155668a.f155749r.mo26884a();
                C58241bu c = mo54739c(obj, i, a);
                if (c == null) {
                    return null;
                }
                Object obj2 = c.mo54720d().get();
                if (obj2 != null) {
                    mo54755s(c, a);
                    c.mo54726j();
                    C58257l lVar = this.f155668a.f155752u;
                    mo54753q();
                    return obj2;
                }
                mo54759w();
            }
            mo54753q();
            return null;
        } finally {
            mo54753q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final Object mo54743g(Object obj, int i, C58203aj ajVar, C60870cx cxVar) {
        Object obj2 = null;
        try {
            Object a = C60917ed.m93034a(cxVar);
            if (a != null) {
                try {
                    this.f155681n.mo54683c(ajVar.mo54708h());
                    lock();
                    long a2 = this.f155668a.f155749r.mo26884a();
                    mo54757u(a2);
                    int i2 = this.f155669b + 1;
                    if (i2 > this.f155672e) {
                        mo54751o();
                        i2 = this.f155669b + 1;
                    }
                    AtomicReferenceArray atomicReferenceArray = this.f155673f;
                    int length = (atomicReferenceArray.length() - 1) & i;
                    C58241bu buVar = (C58241bu) atomicReferenceArray.get(length);
                    C58241bu buVar2 = buVar;
                    while (buVar2 != null) {
                        Object j = buVar2.mo54726j();
                        if (buVar2.mo54717a() != i || j == null || !this.f155668a.f155739h.mo56077d(obj, j)) {
                            buVar2 = buVar2.mo54721e();
                        } else {
                            C58219az d = buVar2.mo54720d();
                            Object obj3 = d.get();
                            int i3 = 2;
                            if (ajVar == d) {
                                obj2 = obj3;
                            } else if (obj3 != null || d == C58234bn.f155732b) {
                                mo54762z(obj, a, 0, 2);
                                unlock();
                                mo54758v();
                                return a;
                            }
                            this.f155671d++;
                            if (ajVar.mo54705f()) {
                                if (obj2 == null) {
                                    i3 = 3;
                                }
                                mo54762z(obj, obj2, ajVar.mo54700a(), i3);
                                i2--;
                            }
                            mo54736B(buVar2, a, a2);
                            this.f155669b = i2;
                            mo54750n(buVar2);
                            unlock();
                            mo54758v();
                            return a;
                        }
                    }
                    this.f155671d++;
                    C58241bu d2 = mo54740d(obj, i, buVar);
                    mo54736B(d2, a, a2);
                    atomicReferenceArray.set(length, d2);
                    this.f155669b = i2;
                    mo54750n(d2);
                    unlock();
                    mo54758v();
                    return a;
                } catch (Throwable th) {
                    th = th;
                    obj2 = a;
                }
            } else {
                throw new C58256k("CacheLoader returned null for key " + obj + ".");
            }
        } catch (Throwable th2) {
            th = th2;
            if (obj2 == null) {
                this.f155681n.mo54682b(ajVar.mo54708h());
                lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = this.f155673f;
                    int length2 = (atomicReferenceArray2.length() - 1) & i;
                    C58241bu buVar3 = (C58241bu) atomicReferenceArray2.get(length2);
                    C58241bu buVar4 = buVar3;
                    while (true) {
                        if (buVar4 == null) {
                            break;
                        }
                        Object j2 = buVar4.mo54726j();
                        if (buVar4.mo54717a() != i || j2 == null || !this.f155668a.f155739h.mo56077d(obj, j2)) {
                            buVar4 = buVar4.mo54721e();
                        } else if (buVar4.mo54720d() == ajVar) {
                            if (ajVar.mo54705f()) {
                                buVar4.mo54732p(ajVar.f155643a);
                            } else {
                                atomicReferenceArray2.set(length2, mo54741e(buVar3, buVar4));
                            }
                        }
                    }
                } finally {
                    unlock();
                    mo54758v();
                }
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final Object mo54744h(C58241bu buVar, long j) {
        if (buVar.mo54726j() == null) {
            mo54759w();
            return null;
        }
        Object obj = buVar.mo54720d().get();
        if (obj == null) {
            mo54759w();
            return null;
        } else if (!this.f155668a.mo54798q(buVar, j)) {
            return obj;
        } else {
            mo54760x(j);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        r11 = r5.mo54720d();
        r2 = r11.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r2 != null) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        r9.f155671d++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r11.mo54705f() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        mo54762z(r10, (java.lang.Object) null, r11.mo54700a(), 3);
        mo54736B(r5, r12, r0);
        r10 = r9.f155669b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        mo54736B(r5, r12, r0);
        r10 = r9.f155669b + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
        r9.f155669b = r10;
        mo54750n(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        if (r13 == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        mo54754r(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        unlock();
        mo54758v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0084, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r9.f155671d++;
        mo54762z(r10, r2, r11.mo54700a(), 2);
        mo54736B(r5, r12, r0);
        mo54750n(r5);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo54745i(java.lang.Object r10, int r11, java.lang.Object r12, boolean r13) {
        /*
            r9 = this;
            r9.lock()
            com.google.common.a.bn r0 = r9.f155668a     // Catch:{ all -> 0x00b9 }
            com.google.common.base.cz r0 = r0.f155749r     // Catch:{ all -> 0x00b9 }
            long r0 = r0.mo26884a()     // Catch:{ all -> 0x00b9 }
            r9.mo54757u(r0)     // Catch:{ all -> 0x00b9 }
            int r2 = r9.f155669b     // Catch:{ all -> 0x00b9 }
            int r2 = r2 + 1
            int r3 = r9.f155672e     // Catch:{ all -> 0x00b9 }
            if (r2 <= r3) goto L_0x0019
            r9.mo54751o()     // Catch:{ all -> 0x00b9 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r9.f155673f     // Catch:{ all -> 0x00b9 }
            int r3 = r2.length()     // Catch:{ all -> 0x00b9 }
            int r3 = r3 + -1
            r3 = r3 & r11
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x00b9 }
            com.google.common.a.bu r4 = (com.google.common.p4520a.C58241bu) r4     // Catch:{ all -> 0x00b9 }
            r5 = r4
        L_0x0029:
            r6 = 0
            if (r5 == 0) goto L_0x009f
            java.lang.Object r7 = r5.mo54726j()     // Catch:{ all -> 0x00b9 }
            int r8 = r5.mo54717a()     // Catch:{ all -> 0x00b9 }
            if (r8 != r11) goto L_0x009a
            if (r7 == 0) goto L_0x009a
            com.google.common.a.bn r8 = r9.f155668a     // Catch:{ all -> 0x00b9 }
            com.google.common.base.af r8 = r8.f155739h     // Catch:{ all -> 0x00b9 }
            boolean r7 = r8.mo56077d(r10, r7)     // Catch:{ all -> 0x00b9 }
            if (r7 == 0) goto L_0x009a
            com.google.common.a.az r11 = r5.mo54720d()     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = r11.get()     // Catch:{ all -> 0x00b9 }
            if (r2 != 0) goto L_0x0079
            int r13 = r9.f155671d     // Catch:{ all -> 0x00b9 }
            int r13 = r13 + 1
            r9.f155671d = r13     // Catch:{ all -> 0x00b9 }
            boolean r13 = r11.mo54705f()     // Catch:{ all -> 0x00b9 }
            if (r13 == 0) goto L_0x0066
            int r11 = r11.mo54700a()     // Catch:{ all -> 0x00b9 }
            r13 = 3
            r9.mo54762z(r10, r6, r11, r13)     // Catch:{ all -> 0x00b9 }
            r9.mo54736B(r5, r12, r0)     // Catch:{ all -> 0x00b9 }
            int r10 = r9.f155669b     // Catch:{ all -> 0x00b9 }
            goto L_0x006d
        L_0x0066:
            r9.mo54736B(r5, r12, r0)     // Catch:{ all -> 0x00b9 }
            int r10 = r9.f155669b     // Catch:{ all -> 0x00b9 }
            int r10 = r10 + 1
        L_0x006d:
            r9.f155669b = r10     // Catch:{ all -> 0x00b9 }
            r9.mo54750n(r5)     // Catch:{ all -> 0x00b9 }
        L_0x0072:
            r9.unlock()
            r9.mo54758v()
            return r6
        L_0x0079:
            if (r13 == 0) goto L_0x0085
            r9.mo54754r(r5, r0)     // Catch:{ all -> 0x00b9 }
        L_0x007e:
            r9.unlock()
            r9.mo54758v()
            return r2
        L_0x0085:
            int r13 = r9.f155671d     // Catch:{ all -> 0x00b9 }
            int r13 = r13 + 1
            r9.f155671d = r13     // Catch:{ all -> 0x00b9 }
            int r11 = r11.mo54700a()     // Catch:{ all -> 0x00b9 }
            r13 = 2
            r9.mo54762z(r10, r2, r11, r13)     // Catch:{ all -> 0x00b9 }
            r9.mo54736B(r5, r12, r0)     // Catch:{ all -> 0x00b9 }
            r9.mo54750n(r5)     // Catch:{ all -> 0x00b9 }
            goto L_0x007e
        L_0x009a:
            com.google.common.a.bu r5 = r5.mo54721e()     // Catch:{ all -> 0x00b9 }
            goto L_0x0029
        L_0x009f:
            int r13 = r9.f155671d     // Catch:{ all -> 0x00b9 }
            int r13 = r13 + 1
            r9.f155671d = r13     // Catch:{ all -> 0x00b9 }
            com.google.common.a.bu r10 = r9.mo54740d(r10, r11, r4)     // Catch:{ all -> 0x00b9 }
            r9.mo54736B(r10, r12, r0)     // Catch:{ all -> 0x00b9 }
            r2.set(r3, r10)     // Catch:{ all -> 0x00b9 }
            int r11 = r9.f155669b     // Catch:{ all -> 0x00b9 }
            int r11 = r11 + 1
            r9.f155669b = r11     // Catch:{ all -> 0x00b9 }
            r9.mo54750n(r10)     // Catch:{ all -> 0x00b9 }
            goto L_0x0072
        L_0x00b9:
            r10 = move-exception
            r9.unlock()
            r9.mo54758v()
            goto L_0x00c2
        L_0x00c1:
            throw r10
        L_0x00c2:
            goto L_0x00c1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58210aq.mo54745i(java.lang.Object, int, java.lang.Object, boolean):java.lang.Object");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final Object mo54746j(C58241bu buVar, Object obj, C58219az azVar) {
        if (azVar.mo54706g()) {
            C58838bb.m90887v(!Thread.holdsLock(buVar), "Recursive load of: %s", obj);
            try {
                Object d = azVar.mo54703d();
                if (d != null) {
                    mo54755s(buVar, this.f155668a.f155749r.mo26884a());
                    return d;
                }
                throw new C58256k("CacheLoader returned null for key " + obj + ".");
            } finally {
                this.f155681n.mo54685e();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final void mo54747k() {
        mo54757u(this.f155668a.f155749r.mo26884a());
        mo54758v();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo54748l() {
        while (true) {
            C58241bu buVar = (C58241bu) this.f155677j.poll();
            if (buVar == null) {
                return;
            }
            if (this.f155680m.contains(buVar)) {
                this.f155680m.add(buVar);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.google.common.a.bu} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f6, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0100, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010f, code lost:
        if (r0.isHeldByCurrentThread() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0111, code lost:
        r0.mo54758v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0114, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54749m() {
        /*
            r14 = this;
            com.google.common.a.bn r0 = r14.f155668a
            boolean r0 = r0.mo54801t()
            r1 = 16
            r2 = 0
            if (r0 == 0) goto L_0x0078
            r0 = 0
        L_0x000c:
            java.lang.ref.ReferenceQueue r3 = r14.f155675h
            java.lang.ref.Reference r3 = r3.poll()
            if (r3 == 0) goto L_0x0078
            com.google.common.a.bu r3 = (com.google.common.p4520a.C58241bu) r3
            com.google.common.a.bn r4 = r14.f155668a
            int r5 = r3.mo54717a()
            com.google.common.a.aq r4 = r4.mo54790c(r5)
            r4.lock()
            int r6 = r4.f155669b     // Catch:{ all -> 0x0070 }
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r4.f155673f     // Catch:{ all -> 0x0070 }
            int r6 = r13.length()     // Catch:{ all -> 0x0070 }
            int r6 = r6 + -1
            r5 = r5 & r6
            java.lang.Object r6 = r13.get(r5)     // Catch:{ all -> 0x0070 }
            r7 = r6
            com.google.common.a.bu r7 = (com.google.common.p4520a.C58241bu) r7     // Catch:{ all -> 0x0070 }
            r8 = r7
        L_0x0036:
            if (r8 == 0) goto L_0x0065
            if (r8 != r3) goto L_0x0060
            int r3 = r4.f155671d     // Catch:{ all -> 0x0070 }
            int r3 = r3 + 1
            r4.f155671d = r3     // Catch:{ all -> 0x0070 }
            java.lang.Object r9 = r8.mo54726j()     // Catch:{ all -> 0x0070 }
            com.google.common.a.az r3 = r8.mo54720d()     // Catch:{ all -> 0x0070 }
            java.lang.Object r10 = r3.get()     // Catch:{ all -> 0x0070 }
            com.google.common.a.az r11 = r8.mo54720d()     // Catch:{ all -> 0x0070 }
            r12 = 3
            r6 = r4
            com.google.common.a.bu r3 = r6.mo54735A(r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0070 }
            int r6 = r4.f155669b     // Catch:{ all -> 0x0070 }
            int r6 = r6 + -1
            r13.set(r5, r3)     // Catch:{ all -> 0x0070 }
            r4.f155669b = r6     // Catch:{ all -> 0x0070 }
            goto L_0x0065
        L_0x0060:
            com.google.common.a.bu r8 = r8.mo54721e()     // Catch:{ all -> 0x0070 }
            goto L_0x0036
        L_0x0065:
            r4.unlock()
            r4.mo54758v()
            int r0 = r0 + 1
            if (r0 != r1) goto L_0x000c
            goto L_0x0078
        L_0x0070:
            r0 = move-exception
            r4.unlock()
            r4.mo54758v()
            throw r0
        L_0x0078:
            com.google.common.a.bn r0 = r14.f155668a
            boolean r0 = r0.mo54802u()
            if (r0 == 0) goto L_0x0128
        L_0x0080:
            java.lang.ref.ReferenceQueue r0 = r14.f155676i
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L_0x0128
            r8 = r0
            com.google.common.a.az r8 = (com.google.common.p4520a.C58219az) r8
            com.google.common.a.bn r0 = r14.f155668a
            com.google.common.a.bu r3 = r8.mo54702c()
            int r4 = r3.mo54717a()
            com.google.common.a.aq r0 = r0.mo54790c(r4)
            java.lang.Object r3 = r3.mo54726j()
            r0.lock()
            int r5 = r0.f155669b     // Catch:{ all -> 0x0119 }
            java.util.concurrent.atomic.AtomicReferenceArray r10 = r0.f155673f     // Catch:{ all -> 0x0119 }
            int r5 = r10.length()     // Catch:{ all -> 0x0119 }
            int r5 = r5 + -1
            r11 = r4 & r5
            java.lang.Object r5 = r10.get(r11)     // Catch:{ all -> 0x0119 }
            com.google.common.a.bu r5 = (com.google.common.p4520a.C58241bu) r5     // Catch:{ all -> 0x0119 }
            r6 = r5
        L_0x00b3:
            if (r6 == 0) goto L_0x0108
            java.lang.Object r7 = r6.mo54726j()     // Catch:{ all -> 0x0119 }
            int r9 = r6.mo54717a()     // Catch:{ all -> 0x0119 }
            if (r9 != r4) goto L_0x0103
            if (r7 == 0) goto L_0x0103
            com.google.common.a.bn r9 = r0.f155668a     // Catch:{ all -> 0x0119 }
            com.google.common.base.af r9 = r9.f155739h     // Catch:{ all -> 0x0119 }
            boolean r9 = r9.mo56077d(r3, r7)     // Catch:{ all -> 0x0119 }
            if (r9 == 0) goto L_0x0103
            com.google.common.a.az r3 = r6.mo54720d()     // Catch:{ all -> 0x0119 }
            if (r3 != r8) goto L_0x00f9
            int r3 = r0.f155671d     // Catch:{ all -> 0x0119 }
            int r3 = r3 + 1
            r0.f155671d = r3     // Catch:{ all -> 0x0119 }
            java.lang.Object r9 = r8.get()     // Catch:{ all -> 0x0119 }
            r12 = 3
            r3 = r0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r9
            r9 = r12
            com.google.common.a.bu r3 = r3.mo54735A(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0119 }
            int r4 = r0.f155669b     // Catch:{ all -> 0x0119 }
            int r4 = r4 + -1
            r10.set(r11, r3)     // Catch:{ all -> 0x0119 }
            r0.f155669b = r4     // Catch:{ all -> 0x0119 }
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 != 0) goto L_0x0114
            goto L_0x0111
        L_0x00f9:
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 != 0) goto L_0x0114
            goto L_0x0111
        L_0x0103:
            com.google.common.a.bu r6 = r6.mo54721e()     // Catch:{ all -> 0x0119 }
            goto L_0x00b3
        L_0x0108:
            r0.unlock()
            boolean r3 = r0.isHeldByCurrentThread()
            if (r3 != 0) goto L_0x0114
        L_0x0111:
            r0.mo54758v()
        L_0x0114:
            int r2 = r2 + 1
            if (r2 != r1) goto L_0x0080
            goto L_0x0128
        L_0x0119:
            r1 = move-exception
            r0.unlock()
            boolean r2 = r0.isHeldByCurrentThread()
            if (r2 == 0) goto L_0x0124
            goto L_0x0127
        L_0x0124:
            r0.mo54758v()
        L_0x0127:
            throw r1
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58210aq.mo54749m():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo54750n(C58241bu buVar) {
        if (this.f155668a.mo54795n()) {
            mo54748l();
            if (((long) buVar.mo54720d().mo54700a()) > this.f155674g && !mo54761y(buVar, buVar.mo54717a(), 5)) {
                throw new AssertionError();
            }
            while (this.f155670c > this.f155674g) {
                for (C58241bu buVar2 : this.f155680m) {
                    if (buVar2.mo54720d().mo54700a() > 0) {
                        if (!mo54761y(buVar2, buVar2.mo54717a(), 5)) {
                            throw new AssertionError();
                        }
                    }
                }
                throw new AssertionError();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final void mo54751o() {
        AtomicReferenceArray atomicReferenceArray = this.f155673f;
        int length = atomicReferenceArray.length();
        if (length < 1073741824) {
            int i = this.f155669b;
            AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length + length);
            this.f155672e = (atomicReferenceArray2.length() * 3) / 4;
            int length2 = atomicReferenceArray2.length() - 1;
            for (int i2 = 0; i2 < length; i2++) {
                C58241bu buVar = (C58241bu) atomicReferenceArray.get(i2);
                if (buVar != null) {
                    C58241bu e = buVar.mo54721e();
                    int a = buVar.mo54717a() & length2;
                    if (e == null) {
                        atomicReferenceArray2.set(a, buVar);
                    } else {
                        C58241bu buVar2 = buVar;
                        while (e != null) {
                            int a2 = e.mo54717a() & length2;
                            int i3 = a2 != a ? a2 : a;
                            if (a2 != a) {
                                buVar2 = e;
                            }
                            e = e.mo54721e();
                            a = i3;
                        }
                        atomicReferenceArray2.set(a, buVar2);
                        while (buVar != buVar2) {
                            int a3 = buVar.mo54717a() & length2;
                            C58241bu a4 = mo54737a(buVar, (C58241bu) atomicReferenceArray2.get(a3));
                            if (a4 != null) {
                                atomicReferenceArray2.set(a3, a4);
                            } else {
                                mo54756t(buVar);
                                i--;
                            }
                            buVar = buVar.mo54721e();
                        }
                    }
                }
            }
            this.f155673f = atomicReferenceArray2;
            this.f155669b = i;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo54752p(long j) {
        C58241bu buVar;
        C58241bu buVar2;
        mo54748l();
        do {
            buVar = (C58241bu) this.f155679l.peek();
            if (buVar == null || !this.f155668a.mo54798q(buVar, j)) {
                do {
                    buVar2 = (C58241bu) this.f155680m.peek();
                    if (buVar2 == null || !this.f155668a.mo54798q(buVar2, j)) {
                        return;
                    }
                } while (mo54761y(buVar2, buVar2.mo54717a(), 4));
                throw new AssertionError();
            }
        } while (mo54761y(buVar, buVar.mo54717a(), 4));
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo54753q() {
        if ((this.f155678k.incrementAndGet() & 63) == 0) {
            mo54747k();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo54754r(C58241bu buVar, long j) {
        if (this.f155668a.mo54796o()) {
            buVar.mo54727k(j);
        }
        this.f155680m.add(buVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo54755s(C58241bu buVar, long j) {
        if (this.f155668a.mo54796o()) {
            buVar.mo54727k(j);
        }
        this.f155677j.add(buVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final void mo54756t(C58241bu buVar) {
        Object j = buVar.mo54726j();
        buVar.mo54717a();
        mo54762z(j, buVar.mo54720d().get(), buVar.mo54720d().mo54700a(), 3);
        this.f155679l.remove(buVar);
        this.f155680m.remove(buVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final void mo54757u(long j) {
        if (tryLock()) {
            try {
                mo54749m();
                mo54752p(j);
                this.f155678k.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo54758v() {
        if (!isHeldByCurrentThread()) {
            C58234bn bnVar = this.f155668a;
            while (((C58243bw) bnVar.f155747p.poll()) != null) {
                try {
                    bnVar.f155748q.mo54811a();
                } catch (Throwable th) {
                    C58234bn.f155731a.logp(Level.WARNING, "com.google.common.cache.LocalCache", "processPendingNotifications", "Exception thrown by removal listener", th);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final void mo54759w() {
        if (tryLock()) {
            try {
                mo54749m();
            } finally {
                unlock();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public final void mo54760x(long j) {
        if (tryLock()) {
            try {
                mo54752p(j);
            } finally {
                unlock();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.google.common.a.bu} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo54761y(com.google.common.p4520a.C58241bu r10, int r11, int r12) {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r9.f155673f
            int r1 = r0.length()
            int r1 = r1 + -1
            r11 = r11 & r1
            java.lang.Object r1 = r0.get(r11)
            r3 = r1
            com.google.common.a.bu r3 = (com.google.common.p4520a.C58241bu) r3
            r4 = r3
        L_0x0011:
            if (r4 == 0) goto L_0x0040
            if (r4 != r10) goto L_0x003b
            int r10 = r9.f155671d
            r1 = 1
            int r10 = r10 + r1
            r9.f155671d = r10
            java.lang.Object r5 = r4.mo54726j()
            com.google.common.a.az r10 = r4.mo54720d()
            java.lang.Object r6 = r10.get()
            com.google.common.a.az r7 = r4.mo54720d()
            r2 = r9
            r8 = r12
            com.google.common.a.bu r10 = r2.mo54735A(r3, r4, r5, r6, r7, r8)
            int r12 = r9.f155669b
            r0.set(r11, r10)
            int r12 = r12 + -1
            r9.f155669b = r12
            return r1
        L_0x003b:
            com.google.common.a.bu r4 = r4.mo54721e()
            goto L_0x0011
        L_0x0040:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.p4520a.C58210aq.mo54761y(com.google.common.a.bu, int, int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public final void mo54762z(Object obj, Object obj2, int i, int i2) {
        this.f155670c -= (long) i;
        int i3 = i2 - 1;
        if (!(i3 == 0 || i3 == 1)) {
            this.f155681n.mo54681a();
        }
        if (this.f155668a.f155747p != C58234bn.f155733c) {
            this.f155668a.f155747p.offer(new C58243bw(obj, obj2));
        }
    }
}
