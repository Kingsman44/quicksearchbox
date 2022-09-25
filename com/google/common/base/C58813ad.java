package com.google.common.base;

import java.io.Serializable;

/* renamed from: com.google.common.base.ad */
/* compiled from: PG */
public final class C58813ad extends C58815af implements Serializable {

    /* renamed from: a */
    public static final C58813ad f156605a = new C58813ad();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return f156605a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo56071a(Object obj) {
        return System.identityHashCode(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo56072b(Object obj, Object obj2) {
        return false;
    }
}
