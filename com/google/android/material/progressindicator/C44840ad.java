package com.google.android.material.progressindicator;

import android.util.Property;
import com.google.android.material.p3505b.C44535e;
import java.util.Arrays;

/* renamed from: com.google.android.material.progressindicator.ad */
/* compiled from: PG */
final class C44840ad extends Property {
    public C44840ad(Class cls) {
        super(cls, "animationFraction");
    }

    public final /* synthetic */ Object get(Object obj) {
        int[] iArr = C44841ae.f116981a;
        return Float.valueOf(((C44841ae) obj).f116988g);
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        C44841ae aeVar = (C44841ae) obj;
        float floatValue = ((Float) obj2).floatValue();
        aeVar.f116988g = floatValue;
        int i = (int) (floatValue * 1800.0f);
        for (int i2 = 0; i2 < 4; i2++) {
            aeVar.f117065k[i2] = Math.max(0.0f, Math.min(1.0f, aeVar.f116984c[i2].getInterpolation(((float) (i - C44841ae.f116982b[i2])) / ((float) C44841ae.f116981a[i2]))));
        }
        if (aeVar.f116987f) {
            Arrays.fill(aeVar.f117066l, C44535e.m78718a(aeVar.f116985d.f117017c[aeVar.f116986e], aeVar.f117064j.f117060i));
            aeVar.f116987f = false;
        }
        aeVar.f117064j.invalidateSelf();
    }
}
