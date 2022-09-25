package com.google.android.apps.gsa.shared.util;

import android.util.SparseArray;
import android.util.SparseBooleanArray;

/* renamed from: com.google.android.apps.gsa.shared.util.bd */
/* compiled from: PG */
public final class C90760bd {
    /* renamed from: a */
    public static final C90761be m148252a(String[] strArr, SparseArray sparseArray, String str, boolean z) {
        return new C90761be(str, strArr, 0, z, false, sparseArray, false);
    }

    /* renamed from: b */
    public static final void m148253b(int i, String[] strArr) {
        if (i < 0 || i >= strArr.length) {
            throw new IllegalArgumentException(i + " not in range.");
        }
    }

    /* renamed from: c */
    public static final void m148254c(int i, int[] iArr, String[] strArr, SparseArray sparseArray) {
        m148253b(i, strArr);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) sparseArray.get(i);
        if (sparseBooleanArray == null) {
            sparseBooleanArray = new SparseBooleanArray(strArr.length);
            sparseArray.put(i, sparseBooleanArray);
        }
        for (int i2 = 0; i2 <= 0; i2++) {
            int i3 = iArr[i2];
            m148253b(i3, strArr);
            sparseBooleanArray.put(i3, Boolean.TRUE.booleanValue());
        }
    }
}
