package com.google.p5238v.p5239a.p5259m;

import com.google.protobuf.C63088z;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.m.bj */
/* compiled from: PG */
public final class C67864bj {

    /* renamed from: a */
    private static final C63088z f183996a = C63088z.m96143E("Tink and Wycheproof.");

    /* renamed from: a */
    public static final void m98065a(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey, int i, int i2) {
        C67889s sVar = new C67889s(eCPrivateKey, i, i2);
        C67890t tVar = new C67890t(eCPublicKey, i, i2);
        try {
            C63088z zVar = f183996a;
            byte[] N = zVar.mo59174N();
            Signature signature = (Signature) C67838ak.f183950c.mo59993a(sVar.f184058b);
            signature.initSign(sVar.f184057a);
            signature.update(N);
            byte[] sign = signature.sign();
            byte b = 1;
            if (sVar.f184059c == 1) {
                int a = C67836ai.m98000a(sVar.f184057a.getParams().getCurve());
                int i3 = a + a;
                if (C67836ai.m98006g(sign)) {
                    byte[] bArr = new byte[i3];
                    int i4 = ((sign[1] & 255) >= 128 ? 3 : 2) + 1;
                    int i5 = i4 + 1;
                    byte b2 = sign[i4];
                    byte b3 = sign[i5] == 0 ? (byte) 1 : 0;
                    System.arraycopy(sign, i5 + b3, bArr, ((i3 / 2) - b2) + b3, b2 - b3);
                    int i6 = i5 + b2 + 1;
                    int i7 = i6 + 1;
                    byte b4 = sign[i6];
                    if (sign[i7] != 0) {
                        b = 0;
                    }
                    System.arraycopy(sign, i7 + b, bArr, (i3 - b4) + b, b4 - b);
                    sign = bArr;
                } else {
                    throw new GeneralSecurityException("Invalid DER encoding");
                }
            }
            tVar.mo59912a(sign, zVar.mo59174N());
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    /* renamed from: b */
    public static final void m98066b(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, int i) {
        C67860bf bfVar = new C67860bf(rSAPrivateCrtKey, i);
        C67861bg bgVar = new C67861bg(rSAPublicKey, i);
        try {
            C63088z zVar = f183996a;
            byte[] N = zVar.mo59174N();
            Signature signature = (Signature) C67838ak.f183950c.mo59993a(bfVar.f183984c);
            signature.initSign(bfVar.f183982a);
            signature.update(N);
            byte[] sign = signature.sign();
            Signature signature2 = (Signature) C67838ak.f183950c.mo59993a(bfVar.f183984c);
            signature2.initVerify(bfVar.f183983b);
            signature2.update(N);
            if (signature2.verify(sign)) {
                bgVar.mo59912a(sign, zVar.mo59174N());
                return;
            }
            throw new RuntimeException("Security bug: RSA signature computation error");
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    /* renamed from: c */
    public static final void m98067c(RSAPrivateCrtKey rSAPrivateCrtKey, RSAPublicKey rSAPublicKey, int i, int i2, int i3) {
        byte[] bArr;
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        C67862bh bhVar = new C67862bh(rSAPrivateCrtKey, i4, i5, i6);
        C67863bi biVar = new C67863bi(rSAPublicKey, i4, i5, i6);
        try {
            byte[] N = f183996a.mo59174N();
            int bitLength = bhVar.f183988b.getModulus().bitLength() - 1;
            int i7 = C67870bp.f184014a;
            MessageDigest messageDigest = (MessageDigest) C67838ak.f183951d.mo59993a(C67869bo.m98080e(bhVar.f183990d));
            byte[] digest = messageDigest.digest(N);
            int digestLength = messageDigest.getDigestLength();
            int i8 = ((bitLength - 1) / 8) + 1;
            int i9 = bhVar.f183989c;
            if (i8 >= digestLength + i9 + 2) {
                byte[] a = C67859be.m98062a(i9);
                int i10 = digestLength + 8;
                byte[] bArr2 = new byte[(bhVar.f183989c + i10)];
                System.arraycopy(digest, 0, bArr2, 8, digestLength);
                int length = a.length;
                System.arraycopy(a, 0, bArr2, i10, length);
                byte[] digest2 = messageDigest.digest(bArr2);
                int i11 = (i8 - digestLength) - 1;
                byte[] bArr3 = new byte[i11];
                int i12 = (i8 - bhVar.f183989c) - digestLength;
                bArr3[i12 - 2] = 1;
                System.arraycopy(a, 0, bArr3, i12 - 1, length);
                byte[] g = C67869bo.m98082g(digest2, i11, bhVar.f183991e);
                byte[] bArr4 = new byte[i11];
                for (int i13 = 0; i13 < i11; i13++) {
                    bArr4[i13] = (byte) (bArr3[i13] ^ g[i13]);
                }
                int i14 = 0;
                while (true) {
                    bArr = bArr4;
                    if (((long) i14) >= (((long) i8) * 8) - ((long) bitLength)) {
                        break;
                    }
                    int i15 = i14 / 8;
                    bArr[i15] = (byte) (((1 << (7 - (i14 % 8))) ^ -1) & bArr[i15]);
                    i14++;
                    bArr4 = bArr;
                }
                int i16 = digestLength + i11;
                byte[] bArr5 = new byte[(i16 + 1)];
                System.arraycopy(bArr, 0, bArr5, 0, i11);
                System.arraycopy(digest2, 0, bArr5, i11, digest2.length);
                bArr5[i16] = -68;
                Cipher cipher = (Cipher) C67838ak.f183948a.mo59993a("RSA/ECB/NOPADDING");
                cipher.init(2, bhVar.f183987a);
                byte[] doFinal = cipher.doFinal(bArr5);
                Cipher cipher2 = (Cipher) C67838ak.f183948a.mo59993a("RSA/ECB/NOPADDING");
                cipher2.init(1, bhVar.f183988b);
                if (new BigInteger(1, bArr5).equals(new BigInteger(1, cipher2.doFinal(doFinal)))) {
                    biVar.mo59912a(doFinal, f183996a.mo59174N());
                    return;
                }
                throw new RuntimeException("Security bug: RSA signature computation error");
            }
            throw new GeneralSecurityException("encoding error");
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
