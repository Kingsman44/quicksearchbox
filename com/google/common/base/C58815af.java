package com.google.common.base;

/* renamed from: com.google.common.base.af */
/* compiled from: PG */
public abstract class C58815af {
    protected C58815af() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo56071a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo56072b(Object obj, Object obj2);

    /* renamed from: c */
    public final int mo56076c(Object obj) {
        if (obj == null) {
            return 0;
        }
        return mo56071a(obj);
    }

    /* renamed from: d */
    public final boolean mo56077d(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return mo56072b(obj, obj2);
    }
}
