package dagger.p5294a;

/* renamed from: dagger.a.k */
/* compiled from: PG */
public final class C68225k {
    /* renamed from: a */
    public static void m98529a(Object obj, Class cls) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }

    /* renamed from: b */
    public static void m98530b(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: c */
    public static void m98531c(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        }
    }

    /* renamed from: d */
    public static void m98532d(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }
}
