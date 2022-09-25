package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ts */
/* compiled from: PG */
public final class C7317ts extends C7299ta {

    /* renamed from: a */
    private final C7323ty f23843a;

    /* renamed from: b */
    private final boolean f23844b;

    /* renamed from: c */
    private final C6911er f23845c;

    /* renamed from: d */
    private final C6910eq f23846d;

    /* renamed from: e */
    private C7315tq f23847e;

    /* renamed from: f */
    private C7314tp f23848f;

    /* renamed from: g */
    private boolean f23849g;

    /* renamed from: h */
    private boolean f23850h;

    /* renamed from: i */
    private boolean f23851i;

    public C7317ts(C7323ty tyVar, boolean z) {
        this.f23843a = tyVar;
        boolean z2 = false;
        if (z && tyVar.mo16484s()) {
            z2 = true;
        }
        this.f23844b = z2;
        this.f23845c = new C6911er();
        this.f23846d = new C6910eq();
        C6912es r = tyVar.mo16483r();
        if (r != null) {
            this.f23847e = C7315tq.m21883b(r, (Object) null, (Object) null);
            this.f23851i = true;
            return;
        }
        this.f23847e = C7315tq.m21882a(tyVar.mo16522U());
    }

    /* renamed from: E */
    private final Object m21896E(Object obj) {
        return (this.f23847e.f23841e == null || !obj.equals(C7315tq.f23839c)) ? obj : this.f23847e.f23841e;
    }

    /* renamed from: F */
    private final void m21897F(long j) {
        C7314tp tpVar = this.f23848f;
        int i = this.f23847e.mo15481i(tpVar.f23833b.f23859a);
        if (i != -1) {
            long j2 = this.f23847e.mo15856z(i, this.f23846d).f22039d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            tpVar.mo16534q(j);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final /* bridge */ /* synthetic */ C7321tw mo16513A(Object obj, C7321tw twVar) {
        Void voidR = (Void) obj;
        Object obj2 = twVar.f23859a;
        if (this.f23847e.f23841e != null && this.f23847e.f23841e.equals(obj2)) {
            obj2 = C7315tq.f23839c;
        }
        return twVar.mo16541a(obj2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo16514B(java.lang.Object r9, com.google.ads.interactivemedia.p367v3.internal.C6912es r10) {
        /*
            r8 = this;
            java.lang.Void r9 = (java.lang.Void) r9
            boolean r9 = r8.f23850h
            r0 = 0
            if (r9 == 0) goto L_0x001c
            com.google.ads.interactivemedia.v3.internal.tq r9 = r8.f23847e
            com.google.ads.interactivemedia.v3.internal.tq r9 = r9.mo16538k(r10)
            r8.f23847e = r9
            com.google.ads.interactivemedia.v3.internal.tp r9 = r8.f23848f
            if (r9 == 0) goto L_0x008b
            long r9 = r9.mo16535r()
            r8.m21897F(r9)
            goto L_0x008b
        L_0x001c:
            boolean r9 = r10.mo15851u()
            if (r9 == 0) goto L_0x0038
            boolean r9 = r8.f23851i
            if (r9 == 0) goto L_0x002d
            com.google.ads.interactivemedia.v3.internal.tq r9 = r8.f23847e
            com.google.ads.interactivemedia.v3.internal.tq r9 = r9.mo16538k(r10)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r9 = com.google.ads.interactivemedia.p367v3.internal.C6911er.f22042a
            java.lang.Object r1 = com.google.ads.interactivemedia.p367v3.internal.C7315tq.f23839c
            com.google.ads.interactivemedia.v3.internal.tq r9 = com.google.ads.interactivemedia.p367v3.internal.C7315tq.m21883b(r10, r9, r1)
        L_0x0035:
            r8.f23847e = r9
            goto L_0x008b
        L_0x0038:
            r9 = 0
            com.google.ads.interactivemedia.v3.internal.er r1 = r8.f23845c
            r10.mo15852v(r9, r1)
            com.google.ads.interactivemedia.v3.internal.er r3 = r8.f23845c
            long r1 = r3.f22056n
            com.google.ads.interactivemedia.v3.internal.tp r9 = r8.f23848f
            if (r9 == 0) goto L_0x0052
            long r4 = r9.mo16533p()
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x0052
            r6 = r4
            goto L_0x0053
        L_0x0052:
            r6 = r1
        L_0x0053:
            java.lang.Object r9 = r3.f22044b
            com.google.ads.interactivemedia.v3.internal.eq r4 = r8.f23846d
            r5 = 0
            r2 = r10
            android.util.Pair r1 = r2.mo15854x(r3, r4, r5, r6)
            java.lang.Object r2 = r1.first
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            boolean r1 = r8.f23851i
            if (r1 == 0) goto L_0x0072
            com.google.ads.interactivemedia.v3.internal.tq r9 = r8.f23847e
            com.google.ads.interactivemedia.v3.internal.tq r9 = r9.mo16538k(r10)
            goto L_0x0076
        L_0x0072:
            com.google.ads.interactivemedia.v3.internal.tq r9 = com.google.ads.interactivemedia.p367v3.internal.C7315tq.m21883b(r10, r9, r2)
        L_0x0076:
            r8.f23847e = r9
            com.google.ads.interactivemedia.v3.internal.tp r9 = r8.f23848f
            if (r9 == 0) goto L_0x008b
            r8.m21897F(r3)
            com.google.ads.interactivemedia.v3.internal.tw r9 = r9.f23833b
            java.lang.Object r10 = r9.f23859a
            java.lang.Object r10 = r8.m21896E(r10)
            com.google.ads.interactivemedia.v3.internal.tw r0 = r9.mo16541a(r10)
        L_0x008b:
            r9 = 1
            r8.f23851i = r9
            r8.f23850h = r9
            com.google.ads.interactivemedia.v3.internal.tq r9 = r8.f23847e
            r8.mo16470e(r9)
            if (r0 == 0) goto L_0x009f
            com.google.ads.interactivemedia.v3.internal.tp r9 = r8.f23848f
            com.google.ads.interactivemedia.p367v3.internal.ary.m19467t(r9)
            r9.mo16536s(r0)
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7317ts.mo16514B(java.lang.Object, com.google.ads.interactivemedia.v3.internal.es):void");
    }

    /* renamed from: C */
    public final C6912es mo16539C() {
        return this.f23847e;
    }

    /* renamed from: D */
    public final C7314tp mo16524W(C7321tw twVar, acc acc, long j) {
        C7323ty tyVar = this.f23843a;
        C7314tp tpVar = new C7314tp(tyVar, twVar, acc, j);
        if (this.f23850h) {
            tpVar.mo16536s(twVar.mo16541a(m21896E(twVar.f23859a)));
        } else {
            this.f23848f = tpVar;
            if (!this.f23849g) {
                this.f23849g = true;
                mo16516v((Object) null, tyVar);
            }
        }
        return tpVar;
    }

    /* renamed from: U */
    public final C6873dg mo16522U() {
        return this.f23843a.mo16522U();
    }

    /* renamed from: V */
    public final void mo16523V(C7320tv tvVar) {
        ((C7314tp) tvVar).mo16537t();
        if (tvVar == this.f23848f) {
            this.f23848f = null;
        }
    }

    /* renamed from: a */
    public final void mo16467a(adh adh) {
        super.mo16467a(adh);
        if (!this.f23844b) {
            this.f23849g = true;
            mo16516v((Object) null, this.f23843a);
        }
    }

    /* renamed from: d */
    public final void mo16469d() {
        this.f23850h = false;
        this.f23849g = false;
        super.mo16469d();
    }

    /* renamed from: u */
    public final void mo16515u() {
    }
}
