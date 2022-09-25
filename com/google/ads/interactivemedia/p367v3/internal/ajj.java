package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ajj */
/* compiled from: PG */
final class ajj extends agt {

    /* renamed from: a */
    private final age f20768a;

    /* renamed from: b */
    private final agt f20769b;

    /* renamed from: c */
    private final Type f20770c;

    public ajj(age age, agt agt, Type type) {
        this.f20768a = age;
        this.f20769b = agt;
        this.f20770c = type;
    }

    public final Object read(alb alb) {
        return this.f20769b.read(alb);
    }

    public final void write(ald ald, Object obj) {
        agt agt = this.f20769b;
        Type type = this.f20770c;
        Type type2 = (obj == null || (type != Object.class && !(type instanceof TypeVariable) && !(type instanceof Class))) ? type : obj.getClass();
        if (type2 != type) {
            agt = this.f20768a.mo14704b(akz.m18867c(type2));
            if (agt instanceof aiz) {
                agt agt2 = this.f20769b;
                if (!(agt2 instanceof aiz)) {
                    agt = agt2;
                }
            }
        }
        agt.write(ald, obj);
    }
}
