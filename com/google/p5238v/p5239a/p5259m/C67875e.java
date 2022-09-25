package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.e */
/* compiled from: PG */
public final class C67875e implements C67851ax {

    /* renamed from: a */
    private static final ThreadLocal f184023a = new C67874d();

    /* renamed from: b */
    private final SecretKeySpec f184024b;

    /* renamed from: c */
    private final int f184025c;

    /* renamed from: d */
    private final int f184026d;

    public C67875e(byte[] bArr, int i) {
        if (C67543a.m97645a(2)) {
            C67870bp.m98083a(bArr.length);
            this.f184024b = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) f184023a.get()).getBlockSize();
            this.f184026d = blockSize;
            if (i < 12 || i > blockSize) {
                throw new GeneralSecurityException("invalid IV size");
            }
            this.f184025c = i;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: c */
    private final void m98106c(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) f184023a.get();
        byte[] bArr4 = new byte[this.f184026d];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f184025c);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z) {
            cipher.init(1, this.f184024b, ivParameterSpec);
        } else {
            cipher.init(2, this.f184024b, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    /* renamed from: a */
    public final byte[] mo59995a(byte[] bArr) {
        int length = bArr.length;
        int i = this.f184025c;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.f184025c;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            m98106c(bArr, i2, i3, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59996b(byte[] bArr) {
        int length = bArr.length;
        int i = this.f184025c;
        if (length <= Integer.MAX_VALUE - i) {
            byte[] bArr2 = new byte[(i + length)];
            byte[] a = C67859be.m98062a(i);
            System.arraycopy(a, 0, bArr2, 0, this.f184025c);
            m98106c(bArr, 0, length, bArr2, this.f184025c, a, true);
            return bArr2;
        }
        int i2 = this.f184025c;
        throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i2));
    }
}
