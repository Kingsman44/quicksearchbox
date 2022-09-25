package com.google.common.p4575r;

import java.util.Arrays;

/* renamed from: com.google.common.r.k */
/* compiled from: PG */
public final class C60754k {

    /* renamed from: a */
    private int[] f164794a;

    /* renamed from: b */
    private int f164795b = 0;

    public C60754k(int i) {
        this.f164794a = new int[i];
    }

    /* renamed from: a */
    public final C60755l mo57179a() {
        int i = this.f164795b;
        return i == 0 ? C60755l.f164796a : new C60755l(this.f164794a, i);
    }

    /* renamed from: b */
    public final void mo57180b(int i) {
        int i2 = this.f164795b + 1;
        int[] iArr = this.f164794a;
        int length = iArr.length;
        if (i2 > length) {
            int i3 = length + (length >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            this.f164794a = Arrays.copyOf(iArr, i3);
        }
        int[] iArr2 = this.f164794a;
        int i4 = this.f164795b;
        iArr2[i4] = i;
        this.f164795b = i4 + 1;
    }
}
