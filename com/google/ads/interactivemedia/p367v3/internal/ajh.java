package com.google.ads.interactivemedia.p367v3.internal;

import com.google.ads.interactivemedia.p367v3.impl.data.C6731ax;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajh */
/* compiled from: PG */
final class ajh implements agu {

    /* renamed from: a */
    private final akz f20757a;

    /* renamed from: b */
    private final boolean f20758b;

    /* renamed from: c */
    private final agp f20759c;

    /* renamed from: d */
    private final agi f20760d;

    public ajh(Object obj, akz akz, boolean z) {
        agi agi = null;
        agp agp = obj instanceof agp ? (agp) obj : null;
        this.f20759c = agp;
        agi = obj instanceof agi ? (agi) obj : agi;
        this.f20760d = agi;
        boolean z2 = true;
        if (agp == null && agi == null) {
            z2 = false;
        }
        C6731ax.m18029e(z2);
        this.f20757a = akz;
        this.f20758b = z;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        if (this.f20757a.equals(akz) || (this.f20758b && this.f20757a.mo14888b() == akz.mo14887a())) {
            return new aji(this.f20759c, this.f20760d, age, akz, this);
        }
        return null;
    }
}
