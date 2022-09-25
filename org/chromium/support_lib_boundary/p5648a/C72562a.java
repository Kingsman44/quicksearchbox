package org.chromium.support_lib_boundary.p5648a;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: org.chromium.support_lib_boundary.a.a */
/* compiled from: PG */
public final class C72562a implements InvocationHandler {

    /* renamed from: a */
    private final Object f193085a;

    public C72562a(Object obj) {
        this.f193085a = obj;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, this.f193085a.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(this.f193085a, objArr);
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (ReflectiveOperationException e2) {
            new StringBuilder("Reflection failed for method ").append(method);
            throw new RuntimeException("Reflection failed for method ".concat(String.valueOf(method)), e2);
        }
    }
}
