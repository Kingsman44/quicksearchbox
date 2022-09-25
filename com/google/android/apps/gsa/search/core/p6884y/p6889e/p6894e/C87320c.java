package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89972ak;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.c */
/* compiled from: PG */
public enum C87320c {
    PERSISTENT(1),
    NORMAL(2),
    PREEMPTIVE(3);
    

    /* renamed from: d */
    public final int f235826d;

    private C87320c(int i) {
        this.f235826d = i;
    }

    /* renamed from: a */
    public final int mo80970a(C86124t tVar) {
        int ordinal = ordinal();
        if (ordinal != 0) {
            return (ordinal == 1 || ordinal == 2) ? 5000 : -1;
        }
        return (int) tVar.mo79743a(C89972ak.f246564e);
    }
}
