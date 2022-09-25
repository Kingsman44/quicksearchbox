package com.google.common.util.concurrent;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58740qf;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.common.util.concurrent.co */
/* compiled from: PG */
public final class C60861co {

    /* renamed from: a */
    public static final /* synthetic */ int f164952a = 0;

    /* renamed from: b */
    private static final C58710pc f164953b = new C58740qf(new C58336bg(new C60857ck(), C58701ou.f156429a));

    /* renamed from: a */
    static C60858cl m92915a() {
        return C60859cm.f164948a;
    }

    /* renamed from: b */
    public static Object m92916b(C60858cl clVar, Future future, Class cls) {
        clVar.mo57339a(cls);
        try {
            return future.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m92919e(cls, e);
        } catch (ExecutionException e2) {
            m92921g(e2.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public static Object m92917c(Future future, Class cls, long j, TimeUnit timeUnit) {
        C60860cn.f164951a.mo57339a(cls);
        try {
            return future.get(j, timeUnit);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw m92919e(cls, e);
        } catch (TimeoutException e2) {
            throw m92919e(cls, e2);
        } catch (ExecutionException e3) {
            m92921g(e3.getCause(), cls);
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    static void m92918d(Class cls) {
        C58838bb.m90873h(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        C58838bb.m90873h(m92922h(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    /* renamed from: e */
    private static Exception m92919e(Class cls, Throwable th) {
        for (Constructor f : f164953b.mo55816k(Arrays.asList(cls.getConstructors()))) {
            Exception exc = (Exception) m92920f(f, th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    /* renamed from: f */
    private static Object m92920f(Constructor constructor, Throwable th) {
        Class[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; i++) {
            Class cls = parameterTypes[i];
            if (cls.equals(String.class)) {
                objArr[i] = th.toString();
            } else if (!cls.equals(Throwable.class)) {
                return null;
            } else {
                objArr[i] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: g */
    private static void m92921g(Throwable th, Class cls) {
        if (th instanceof Error) {
            throw new C60827bh((Error) th);
        } else if (th instanceof RuntimeException) {
            throw new C60916ec(th);
        } else {
            throw m92919e(cls, th);
        }
    }

    /* renamed from: h */
    private static boolean m92922h(Class cls) {
        try {
            m92919e(cls, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }
}
