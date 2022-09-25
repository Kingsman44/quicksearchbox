package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aiw */
/* compiled from: PG */
public final class aiw implements agu {

    /* renamed from: a */
    final boolean f20725a = false;

    /* renamed from: b */
    private final ahp f20726b;

    public aiw(ahp ahp) {
        this.f20726b = ahp;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        agt agt;
        Type b = akz.mo14888b();
        if (!Map.class.isAssignableFrom(akz.mo14887a())) {
            return null;
        }
        Type[] i = aha.m18718i(b, aha.m18712c(b));
        Type type = i[0];
        if (type == Boolean.TYPE || type == Boolean.class) {
            agt = aku.f20819f;
        } else {
            agt = age.mo14704b(akz.m18867c(type));
        }
        agt b2 = age.mo14704b(akz.m18867c(i[1]));
        aid a = this.f20726b.mo14769a(akz);
        return new aiv(this, age, i[0], agt, i[1], b2, a);
    }
}
