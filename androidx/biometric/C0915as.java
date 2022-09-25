package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.PresentationSession;

/* renamed from: androidx.biometric.as */
/* compiled from: PG */
final class C0915as {
    /* renamed from: a */
    static BiometricPrompt.CryptoObject m2834a(PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    /* renamed from: b */
    static PresentationSession m2835b(BiometricPrompt.CryptoObject cryptoObject) {
        return cryptoObject.getPresentationSession();
    }
}
