package com.google.android.libraries.lens.common.text;

import android.graphics.Color;
import androidx.core.graphics.C1924a;
import com.google.android.libraries.lens.common.p2001d.C24106a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.google.android.libraries.lens.common.text.r */
/* compiled from: PG */
public final class C24142r {
    /* renamed from: a */
    public static double m44845a(double d, double d2) {
        return d > d2 ? (d + 0.05d) / (d2 + 0.05d) : (d2 + 0.05d) / (d + 0.05d);
    }

    /* renamed from: b */
    public static int m44846b(double d, boolean z, int i) {
        float[] fArr = new float[3];
        C1924a.m5191j(i, fArr);
        float f = z ? fArr[2] : 0.0f;
        float f2 = z ? 1.0f : fArr[2];
        for (int i2 = 0; i2 < 10 && f2 - f > 0.001f; i2++) {
            fArr[2] = (f + f2) / 2.0f;
            if (m44845a(C1924a.m5183b(C1924a.m5184c(fArr)), d) > 4.5d) {
                if (z) {
                    f2 = fArr[2];
                } else {
                    f = fArr[2];
                }
            } else if (z) {
                f = fArr[2];
            } else {
                f2 = fArr[2];
            }
        }
        return C1924a.m5184c(fArr);
    }

    /* renamed from: c */
    public static C58833ax m44847c(int[] iArr) {
        if (r0 == 0) {
            return C58836b.f156633a;
        }
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        C58480gp e3 = C58485gu.m89837e();
        for (int i : iArr) {
            int i2 = (i >> 8) | -16777216;
            e.mo55395g(Integer.valueOf(Color.red(i2)));
            e2.mo55395g(Integer.valueOf(Color.green(i2)));
            e3.mo55395g(Integer.valueOf(Color.blue(i2)));
        }
        return C58833ax.m90834k(Integer.valueOf(Color.argb(PrivateKeyType.INVALID, C24106a.m44785a(e.mo55394f()), C24106a.m44785a(e2.mo55394f()), C24106a.m44785a(e3.mo55394f()))));
    }
}
