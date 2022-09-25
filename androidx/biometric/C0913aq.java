package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: androidx.biometric.aq */
/* compiled from: PG */
final class C0913aq {
    /* renamed from: a */
    static BiometricPrompt.CryptoObject m2826a(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    /* renamed from: b */
    static BiometricPrompt.CryptoObject m2827b(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    /* renamed from: c */
    static BiometricPrompt.CryptoObject m2828c(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }

    /* renamed from: d */
    static Signature m2829d(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getSignature();
    }

    /* renamed from: e */
    static Cipher m2830e(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getCipher();
    }

    /* renamed from: f */
    static Mac m2831f(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getMac();
    }
}
