package com.google.android.libraries.assistant.p1622v;

import com.google.android.libraries.gsa.logoview.C22885a;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.assistant.v.a */
/* compiled from: PG */
public class C19457a implements C22885a {

    /* renamed from: a */
    final float[] f54392a = new float[4];

    /* renamed from: b */
    public float f54393b;

    /* renamed from: c */
    float f54394c;

    /* renamed from: d */
    int f54395d;

    /* renamed from: e */
    private final float[] f54396e = new float[4];

    /* renamed from: a */
    public final void mo24646a() {
        Arrays.fill(this.f54392a, 0.0f);
        Arrays.fill(this.f54396e, 0.0f);
        this.f54394c = 0.0f;
    }

    /* renamed from: b */
    public final void mo24647b(long j, float[] fArr) {
        float[] fArr2 = this.f54396e;
        int i = this.f54395d;
        float f = this.f54393b / 100.0f;
        fArr2[i] = f;
        int i2 = (i + 3) & 3;
        int i3 = (i + 2) & 3;
        float f2 = ((f + fArr2[i2]) + fArr2[i3]) / 3.0f;
        float f3 = this.f54394c;
        float f4 = f2 > f3 ? f3 + ((f2 - f3) * 0.3f) : f3 * 0.92f;
        this.f54394c = f4;
        fArr[0] = f4;
        float[] fArr3 = this.f54392a;
        fArr[1] = fArr3[i2];
        fArr[2] = fArr3[i3];
        int i4 = (i + 1) & 3;
        fArr[3] = fArr3[i4];
        fArr3[i] = f4;
        this.f54395d = i4;
    }
}
