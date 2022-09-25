package com.google.android.apps.gsa.searchplate;

import com.google.android.libraries.gsa.logoview.C22885a;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.searchplate.j */
/* compiled from: PG */
final class C88947j implements C22885a {
    /* renamed from: a */
    public final void mo24646a() {
    }

    /* renamed from: b */
    public final void mo24647b(long j, float[] fArr) {
        float f = (((float) j) % 400.0f) / 400.0f;
        double d = (double) (f + f);
        Double.isNaN(d);
        Arrays.fill(fArr, (float) ((Math.sin(d * 3.141592653589793d) * 0.5d) + 0.5d));
    }
}
