package androidx.biometric;

import android.os.Build;
import org.chromium.net.PrivateKeyType;

/* renamed from: androidx.biometric.f */
/* compiled from: PG */
public final class C0932f {
    /* renamed from: a */
    public static boolean m2852a(int i) {
        return (i & 32768) != 0;
    }

    /* renamed from: b */
    public static boolean m2853b(int i) {
        if (i != 255) {
            if (i == 32768) {
                return Build.VERSION.SDK_INT >= 30;
            }
            if (i == 32783) {
                return Build.VERSION.SDK_INT > 29;
            }
            if (i != 33023) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m2854c(int i) {
        return (i & PrivateKeyType.INVALID) == 255;
    }
}
