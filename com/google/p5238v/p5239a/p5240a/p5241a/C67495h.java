package com.google.p5238v.p5239a.p5240a.p5241a;

import java.util.Arrays;

/* renamed from: com.google.v.a.a.a.h */
/* compiled from: PG */
public final class C67495h extends C67492e {
    public C67495h(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo59881a() {
        return 24;
    }

    /* renamed from: b */
    public final int[] mo59882b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = new int[16];
            C67488a.m97485b(iArr3, this.f183428a);
            iArr3[12] = iArr[0];
            iArr3[13] = iArr[1];
            iArr3[14] = iArr[2];
            iArr3[15] = iArr[3];
            C67488a.m97486c(iArr3);
            iArr3[4] = iArr3[12];
            iArr3[5] = iArr3[13];
            iArr3[6] = iArr3[14];
            iArr3[7] = iArr3[15];
            C67488a.m97485b(iArr2, Arrays.copyOf(iArr3, 8));
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
