package com.facebook.litho;

import android.graphics.PathEffect;
import com.facebook.yoga.C6571g;
import java.util.Arrays;

/* renamed from: com.facebook.litho.e */
/* compiled from: PG */
public final class C6207e implements C6142bw {

    /* renamed from: a */
    public final float[] f18352a = new float[4];

    /* renamed from: b */
    public final int[] f18353b = new int[4];

    /* renamed from: c */
    final int[] f18354c = new int[4];

    /* renamed from: d */
    public PathEffect f18355d;

    /* renamed from: b */
    static int m16462b(int[] iArr, int i) {
        if (iArr.length == 4) {
            return iArr[m16464d(i)];
        }
        throw new IllegalArgumentException("Given wrongly sized array");
    }

    /* renamed from: c */
    public static void m16463c(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            iArr[i3] = i2;
        }
    }

    /* renamed from: d */
    private static int m16464d(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2) {
                if (i2 == 3) {
                    return 3;
                }
                if (i2 == 4) {
                    return 0;
                }
                if (i2 != 5) {
                    throw new IllegalArgumentException("Given unsupported edge ".concat(C6571g.m17938a(i)));
                }
            }
        }
        return i3;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo13057a(Object obj) {
        C6207e eVar = (C6207e) obj;
        if (this == eVar) {
            return true;
        }
        return eVar != null && Arrays.equals(this.f18352a, eVar.f18352a) && Arrays.equals(this.f18353b, eVar.f18353b) && Arrays.equals(this.f18354c, eVar.f18354c);
    }
}
