package p5488io.p5490b.p5515g;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70080a;
import p5488io.p5490b.p5497e.p5513j.C70089j;

/* renamed from: io.b.g.c */
/* compiled from: PG */
public final class C70097c implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186828a;

    /* renamed from: b */
    C69803b f186829b;

    /* renamed from: c */
    boolean f186830c;

    /* renamed from: d */
    C70080a f186831d;

    /* renamed from: e */
    volatile boolean f186832e;

    public C70097c(C70123o oVar) {
        this.f186828a = oVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186832e) {
            synchronized (this) {
                if (!this.f186832e) {
                    if (this.f186830c) {
                        C70080a aVar = this.f186831d;
                        if (aVar == null) {
                            aVar = new C70080a();
                            this.f186831d = aVar;
                        }
                        aVar.mo61623a(C70089j.f186819a);
                        return;
                    }
                    this.f186832e = true;
                    this.f186830c = true;
                    this.f186828a.mo25986a();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1 == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        p5488io.p5490b.p5517i.C70101a.m102023e(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r3.f186828a.mo25987b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25987b(java.lang.Throwable r4) {
        /*
            r3 = this;
            boolean r0 = r3.f186832e
            if (r0 == 0) goto L_0x0008
            p5488io.p5490b.p5517i.C70101a.m102023e(r4)
            return
        L_0x0008:
            monitor-enter(r3)
            boolean r0 = r3.f186832e     // Catch:{ all -> 0x003d }
            r1 = 1
            if (r0 == 0) goto L_0x000f
            goto L_0x0030
        L_0x000f:
            boolean r0 = r3.f186830c     // Catch:{ all -> 0x003d }
            r2 = 0
            if (r0 == 0) goto L_0x002b
            r3.f186832e = r1     // Catch:{ all -> 0x003d }
            io.b.e.j.a r0 = r3.f186831d     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0021
            io.b.e.j.a r0 = new io.b.e.j.a     // Catch:{ all -> 0x003d }
            r0.<init>()     // Catch:{ all -> 0x003d }
            r3.f186831d = r0     // Catch:{ all -> 0x003d }
        L_0x0021:
            java.lang.Object r4 = p5488io.p5490b.p5497e.p5513j.C70089j.m101988a(r4)     // Catch:{ all -> 0x003d }
            java.lang.Object[] r0 = r0.f186812a     // Catch:{ all -> 0x003d }
            r0[r2] = r4     // Catch:{ all -> 0x003d }
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            return
        L_0x002b:
            r3.f186832e = r1     // Catch:{ all -> 0x003d }
            r3.f186830c = r1     // Catch:{ all -> 0x003d }
            r1 = 0
        L_0x0030:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            if (r1 == 0) goto L_0x0037
            p5488io.p5490b.p5517i.C70101a.m102023e(r4)
            return
        L_0x0037:
            io.b.o r0 = r3.f186828a
            r0.mo25987b(r4)
            return
        L_0x003d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5515g.C70097c.mo25987b(java.lang.Throwable):void");
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186829b, bVar)) {
            this.f186829b = bVar;
            this.f186828a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186829b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r6.f186828a.mo25988lL(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7 = r6.f186831d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0041, code lost:
        if (r7 != null) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0043, code lost:
        r6.f186830c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0045, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0047, code lost:
        r6.f186831d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004b, code lost:
        r2 = r6.f186828a;
        r7 = r7.f186812a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004f, code lost:
        if (r7 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0053, code lost:
        if (r3 >= 4) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        r5 = r7[r3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0057, code lost:
        if (r5 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005c, code lost:
        if (r5 != p5488io.p5490b.p5497e.p5513j.C70089j.f186819a) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x005e, code lost:
        r2.mo25986a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0061, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0064, code lost:
        if ((r5 instanceof p5488io.p5490b.p5497e.p5513j.C70088i) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0066, code lost:
        r2.mo25987b(((p5488io.p5490b.p5497e.p5513j.C70088i) r5).f186818a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0070, code lost:
        if ((r5 instanceof p5488io.p5490b.p5497e.p5513j.C70087h) == false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0072, code lost:
        r5 = (p5488io.p5490b.p5497e.p5513j.C70087h) r5;
        r2.mo26850d((p5488io.p5490b.p5494b.C69803b) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0078, code lost:
        r2.mo25988lL(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x007e, code lost:
        r7 = (java.lang.Object[]) r7[4];
     */
    /* renamed from: lL */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25988lL(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.f186832e
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            if (r7 != 0) goto L_0x0017
            io.b.b.b r7 = r6.f186829b
            r7.dispose()
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            r7.<init>(r0)
            r6.mo25987b(r7)
            return
        L_0x0017:
            monitor-enter(r6)
            boolean r0 = r6.f186832e     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            return
        L_0x001e:
            boolean r0 = r6.f186830c     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0034
            io.b.e.j.a r0 = r6.f186831d     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x002d
            io.b.e.j.a r0 = new io.b.e.j.a     // Catch:{ all -> 0x0086 }
            r0.<init>()     // Catch:{ all -> 0x0086 }
            r6.f186831d = r0     // Catch:{ all -> 0x0086 }
        L_0x002d:
            io.b.e.j.j r1 = p5488io.p5490b.p5497e.p5513j.C70089j.f186819a     // Catch:{ all -> 0x0086 }
            r0.mo61623a(r7)     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            return
        L_0x0034:
            r0 = 1
            r6.f186830c = r0     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            io.b.o r0 = r6.f186828a
            r0.mo25988lL(r7)
        L_0x003d:
            monitor-enter(r6)
            io.b.e.j.a r7 = r6.f186831d     // Catch:{ all -> 0x0083 }
            r0 = 0
            if (r7 != 0) goto L_0x0047
            r6.f186830c = r0     // Catch:{ all -> 0x0083 }
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            return
        L_0x0047:
            r1 = 0
            r6.f186831d = r1     // Catch:{ all -> 0x0083 }
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            io.b.o r2 = r6.f186828a
            java.lang.Object[] r7 = r7.f186812a
        L_0x004f:
            if (r7 == 0) goto L_0x003d
            r3 = 0
        L_0x0052:
            r4 = 4
            if (r3 >= r4) goto L_0x007e
            r5 = r7[r3]
            if (r5 != 0) goto L_0x005a
            goto L_0x007e
        L_0x005a:
            io.b.e.j.j r4 = p5488io.p5490b.p5497e.p5513j.C70089j.f186819a
            if (r5 != r4) goto L_0x0062
            r2.mo25986a()
            return
        L_0x0062:
            boolean r4 = r5 instanceof p5488io.p5490b.p5497e.p5513j.C70088i
            if (r4 == 0) goto L_0x006e
            io.b.e.j.i r5 = (p5488io.p5490b.p5497e.p5513j.C70088i) r5
            java.lang.Throwable r7 = r5.f186818a
            r2.mo25987b(r7)
            return
        L_0x006e:
            boolean r4 = r5 instanceof p5488io.p5490b.p5497e.p5513j.C70087h
            if (r4 == 0) goto L_0x0078
            io.b.e.j.h r5 = (p5488io.p5490b.p5497e.p5513j.C70087h) r5
            r2.mo26850d(r1)
            goto L_0x007b
        L_0x0078:
            r2.mo25988lL(r5)
        L_0x007b:
            int r3 = r3 + 1
            goto L_0x0052
        L_0x007e:
            r7 = r7[r4]
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            goto L_0x004f
        L_0x0083:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0083 }
            throw r7
        L_0x0086:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0089:
            throw r7
        L_0x008a:
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.p5490b.p5515g.C70097c.mo25988lL(java.lang.Object):void");
    }
}
