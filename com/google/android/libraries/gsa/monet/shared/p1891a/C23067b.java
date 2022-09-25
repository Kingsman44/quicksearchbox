package com.google.android.libraries.gsa.monet.shared.p1891a;

/* renamed from: com.google.android.libraries.gsa.monet.shared.a.b */
/* compiled from: PG */
public final class C23067b {
    /* renamed from: a */
    public static void m43228a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m43229b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: c */
    public static void m43230c(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C23068c.m43237a(str, obj));
        }
    }

    /* renamed from: d */
    public static void m43231d(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(C23068c.m43237a(str, obj, obj2, obj3));
        }
    }

    /* renamed from: e */
    public static void m43232e(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    public static void m43233f(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: g */
    public static void m43234g(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C23068c.m43237a(str, obj));
        }
    }

    /* renamed from: h */
    public static void m43235h(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = C23068c.m43237a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                str = C23068c.m43237a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: i */
    public static void m43236i(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }
}
