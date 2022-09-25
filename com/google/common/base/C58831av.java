package com.google.common.base;

/* renamed from: com.google.common.base.av */
/* compiled from: PG */
public final class C58831av {
    /* renamed from: a */
    public static C58830au m90828a(Class cls) {
        return new C58830au(cls.getSimpleName());
    }

    /* renamed from: b */
    public static C58830au m90829b(Object obj) {
        return new C58830au(obj.getClass().getSimpleName());
    }

    /* renamed from: c */
    public static Object m90830c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }
}
