package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* renamed from: com.google.v.a.m.bi */
/* compiled from: PG */
public final class C67863bi implements C67537ah {

    /* renamed from: a */
    private final RSAPublicKey f183992a;

    /* renamed from: b */
    private final int f183993b;

    /* renamed from: c */
    private final int f183994c;

    /* renamed from: d */
    private final int f183995d;

    public C67863bi(RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        if (C67543a.m97645a(2)) {
            int i4 = C67870bp.f184014a;
            C67870bp.m98084b(rSAPublicKey.getModulus().bitLength());
            C67870bp.m98085c(rSAPublicKey.getPublicExponent());
            this.f183992a = rSAPublicKey;
            this.f183994c = i;
            this.f183995d = i2;
            this.f183993b = i3;
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final void mo59912a(byte[] bArr, byte[] bArr2) {
        BigInteger publicExponent = this.f183992a.getPublicExponent();
        BigInteger modulus = this.f183992a.getModulus();
        int bitLength = modulus.bitLength();
        int bitLength2 = (modulus.bitLength() + 6) / 8;
        if ((bitLength + 7) / 8 == bArr.length) {
            BigInteger a = C67869bo.m98076a(bArr);
            if (a.compareTo(modulus) < 0) {
                byte[] d = C67869bo.m98079d(a.modPow(publicExponent, modulus), bitLength2);
                int bitLength3 = modulus.bitLength() - 1;
                int i = C67870bp.f184014a;
                MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a(C67869bo.m98080e(this.f183994c));
                byte[] digest = messageDigest.digest(bArr2);
                int digestLength = messageDigest.getDigestLength();
                int length = d.length;
                if (length < this.f183993b + digestLength + 2) {
                    throw new GeneralSecurityException("inconsistent");
                } else if (d[length - 1] == -68) {
                    int i2 = length - digestLength;
                    int i3 = i2 - 1;
                    byte[] copyOf = Arrays.copyOf(d, i3);
                    int length2 = copyOf.length;
                    byte[] copyOfRange = Arrays.copyOfRange(d, length2, length2 + digestLength);
                    int i4 = 0;
                    while (true) {
                        int i5 = digestLength;
                        long j = (((long) length) * 8) - ((long) bitLength3);
                        if (((long) i4) >= j) {
                            byte[] g = C67869bo.m98082g(copyOfRange, i3, this.f183995d);
                            int length3 = g.length;
                            byte[] bArr3 = new byte[length3];
                            for (int i6 = 0; i6 < length3; i6++) {
                                bArr3[i6] = (byte) (g[i6] ^ copyOf[i6]);
                            }
                            for (int i7 = 0; ((long) i7) <= j; i7++) {
                                int i8 = i7 / 8;
                                bArr3[i8] = (byte) (bArr3[i8] & ((1 << (7 - (i7 % 8))) ^ -1));
                            }
                            int i9 = 0;
                            while (true) {
                                int i10 = this.f183993b;
                                int i11 = (i2 - i10) - 2;
                                if (i9 < i11) {
                                    if (bArr3[i9] == 0) {
                                        i9++;
                                    } else {
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                } else if (bArr3[i11] == 1) {
                                    byte[] copyOfRange2 = Arrays.copyOfRange(bArr3, length3 - i10, length3);
                                    int i12 = i5 + 8;
                                    byte[] bArr4 = new byte[(this.f183993b + i12)];
                                    System.arraycopy(digest, 0, bArr4, 8, digest.length);
                                    System.arraycopy(copyOfRange2, 0, bArr4, i12, copyOfRange2.length);
                                    if (!C67886p.m98134b(messageDigest.digest(bArr4), copyOfRange)) {
                                        throw new GeneralSecurityException("inconsistent");
                                    }
                                    return;
                                } else {
                                    throw new GeneralSecurityException("inconsistent");
                                }
                            }
                        } else if (((copyOf[i4 / 8] >> (7 - (i4 % 8))) & 1) == 0) {
                            i4++;
                            digestLength = i5;
                        } else {
                            throw new GeneralSecurityException("inconsistent");
                        }
                    }
                } else {
                    throw new GeneralSecurityException("inconsistent");
                }
            } else {
                throw new GeneralSecurityException("signature out of range");
            }
        } else {
            throw new GeneralSecurityException("invalid signature's length");
        }
    }
}
