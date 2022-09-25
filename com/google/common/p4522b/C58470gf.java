package com.google.common.p4522b;

/* renamed from: com.google.common.b.gf */
/* compiled from: PG */
public abstract class C58470gf {
    /* renamed from: e */
    static int m89790e(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int highestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = highestOneBit + highestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    /* renamed from: c */
    public abstract void mo55373c(Object obj);

    /* renamed from: d */
    public void mo55374d(Iterable iterable) {
        for (Object c : iterable) {
            mo55373c(c);
        }
    }
}
