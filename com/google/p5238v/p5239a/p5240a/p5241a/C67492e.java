package com.google.p5238v.p5239a.p5240a.p5241a;

import com.google.p5238v.p5239a.p5259m.C67886p;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.v.a.a.a.e */
/* compiled from: PG */
abstract class C67492e {

    /* renamed from: a */
    int[] f183428a;

    /* renamed from: b */
    private final int f183429b;

    public C67492e(byte[] bArr, int i) {
        if (bArr.length == 32) {
            this.f183428a = C67488a.m97487d(bArr);
            this.f183429b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: a */
    public abstract int mo59881a();

    /* renamed from: b */
    public abstract int[] mo59882b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer mo59883c(byte[] bArr, int i) {
        int[] b = mo59882b(C67488a.m97487d(bArr), i);
        int[] iArr = (int[]) b.clone();
        C67488a.m97486c(iArr);
        for (int i2 = 0; i2 < b.length; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final void mo59884d(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == mo59881a()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo59883c(bArr, this.f183429b + i2);
                if (i2 == i - 1) {
                    C67886p.m98133a(byteBuffer, byteBuffer2, c, remaining % 64);
                } else {
                    C67886p.m98133a(byteBuffer, byteBuffer2, c, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo59881a());
    }
}
