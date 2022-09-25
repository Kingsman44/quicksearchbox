package org.chromium.support_lib_boundary.p5648a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* renamed from: org.chromium.support_lib_boundary.a.b */
/* compiled from: PG */
public final class C72563b {
    /* renamed from: a */
    public static Object m107251a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(C72563b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
