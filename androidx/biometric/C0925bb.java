package androidx.biometric;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: androidx.biometric.bb */
/* compiled from: PG */
public final class C0925bb {
    /* renamed from: a */
    public static KeyguardManager m2845a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* renamed from: b */
    static boolean m2846b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
