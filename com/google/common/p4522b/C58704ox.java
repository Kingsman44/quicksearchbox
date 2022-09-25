package com.google.common.p4522b;

import java.lang.reflect.Array;
import java.util.Collection;

/* renamed from: com.google.common.b.ox */
/* compiled from: PG */
public final class C58704ox {
    /* renamed from: a */
    public static Object[] m90448a(Object[] objArr, Object[] objArr2, Class cls) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArr3 = (Object[]) Array.newInstance(cls, length + length2);
        System.arraycopy(objArr, 0, objArr3, 0, length);
        System.arraycopy(objArr2, 0, objArr3, length, length2);
        return objArr3;
    }

    /* renamed from: b */
    public static Object[] m90449b(Collection collection, Object[] objArr) {
        int size = collection.size();
        if (objArr.length < size) {
            objArr = C58711pd.m90498a(objArr, size);
        }
        int i = 0;
        for (Object obj : collection) {
            objArr[i] = obj;
            i++;
        }
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* renamed from: c */
    static void m90450c(Object obj, int i) {
        if (obj == null) {
            throw new NullPointerException("at index " + i);
        }
    }

    /* renamed from: d */
    static void m90451d(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m90450c(objArr[i2], i2);
        }
    }
}
