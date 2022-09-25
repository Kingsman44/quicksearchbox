package androidx.biometric;

import android.hardware.biometrics.BiometricManager;
import android.hardware.fingerprint.FingerprintManager;
import android.util.Log;
import androidx.core.p085a.p086a.C1780a;
import androidx.core.p085a.p086a.C1782c;

/* renamed from: androidx.biometric.ac */
/* compiled from: PG */
public final class C0899ac {
    /* renamed from: a */
    public static final int m2799a(C1782c cVar) {
        if (cVar == null) {
            Log.e("BiometricManager", "Failure in canAuthenticate(). FingerprintManager was null.");
            return 1;
        }
        FingerprintManager c = C1780a.m4897c(cVar.f5555a);
        if (c == null || !C1780a.m4901g(c)) {
            return 12;
        }
        FingerprintManager c2 = C1780a.m4897c(cVar.f5555a);
        return (c2 == null || !C1780a.m4900f(c2)) ? 11 : 0;
    }

    /* renamed from: b */
    public static final int m2800b(BiometricManager biometricManager) {
        if (biometricManager != null) {
            return C0952z.m2880a(biometricManager);
        }
        Log.e("BiometricManager", "Failure in canAuthenticate(). BiometricManager was null.");
        return 1;
    }
}
