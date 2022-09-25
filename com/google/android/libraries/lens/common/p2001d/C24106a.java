package com.google.android.libraries.lens.common.p2001d;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.common.d.a */
/* compiled from: PG */
public final class C24106a {
    /* renamed from: a */
    public static int m44785a(List list) {
        C58485gu E = C58485gu.m89835E(list);
        int i = ((C58724pq) E).f156474d;
        int i2 = i / 2;
        if (i % 2 == 0) {
            return (((Integer) E.get(i2)).intValue() + ((Integer) E.get(i2 - 1)).intValue()) / 2;
        }
        return ((Integer) E.get(i2)).intValue();
    }
}
