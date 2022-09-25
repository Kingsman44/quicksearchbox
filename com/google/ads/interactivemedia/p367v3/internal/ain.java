package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ain */
/* compiled from: PG */
public final class ain implements agu {

    /* renamed from: a */
    private final ahp f20706a;

    public ain(ahp ahp) {
        this.f20706a = ahp;
    }

    /* renamed from: a */
    public final agt mo14748a(age age, akz akz) {
        Type b = akz.mo14888b();
        Class a = akz.mo14887a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        Type h = aha.m18717h(b, a);
        return new aim(age, h, age.mo14704b(akz.m18867c(h)), this.f20706a.mo14769a(akz));
    }
}
