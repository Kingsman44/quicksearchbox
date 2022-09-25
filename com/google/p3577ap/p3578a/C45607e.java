package com.google.p3577ap.p3578a;

import java.util.List;

/* renamed from: com.google.ap.a.e */
/* compiled from: PG */
public final class C45607e {
    /* renamed from: a */
    public static C45606d m81310a(List list, int i) {
        int size = list.size();
        if (i < 0) {
            i = size;
        } else if (i == 0) {
            i = 1;
        }
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        while (i4 + i <= size) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 = Math.max(i5, ((Integer) list.get(i4 + i6)).intValue());
            }
            int i7 = i5 < i3 ? i5 : i3;
            if (i5 < i3) {
                i2 = i4;
            }
            i4++;
            i3 = i7;
        }
        return new C45603a(i2, i3);
    }
}
