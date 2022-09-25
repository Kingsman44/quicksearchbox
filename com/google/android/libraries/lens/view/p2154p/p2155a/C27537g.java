package com.google.android.libraries.lens.view.p2154p.p2155a;

import android.graphics.PointF;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.p.a.g */
/* compiled from: PG */
public final class C27537g {

    /* renamed from: a */
    public static final C59071e f75326a = C59071e.m91332i("com.google.android.libraries.lens.view.p.a.g");

    /* renamed from: a */
    static float m51282a(PointF pointF, PointF pointF2) {
        return m51283b(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    /* renamed from: b */
    static float m51283b(float f, float f2, float f3, float f4) {
        return (float) Math.hypot((double) (f - f3), (double) (f2 - f4));
    }

    /* renamed from: c */
    public static int m51284c(int i) {
        int i2 = i % 360;
        return i2 < 0 ? i2 + 360 : i2;
    }

    /* renamed from: d */
    static PointF[] m51285d(C62491dn dnVar) {
        PointF[] pointFArr = new PointF[dnVar.f168713b.size()];
        for (int i = 0; i < dnVar.f168713b.size(); i++) {
            pointFArr[i] = new PointF(((C62488dk) dnVar.f168713b.get(i)).f168702b, ((C62488dk) dnVar.f168713b.get(i)).f168703c);
        }
        return pointFArr;
    }
}
