package com.facebook.litho.p329g;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* renamed from: com.facebook.litho.g.m */
/* compiled from: PG */
public abstract class C6334m {
    /* renamed from: b */
    protected static void m16988b(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            throw new IllegalStateException("The following props are not marked as optional and were not supplied: ".concat(String.valueOf(Arrays.toString(arrayList.toArray()))));
        }
    }

    /* renamed from: a */
    public abstract C6335n mo13289a();
}
