package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.e */
/* compiled from: PG */
final class C2374e {

    /* renamed from: a */
    static final C2374e f6595a = new C2374e();

    /* renamed from: b */
    public final Map f6596b = new HashMap();

    /* renamed from: c */
    private final Map f6597c = new HashMap();

    /* renamed from: d */
    private static final void m6374d(Map map, C2373d dVar, C2382m mVar, Class cls) {
        C2382m mVar2 = (C2382m) map.get(dVar);
        if (mVar2 != null && mVar != mVar2) {
            Method method = dVar.f6594b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
        } else if (mVar2 == null) {
            map.put(dVar, mVar);
        }
    }

    /* renamed from: a */
    public final C2372c mo5777a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(mo5778b(superclass).f6592b);
        }
        for (Class b : cls.getInterfaces()) {
            for (Map.Entry entry : mo5778b(b).f6592b.entrySet()) {
                m6374d(hashMap, (C2373d) entry.getKey(), (C2382m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = mo5779c(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (C2391v.class.isAssignableFrom(parameterTypes[0])) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C2382m a = onLifecycleEvent.mo5713a();
                if (length > 1) {
                    if (!C2382m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == C2382m.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length <= 2) {
                    m6374d(hashMap, new C2373d(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C2372c cVar = new C2372c(hashMap);
        this.f6597c.put(cls, cVar);
        this.f6596b.put(cls, Boolean.valueOf(z));
        return cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C2372c mo5778b(Class cls) {
        C2372c cVar = (C2372c) this.f6597c.get(cls);
        if (cVar != null) {
            return cVar;
        }
        return mo5777a(cls, (Method[]) null);
    }

    /* renamed from: c */
    public final Method[] mo5779c(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
