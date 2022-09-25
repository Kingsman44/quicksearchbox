package androidx.biometric;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: androidx.biometric.s */
/* compiled from: PG */
final class C0945s {
    /* renamed from: a */
    static void m2870a(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(true);
    }

    /* renamed from: b */
    static void m2871b(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
