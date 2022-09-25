package androidx.biometric;

import android.hardware.biometrics.BiometricManager;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.biometric.aa */
/* compiled from: PG */
public final class C0897aa {
    /* renamed from: a */
    public static int m2798a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(PrivateKeyType.INVALID);
    }
}
