package com.google.android.apps.gsa.nga.engine.recognition.p6125k.p6126a;

import com.google.common.base.C58889cz;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.k.a.b */
/* compiled from: PG */
public final class C77734b {

    /* renamed from: a */
    private final long f214139a;

    /* renamed from: b */
    private final C58889cz f214140b;

    /* renamed from: c */
    private float f214141c = 75.0f;

    /* renamed from: d */
    private double f214142d = C59203do.f157270a;

    /* renamed from: e */
    private float f214143e = 0.0f;

    /* renamed from: f */
    private long f214144f;

    /* renamed from: g */
    private float f214145g;

    /* renamed from: h */
    private float f214146h = 8.0f;

    public C77734b(int i, C58889cz czVar) {
        long j = (long) i;
        this.f214139a = (j + j) / 1000;
        this.f214140b = czVar;
    }

    /* renamed from: a */
    public final synchronized float mo72796a() {
        return this.f214143e;
    }

    /* renamed from: b */
    public final synchronized float mo72797b() {
        return this.f214145g;
    }

    /* renamed from: c */
    public final synchronized void mo72798c() {
        this.f214144f = this.f214140b.mo26884a();
    }

    /* renamed from: d */
    public final synchronized void mo72799d(byte[] bArr, int i) {
        float f;
        float f2;
        if (this.f214140b.mo26884a() - this.f214144f >= 500000000) {
            int i2 = i / 2;
            int i3 = i;
            double d = 0.0d;
            while (i3 >= 2) {
                int i4 = i3 - 1;
                int i5 = i4 - 1;
                int i6 = (bArr[i4] << 8) + (bArr[i5] & 255);
                double d2 = (double) (i6 * i6);
                Double.isNaN(d2);
                d += d2;
                i3 = i5;
            }
            double d3 = (double) i;
            double d4 = (double) this.f214139a;
            Double.isNaN(d3);
            Double.isNaN(d4);
            double exp = Math.exp(-((d3 / d4) / 200.0d));
            double d5 = this.f214142d;
            double d6 = (double) i2;
            Double.isNaN(d6);
            double d7 = d5 + ((1.0d - exp) * (((d / d6) * 9.313794180343393E-10d) - d5));
            this.f214142d = d7;
            float sqrt = (float) Math.sqrt(Math.max(C59203do.f157270a, Math.min(1.0d, d7)));
            this.f214143e = sqrt;
            float f3 = sqrt * 32767.0f;
            float f4 = this.f214141c;
            if (f4 < f3) {
                f = (f4 * 0.9995f) + (5.0E-4f * f3);
                this.f214141c = f;
            } else {
                f = (f4 * 0.95f) + (0.05f * f3);
                this.f214141c = f;
            }
            float f5 = -120.0f;
            if (((double) f) > C59203do.f157270a) {
                double d8 = (double) (f3 / f);
                if (d8 > 1.0E-6d) {
                    f5 = ((float) Math.log10(d8)) * 10.0f;
                }
            }
            float f6 = this.f214146h;
            if (f5 > f6) {
                this.f214146h = f5;
                f2 = f5;
            } else {
                f2 = Math.max(8.0f, f6 * (f5 / f6));
                this.f214146h = f2;
            }
            float f7 = f5 / f2;
            this.f214145g = f7;
            if (f7 <= 0.0f) {
                this.f214145g = 0.0f;
            }
        }
    }
}
