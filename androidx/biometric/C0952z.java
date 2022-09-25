package androidx.biometric;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: androidx.biometric.z */
/* compiled from: PG */
public final class C0952z {
    /* renamed from: a */
    static int m2880a(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }

    /* renamed from: b */
    public static BiometricManager m2881b(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    /* renamed from: c */
    public static Method m2882c() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
