package com.google.ads.interactivemedia.p367v3.internal;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.akt */
/* compiled from: PG */
final class akt extends agt {

    /* renamed from: a */
    private final Map f20788a = new HashMap();

    /* renamed from: b */
    private final Map f20789b = new HashMap();

    public akt(Class cls) {
        try {
            for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                String name = enumR.name();
                agw agw = (agw) cls.getField(name).getAnnotation(agw.class);
                if (agw != null) {
                    name = agw.mo14751a();
                    for (String put : agw.mo14752b()) {
                        this.f20788a.put(put, enumR);
                    }
                }
                this.f20788a.put(name, enumR);
                this.f20789b.put(enumR, name);
            }
        } catch (NoSuchFieldException e) {
            throw new AssertionError(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object read(alb alb) {
        if (alb.mo14838p() != 9) {
            return (Enum) this.f20788a.get(alb.mo14829g());
        }
        alb.mo14831i();
        return null;
    }

    public final /* bridge */ /* synthetic */ void write(ald ald, Object obj) {
        Enum enumR = (Enum) obj;
        ald.mo14855k(enumR == null ? null : (String) this.f20789b.get(enumR));
    }
}
