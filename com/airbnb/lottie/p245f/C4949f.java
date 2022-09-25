package com.airbnb.lottie.p245f;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.p234a.p235a.C4793l;
import com.airbnb.lottie.p238c.C4842a;
import com.airbnb.lottie.p238c.C4890e;
import com.airbnb.lottie.p238c.p240b.C4868k;
import com.google.common.p4535g.C59203do;
import java.util.List;
import org.chromium.net.PrivateKeyType;

/* renamed from: com.airbnb.lottie.f.f */
/* compiled from: PG */
public final class C4949f {

    /* renamed from: a */
    private static final PointF f15721a = new PointF();

    /* renamed from: a */
    public static double m13707a(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    /* renamed from: b */
    public static float m13708b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* renamed from: c */
    public static float m13709c(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: d */
    static int m13710d(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if ((i ^ i2) < 0 && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    /* renamed from: e */
    public static int m13711e(int i, int i2, float f) {
        return (int) (((float) i) + (f * ((float) (i2 - i))));
    }

    /* renamed from: f */
    public static PointF m13712f(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    /* renamed from: g */
    public static void m13713g(C4868k kVar, Path path) {
        path.reset();
        PointF pointF = kVar.f15505b;
        path.moveTo(pointF.x, pointF.y);
        f15721a.set(pointF.x, pointF.y);
        for (int i = 0; i < kVar.f15504a.size(); i++) {
            C4842a aVar = (C4842a) kVar.f15504a.get(i);
            PointF pointF2 = aVar.f15419a;
            PointF pointF3 = aVar.f15420b;
            PointF pointF4 = aVar.f15421c;
            PointF pointF5 = f15721a;
            if (!pointF2.equals(pointF5) || !pointF3.equals(pointF4)) {
                path.cubicTo(pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y);
            } else {
                path.lineTo(pointF4.x, pointF4.y);
            }
            pointF5.set(pointF4.x, pointF4.y);
        }
        if (kVar.f15506c) {
            path.close();
        }
    }

    /* renamed from: h */
    public static void m13714h(C4890e eVar, int i, List list, C4890e eVar2, C4793l lVar) {
        if (eVar.mo9825d(lVar.mo9722g(), i)) {
            list.add(eVar2.mo9823b(lVar.mo9722g()).mo9824c(lVar));
        }
    }

    /* renamed from: i */
    public static boolean m13715i(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    /* renamed from: j */
    public static double m13716j(double d) {
        return Math.max(C59203do.f157270a, Math.min(1.0d, d));
    }

    /* renamed from: k */
    public static int m13717k(int i) {
        return Math.max(0, Math.min(PrivateKeyType.INVALID, i));
    }
}
