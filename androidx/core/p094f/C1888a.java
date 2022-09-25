package androidx.core.p094f;

import android.os.Build;
import java.util.Locale;

/* renamed from: androidx.core.f.a */
/* compiled from: PG */
public final class C1888a {
    /* renamed from: a */
    protected static boolean m5147a(String str, String str2) {
        if (!"REL".equals(str2) && str2.toUpperCase(Locale.ROOT).compareTo(str.toUpperCase(Locale.ROOT)) >= 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    /* renamed from: b */
    public static boolean m5148b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @Deprecated
    /* renamed from: c */
    public static boolean m5149c() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.VERSION.SDK_INT >= 30 && m5147a("S", Build.VERSION.CODENAME);
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m5150d() {
        if (Build.VERSION.SDK_INT < 33) {
            return Build.VERSION.SDK_INT >= 32 && m5147a("Tiramisu", Build.VERSION.CODENAME);
        }
        return true;
    }
}
