package com.google.android.libraries.social.populous.core;

/* renamed from: com.google.android.libraries.social.populous.core.bb */
/* compiled from: PG */
public enum C42276bb {
    EMPTY(3),
    PARTIAL(2),
    FULL(1);
    

    /* renamed from: d */
    public final int f110907d;

    private C42276bb(int i) {
        this.f110907d = i;
    }

    /* renamed from: a */
    public final int mo45231a() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        if (ordinal == 2) {
            return 4;
        }
        throw new AssertionError(this);
    }
}
