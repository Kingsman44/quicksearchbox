package com.bumptech.glide.p287f;

/* renamed from: com.bumptech.glide.f.m */
/* compiled from: PG */
public final class C5596m implements C5590g, C5588e {

    /* renamed from: a */
    public volatile C5588e f16926a;

    /* renamed from: b */
    public volatile C5588e f16927b;

    /* renamed from: c */
    private final C5590g f16928c;

    /* renamed from: d */
    private final Object f16929d;

    /* renamed from: e */
    private C5589f f16930e = C5589f.CLEARED;

    /* renamed from: f */
    private C5589f f16931f = C5589f.CLEARED;

    /* renamed from: g */
    private boolean f16932g;

    public C5596m(Object obj, C5590g gVar) {
        this.f16929d = obj;
        this.f16928c = gVar;
    }

    /* renamed from: a */
    public final C5590g mo12013a() {
        C5590g a;
        synchronized (this.f16929d) {
            C5590g gVar = this.f16928c;
            a = gVar != null ? gVar.mo12013a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo12014b() {
        C5589f fVar;
        C5589f fVar2;
        synchronized (this.f16929d) {
            this.f16932g = true;
            try {
                if (!(this.f16930e == C5589f.SUCCESS || this.f16931f == (fVar2 = C5589f.RUNNING))) {
                    this.f16931f = fVar2;
                    this.f16927b.mo12014b();
                }
                if (this.f16932g && this.f16930e != (fVar = C5589f.RUNNING)) {
                    this.f16930e = fVar;
                    this.f16926a.mo12014b();
                }
            } finally {
                this.f16932g = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo12015c() {
        synchronized (this.f16929d) {
            this.f16932g = false;
            this.f16930e = C5589f.CLEARED;
            this.f16931f = C5589f.CLEARED;
            this.f16927b.mo12015c();
            this.f16926a.mo12015c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12016d(com.bumptech.glide.p287f.C5588e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f16929d
            monitor-enter(r0)
            com.bumptech.glide.f.e r1 = r2.f16926a     // Catch:{ all -> 0x001e }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001e }
            if (r3 != 0) goto L_0x0011
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x001e }
            r2.f16931f = r3     // Catch:{ all -> 0x001e }
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x0011:
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x001e }
            r2.f16930e = r3     // Catch:{ all -> 0x001e }
            com.bumptech.glide.f.g r3 = r2.f16928c     // Catch:{ all -> 0x001e }
            if (r3 == 0) goto L_0x001c
            r3.mo12016d(r2)     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            return
        L_0x001e:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5596m.mo12016d(com.bumptech.glide.f.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12017e(com.bumptech.glide.p287f.C5588e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f16929d
            monitor-enter(r0)
            com.bumptech.glide.f.e r1 = r2.f16927b     // Catch:{ all -> 0x0029 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x0011
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.SUCCESS     // Catch:{ all -> 0x0029 }
            r2.f16931f = r3     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0011:
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.SUCCESS     // Catch:{ all -> 0x0029 }
            r2.f16930e = r3     // Catch:{ all -> 0x0029 }
            com.bumptech.glide.f.g r3 = r2.f16928c     // Catch:{ all -> 0x0029 }
            if (r3 == 0) goto L_0x001c
            r3.mo12017e(r2)     // Catch:{ all -> 0x0029 }
        L_0x001c:
            com.bumptech.glide.f.f r3 = r2.f16931f     // Catch:{ all -> 0x0029 }
            boolean r3 = r3.f16883f     // Catch:{ all -> 0x0029 }
            if (r3 != 0) goto L_0x0027
            com.bumptech.glide.f.e r3 = r2.f16927b     // Catch:{ all -> 0x0029 }
            r3.mo12015c()     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5596m.mo12017e(com.bumptech.glide.f.e):void");
    }

    /* renamed from: f */
    public final void mo12018f() {
        synchronized (this.f16929d) {
            if (!this.f16931f.f16883f) {
                this.f16931f = C5589f.PAUSED;
                this.f16927b.mo12018f();
            }
            if (!this.f16930e.f16883f) {
                this.f16930e = C5589f.PAUSED;
                this.f16926a.mo12018f();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo12019g(C5588e eVar) {
        boolean z;
        synchronized (this.f16929d) {
            C5590g gVar = this.f16928c;
            z = false;
            if ((gVar == null || gVar.mo12019g(this)) && eVar.equals(this.f16926a) && this.f16930e != C5589f.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: h */
    public final boolean mo12020h(C5588e eVar) {
        boolean z;
        synchronized (this.f16929d) {
            C5590g gVar = this.f16928c;
            z = false;
            if ((gVar == null || gVar.mo12020h(this)) && eVar.equals(this.f16926a) && !mo12022j()) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: i */
    public final boolean mo12021i(C5588e eVar) {
        boolean z;
        synchronized (this.f16929d) {
            C5590g gVar = this.f16928c;
            z = false;
            if ((gVar == null || gVar.mo12021i(this)) && (eVar.equals(this.f16926a) || this.f16930e != C5589f.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo12022j() {
        boolean z;
        synchronized (this.f16929d) {
            z = true;
            if (!this.f16927b.mo12022j()) {
                if (!this.f16926a.mo12022j()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo12023k() {
        boolean z;
        synchronized (this.f16929d) {
            z = this.f16930e == C5589f.CLEARED;
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo12024l() {
        boolean z;
        synchronized (this.f16929d) {
            z = this.f16930e == C5589f.SUCCESS;
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo12025m(C5588e eVar) {
        if (eVar instanceof C5596m) {
            C5596m mVar = (C5596m) eVar;
            if (this.f16926a != null ? this.f16926a.mo12025m(mVar.f16926a) : mVar.f16926a == null) {
                if (this.f16927b == null) {
                    if (mVar.f16927b == null) {
                        return true;
                    }
                } else if (!this.f16927b.mo12025m(mVar.f16927b)) {
                    return false;
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo12026n() {
        boolean z;
        synchronized (this.f16929d) {
            z = this.f16930e == C5589f.RUNNING;
        }
        return z;
    }
}
