package com.google.android.apps.gsa.searchplate;

import com.google.android.apps.gsa.searchplate.p6966d.C88939k;
import com.google.android.apps.gsa.shared.util.C90740ax;
import com.google.android.libraries.gsa.logoview.C22885a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.searchplate.am */
/* compiled from: PG */
public final class C88911am implements C22885a {

    /* renamed from: a */
    public C90740ax f240858a;

    /* renamed from: b */
    private final float[] f240859b = new float[4];

    /* renamed from: c */
    private final float[] f240860c = new float[4];

    /* renamed from: d */
    private float f240861d;

    /* renamed from: e */
    private int f240862e;

    /* renamed from: a */
    public final void mo24646a() {
        Arrays.fill(this.f240860c, 0.0f);
        Arrays.fill(this.f240859b, 0.0f);
        this.f240861d = 0.0f;
    }

    /* renamed from: b */
    public final void mo24647b(long j, float[] fArr) {
        C90740ax axVar = this.f240858a;
        if (axVar != null) {
            this.f240859b[this.f240862e] = ((float) axVar.mo21713a()) / 100.0f;
            float[] fArr2 = this.f240859b;
            int i = this.f240862e;
            float f = fArr2[i];
            float f2 = fArr2[(i + 3) & 3];
            float a = C88939k.m144545a(this.f240861d, ((f + f2) + fArr2[(i + 2) & 3]) / 3.0f);
            this.f240861d = a;
            fArr[0] = a;
            float[] fArr3 = this.f240860c;
            int i2 = this.f240862e;
            fArr[1] = fArr3[(i2 + 3) & 3];
            fArr[2] = fArr3[(i2 + 2) & 3];
            fArr[3] = fArr3[(i2 + 1) & 3];
        }
        float[] fArr4 = this.f240860c;
        int i3 = this.f240862e;
        fArr4[i3] = this.f240861d;
        this.f240862e = (i3 + 1) & 3;
    }
}
