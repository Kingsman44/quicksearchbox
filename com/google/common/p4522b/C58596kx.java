package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.kx */
/* compiled from: PG */
public final class C58596kx extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object f156294a;

    /* renamed from: b */
    final Object f156295b;

    /* renamed from: c */
    final Object[] f156296c;

    public C58596kx(Object obj, Object obj2, Object[] objArr) {
        this.f156294a = obj;
        this.f156295b = obj2;
        this.f156296c = objArr;
    }

    public final Object get(int i) {
        if (i == 0) {
            return this.f156294a;
        }
        if (i == 1) {
            return this.f156295b;
        }
        C58838bb.m90861B(i, size(), "index");
        return this.f156296c[i - 2];
    }

    public final int size() {
        int length = this.f156296c.length;
        return C60757n.m92748i(2);
    }
}
