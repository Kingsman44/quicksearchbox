package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.cq */
/* compiled from: PG */
public final class C6856cq {

    /* renamed from: a */
    public C6887du f21705a;

    /* renamed from: b */
    public int f21706b;

    /* renamed from: c */
    public boolean f21707c;

    /* renamed from: d */
    public int f21708d;

    /* renamed from: e */
    public boolean f21709e;

    /* renamed from: f */
    public int f21710f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f21711g;

    public C6856cq(C6887du duVar) {
        this.f21705a = duVar;
    }

    /* renamed from: a */
    public final void mo15583a(int i) {
        boolean z = true;
        if (!this.f21711g && i == false) {
            z = false;
        }
        this.f21711g = z;
        this.f21706b += i;
    }

    /* renamed from: b */
    public final void mo15584b(C6887du duVar) {
        this.f21711g |= this.f21705a != duVar;
        this.f21705a = duVar;
    }

    /* renamed from: c */
    public final void mo15585c(int i) {
        boolean z = true;
        if (!this.f21707c || this.f21708d == 4) {
            this.f21711g = true;
            this.f21707c = true;
            this.f21708d = i;
            return;
        }
        if (i != 4) {
            z = false;
        }
        ary.m19462o(z);
    }

    /* renamed from: d */
    public final void mo15586d(int i) {
        this.f21711g = true;
        this.f21709e = true;
        this.f21710f = i;
    }
}
