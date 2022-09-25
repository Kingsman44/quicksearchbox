package com.google.android.libraries.elements.internal;

import java.util.Arrays;

/* renamed from: com.google.android.libraries.elements.internal.ao */
/* compiled from: PG */
public final class C21335ao {
    /* renamed from: a */
    static C21333am m40342a(int i, int i2, int[] iArr, boolean z) {
        int i3;
        int i4;
        int i5 = (i + i2) - 1;
        if (z) {
            i5++;
        }
        if (!z || i != 0) {
            i3 = i;
            i4 = m40343b(iArr, i);
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (i2 > 0) {
            i2 += m40343b(iArr, i5) - i4;
        }
        return new C21333am(i3 + i4, i2);
    }

    /* renamed from: b */
    private static int m40343b(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        if (binarySearch >= 0) {
            while (binarySearch < iArr.length - 1) {
                int i2 = binarySearch + 1;
                if (iArr[i2] != i) {
                    break;
                }
                binarySearch = i2;
            }
        }
        return binarySearch >= 0 ? binarySearch + 1 : (-binarySearch) - 1;
    }
}
