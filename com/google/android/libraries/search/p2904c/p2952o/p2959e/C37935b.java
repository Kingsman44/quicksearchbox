package com.google.android.libraries.search.p2904c.p2952o.p2959e;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.common.p4535g.C59203do;
import java.io.InputStream;

/* renamed from: com.google.android.libraries.search.c.o.e.b */
/* compiled from: PG */
public final class C37935b {
    /* renamed from: a */
    public static float m66963a(float f, float f2) {
        float f3;
        float f4;
        if (f < f2) {
            f3 = f * 0.999f;
            f4 = 0.001f;
        } else {
            f3 = f * 0.95f;
            f4 = 0.05f;
        }
        return f3 + (f2 * f4);
    }

    /* renamed from: b */
    public static float m66964b(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return 0.0f;
        }
        double d = (double) i2;
        Double.isNaN(d);
        double d2 = d / 2.0d;
        int i3 = i2 + i;
        long j = 0;
        long j2 = 0;
        while (i3 >= i + 2) {
            int i4 = i3 - 2;
            int i5 = (bArr[i3 - 1] << 8) + (bArr[i4] & 255);
            j2 += (long) i5;
            j += (long) (i5 * i5);
            i3 = i4;
        }
        double d3 = (double) j;
        Double.isNaN(d3);
        double d4 = (double) (j2 * j2);
        Double.isNaN(d4);
        return (float) Math.sqrt(((d3 * d2) - d4) / (d2 * d2));
    }

    /* renamed from: c */
    public static int m66965c(float f, float f2) {
        float f3 = -120.0f;
        if (((double) f) > C59203do.f157270a) {
            double d = (double) (f2 / f);
            if (d > 1.0E-6d) {
                f3 = ((float) Math.log10(d)) * 10.0f;
            }
        }
        return m66966d(f3);
    }

    /* renamed from: d */
    public static int m66966d(float f) {
        return (int) (((Math.min(Math.max(f, -2.0f), 10.0f) + 2.0f) * 100.0f) / 12.0f);
    }

    /* renamed from: e */
    public static void m66967e(InputStream inputStream, C37360ay ayVar, C37934a aVar) {
        int i = ayVar.f99228c;
        byte[] bArr = new byte[(((i + i) / 1000) * 20 * Integer.bitCount(ayVar.f99229d))];
        float f = 75.0f;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                aVar.mo41159a(0);
                return;
            } else if (read != 0) {
                float b = m66964b(bArr, 0, read);
                f = m66963a(f, b);
                aVar.mo41159a(m66965c(f, b));
            }
        }
    }
}
