package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;

/* renamed from: com.google.android.libraries.lens.common.a.f */
/* compiled from: PG */
public final class C24098f {
    /* renamed from: a */
    public static boolean m44769a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        int c = m44771c(pointF, pointF2, pointF3);
        int c2 = m44771c(pointF, pointF2, pointF4);
        int c3 = m44771c(pointF3, pointF4, pointF);
        int c4 = m44771c(pointF3, pointF4, pointF2);
        if (c != c2 && c3 != c4) {
            return true;
        }
        if (c == 1 && m44770b(pointF, pointF3, pointF2)) {
            return true;
        }
        if (c2 == 1 && m44770b(pointF, pointF4, pointF2)) {
            return true;
        }
        if (c3 == 1 && m44770b(pointF3, pointF, pointF4)) {
            return true;
        }
        if (c4 != 1 || !m44770b(pointF3, pointF2, pointF4)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m44770b(PointF pointF, PointF pointF2, PointF pointF3) {
        return pointF2.x <= Math.max(pointF.x, pointF3.x) && pointF2.x >= Math.min(pointF.x, pointF3.x) && pointF2.y <= Math.max(pointF.y, pointF3.y) && pointF2.y >= Math.min(pointF.y, pointF3.y);
    }

    /* renamed from: c */
    public static int m44771c(PointF pointF, PointF pointF2, PointF pointF3) {
        float f = ((pointF2.y - pointF.y) * (pointF3.x - pointF2.x)) - ((pointF2.x - pointF.x) * (pointF3.y - pointF2.y));
        if (Math.abs(f) < 1.0E-6f) {
            return 1;
        }
        return f > 0.0f ? 3 : 2;
    }
}
