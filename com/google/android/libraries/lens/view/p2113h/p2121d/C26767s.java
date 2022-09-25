package com.google.android.libraries.lens.view.p2113h.p2121d;

import android.util.Range;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.lens.view.h.d.s */
/* compiled from: PG */
public final class C26767s {
    /* renamed from: a */
    public static Range m49568a(C58485gu guVar, int i, int i2) {
        int i3;
        Range range = null;
        if (!guVar.isEmpty()) {
            C58724pq pqVar = (C58724pq) guVar;
            int i4 = pqVar.f156474d;
            Integer num = null;
            for (int i5 = 0; i5 < i4; i5++) {
                int intValue = ((Integer) ((Range) guVar.get(i5)).getUpper()).intValue();
                if (intValue <= i2 && (num == null || intValue > num.intValue())) {
                    num = Integer.valueOf(intValue);
                }
            }
            if (num != null) {
                i3 = num.intValue();
            } else {
                int i6 = pqVar.f156474d;
                int i7 = Integer.MAX_VALUE;
                for (int i8 = 0; i8 < i6; i8++) {
                    i7 = Math.min(i7, ((Integer) ((Range) guVar.get(i8)).getUpper()).intValue());
                }
                i3 = i7;
            }
            C58480gp e = C58485gu.m89837e();
            int i9 = pqVar.f156474d;
            for (int i10 = 0; i10 < i9; i10++) {
                Range range2 = (Range) guVar.get(i10);
                if (i3 == ((Integer) range2.getUpper()).intValue()) {
                    e.mo55395g(range2);
                }
            }
            C58485gu f = e.mo55394f();
            C58724pq pqVar2 = (C58724pq) f;
            int i11 = pqVar2.f156474d;
            for (int i12 = 0; i12 < i11; i12++) {
                Range range3 = (Range) f.get(i12);
                int intValue2 = ((Integer) range3.getLower()).intValue();
                if (intValue2 <= i && (range == null || intValue2 > ((Integer) range.getLower()).intValue())) {
                    range = range3;
                }
            }
            if (range == null) {
                Range range4 = new Range(Integer.MAX_VALUE, Integer.MAX_VALUE);
                int i13 = pqVar2.f156474d;
                range = range4;
                for (int i14 = 0; i14 < i13; i14++) {
                    Range range5 = (Range) f.get(i14);
                    if (((Integer) range5.getLower()).intValue() < ((Integer) range.getLower()).intValue()) {
                        range = range5;
                    }
                }
            }
        }
        return range;
    }
}
