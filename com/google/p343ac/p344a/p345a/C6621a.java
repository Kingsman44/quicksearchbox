package com.google.p343ac.p344a.p345a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ac.a.a.a */
/* compiled from: PG */
public final class C6621a {
    /* renamed from: a */
    public static final List m18003a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        int i = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (intValue >= 0) {
                i = i + intValue + 1;
                if (i >= 0) {
                    arrayList.add(Integer.valueOf(i));
                } else {
                    throw new IllegalArgumentException("Encountered integer overflow");
                }
            } else {
                throw new IllegalArgumentException("Encountered negative delta");
            }
        }
        return arrayList;
    }
}
