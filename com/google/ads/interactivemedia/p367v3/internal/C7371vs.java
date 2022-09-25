package com.google.ads.interactivemedia.p367v3.internal;

import android.util.SparseArray;

/* renamed from: com.google.ads.interactivemedia.v3.internal.vs */
/* compiled from: PG */
public final class C7371vs implements C7056ka {

    /* renamed from: b */
    private static final C7067kl f24078b = new C7067kl();

    /* renamed from: c */
    private final C7053jy f24079c;

    /* renamed from: d */
    private final int f24080d;

    /* renamed from: e */
    private final C6864cy f24081e;

    /* renamed from: f */
    private final SparseArray f24082f = new SparseArray();

    /* renamed from: g */
    private boolean f24083g;

    /* renamed from: h */
    private long f24084h;

    /* renamed from: i */
    private C7070ko f24085i;

    /* renamed from: j */
    private C6864cy[] f24086j;

    /* renamed from: k */
    private C7369vq f24087k;

    public C7371vs(C7053jy jyVar, int i, C6864cy cyVar) {
        this.f24079c = jyVar;
        this.f24080d = i;
        this.f24081e = cyVar;
    }

    /* renamed from: ak */
    public final C7073kr mo16113ak(int i, int i2) {
        C7370vr vrVar = (C7370vr) this.f24082f.get(i);
        if (vrVar == null) {
            ary.m19464q(this.f24086j == null);
            vrVar = new C7370vr(i, i2, i2 == this.f24080d ? this.f24081e : null);
            vrVar.mo16676g(this.f24087k, this.f24084h);
            this.f24082f.put(i, vrVar);
        }
        return vrVar;
    }

    /* renamed from: al */
    public final void mo16114al() {
        C6864cy[] cyVarArr = new C6864cy[this.f24082f.size()];
        for (int i = 0; i < this.f24082f.size(); i++) {
            C6864cy cyVar = ((C7370vr) this.f24082f.valueAt(i)).f24071a;
            ary.m19466s(cyVar);
            cyVarArr[i] = cyVar;
        }
        this.f24086j = cyVarArr;
    }

    /* renamed from: am */
    public final void mo16115am(C7070ko koVar) {
        this.f24085i = koVar;
    }

    /* renamed from: d */
    public final C7048jt mo16677d() {
        C7070ko koVar = this.f24085i;
        if (koVar instanceof C7048jt) {
            return (C7048jt) koVar;
        }
        return null;
    }

    /* renamed from: e */
    public final C6864cy[] mo16678e() {
        return this.f24086j;
    }

    /* renamed from: f */
    public final void mo16679f() {
        this.f24079c.mo16110f();
    }

    /* renamed from: g */
    public final void mo16680g(C7369vq vqVar, long j, long j2) {
        this.f24087k = vqVar;
        this.f24084h = j2;
        if (!this.f24083g) {
            this.f24079c.mo16108d(this);
            if (j != -9223372036854775807L) {
                this.f24079c.mo16109e(0, j);
            }
            this.f24083g = true;
            return;
        }
        C7053jy jyVar = this.f24079c;
        if (j == -9223372036854775807L) {
            j = 0;
        }
        jyVar.mo16109e(0, j);
        for (int i = 0; i < this.f24082f.size(); i++) {
            ((C7370vr) this.f24082f.valueAt(i)).mo16676g(vqVar, j2);
        }
    }

    /* renamed from: h */
    public final boolean mo16681h(C7050jv jvVar) {
        int h = this.f24079c.mo16112h(jvVar, f24078b);
        ary.m19464q(h != 1);
        return h == 0;
    }
}
