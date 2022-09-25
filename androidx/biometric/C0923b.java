package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: androidx.biometric.b */
/* compiled from: PG */
final class C0923b {
    /* renamed from: a */
    static BiometricPrompt.AuthenticationCallback m2842a(C0930d dVar) {
        return new C0896a(dVar);
    }

    /* renamed from: b */
    static BiometricPrompt.CryptoObject m2843b(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getCryptoObject();
    }
}
