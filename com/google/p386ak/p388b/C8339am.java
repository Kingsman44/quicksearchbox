package com.google.p386ak.p388b;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* renamed from: com.google.ak.b.am */
/* compiled from: PG */
final class C8339am extends C8341ao {

    /* renamed from: a */
    final /* synthetic */ Method f29170a;

    public C8339am(Method method) {
        this.f29170a = method;
    }

    /* renamed from: a */
    public final boolean mo17085a(AccessibleObject accessibleObject, Object obj) {
        try {
            return ((Boolean) this.f29170a.invoke(accessibleObject, new Object[]{obj})).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
