package com.google.common.base;

import java.util.AbstractList;

/* renamed from: com.google.common.base.ap */
/* compiled from: PG */
public final class C58825ap extends AbstractList {

    /* renamed from: a */
    final /* synthetic */ Object[] f156618a;

    /* renamed from: b */
    final /* synthetic */ Object f156619b;

    /* renamed from: c */
    final /* synthetic */ Object f156620c;

    public C58825ap(Object[] objArr, Object obj, Object obj2) {
        this.f156618a = objArr;
        this.f156619b = obj;
        this.f156620c = obj2;
    }

    public final Object get(int i) {
        if (i != 0) {
            return i != 1 ? this.f156618a[i - 2] : this.f156620c;
        }
        return this.f156619b;
    }

    public final int size() {
        return this.f156618a.length + 2;
    }
}
