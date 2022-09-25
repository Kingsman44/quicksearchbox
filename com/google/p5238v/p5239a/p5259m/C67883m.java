package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67583e;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5251g.p5252a.C67622a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.m */
/* compiled from: PG */
public final class C67883m implements C67583e {

    /* renamed from: a */
    private static final Collection f184048a = Arrays.asList(new Integer[]{64});

    /* renamed from: b */
    private static final byte[] f184049b = new byte[16];

    /* renamed from: c */
    private final C67853az f184050c;

    /* renamed from: d */
    private final byte[] f184051d;

    public C67883m(byte[] bArr) {
        if (C67543a.m97645a(1)) {
            Collection collection = f184048a;
            int length = bArr.length;
            if (collection.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.f184051d = Arrays.copyOfRange(bArr, i, length);
                this.f184050c = new C67853az(copyOfRange);
                return;
            }
            throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    /* renamed from: a */
    public final byte[] mo59916a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) C67838ak.f183948a.mo59993a("AES/CTR/NoPadding");
            byte[][] bArr4 = {bArr2, bArr};
            byte[] a = this.f184050c.mo59969a(f184049b, 16);
            for (int i = 0; i <= 0; i++) {
                byte[] bArr5 = bArr4[i];
                if (bArr5 == null) {
                    bArr5 = new byte[0];
                }
                a = C67886p.m98136d(C67622a.m97786b(a), this.f184050c.mo59969a(bArr5, 16));
            }
            byte[] bArr6 = bArr4[1];
            int length = bArr6.length;
            if (length >= 16) {
                int length2 = a.length;
                if (length >= length2) {
                    int i2 = length - length2;
                    bArr3 = Arrays.copyOf(bArr6, length);
                    for (int i3 = 0; i3 < a.length; i3++) {
                        int i4 = i2 + i3;
                        bArr3[i4] = (byte) (bArr3[i4] ^ a[i3]);
                    }
                } else {
                    throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
                }
            } else {
                bArr3 = C67886p.m98136d(C67622a.m97785a(bArr6), C67622a.m97786b(a));
            }
            byte[] a2 = this.f184050c.mo59969a(bArr3, 16);
            byte[] bArr7 = (byte[]) a2.clone();
            bArr7[8] = (byte) (bArr7[8] & Byte.MAX_VALUE);
            bArr7[12] = (byte) (bArr7[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f184051d, "AES"), new IvParameterSpec(bArr7));
            return C67886p.m98135c(a2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
