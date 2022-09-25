package com.google.common.base;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.common.base.bj */
/* compiled from: PG */
public final class C58846bj {
    /* renamed from: b */
    public static C58839bc m90900b(Object obj) {
        return obj == null ? C58844bh.IS_NULL : new C58842bf(obj);
    }

    /* renamed from: c */
    public static String m90901c(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: d */
    public static List m90902d(C58839bc bcVar, C58839bc bcVar2) {
        return Arrays.asList(new C58839bc[]{bcVar, bcVar2});
    }

    /* renamed from: a */
    public static C58839bc m90899a(C58839bc bcVar, C58839bc bcVar2) {
        bcVar.getClass();
        bcVar2.getClass();
        return new C58840bd(m90902d(bcVar, bcVar2));
    }
}
