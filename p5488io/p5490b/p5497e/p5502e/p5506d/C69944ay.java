package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.ay */
/* compiled from: PG */
final class C69944ay extends AtomicBoolean implements C70123o, C69803b {
    private static final long serialVersionUID = -7419642935409022375L;

    /* renamed from: a */
    final C70123o f186430a;

    /* renamed from: b */
    final C69945az f186431b;

    /* renamed from: c */
    final C69943ax f186432c;

    /* renamed from: d */
    C69803b f186433d;

    public C69944ay(C70123o oVar, C69945az azVar, C69943ax axVar) {
        this.f186430a = oVar;
        this.f186431b = azVar;
        this.f186432c = axVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (compareAndSet(false, true)) {
            this.f186431b.mo61530a(this.f186432c);
            this.f186430a.mo25986a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f186431b.mo61530a(this.f186432c);
            this.f186430a.mo25987b(th);
            return;
        }
        C70101a.m102023e(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186433d, bVar)) {
            this.f186433d = bVar;
            this.f186430a.mo26850d(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r7 = this;
            io.b.b.b r0 = r7.f186433d
            r0.dispose()
            r0 = 0
            r1 = 1
            boolean r0 = r7.compareAndSet(r0, r1)
            if (r0 == 0) goto L_0x0037
            io.b.e.e.d.az r0 = r7.f186431b
            io.b.e.e.d.ax r1 = r7.f186432c
            monitor-enter(r0)
            io.b.e.e.d.ax r2 = r0.f186435b     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0032
            if (r2 == r1) goto L_0x0019
            goto L_0x0032
        L_0x0019:
            long r2 = r1.f186427c     // Catch:{ all -> 0x0034 }
            r4 = -1
            long r2 = r2 + r4
            r1.f186427c = r2     // Catch:{ all -> 0x0034 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0030
            boolean r2 = r1.f186428d     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r0.mo61531b(r1)     // Catch:{ all -> 0x0034 }
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r1
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5497e.p5502e.p5506d.C69944ay.dispose():void");
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        this.f186430a.mo25988lL(obj);
    }
}
