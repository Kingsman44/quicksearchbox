package com.google.android.gms.common.util;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.common.util.b */
/* compiled from: PG */
public final class C144002b {
    /* renamed from: a */
    public static boolean m234180a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int[] m234181b(Collection collection) {
        int i = 0;
        if (collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        return iArr;
    }
}
