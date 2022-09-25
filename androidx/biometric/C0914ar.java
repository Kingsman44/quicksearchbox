package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.IdentityCredential;

/* renamed from: androidx.biometric.ar */
/* compiled from: PG */
final class C0914ar {
    /* renamed from: a */
    static BiometricPrompt.CryptoObject m2832a(IdentityCredential identityCredential) {
        return new BiometricPrompt.CryptoObject(identityCredential);
    }

    /* renamed from: b */
    static IdentityCredential m2833b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getIdentityCredential();
    }
}
