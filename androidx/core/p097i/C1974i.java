package androidx.core.p097i;

import java.util.Locale;

/* renamed from: androidx.core.i.i */
/* compiled from: PG */
public final class C1974i {
    /* renamed from: a */
    public static void m5313a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m5314b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m5315c(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: d */
    public static void m5316d(int i, int i2, int i3, String str) {
        if (i < i2) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        } else if (i > i3) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i3)}));
        }
    }

    /* renamed from: e */
    public static void m5317e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: f */
    public static void m5318f(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: g */
    public static void m5319g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }
}
