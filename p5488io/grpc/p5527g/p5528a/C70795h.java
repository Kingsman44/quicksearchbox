package p5488io.grpc.p5527g.p5528a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: io.grpc.g.a.h */
/* compiled from: PG */
public final class C70795h {

    /* renamed from: a */
    private final Class f188796a;

    /* renamed from: b */
    private final String f188797b;

    /* renamed from: c */
    private final Class[] f188798c;

    public C70795h(Class cls, String str, Class... clsArr) {
        this.f188796a = cls;
        this.f188797b = str;
        this.f188798c = clsArr;
    }

    /* renamed from: d */
    private final Method m103551d(Class cls) {
        Class cls2;
        Method e = m103552e(cls, this.f188797b, this.f188798c);
        if (e == null || (cls2 = this.f188796a) == null || cls2.isAssignableFrom(e.getReturnType())) {
            return e;
        }
        return null;
    }

    /* renamed from: e */
    private static Method m103552e(Class cls, String str, Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return m103552e(cls.getSuperclass(), str, clsArr);
            }
            Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (NoSuchMethodException unused) {
            }
            return method;
        } catch (NoSuchMethodException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final Object mo62499a(Object obj, Object... objArr) {
        Method d;
        try {
            d = m103551d(obj.getClass());
            if (d != null) {
                return d.invoke(obj, objArr);
            }
            String str = this.f188797b;
            String valueOf = String.valueOf(obj);
            throw new AssertionError("Method " + str + " not supported for object " + valueOf);
        } catch (IllegalAccessException e) {
            AssertionError assertionError = new AssertionError("Unexpectedly could not call: ".concat(d.toString()));
            assertionError.initCause(e);
            throw assertionError;
        } catch (InvocationTargetException e2) {
            Throwable targetException = e2.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError2 = new AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    /* renamed from: b */
    public final boolean mo62500b(Object obj) {
        return m103551d(obj.getClass()) != null;
    }

    /* renamed from: c */
    public final void mo62501c(Object obj, Object... objArr) {
        try {
            Method d = m103551d(obj.getClass());
            if (d != null) {
                try {
                    d.invoke(obj, objArr);
                } catch (IllegalAccessException unused) {
                }
            }
        } catch (InvocationTargetException e) {
            Throwable targetException = e.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }
}
