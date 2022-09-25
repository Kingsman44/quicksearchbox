package com.google.android.apps.gsa.staticplugins.p7382aj;

import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.staticplugins.aj.c */
/* compiled from: PG */
final class C93881c {

    /* renamed from: a */
    public final float[] f262205a;

    /* renamed from: b */
    public double f262206b;

    private C93881c(float[] fArr) {
        this.f262205a = fArr;
    }

    /* renamed from: a */
    public static C93881c m154895a() {
        return new C93881c(new float[3]);
    }

    /* renamed from: b */
    public final void mo88201b(float[] fArr) {
        C58838bb.m90861B(2, fArr.length, "index");
        for (int i = 0; i < 3; i++) {
            this.f262205a[i] = fArr[i];
        }
        float[] fArr2 = this.f262205a;
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        this.f262206b = Math.sqrt((double) ((f * f) + (f2 * f2) + (f3 * f3)));
    }
}
