package com.google.p5238v.p5239a.p5240a.p5241a;

/* renamed from: com.google.v.a.a.a.d */
/* compiled from: PG */
public final class C67491d extends C67492e {
    public C67491d(byte[] bArr, int i) {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo59881a() {
        return 12;
    }

    /* renamed from: b */
    public final int[] mo59882b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            C67488a.m97485b(iArr2, this.f183428a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
