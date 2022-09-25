package com.google.common.base;

import java.util.Set;

/* renamed from: com.google.common.base.cn */
/* compiled from: PG */
final class C58877cn {
    /* renamed from: a */
    static final void m90955a(int i, Set set) {
        set.add(Integer.valueOf(i));
    }

    /* renamed from: b */
    static final void m90956b(int i, int i2, Set set) {
        while (i <= i2) {
            set.add(Integer.valueOf(i));
            i++;
        }
    }

    /* renamed from: c */
    static final void m90957c(C58878co coVar, Set set) {
        for (Integer intValue : coVar.f156716b) {
            set.add(Integer.valueOf(intValue.intValue()));
        }
    }
}
