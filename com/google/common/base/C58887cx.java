package com.google.common.base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.base.cx */
/* compiled from: PG */
public final class C58887cx {

    /* renamed from: a */
    private static final Object f156730a;

    static {
        Object h = m90981h();
        f156730a = h;
        if (h != null) {
            m90982i("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (h != null) {
            m90983j(h);
        }
    }

    @Deprecated
    /* renamed from: a */
    public static RuntimeException m90974a(Throwable th) {
        m90980g(th);
        throw new RuntimeException(th);
    }

    /* renamed from: b */
    public static String m90975b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: c */
    public static Throwable m90976c(Throwable th, Class cls) {
        try {
            return (Throwable) cls.cast(th.getCause());
        } catch (ClassCastException e) {
            e.initCause(th);
            throw e;
        }
    }

    /* renamed from: d */
    public static Throwable m90977d(Throwable th) {
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return th;
            }
            if (cause != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
                th = cause;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
        }
    }

    /* renamed from: h */
    private static Object m90981h() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, (ClassLoader) null).getMethod("getJavaLangAccess", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: i */
    private static Method m90982i(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, (ClassLoader) null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static void m90983j(Object obj) {
        try {
            Method i = m90982i("getStackTraceDepth", Throwable.class);
            if (i != null) {
                i.invoke(obj, new Object[]{new Throwable()});
            }
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
        }
    }

    /* renamed from: f */
    public static void m90979f(Throwable th, Class cls) {
        th.getClass();
        if (cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    /* renamed from: g */
    public static void m90980g(Throwable th) {
        th.getClass();
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }

    /* renamed from: e */
    public static List m90978e(Throwable th) {
        th.getClass();
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th);
        boolean z = false;
        Throwable th2 = th;
        while (true) {
            th = th.getCause();
            if (th == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th);
            if (th != th2) {
                if (z) {
                    th2 = th2.getCause();
                }
                z = !z;
            } else {
                throw new IllegalArgumentException("Loop in causal chain detected.", th);
            }
        }
    }
}
