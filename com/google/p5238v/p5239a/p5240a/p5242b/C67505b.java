package com.google.p5238v.p5239a.p5240a.p5242b;

import com.google.p5238v.p5239a.C67486a;
import com.google.p5238v.p5239a.p5259m.C67859be;
import com.google.p5238v.p5239a.p5259m.C67869bo;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.a.b.b */
/* compiled from: PG */
public final class C67505b implements C67486a {

    /* renamed from: a */
    private static final ThreadLocal f183433a = new C67504a();

    /* renamed from: b */
    private final SecretKey f183434b;

    public C67505b(byte[] bArr) {
        C67870bp.m98083a(bArr.length);
        this.f183434b = new SecretKeySpec(bArr, "AES");
    }

    /* renamed from: c */
    private static AlgorithmParameterSpec m97531c(byte[] bArr, int i) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i);
        } catch (ClassNotFoundException unused) {
            if (C67869bo.m98078c()) {
                return new IvParameterSpec(bArr, 0, i);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            AlgorithmParameterSpec c = m97531c(bArr, 12);
            ThreadLocal threadLocal = f183433a;
            ((Cipher) threadLocal.get()).init(2, this.f183434b, c);
            return ((Cipher) threadLocal.get()).doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            byte[] a = C67859be.m98062a(12);
            System.arraycopy(a, 0, bArr3, 0, 12);
            AlgorithmParameterSpec c = m97531c(a, a.length);
            ThreadLocal threadLocal = f183433a;
            ((Cipher) threadLocal.get()).init(1, this.f183434b, c);
            int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, length, bArr3, 12);
            if (doFinal == length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
