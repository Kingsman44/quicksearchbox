package com.google.ads.interactivemedia.p367v3.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqf */
/* compiled from: PG */
public final class aqf {

    /* renamed from: a */
    private static final Object f21382a;

    static {
        Object b = m19296b();
        f21382a = b;
        if (b != null) {
            m19297c("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (b != null) {
            m19298d();
        }
    }

    /* renamed from: a */
    public static void m19295a(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: b */
    private static Object m19296b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Method m19297c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static void m19298d() {
        try {
            Method c = m19297c("getStackTraceDepth", Throwable.class);
            if (c != null) {
                c.invoke(m19296b(), new Object[]{new Throwable()});
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }
}
