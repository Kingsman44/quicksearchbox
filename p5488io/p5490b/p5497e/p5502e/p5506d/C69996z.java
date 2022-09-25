package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70122n;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5500c.C69846e;
import p5488io.p5490b.p5497e.p5500c.C69847f;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.z */
/* compiled from: PG */
final class C69996z extends AtomicInteger implements C69803b, C70123o {

    /* renamed from: a */
    static final C69994x[] f186558a = new C69994x[0];

    /* renamed from: b */
    static final C69994x[] f186559b = new C69994x[0];
    private static final long serialVersionUID = -2117620485640801370L;

    /* renamed from: c */
    final C70123o f186560c;

    /* renamed from: d */
    final boolean f186561d;

    /* renamed from: e */
    final int f186562e;

    /* renamed from: f */
    final int f186563f;

    /* renamed from: g */
    volatile C69846e f186564g;

    /* renamed from: h */
    volatile boolean f186565h;

    /* renamed from: i */
    final C70081b f186566i = new C70081b();

    /* renamed from: j */
    volatile boolean f186567j;

    /* renamed from: k */
    final AtomicReference f186568k;

    /* renamed from: l */
    C69803b f186569l;

    /* renamed from: m */
    long f186570m;

    /* renamed from: n */
    long f186571n;

    /* renamed from: o */
    int f186572o;

    /* renamed from: p */
    Queue f186573p;

    /* renamed from: q */
    int f186574q;

    public C69996z(C70123o oVar, int i, int i2) {
        this.f186560c = oVar;
        this.f186561d = false;
        this.f186562e = i;
        this.f186563f = i2;
        if (i != Integer.MAX_VALUE) {
            this.f186573p = new ArrayDeque(i);
        }
        this.f186568k = new AtomicReference(f186558a);
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186565h) {
            this.f186565h = true;
            mo61557f();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186565h) {
            C70101a.m102023e(th);
        } else if (C70085f.m101987d(this.f186566i, th)) {
            this.f186565h = true;
            mo61557f();
        } else {
            C70101a.m102023e(th);
        }
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186569l, bVar)) {
            this.f186569l = bVar;
            this.f186560c.mo26850d(this);
        }
    }

    public final void dispose() {
        Throwable c;
        if (!this.f186567j) {
            this.f186567j = true;
            if (mo61562k() && (c = C70085f.m101986c(this.f186566i)) != null && c != C70085f.f186815a) {
                C70101a.m102023e(c);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo61557f() {
        if (getAndIncrement() == 0) {
            mo61558g();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo61558g() {
        int i;
        int i2;
        C70123o oVar = this.f186560c;
        int i3 = 1;
        while (!mo61561j()) {
            C69846e eVar = this.f186564g;
            if (eVar != null) {
                while (!mo61561j()) {
                    Object lN = eVar.mo61479lN();
                    if (lN != null) {
                        oVar.mo25988lL(lN);
                    }
                }
                return;
            }
            boolean z = this.f186565h;
            C69846e eVar2 = this.f186564g;
            C69994x[] xVarArr = (C69994x[]) this.f186568k.get();
            int length = xVarArr.length;
            int i4 = 0;
            if (this.f186562e != Integer.MAX_VALUE) {
                synchronized (this) {
                    i = this.f186573p.size();
                }
            } else {
                i = 0;
            }
            if (!z || !((eVar2 == null || eVar2.mo61476i()) && length == 0 && i == 0)) {
                if (length != 0) {
                    long j = this.f186571n;
                    int i5 = this.f186572o;
                    if (length <= i5 || xVarArr[i5].f186553a != j) {
                        if (length <= i5) {
                            i5 = 0;
                        }
                        for (int i6 = 0; i6 < length && xVarArr[i5].f186553a != j; i6++) {
                            i5++;
                            if (i5 == length) {
                                i5 = 0;
                            }
                        }
                        this.f186572o = i5;
                        this.f186571n = xVarArr[i5].f186553a;
                    }
                    int i7 = 0;
                    int i8 = 0;
                    while (i7 < length) {
                        if (!mo61561j()) {
                            C69994x xVar = xVarArr[i5];
                            C69847f fVar = xVar.f186556d;
                            if (fVar != null) {
                                while (true) {
                                    try {
                                        Object lN2 = fVar.mo61479lN();
                                        if (lN2 == null) {
                                            break;
                                        }
                                        oVar.mo25988lL(lN2);
                                        if (mo61561j()) {
                                            return;
                                        }
                                    } catch (Throwable th) {
                                        C69813f.m101292a(th);
                                        C69828d.m101309f(xVar);
                                        C70085f.m101987d(this.f186566i, th);
                                        if (!mo61561j()) {
                                            mo61559h(xVar);
                                            i8++;
                                            i2 = i5 + 1;
                                            if (i2 != length) {
                                            }
                                        } else {
                                            return;
                                        }
                                    }
                                }
                            }
                            boolean z2 = xVar.f186555c;
                            C69847f fVar2 = xVar.f186556d;
                            if (z2 && (fVar2 == null || fVar2.mo61476i())) {
                                mo61559h(xVar);
                                if (!mo61561j()) {
                                    i8++;
                                } else {
                                    return;
                                }
                            }
                            i2 = i5 + 1;
                            if (i2 != length) {
                                i7++;
                            }
                            i2 = 0;
                            i7++;
                        } else {
                            return;
                        }
                    }
                    this.f186572o = i5;
                    this.f186571n = xVarArr[i5].f186553a;
                    i4 = i8;
                }
                if (i4 == 0) {
                    i3 = addAndGet(-i3);
                    if (i3 == 0) {
                        return;
                    }
                } else if (this.f186562e != Integer.MAX_VALUE) {
                    while (true) {
                        int i9 = i4 - 1;
                        if (i4 == 0) {
                            continue;
                            break;
                        }
                        synchronized (this) {
                            C70122n nVar = (C70122n) this.f186573p.poll();
                            if (nVar == null) {
                                this.f186574q--;
                            } else {
                                mo61560i(nVar);
                            }
                        }
                        i4 = i9;
                    }
                    while (true) {
                    }
                } else {
                    continue;
                }
            } else {
                Throwable c = C70085f.m101986c(this.f186566i);
                if (c == C70085f.f186815a) {
                    return;
                }
                if (c == null) {
                    oVar.mo25986a();
                    return;
                } else {
                    oVar.mo25987b(c);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo61559h(C69994x xVar) {
        C69994x[] xVarArr;
        C69994x[] xVarArr2;
        do {
            xVarArr = (C69994x[]) this.f186568k.get();
            int length = xVarArr.length;
            if (length != 0) {
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (xVarArr[i] == xVar) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        xVarArr2 = f186558a;
                    } else {
                        C69994x[] xVarArr3 = new C69994x[(length - 1)];
                        System.arraycopy(xVarArr, 0, xVarArr3, 0, i);
                        System.arraycopy(xVarArr, i + 1, xVarArr3, i, (length - i) - 1);
                        xVarArr2 = xVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!C69995y.m101766a(this.f186568k, xVarArr, xVarArr2));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (decrementAndGet() != 0) goto L_0x005b;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61560i(p5488io.p5490b.C70122n r7) {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r7 instanceof java.util.concurrent.Callable
            r1 = 0
            if (r0 == 0) goto L_0x008e
            java.util.concurrent.Callable r7 = (java.util.concurrent.Callable) r7
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            java.lang.Object r7 = r7.call()     // Catch:{ all -> 0x005f }
            if (r7 != 0) goto L_0x0012
            goto L_0x006b
        L_0x0012:
            int r3 = r6.get()
            if (r3 != 0) goto L_0x002a
            boolean r3 = r6.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x002a
            io.b.o r3 = r6.f186560c
            r3.mo25988lL(r7)
            int r7 = r6.decrementAndGet()
            if (r7 == 0) goto L_0x006b
            goto L_0x005b
        L_0x002a:
            io.b.e.c.e r3 = r6.f186564g
            if (r3 != 0) goto L_0x0043
            int r3 = r6.f186562e
            if (r3 != r0) goto L_0x003a
            io.b.e.f.d r3 = new io.b.e.f.d
            int r4 = r6.f186563f
            r3.<init>(r4)
            goto L_0x0041
        L_0x003a:
            io.b.e.f.c r3 = new io.b.e.f.c
            int r4 = r6.f186562e
            r3.<init>(r4)
        L_0x0041:
            r6.f186564g = r3
        L_0x0043:
            boolean r7 = r3.mo61477j(r7)
            if (r7 != 0) goto L_0x0054
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r3 = "Scalar queue full?!"
            r7.<init>(r3)
            r6.mo25987b(r7)
            goto L_0x006b
        L_0x0054:
            int r7 = r6.getAndIncrement()
            if (r7 == 0) goto L_0x005b
            goto L_0x008d
        L_0x005b:
            r6.mo61558g()
            goto L_0x006b
        L_0x005f:
            r7 = move-exception
            p5488io.p5490b.p5495c.C69813f.m101292a(r7)
            io.b.e.j.b r3 = r6.f186566i
            p5488io.p5490b.p5497e.p5513j.C70085f.m101987d(r3, r7)
            r6.mo61557f()
        L_0x006b:
            int r7 = r6.f186562e
            if (r7 == r0) goto L_0x008d
            monitor-enter(r6)
            java.util.Queue r7 = r6.f186573p     // Catch:{ all -> 0x008a }
            java.lang.Object r7 = r7.poll()     // Catch:{ all -> 0x008a }
            io.b.n r7 = (p5488io.p5490b.C70122n) r7     // Catch:{ all -> 0x008a }
            if (r7 != 0) goto L_0x0081
            int r0 = r6.f186574q     // Catch:{ all -> 0x008a }
            int r0 = r0 + -1
            r6.f186574q = r0     // Catch:{ all -> 0x008a }
            r1 = 1
        L_0x0081:
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0086
            goto L_0x0000
        L_0x0086:
            r6.mo61557f()
            return
        L_0x008a:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x008a }
            throw r7
        L_0x008d:
            return
        L_0x008e:
            io.b.e.e.d.x r0 = new io.b.e.e.d.x
            long r2 = r6.f186570m
            r4 = 1
            long r4 = r4 + r2
            r6.f186570m = r4
            r0.<init>(r6, r2)
        L_0x009a:
            java.util.concurrent.atomic.AtomicReference r2 = r6.f186568k
            java.lang.Object r2 = r2.get()
            io.b.e.e.d.x[] r2 = (p5488io.p5490b.p5497e.p5502e.p5506d.C69994x[]) r2
            io.b.e.e.d.x[] r3 = f186559b
            if (r2 != r3) goto L_0x00aa
            p5488io.p5490b.p5497e.p5498a.C69828d.m101309f(r0)
            return
        L_0x00aa:
            int r3 = r2.length
            int r4 = r3 + 1
            io.b.e.e.d.x[] r4 = new p5488io.p5490b.p5497e.p5502e.p5506d.C69994x[r4]
            java.lang.System.arraycopy(r2, r1, r4, r1, r3)
            r4[r3] = r0
            java.util.concurrent.atomic.AtomicReference r3 = r6.f186568k
            boolean r2 = p5488io.p5490b.p5497e.p5502e.p5506d.C69995y.m101766a(r3, r2, r4)
            if (r2 == 0) goto L_0x009a
            r7.mo61539p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5506d.C69996z.mo61560i(io.b.n):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final boolean mo61561j() {
        if (this.f186567j) {
            return true;
        }
        if (((Throwable) this.f186566i.get()) == null) {
            return false;
        }
        mo61562k();
        Throwable c = C70085f.m101986c(this.f186566i);
        if (c != C70085f.f186815a) {
            this.f186560c.mo25987b(c);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo61562k() {
        C69994x[] xVarArr;
        this.f186569l.dispose();
        C69994x[] xVarArr2 = (C69994x[]) this.f186568k.get();
        C69994x[] xVarArr3 = f186559b;
        if (xVarArr2 == xVarArr3 || (xVarArr = (C69994x[]) this.f186568k.getAndSet(xVarArr3)) == xVarArr3) {
            return false;
        }
        for (C69994x f : xVarArr) {
            C69828d.m101309f(f);
        }
        return true;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186565h) {
            try {
                C70122n nVar = (C70122n) obj;
                C69841j.m101337b(nVar, "The mapper returned a null ObservableSource");
                if (this.f186562e != Integer.MAX_VALUE) {
                    synchronized (this) {
                        int i = this.f186574q;
                        if (i != this.f186562e) {
                            this.f186574q = i + 1;
                        } else {
                            this.f186573p.offer(nVar);
                            return;
                        }
                    }
                }
                mo61560i(nVar);
            } catch (Throwable th) {
                C69813f.m101292a(th);
                this.f186569l.dispose();
                mo25987b(th);
            }
        }
    }
}
