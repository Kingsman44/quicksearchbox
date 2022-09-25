package com.google.common.p4535g;

import java.util.Arrays;

/* renamed from: com.google.common.g.be */
/* compiled from: PG */
public final class C59139be {

    /* renamed from: a */
    private int f157170a = 0;

    /* renamed from: b */
    private final int[] f157171b;

    public C59139be() {
        int[] iArr = new int[10];
        this.f157171b = iArr;
        Arrays.fill(iArr, 0, 2, 0);
    }

    /* renamed from: a */
    public final int mo56509a(int i) {
        int i2 = this.f157170a;
        if (i2 < 2) {
            i2++;
            this.f157170a = i2;
        }
        while (true) {
            i2--;
            if (i2 < 0) {
                return i;
            }
            int[] iArr = this.f157171b;
            i += iArr[i2];
            iArr[i2] = i;
        }
    }
}
