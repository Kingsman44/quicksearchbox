package com.android.p261d.p262a;

import android.graphics.RectF;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.android.d.a.e */
/* compiled from: PG */
public final class C5041e {
    /* renamed from: a */
    public static int m13842a(int i) {
        if (i <= 1073741824) {
            int i2 = i - 1;
            int i3 = i2 | (i2 >> 16);
            int i4 = i3 | (i3 >> 8);
            int i5 = i4 | (i4 >> 4);
            int i6 = i5 | (i5 >> 2);
            return (i6 | (i6 >> 1)) + 1;
        }
        throw new IllegalArgumentException("n is invalid: " + i);
    }

    /* renamed from: b */
    public static RectF m13843b(int i, int i2, int i3, int i4, boolean z) {
        RectF rectF = new RectF();
        float f = (float) i;
        float f2 = (float) i2;
        float f3 = (float) i3;
        float f4 = (float) i4;
        float f5 = f3 / f4;
        if (f / f2 > f5) {
            rectF.top = 0.0f;
            rectF.bottom = f2;
            rectF.left = (f - (f5 * f2)) / 2.0f;
            rectF.right = f - rectF.left;
            if (z) {
                rectF.right -= rectF.left;
                rectF.left = 0.0f;
            }
        } else {
            rectF.left = 0.0f;
            rectF.right = f;
            rectF.top = (f2 - ((f4 / f3) * f)) / 2.0f;
            rectF.bottom = f2 - rectF.top;
        }
        return rectF;
    }

    /* renamed from: c */
    public static void m13844c(boolean z) {
        if (!z) {
            throw new AssertionError();
        }
    }

    /* renamed from: d */
    public static void m13845d(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.w("Utils", "close fail ", e);
            }
        }
    }
}
