package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.ac */
/* compiled from: PG */
public final class C58812ac extends C58815af implements Serializable {

    /* renamed from: a */
    public static final C58812ac f156604a = new C58812ac();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return f156604a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo56071a(Object obj) {
        return obj.hashCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo56072b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
