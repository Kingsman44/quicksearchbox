package androidx.biometric;

import android.content.pm.PackageManager;

/* renamed from: androidx.biometric.bd */
/* compiled from: PG */
public final class C0927bd {
    /* renamed from: a */
    public static boolean m2848a(PackageManager packageManager) {
        return packageManager.hasSystemFeature("android.hardware.fingerprint");
    }
}
