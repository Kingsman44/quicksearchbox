package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aji */
/* compiled from: PG */
public final class aji extends agt {

    /* renamed from: a */
    final age f20761a;

    /* renamed from: b */
    private final agp f20762b;

    /* renamed from: c */
    private final agi f20763c;

    /* renamed from: d */
    private final akz f20764d;

    /* renamed from: e */
    private final agu f20765e;

    /* renamed from: f */
    private final ajg f20766f = new ajg();

    /* renamed from: g */
    private agt f20767g;

    public aji(agp agp, agi agi, age age, akz akz, agu agu) {
        this.f20762b = agp;
        this.f20763c = agi;
        this.f20761a = age;
        this.f20764d = akz;
        this.f20765e = agu;
    }

    /* renamed from: a */
    public static agu m18838a(akz akz, Object obj) {
        return new ajh(obj, akz, akz.mo14888b() == akz.mo14887a());
    }

    /* renamed from: b */
    private final agt m18839b() {
        agt agt = this.f20767g;
        if (agt != null) {
            return agt;
        }
        agt c = this.f20761a.mo14705c(this.f20765e, this.f20764d);
        this.f20767g = c;
        return c;
    }

    public final Object read(alb alb) {
        if (this.f20763c == null) {
            return m18839b().read(alb);
        }
        if (C6731ax.m18025a(alb) instanceof agl) {
            return null;
        }
        agi agi = this.f20763c;
        this.f20764d.mo14888b();
        return agi.mo14722a();
    }

    public final void write(ald ald, Object obj) {
        agp agp = this.f20762b;
        if (agp == null) {
            m18839b().write(ald, obj);
        } else if (obj == null) {
            ald.mo14851g();
        } else {
            this.f20764d.mo14888b();
            C6731ax.m18026b(agp.mo14740a(obj), ald);
        }
    }
}
