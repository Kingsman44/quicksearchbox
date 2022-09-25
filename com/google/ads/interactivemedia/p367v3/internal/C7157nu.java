package com.google.ads.interactivemedia.p367v3.internal;

import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nu */
/* compiled from: PG */
public final class C7157nu implements C7053jy {

    /* renamed from: a */
    private final C6864cy f23140a;

    /* renamed from: b */
    private final aee f23141b = new aee(9);

    /* renamed from: c */
    private C7073kr f23142c;

    /* renamed from: d */
    private int f23143d = 0;

    /* renamed from: e */
    private int f23144e;

    /* renamed from: f */
    private long f23145f;

    /* renamed from: g */
    private int f23146g;

    /* renamed from: h */
    private int f23147h;

    public C7157nu(C6864cy cyVar) {
        this.f23140a = cyVar;
    }

    /* renamed from: d */
    public final void mo16108d(C7056ka kaVar) {
        kaVar.mo16115am(new C7069kn(-9223372036854775807L));
        C7073kr ak = kaVar.mo16113ak(0, 3);
        this.f23142c = ak;
        ak.mo16102a(this.f23140a);
        kaVar.mo16114al();
    }

    /* renamed from: e */
    public final void mo16109e(long j, long j2) {
        this.f23143d = 0;
    }

    /* renamed from: f */
    public final void mo16110f() {
    }

    /* renamed from: g */
    public final boolean mo16111g(C7050jv jvVar) {
        this.f23141b.mo14547a(8);
        jvVar.mo16094g(this.f23141b.mo14555i(), 0, 8);
        if (this.f23141b.mo14568v() == 1380139777) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final int mo16112h(C7050jv jvVar, C7067kl klVar) {
        ary.m19466s(this.f23142c);
        while (true) {
            int i = this.f23143d;
            if (i == 0) {
                this.f23141b.mo14547a(8);
                if (!jvVar.mo16089b(this.f23141b.mo14555i(), 0, 8, true)) {
                    return -1;
                }
                if (this.f23141b.mo14568v() == 1380139777) {
                    this.f23144e = this.f23141b.mo14560n();
                    this.f23143d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i != 1) {
                while (this.f23146g > 0) {
                    this.f23141b.mo14547a(3);
                    jvVar.mo16090c(this.f23141b.mo14555i(), 0, 3);
                    this.f23142c.mo16105d(this.f23141b, 3);
                    this.f23147h += 3;
                    this.f23146g--;
                }
                int i2 = this.f23147h;
                if (i2 > 0) {
                    this.f23142c.mo16103b(this.f23145f, 1, i2, 0, (C7072kq) null);
                }
                this.f23143d = 1;
                return 0;
            } else {
                int i3 = this.f23144e;
                if (i3 == 0) {
                    this.f23141b.mo14547a(5);
                    if (!jvVar.mo16089b(this.f23141b.mo14555i(), 0, 5, true)) {
                        break;
                    }
                    this.f23145f = (this.f23141b.mo14566t() * 1000) / 45;
                } else if (i3 == 1) {
                    this.f23141b.mo14547a(9);
                    if (!jvVar.mo16089b(this.f23141b.mo14555i(), 0, 9, true)) {
                        break;
                    }
                    this.f23145f = this.f23141b.mo14570x();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i3);
                    throw new C6886dt(sb.toString());
                }
                this.f23146g = this.f23141b.mo14560n();
                this.f23147h = 0;
                this.f23143d = 2;
            }
        }
        this.f23143d = 0;
        return -1;
    }
}
