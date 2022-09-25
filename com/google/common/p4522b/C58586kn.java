package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import com.google.common.p4575r.C60757n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.kn */
/* compiled from: PG */
public final class C58586kn extends AbstractList implements Serializable, RandomAccess {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final Object f156280a;

    /* renamed from: b */
    final Object[] f156281b;

    public C58586kn(Object obj, Object[] objArr) {
        this.f156280a = obj;
        this.f156281b = objArr;
    }

    public final Object get(int i) {
        C58838bb.m90861B(i, size(), "index");
        if (i == 0) {
            return this.f156280a;
        }
        return this.f156281b[i - 1];
    }

    public final int size() {
        return C60757n.m92748i(((long) this.f156281b.length) + 1);
    }
}
