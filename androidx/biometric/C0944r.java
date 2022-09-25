package androidx.biometric;

import android.content.Context;
import android.content.DialogInterface;
import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* renamed from: androidx.biometric.r */
/* compiled from: PG */
final class C0944r {
    /* renamed from: a */
    static BiometricPrompt.Builder m2863a(Context context) {
        return new BiometricPrompt.Builder(context);
    }

    /* renamed from: b */
    static BiometricPrompt m2864b(BiometricPrompt.Builder builder) {
        return builder.build();
    }

    /* renamed from: c */
    static void m2865c(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cancellationSignal, executor, authenticationCallback);
    }

    /* renamed from: d */
    static void m2866d(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt.AuthenticationCallback authenticationCallback) {
        biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, authenticationCallback);
    }

    /* renamed from: e */
    static void m2867e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
        builder.setNegativeButton(charSequence, executor, onClickListener);
    }

    /* renamed from: f */
    static void m2868f(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    /* renamed from: g */
    static void m2869g(BiometricPrompt.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}
