package com.google.common.p4576s;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.google.common.s.s */
/* compiled from: PG */
final class C60782s implements InvocationHandler {

    /* renamed from: b */
    public static final /* synthetic */ int f164833b = 0;

    /* renamed from: c */
    private static final C58495hd f164834c;

    /* renamed from: a */
    public final C60781r f164835a;

    static {
        C58490gz gzVar = new C58490gz(4);
        for (Method method : C60781r.class.getMethods()) {
            if (method.getDeclaringClass().equals(C60781r.class)) {
                try {
                    method.setAccessible(true);
                } catch (AccessControlException unused) {
                }
                gzVar.mo55429h(method.getName(), method);
            }
        }
        f164834c = gzVar.mo55427f(false);
    }

    public C60782s(C60781r rVar) {
        this.f164835a = rVar;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Method method2 = (Method) f164834c.get(name);
        if (method2 != null) {
            try {
                return method2.invoke(this.f164835a, objArr);
            } catch (InvocationTargetException e) {
                throw e.getCause();
            }
        } else {
            throw new UnsupportedOperationException(name);
        }
    }
}
