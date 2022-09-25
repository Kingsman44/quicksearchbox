package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apz */
/* compiled from: PG */
public final class apz {
    /* renamed from: a */
    public static apy m19252a(Object obj) {
        return new apy(obj.getClass().getSimpleName());
    }

    /* renamed from: b */
    public static boolean m19253b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m19254c(afv afv) {
        aps aps = (aps) afv.mo14701a().getAnnotation(aps.class);
        return aps != null && Arrays.asList(aps.mo15154b()).contains(afv.mo14702b());
    }
}
