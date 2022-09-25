package com.google.common.p4535g;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.common.g.dn */
/* compiled from: PG */
final class C59202dn extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private Object[] f157268a;

    /* renamed from: b */
    private int f157269b;

    public C59202dn(int i) {
        this.f157268a = new Object[Math.max(1, i)];
    }

    public final boolean add(Object obj) {
        int i = this.f157269b;
        Object[] objArr = this.f157268a;
        if (i == objArr.length) {
            this.f157268a = Arrays.copyOf(objArr, i + i);
        }
        Object[] objArr2 = this.f157268a;
        int i2 = this.f157269b;
        this.f157269b = i2 + 1;
        objArr2[i2] = obj;
        return true;
    }

    public final Object get(int i) {
        return this.f157268a[i];
    }

    public final Object set(int i, Object obj) {
        Object[] objArr = this.f157268a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final int size() {
        return this.f157269b;
    }
}
