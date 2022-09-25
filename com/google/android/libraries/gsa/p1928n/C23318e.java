package com.google.android.libraries.gsa.p1928n;

import java.lang.reflect.Proxy;

@Deprecated
/* renamed from: com.google.android.libraries.gsa.n.e */
/* compiled from: PG */
public final class C23318e {
    /* renamed from: a */
    public static Object m43746a(Object obj) {
        C23317d dVar = new C23317d(obj);
        Class<?> cls = obj.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), dVar);
    }
}
