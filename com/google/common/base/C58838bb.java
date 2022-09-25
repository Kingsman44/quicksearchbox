package com.google.common.base;

/* renamed from: com.google.common.base.bb */
/* compiled from: PG */
public final class C58838bb {
    /* renamed from: A */
    public static void m90860A(boolean z, int i, long j) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a("The size of key + value (%s bytes) is greater than the cache's total capacity (%s bytes)", Integer.valueOf(i), Long.valueOf(j)));
        }
    }

    /* renamed from: B */
    public static void m90861B(int i, int i2, String str) {
        String str2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str2 = C58880cq.m90965a("%s (%s) must not be negative", str, Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                str2 = C58880cq.m90965a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str2);
        }
    }

    /* renamed from: C */
    public static void m90862C(Object obj, String str, int i) {
        if (obj == null) {
            throw new NullPointerException(C58880cq.m90965a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: D */
    public static void m90863D(Object obj, String str, Object obj2, Object obj3) {
        if (obj == null) {
            throw new NullPointerException(C58880cq.m90965a(str, obj2, obj3));
        }
    }

    /* renamed from: E */
    public static void m90864E(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m90865F(i, i2, "index"));
        }
    }

    /* renamed from: F */
    private static String m90865F(int i, int i2, String str) {
        if (i < 0) {
            return C58880cq.m90965a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C58880cq.m90965a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException("negative size: " + i2);
        }
    }

    /* renamed from: a */
    public static Object m90866a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: b */
    public static Object m90867b(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C58880cq.m90965a(str, obj2));
    }

    /* renamed from: c */
    public static void m90868c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: d */
    public static void m90869d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: e */
    public static void m90870e(boolean z, String str, char c) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, Character.valueOf(c)));
        }
    }

    /* renamed from: f */
    public static void m90871f(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: g */
    public static void m90872g(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: h */
    public static void m90873h(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj));
        }
    }

    /* renamed from: i */
    public static void m90874i(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, objArr));
        }
    }

    /* renamed from: j */
    public static void m90875j(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: k */
    public static void m90876k(boolean z, String str, long j, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, Long.valueOf(j), obj));
        }
    }

    /* renamed from: l */
    public static void m90877l(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj, Integer.valueOf(i)));
        }
    }

    /* renamed from: m */
    public static void m90878m(boolean z, String str, Object obj, long j) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj, Long.valueOf(j)));
        }
    }

    /* renamed from: n */
    public static void m90879n(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj, obj2));
        }
    }

    /* renamed from: o */
    public static void m90880o(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj, obj2, obj3));
        }
    }

    /* renamed from: p */
    public static void m90881p(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (!z) {
            throw new IllegalArgumentException(C58880cq.m90965a(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: q */
    public static void m90882q(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m90865F(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m90865F(i2, i3, "end index");
            } else {
                str = C58880cq.m90965a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: r */
    public static void m90883r(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: s */
    public static void m90884s(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* renamed from: t */
    public static void m90885t(boolean z, String str, int i) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, Integer.valueOf(i)));
        }
    }

    /* renamed from: u */
    public static void m90886u(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, Long.valueOf(j)));
        }
    }

    /* renamed from: v */
    public static void m90887v(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, obj));
        }
    }

    /* renamed from: w */
    public static void m90888w(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    /* renamed from: x */
    public static void m90889x(boolean z, String str, Object obj, int i) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, obj, Integer.valueOf(i)));
        }
    }

    /* renamed from: y */
    public static void m90890y(boolean z, String str, Object obj, Object obj2) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, obj, obj2));
        }
    }

    /* renamed from: z */
    public static void m90891z(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (!z) {
            throw new IllegalStateException(C58880cq.m90965a(str, obj, obj2, obj3));
        }
    }
}
