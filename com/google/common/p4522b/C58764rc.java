package com.google.common.p4522b;

import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.b.rc */
/* compiled from: PG */
public final class C58764rc {
    /* renamed from: a */
    public static int m90670a(List list, Object obj, Comparator comparator) {
        if (!(list instanceof RandomAccess)) {
            list = C58597ky.m90211b(list);
        }
        int size = list.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(obj, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare > 0) {
                i = i2 + 1;
            } else {
                list.subList(i, size + 1);
                return i + (i2 - i);
            }
        }
        return i - 1;
    }
}
