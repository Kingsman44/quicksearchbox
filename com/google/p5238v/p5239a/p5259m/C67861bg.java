package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;

/* renamed from: com.google.v.a.m.bg */
/* compiled from: PG */
public final class C67861bg implements C67537ah {

    /* renamed from: a */
    private final RSAPublicKey f183985a;

    /* renamed from: b */
    private final int f183986b;

    public C67861bg(RSAPublicKey rSAPublicKey, int i) {
        if (C67543a.m97645a(2)) {
            int i2 = C67870bp.f184014a;
            C67870bp.m98084b(rSAPublicKey.getModulus().bitLength());
            C67870bp.m98085c(rSAPublicKey.getPublicExponent());
            this.f183985a = rSAPublicKey;
            this.f183986b = i;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final void mo59912a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        BigInteger publicExponent = this.f183985a.getPublicExponent();
        BigInteger modulus = this.f183985a.getModulus();
        int bitLength = (modulus.bitLength() + 7) / 8;
        if (bitLength == bArr.length) {
            BigInteger a = C67869bo.m98076a(bArr);
            if (a.compareTo(modulus) < 0) {
                byte[] d = C67869bo.m98079d(a.modPow(publicExponent, modulus), bitLength);
                int i = this.f183986b;
                int i2 = C67870bp.f184014a;
                MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a(C67869bo.m98080e(this.f183986b));
                messageDigest.update(bArr2);
                byte[] digest = messageDigest.digest();
                int i3 = i - 1;
                int i4 = 2;
                if (i3 == 2) {
                    bArr3 = C67849av.m98041b("3031300d060960864801650304020105000420");
                } else if (i3 != 3) {
                    bArr3 = C67849av.m98041b("3051300d060960864801650304020305000440");
                } else {
                    bArr3 = C67849av.m98041b("3041300d060960864801650304020205000430");
                }
                int length = bArr3.length + digest.length;
                if (bitLength >= length + 11) {
                    byte[] bArr4 = new byte[bitLength];
                    bArr4[0] = 0;
                    bArr4[1] = 1;
                    int i5 = 0;
                    while (i5 < (bitLength - length) - 3) {
                        bArr4[i4] = -1;
                        i5++;
                        i4++;
                    }
                    int i6 = i4 + 1;
                    bArr4[i4] = 0;
                    int length2 = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr4, i6, length2);
                    System.arraycopy(digest, 0, bArr4, i6 + length2, digest.length);
                    if (!C67886p.m98134b(d, bArr4)) {
                        throw new GeneralSecurityException("invalid signature");
                    }
                    return;
                }
                throw new GeneralSecurityException("intended encoded message length too short");
            }
            throw new GeneralSecurityException("signature out of range");
        }
        throw new GeneralSecurityException("invalid signature's length");
    }
}
