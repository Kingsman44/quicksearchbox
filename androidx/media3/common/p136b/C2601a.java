package androidx.media3.common.p136b;

/* renamed from: androidx.media3.common.b.a */
/* compiled from: PG */
public final class C2601a {
    /* renamed from: a */
    public static Object m6829a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static void m6830b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: c */
    public static void m6831c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: d */
    public static void m6832d(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public static void m6833e(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: f */
    public static void m6834f(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: g */
    public static void m6835g(Object obj, Object obj2) {
        if (obj == null) {
            throw new IllegalStateException((String) obj2);
        }
    }
}
