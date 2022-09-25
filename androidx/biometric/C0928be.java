package androidx.biometric;

import android.content.pm.PackageManager;

/* renamed from: androidx.biometric.be */
/* compiled from: PG */
public final class C0928be {
    /* renamed from: a */
    public static boolean m2849a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.face");
    }

    /* renamed from: b */
    public static boolean m2850b(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.biometrics.iris");
    }
}
