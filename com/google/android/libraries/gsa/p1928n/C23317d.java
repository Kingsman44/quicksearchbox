package com.google.android.libraries.gsa.p1928n;

import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.p576aq.C10485ab;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.gsa.n.d */
/* compiled from: PG */
final class C23317d implements InvocationHandler {

    /* renamed from: a */
    final Map f63813a = new HashMap();

    /* renamed from: b */
    private final Object f63814b;

    /* renamed from: c */
    private final C10485ab f63815c;

    public C23317d(Object obj) {
        this.f63814b = obj;
        this.f63815c = C10485ab.m25462a(obj.getClass().getSimpleName());
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f63813a.containsKey(method)) {
            return this.f63813a.get(method);
        }
        Object invoke = method.invoke(this.f63814b, objArr);
        if (!(invoke instanceof C23249a)) {
            return invoke;
        }
        C10485ab abVar = this.f63815c;
        method.getName();
        C23316c cVar = new C23316c((C23249a) invoke, abVar);
        this.f63813a.put(method, cVar);
        return cVar;
    }
}
