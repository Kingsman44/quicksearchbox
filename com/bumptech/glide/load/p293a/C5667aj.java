package com.bumptech.glide.load.p293a;

import androidx.core.p097i.C1971f;
import com.bumptech.glide.load.C5637a;
import com.bumptech.glide.load.C5955n;
import com.bumptech.glide.load.p293a.p296c.C5710e;
import com.bumptech.glide.p287f.C5594k;
import com.bumptech.glide.p291h.C5630q;
import com.bumptech.glide.p291h.p292a.C5610f;
import com.bumptech.glide.p291h.p292a.C5613i;
import com.bumptech.glide.p291h.p292a.C5614j;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bumptech.glide.load.a.aj */
/* compiled from: PG */
public final class C5667aj implements C5721n, C5610f {

    /* renamed from: a */
    final C5666ai f17075a = new C5666ai();

    /* renamed from: b */
    public final C5614j f17076b = new C5613i();

    /* renamed from: c */
    public final C5670am f17077c;

    /* renamed from: d */
    public final C5668ak f17078d;

    /* renamed from: e */
    public C5955n f17079e;

    /* renamed from: f */
    public boolean f17080f;

    /* renamed from: g */
    public boolean f17081g;

    /* renamed from: h */
    public C5679av f17082h;

    /* renamed from: i */
    C5637a f17083i;

    /* renamed from: j */
    public boolean f17084j;

    /* renamed from: k */
    C5673ap f17085k;

    /* renamed from: l */
    public boolean f17086l;

    /* renamed from: m */
    C5671an f17087m;

    /* renamed from: n */
    public volatile boolean f17088n;

    /* renamed from: o */
    private final C1971f f17089o;

    /* renamed from: p */
    private final C5710e f17090p;

    /* renamed from: q */
    private final C5710e f17091q;

    /* renamed from: r */
    private final C5710e f17092r;

    /* renamed from: s */
    private final AtomicInteger f17093s = new AtomicInteger();

    /* renamed from: t */
    private boolean f17094t;

    /* renamed from: u */
    private C5725r f17095u;

    public C5667aj(C5710e eVar, C5710e eVar2, C5710e eVar3, C5668ak akVar, C5670am amVar, C1971f fVar) {
        this.f17090p = eVar;
        this.f17091q = eVar2;
        this.f17092r = eVar3;
        this.f17078d = akVar;
        this.f17077c = amVar;
        this.f17089o = fVar;
    }

    /* renamed from: j */
    private final boolean m14709j() {
        return this.f17086l || this.f17084j || this.f17088n;
    }

    /* renamed from: b */
    public final C5710e mo12149b() {
        return this.f17094t ? this.f17092r : this.f17091q;
    }

    /* renamed from: c */
    public final synchronized void mo12150c(C5594k kVar, Executor executor) {
        this.f17076b.mo12057b();
        this.f17075a.f17074a.add(new C5665ah(kVar, executor));
        if (this.f17084j) {
            mo12152e(1);
            executor.execute(new C5664ag(this, kVar));
        } else if (this.f17086l) {
            mo12152e(1);
            executor.execute(new C5663af(this, kVar));
        } else {
            C5630q.m14604a(!this.f17088n, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo12151d() {
        C5671an anVar;
        synchronized (this) {
            this.f17076b.mo12057b();
            C5630q.m14604a(m14709j(), "Not yet complete!");
            int decrementAndGet = this.f17093s.decrementAndGet();
            C5630q.m14604a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                anVar = this.f17087m;
                mo12153f();
            } else {
                anVar = null;
            }
        }
        if (anVar != null) {
            anVar.mo12163f();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12152e(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.m14709j()     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "Not yet complete!"
            com.bumptech.glide.p291h.C5630q.m14604a(r0, r1)     // Catch:{ all -> 0x001d }
            java.util.concurrent.atomic.AtomicInteger r0 = r2.f17093s     // Catch:{ all -> 0x001d }
            int r3 = r0.getAndAdd(r3)     // Catch:{ all -> 0x001d }
            if (r3 != 0) goto L_0x001b
            com.bumptech.glide.load.a.an r3 = r2.f17087m     // Catch:{ all -> 0x001d }
            if (r3 == 0) goto L_0x001b
            r3.mo12161d()     // Catch:{ all -> 0x001d }
            monitor-exit(r2)
            return
        L_0x001b:
            monitor-exit(r2)
            return
        L_0x001d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p293a.C5667aj.mo12152e(int):void");
    }

    /* renamed from: f */
    public final synchronized void mo12153f() {
        if (this.f17079e != null) {
            this.f17075a.f17074a.clear();
            this.f17079e = null;
            this.f17087m = null;
            this.f17082h = null;
            this.f17086l = false;
            this.f17088n = false;
            this.f17084j = false;
            C5725r rVar = this.f17095u;
            if (rVar.f17253c.mo12236d()) {
                rVar.mo12237b();
            }
            this.f17095u = null;
            this.f17085k = null;
            this.f17083i = null;
            this.f17089o.mo5127b(this);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: fC */
    public final C5614j mo12055fC() {
        return this.f17076b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo12154g(com.bumptech.glide.p287f.C5594k r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.bumptech.glide.h.a.j r0 = r1.f17076b     // Catch:{ all -> 0x004c }
            r0.mo12057b()     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.a.ai r0 = r1.f17075a     // Catch:{ all -> 0x004c }
            java.util.List r0 = r0.f17074a     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.a.ah r2 = com.bumptech.glide.load.p293a.C5666ai.m14704b(r2)     // Catch:{ all -> 0x004c }
            r0.remove(r2)     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.a.ai r2 = r1.f17075a     // Catch:{ all -> 0x004c }
            boolean r2 = r2.mo12147e()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004a
            boolean r2 = r1.m14709j()     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x0020
            goto L_0x0035
        L_0x0020:
            r2 = 1
            r1.f17088n = r2     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.a.r r0 = r1.f17095u     // Catch:{ all -> 0x004c }
            r0.f17267q = r2     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.a.l r2 = r0.f17266p     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x002e
            r2.mo12181a()     // Catch:{ all -> 0x004c }
        L_0x002e:
            com.bumptech.glide.load.a.ak r2 = r1.f17078d     // Catch:{ all -> 0x004c }
            com.bumptech.glide.load.n r0 = r1.f17079e     // Catch:{ all -> 0x004c }
            r2.mo12138b(r1, r0)     // Catch:{ all -> 0x004c }
        L_0x0035:
            boolean r2 = r1.f17084j     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x003d
            boolean r2 = r1.f17086l     // Catch:{ all -> 0x004c }
            if (r2 == 0) goto L_0x004a
        L_0x003d:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.f17093s     // Catch:{ all -> 0x004c }
            int r2 = r2.get()     // Catch:{ all -> 0x004c }
            if (r2 != 0) goto L_0x004a
            r1.mo12153f()     // Catch:{ all -> 0x004c }
            monitor-exit(r1)
            return
        L_0x004a:
            monitor-exit(r1)
            return
        L_0x004c:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p293a.C5667aj.mo12154g(com.bumptech.glide.f.k):void");
    }

    /* renamed from: h */
    public final synchronized void mo12155h(C5725r rVar) {
        C5710e eVar;
        this.f17095u = rVar;
        int e = rVar.mo12239e(1);
        if (e != 2) {
            if (e != 3) {
                eVar = mo12149b();
                eVar.execute(rVar);
            }
        }
        eVar = this.f17090p;
        eVar.execute(rVar);
    }

    /* renamed from: i */
    public final synchronized void mo12156i(C5955n nVar, boolean z, boolean z2, boolean z3) {
        this.f17079e = nVar;
        this.f17080f = z;
        this.f17094t = z2;
        this.f17081g = z3;
    }
}
