package com.google.p5238v.p5239a.p5248e.p5249a;

import android.util.Log;
import com.google.p5238v.p5239a.C67486a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: com.google.v.a.e.a.c */
/* compiled from: PG */
public final class C67586c implements C67486a {

    /* renamed from: a */
    private static final String f183516a = "c";

    /* renamed from: b */
    private final SecretKey f183517b;

    public C67586c(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f183517b = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    /* renamed from: c */
    private static void m97746c() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    /* renamed from: d */
    private final byte[] m97747d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(2, this.f183517b, gCMParameterSpec);
            instance.updateAAD(bArr2);
            return instance.doFinal(bArr, 12, length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* renamed from: e */
    private final byte[] m97748e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length <= 2147483619) {
            byte[] bArr3 = new byte[(length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f183517b);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    /* renamed from: a */
    public final byte[] mo59877a(byte[] bArr, byte[] bArr2) {
        try {
            return m97747d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f183516a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m97746c();
            return m97747d(bArr, bArr2);
        }
    }

    /* renamed from: b */
    public final byte[] mo59878b(byte[] bArr, byte[] bArr2) {
        try {
            return m97748e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e) {
            Log.w(f183516a, "encountered a potentially transient KeyStore error, will wait and retry", e);
            m97746c();
            return m97748e(bArr, bArr2);
        }
    }
}
