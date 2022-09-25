package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5251g.p5252a.C67622a;
import com.google.p5238v.p5239a.p5254i.C67641a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.az */
/* compiled from: PG */
public final class C67853az implements C67641a {

    /* renamed from: a */
    private final SecretKey f183963a;

    /* renamed from: b */
    private final byte[] f183964b;

    /* renamed from: c */
    private final byte[] f183965c;

    public C67853az(byte[] bArr) {
        C67870bp.m98083a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f183963a = secretKeySpec;
        Cipher b = m98053b();
        b.init(1, secretKeySpec);
        byte[] b2 = C67622a.m97786b(b.doFinal(new byte[16]));
        this.f183964b = b2;
        this.f183965c = C67622a.m97786b(b2);
    }

    /* renamed from: b */
    private static Cipher m98053b() {
        if (C67543a.m97645a(1)) {
            return (Cipher) C67838ak.f183948a.mo59993a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo59969a(byte[] bArr, int i) {
        byte[] bArr2;
        if (i <= 16) {
            Cipher b = m98053b();
            b.init(1, this.f183963a);
            int length = bArr.length;
            double d = (double) length;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 16.0d));
            if (max * 16 == length) {
                bArr2 = C67886p.m98137e(bArr, (max - 1) * 16, this.f183964b, 0, 16);
            } else {
                bArr2 = C67886p.m98136d(C67622a.m97785a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f183965c);
            }
            byte[] bArr3 = new byte[16];
            for (int i2 = 0; i2 < max - 1; i2++) {
                bArr3 = b.doFinal(C67886p.m98137e(bArr3, 0, bArr, i2 * 16, 16));
            }
            return Arrays.copyOf(b.doFinal(C67886p.m98136d(bArr2, bArr3)), i);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
