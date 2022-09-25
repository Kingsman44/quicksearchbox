package com.google.android.libraries.p590as.p591a;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/* renamed from: com.google.android.libraries.as.a.h */
/* compiled from: PG */
public final class C10774h {

    /* renamed from: a */
    public final ByteArrayOutputStream f35773a = new ByteArrayOutputStream();

    /* renamed from: b */
    public int f35774b = 0;

    /* renamed from: c */
    private final int[] f35775c = new int[8];

    /* renamed from: a */
    public final void mo19267a(long j, int i) {
        int i2 = i;
        char c = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int testBit = BigInteger.valueOf(j).testBit((i2 - i3) - 1);
            if (testBit != 0) {
                testBit = 1;
            }
            int[] iArr = this.f35775c;
            int i4 = this.f35774b;
            iArr[i4] = testBit;
            int i5 = i4 + 1;
            this.f35774b = i5;
            if (i5 == 8) {
                int i6 = iArr[c];
                int i7 = iArr[1];
                int i8 = iArr[2];
                int i9 = iArr[3];
                int i10 = iArr[4];
                int i11 = iArr[5];
                int i12 = iArr[6];
                this.f35773a.write((i6 << 7) | (i7 << 6) | (i8 << 5) | (i9 << 4) | (i10 << 3) | (i11 << 2) | (i12 + i12) | iArr[7]);
                c = 0;
                this.f35774b = 0;
            }
        }
    }
}
