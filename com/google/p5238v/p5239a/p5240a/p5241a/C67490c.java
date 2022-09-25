package com.google.p5238v.p5239a.p5240a.p5241a;

import android.os.Build;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import com.google.p5238v.p5239a.p5259m.C67869bo;
import com.google.p5238v.p5239a.p5259m.C67870bp;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.a.a.c */
/* compiled from: PG */
public final class C67490c {

    /* renamed from: a */
    public static final ThreadLocal f183425a = new C67489b();

    /* renamed from: b */
    public final SecretKey f183426b;

    /* renamed from: c */
    public final boolean f183427c;

    public C67490c(byte[] bArr, boolean z) {
        if (C67543a.m97645a(2)) {
            C67870bp.m98083a(bArr.length);
            this.f183426b = new SecretKeySpec(bArr, "AES");
            this.f183427c = z;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: b */
    public static AlgorithmParameterSpec m97489b(byte[] bArr) {
        if (!C67869bo.m98078c() || Integer.valueOf(Build.VERSION.SDK_INT).intValue() > 19) {
            return new GCMParameterSpec(128, bArr, 0, 12);
        }
        return new IvParameterSpec(bArr, 0, 12);
    }

    /* renamed from: a */
    public final byte[] mo59880a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 12) {
            int length = bArr2.length;
            if (length <= 2147483619) {
                boolean z = this.f183427c;
                byte[] bArr3 = new byte[(z ? length + 28 : length + 16)];
                if (z) {
                    System.arraycopy(bArr, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec b = m97489b(bArr);
                ThreadLocal threadLocal = f183425a;
                ((Cipher) threadLocal.get()).init(1, this.f183426b, b);
                int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, length, bArr3, true != this.f183427c ? 0 : 12);
                if (doFinal == length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", new Object[]{16, Integer.valueOf(doFinal - length)}));
            }
            throw new GeneralSecurityException("plaintext too long");
        }
        throw new GeneralSecurityException("iv is wrong size");
    }
}
