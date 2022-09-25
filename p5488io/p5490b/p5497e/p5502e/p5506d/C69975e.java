package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicInteger;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;
import p5488io.p5490b.p5497e.p5509f.C70038d;
import p5488io.p5490b.p5497e.p5513j.C70081b;
import p5488io.p5490b.p5497e.p5513j.C70085f;

/* renamed from: io.b.e.e.d.e */
/* compiled from: PG */
final class C69975e extends AtomicInteger implements C69803b {
    private static final long serialVersionUID = 8567835998786448817L;

    /* renamed from: a */
    final C70123o f186507a;

    /* renamed from: b */
    final C69822d f186508b;

    /* renamed from: c */
    final C69974d[] f186509c;

    /* renamed from: d */
    Object[] f186510d;

    /* renamed from: e */
    final C70038d f186511e;

    /* renamed from: f */
    volatile boolean f186512f;

    /* renamed from: g */
    volatile boolean f186513g;

    /* renamed from: h */
    final C70081b f186514h = new C70081b();

    /* renamed from: i */
    int f186515i;

    /* renamed from: j */
    int f186516j;

    public C69975e(C70123o oVar, C69822d dVar, int i, int i2) {
        this.f186507a = oVar;
        this.f186508b = dVar;
        this.f186510d = new Object[i];
        C69974d[] dVarArr = new C69974d[i];
        for (int i3 = 0; i3 < i; i3++) {
            dVarArr[i3] = new C69974d(this, i3);
        }
        this.f186509c = dVarArr;
        this.f186511e = new C70038d(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo61547a() {
        for (C69974d f : this.f186509c) {
            C69828d.m101309f(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo61548b(C70038d dVar) {
        synchronized (this) {
            this.f186510d = null;
        }
        dVar.mo61475c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo61549c() {
        if (getAndIncrement() == 0) {
            C70038d dVar = this.f186511e;
            C70123o oVar = this.f186507a;
            int i = 1;
            while (!this.f186512f) {
                if (this.f186514h.get() == null) {
                    boolean z = this.f186513g;
                    Object[] objArr = (Object[]) dVar.mo61479lN();
                    if (z) {
                        if (objArr == null) {
                            mo61548b(dVar);
                            Throwable c = C70085f.m101986c(this.f186514h);
                            if (c == null) {
                                oVar.mo25986a();
                                return;
                            } else {
                                oVar.mo25987b(c);
                                return;
                            }
                        }
                    } else if (objArr == null) {
                        i = addAndGet(-i);
                        if (i == 0) {
                            return;
                        }
                    }
                    try {
                        Object a = this.f186508b.mo25875a(objArr);
                        C69841j.m101337b(a, "The combiner returned a null value");
                        oVar.mo25988lL(a);
                    } catch (Throwable th) {
                        C69813f.m101292a(th);
                        C70085f.m101987d(this.f186514h, th);
                        mo61547a();
                        mo61548b(dVar);
                        oVar.mo25987b(C70085f.m101986c(this.f186514h));
                        return;
                    }
                } else {
                    mo61547a();
                    mo61548b(dVar);
                    oVar.mo25987b(C70085f.m101986c(this.f186514h));
                    return;
                }
            }
            mo61548b(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        if (r4 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        mo61549c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61550d(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object[] r0 = r3.f186510d     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            return
        L_0x0007:
            r1 = r0[r4]     // Catch:{ all -> 0x002b }
            int r2 = r3.f186515i     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0011
            int r2 = r2 + 1
            r3.f186515i = r2     // Catch:{ all -> 0x002b }
        L_0x0011:
            r0[r4] = r5     // Catch:{ all -> 0x002b }
            int r4 = r0.length     // Catch:{ all -> 0x002b }
            if (r2 != r4) goto L_0x0023
            io.b.e.f.d r4 = r3.f186511e     // Catch:{ all -> 0x002b }
            java.lang.Object r5 = r0.clone()     // Catch:{ all -> 0x002b }
            java.lang.Object[] r5 = (java.lang.Object[]) r5     // Catch:{ all -> 0x002b }
            r4.mo61477j(r5)     // Catch:{ all -> 0x002b }
            r4 = 1
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            if (r4 == 0) goto L_0x002a
            r3.mo61549c()
        L_0x002a:
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5506d.C69975e.mo61550d(int, java.lang.Object):void");
    }

    public final void dispose() {
        if (!this.f186512f) {
            this.f186512f = true;
            mo61547a();
            if (getAndIncrement() == 0) {
                mo61548b(this.f186511e);
            }
        }
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }
}
