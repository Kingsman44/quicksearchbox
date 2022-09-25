package com.google.common.p4535g;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.common.g.dm */
/* compiled from: PG */
final class C59201dm extends AbstractList implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: a */
    private Object[][] f157266a;

    /* renamed from: b */
    private int f157267b;

    public C59201dm(int i) {
        this.f157266a = new Object[((i >> 8) + 1)][];
    }

    public final boolean add(Object obj) {
        int i = this.f157267b >> 8;
        Object[][] objArr = this.f157266a;
        if (i == objArr.length) {
            objArr = (Object[][]) Arrays.copyOf(objArr, i + i);
            this.f157266a = objArr;
            objArr[i] = new Object[256];
        } else if (objArr[i] == null) {
            objArr[i] = new Object[256];
        }
        Object[] objArr2 = objArr[i];
        int i2 = this.f157267b;
        objArr2[i2 & PrivateKeyType.INVALID] = obj;
        this.f157267b = i2 + 1;
        return true;
    }

    public final Object get(int i) {
        return this.f157266a[i >> 8][i & PrivateKeyType.INVALID];
    }

    public final Object set(int i, Object obj) {
        Object[][] objArr = this.f157266a;
        Object[] objArr2 = objArr[i];
        objArr[i >> 8][i & PrivateKeyType.INVALID] = obj;
        return objArr2;
    }

    public final int size() {
        return this.f157267b;
    }
}
