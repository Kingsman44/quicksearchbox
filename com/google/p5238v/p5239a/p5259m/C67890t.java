package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.t */
/* compiled from: PG */
public final class C67890t implements C67537ah {

    /* renamed from: a */
    private final ECPublicKey f184060a;

    /* renamed from: b */
    private final String f184061b;

    /* renamed from: c */
    private final int f184062c;

    public C67890t(ECPublicKey eCPublicKey, int i, int i2) {
        if (C67543a.m97645a(2)) {
            C67836ai.m98004e(eCPublicKey);
            this.f184061b = C67869bo.m98081f(i);
            this.f184060a = eCPublicKey;
            this.f184062c = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }

    /* renamed from: a */
    public final void mo59912a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        int i;
        if (this.f184062c == 1) {
            EllipticCurve curve = this.f184060a.getParams().getCurve();
            int length = bArr.length;
            int a = C67836ai.m98000a(curve);
            if (length != a + a) {
                throw new GeneralSecurityException("Invalid signature");
            } else if ((length & 1) != 0 || length == 0 || length > 132) {
                throw new GeneralSecurityException("Invalid IEEE_P1363 encoding");
            } else {
                int i2 = length >> 1;
                byte[] i3 = C67836ai.m98008i(Arrays.copyOf(bArr, i2));
                byte[] i4 = C67836ai.m98008i(Arrays.copyOfRange(bArr, i2, length));
                int length2 = i3.length;
                int length3 = i4.length;
                int i5 = length2 + 4 + length3;
                if (i5 >= 128) {
                    bArr3 = new byte[(i5 + 3)];
                    bArr3[0] = 48;
                    bArr3[1] = -127;
                    bArr3[2] = (byte) i5;
                    i = 3;
                } else {
                    bArr3 = new byte[(i5 + 2)];
                    bArr3[0] = 48;
                    bArr3[1] = (byte) i5;
                    i = 2;
                }
                int i6 = i + 1;
                bArr3[i] = 2;
                int i7 = i6 + 1;
                bArr3[i6] = (byte) length2;
                System.arraycopy(i3, 0, bArr3, i7, length2);
                int i8 = i7 + length2;
                int i9 = i8 + 1;
                bArr3[i8] = 2;
                bArr3[i9] = (byte) length3;
                System.arraycopy(i4, 0, bArr3, i9 + 1, length3);
                bArr = bArr3;
            }
        }
        if (C67836ai.m98006g(bArr)) {
            Signature signature = (Signature) C67838ak.f183950c.mo59993a(this.f184061b);
            signature.initVerify(this.f184060a);
            signature.update(bArr2);
            try {
                if (signature.verify(bArr)) {
                    return;
                }
            } catch (RuntimeException unused) {
            }
            throw new GeneralSecurityException("Invalid signature");
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
