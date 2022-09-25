package com.bumptech.glide.p287f;

/* renamed from: com.bumptech.glide.f.b */
/* compiled from: PG */
public final class C5576b implements C5590g, C5588e {

    /* renamed from: a */
    public volatile C5588e f16863a;

    /* renamed from: b */
    public volatile C5588e f16864b;

    /* renamed from: c */
    private final Object f16865c;

    /* renamed from: d */
    private final C5590g f16866d;

    /* renamed from: e */
    private C5589f f16867e = C5589f.CLEARED;

    /* renamed from: f */
    private C5589f f16868f = C5589f.CLEARED;

    public C5576b(Object obj, C5590g gVar) {
        this.f16865c = obj;
        this.f16866d = gVar;
    }

    /* renamed from: a */
    public final C5590g mo12013a() {
        C5590g a;
        synchronized (this.f16865c) {
            C5590g gVar = this.f16866d;
            a = gVar != null ? gVar.mo12013a() : this;
        }
        return a;
    }

    /* renamed from: b */
    public final void mo12014b() {
        synchronized (this.f16865c) {
            if (this.f16867e != C5589f.RUNNING) {
                this.f16867e = C5589f.RUNNING;
                this.f16863a.mo12014b();
            }
        }
    }

    /* renamed from: c */
    public final void mo12015c() {
        synchronized (this.f16865c) {
            this.f16867e = C5589f.CLEARED;
            this.f16863a.mo12015c();
            C5589f fVar = this.f16868f;
            C5589f fVar2 = C5589f.CLEARED;
            if (fVar != fVar2) {
                this.f16868f = fVar2;
                this.f16864b.mo12015c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12016d(com.bumptech.glide.p287f.C5588e r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f16865c
            monitor-enter(r0)
            com.bumptech.glide.f.e r1 = r2.f16864b     // Catch:{ all -> 0x002b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x001e
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x002b }
            r2.f16867e = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.f.f r3 = r2.f16868f     // Catch:{ all -> 0x002b }
            com.bumptech.glide.f.f r1 = com.bumptech.glide.p287f.C5589f.RUNNING     // Catch:{ all -> 0x002b }
            if (r3 == r1) goto L_0x001c
            r2.f16868f = r1     // Catch:{ all -> 0x002b }
            com.bumptech.glide.f.e r3 = r2.f16864b     // Catch:{ all -> 0x002b }
            r3.mo12014b()     // Catch:{ all -> 0x002b }
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x001e:
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x002b }
            r2.f16868f = r3     // Catch:{ all -> 0x002b }
            com.bumptech.glide.f.g r3 = r2.f16866d     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0029
            r3.mo12016d(r2)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5576b.mo12016d(com.bumptech.glide.f.e):void");
    }

    /* renamed from: e */
    public final void mo12017e(C5588e eVar) {
        synchronized (this.f16865c) {
            if (eVar.equals(this.f16863a)) {
                this.f16867e = C5589f.SUCCESS;
            } else if (eVar.equals(this.f16864b)) {
                this.f16868f = C5589f.SUCCESS;
            }
            C5590g gVar = this.f16866d;
            if (gVar != null) {
                gVar.mo12017e(this);
            }
        }
    }

    /* renamed from: f */
    public final void mo12018f() {
        synchronized (this.f16865c) {
            if (this.f16867e == C5589f.RUNNING) {
                this.f16867e = C5589f.PAUSED;
                this.f16863a.mo12018f();
            }
            if (this.f16868f == C5589f.RUNNING) {
                this.f16868f = C5589f.PAUSED;
                this.f16864b.mo12018f();
            }
        }
    }

    /* renamed from: g */
    public final boolean mo12019g(C5588e eVar) {
        boolean z;
        synchronized (this.f16865c) {
            C5590g gVar = this.f16866d;
            z = false;
            if ((gVar == null || gVar.mo12019g(this)) && eVar.equals(this.f16863a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r6 != false) goto L_0x0034;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12020h(com.bumptech.glide.p287f.C5588e r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16865c
            monitor-enter(r0)
            com.bumptech.glide.f.g r1 = r5.f16866d     // Catch:{ all -> 0x0037 }
            r2 = 0
            if (r1 == 0) goto L_0x000e
            boolean r1 = r1.mo12020h(r5)     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0035
        L_0x000e:
            com.bumptech.glide.f.f r1 = r5.f16867e     // Catch:{ all -> 0x0037 }
            com.bumptech.glide.f.f r3 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x0037 }
            r4 = 1
            if (r1 == r3) goto L_0x001c
            com.bumptech.glide.f.e r1 = r5.f16863a     // Catch:{ all -> 0x0037 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0037 }
            goto L_0x0032
        L_0x001c:
            com.bumptech.glide.f.e r1 = r5.f16864b     // Catch:{ all -> 0x0037 }
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x0037 }
            if (r6 == 0) goto L_0x0031
            com.bumptech.glide.f.f r6 = r5.f16868f     // Catch:{ all -> 0x0037 }
            com.bumptech.glide.f.f r1 = com.bumptech.glide.p287f.C5589f.SUCCESS     // Catch:{ all -> 0x0037 }
            if (r6 == r1) goto L_0x002f
            com.bumptech.glide.f.f r1 = com.bumptech.glide.p287f.C5589f.FAILED     // Catch:{ all -> 0x0037 }
            if (r6 != r1) goto L_0x0031
            goto L_0x0034
        L_0x002f:
            r6 = 1
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            if (r6 == 0) goto L_0x0035
        L_0x0034:
            r2 = 1
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r2
        L_0x0037:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p287f.C5576b.mo12020h(com.bumptech.glide.f.e):boolean");
    }

    /* renamed from: i */
    public final boolean mo12021i(C5588e eVar) {
        boolean z;
        synchronized (this.f16865c) {
            C5590g gVar = this.f16866d;
            z = true;
            if (gVar != null) {
                if (!gVar.mo12021i(this)) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: j */
    public final boolean mo12022j() {
        boolean z;
        synchronized (this.f16865c) {
            z = true;
            if (!this.f16863a.mo12022j()) {
                if (!this.f16864b.mo12022j()) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: k */
    public final boolean mo12023k() {
        boolean z;
        synchronized (this.f16865c) {
            z = false;
            if (this.f16867e == C5589f.CLEARED && this.f16868f == C5589f.CLEARED) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: l */
    public final boolean mo12024l() {
        boolean z;
        synchronized (this.f16865c) {
            z = true;
            if (this.f16867e != C5589f.SUCCESS) {
                if (this.f16868f != C5589f.SUCCESS) {
                    z = false;
                }
            }
        }
        return z;
    }

    /* renamed from: m */
    public final boolean mo12025m(C5588e eVar) {
        if (eVar instanceof C5576b) {
            C5576b bVar = (C5576b) eVar;
            if (!this.f16863a.mo12025m(bVar.f16863a) || !this.f16864b.mo12025m(bVar.f16864b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final boolean mo12026n() {
        boolean z;
        synchronized (this.f16865c) {
            z = true;
            if (this.f16867e != C5589f.RUNNING) {
                if (this.f16868f != C5589f.RUNNING) {
                    z = false;
                }
            }
        }
        return z;
    }
}
