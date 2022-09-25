package com.google.p386ak.p388b;

import java.lang.reflect.AccessibleObject;

/* renamed from: com.google.ak.b.ao */
/* compiled from: PG */
public abstract class C8341ao {

    /* renamed from: b */
    public static final C8341ao f29171b;

    static {
        C8341ao aoVar = null;
        if (C8328ab.m23098a()) {
            try {
                aoVar = new C8339am(AccessibleObject.class.getDeclaredMethod("canAccess", new Class[]{Object.class}));
            } catch (NoSuchMethodException unused) {
            }
        }
        if (aoVar == null) {
            aoVar = new C8340an();
        }
        f29171b = aoVar;
    }

    /* renamed from: a */
    public abstract boolean mo17085a(AccessibleObject accessibleObject, Object obj);
}
