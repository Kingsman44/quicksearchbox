package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import com.google.common.base.C58880cq;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.common.r.i */
/* compiled from: PG */
public final class C60752i extends C60753j {
    /* renamed from: a */
    public static float m92727a(float f, float f2, float f3) {
        if (f2 <= f3) {
            return Math.min(Math.max(f, f2), f3);
        }
        throw new IllegalArgumentException(C58880cq.m90965a("min (%s) must be less than or equal to max (%s)", Float.valueOf(f2), Float.valueOf(f3)));
    }

    /* renamed from: b */
    public static float m92728b(float... fArr) {
        C58838bb.m90868c(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.max(f, fArr[i]);
        }
        return f;
    }

    /* renamed from: c */
    public static float m92729c(float... fArr) {
        C58838bb.m90868c(fArr.length > 0);
        float f = fArr[0];
        for (int i = 1; i < fArr.length; i++) {
            f = Math.min(f, fArr[i]);
        }
        return f;
    }

    /* renamed from: d */
    public static int m92730d(float[] fArr, float f, int i, int i2) {
        while (i < i2) {
            if (fArr[i] == f) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: e */
    public static List m92731e(float... fArr) {
        int length = fArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new C60751h(fArr, 0, length);
    }

    /* renamed from: f */
    public static float[] m92732f(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        float[] fArr = new float[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            fArr[i] = ((Number) obj).floatValue();
        }
        return fArr;
    }
}
