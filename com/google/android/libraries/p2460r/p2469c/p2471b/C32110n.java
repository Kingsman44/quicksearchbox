package com.google.android.libraries.p2460r.p2469c.p2471b;

import com.google.p4283bv.p4354e.p4367c.p4368a.C57448ds;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.r.c.b.n */
/* compiled from: PG */
public final class C32110n {
    /* renamed from: a */
    static boolean m59817a(int i) {
        return i == 0 || i == 15;
    }

    /* renamed from: b */
    public static boolean m59818b(C57448ds dsVar, int i) {
        if (dsVar.f153455a == 6 && ((Integer) dsVar.f153456b).intValue() > 0) {
            return true;
        }
        if (dsVar.f153455a != 5 || ((Integer) dsVar.f153456b).intValue() <= 0) {
            return (dsVar.f153455a == 4 && ((Integer) dsVar.f153456b).intValue() > 0) || i > 0;
        }
        return true;
    }

    /* renamed from: c */
    public static float[] m59819c(float f, int i, int i2) {
        float[] fArr = new float[8];
        if (f > 0.0f) {
            if (i == 0) {
                Arrays.fill(fArr, 0, 8, f);
                return fArr;
            } else if (i2 == 1) {
                if ((i & 1) != 0) {
                    fArr[2] = f;
                    fArr[3] = f;
                }
                if ((i & 2) != 0) {
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if ((i & 4) != 0) {
                    fArr[6] = f;
                    fArr[7] = f;
                }
                if ((i & 8) != 0) {
                    fArr[4] = f;
                    fArr[5] = f;
                }
            } else {
                if ((i & 1) != 0) {
                    fArr[0] = f;
                    fArr[1] = f;
                }
                if ((i & 2) != 0) {
                    fArr[2] = f;
                    fArr[3] = f;
                }
                if ((i & 4) != 0) {
                    fArr[4] = f;
                    fArr[5] = f;
                }
                if ((i & 8) != 0) {
                    fArr[6] = f;
                    fArr[7] = f;
                }
            }
        }
        return fArr;
    }

    /* renamed from: d */
    static boolean m59820d(int i, int i2) {
        return i2 == 0 || ((i + -1) & i2) != 0;
    }
}
