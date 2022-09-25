package com.google.common.p4575r;

import com.google.common.base.C58838bb;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: com.google.common.r.f */
/* compiled from: PG */
public final class C60749f extends C60750g {
    static {
        Pattern.compile("[+-]?(?:NaN|Infinity|(?:\\d+#(?:\\.\\d*#)?|\\.\\d+#)(?:[eE][+-]?\\d+#)?[fFdD]?|0[xX](?:[0-9a-fA-F]+#(?:\\.[0-9a-fA-F]*#)?|\\.[0-9a-fA-F]+#)[pP][+-]?\\d+#[fFdD]?)".replace("#", "+"));
    }

    /* renamed from: a */
    public static int m92723a(double d) {
        return Double.valueOf(d).hashCode();
    }

    /* renamed from: b */
    public static void m92724b(double[] dArr) {
        int length = dArr.length;
        int i = 0;
        C58838bb.m90882q(0, length, length);
        Arrays.sort(dArr, 0, length);
        C58838bb.m90882q(0, length, length);
        while (true) {
            length--;
            if (i < length) {
                double d = dArr[i];
                dArr[i] = dArr[length];
                dArr[length] = d;
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static double[] m92725c(Collection collection) {
        if (!(collection instanceof C60748e)) {
            Object[] array = collection.toArray();
            int length = array.length;
            double[] dArr = new double[length];
            for (int i = 0; i < length; i++) {
                Object obj = array[i];
                obj.getClass();
                dArr[i] = ((Number) obj).doubleValue();
            }
            return dArr;
        }
        C60748e eVar = (C60748e) collection;
        throw null;
    }

    /* renamed from: d */
    public static double m92726d(double d) {
        return Math.min(Math.max(d, -10000.0d), 10000.0d);
    }
}
