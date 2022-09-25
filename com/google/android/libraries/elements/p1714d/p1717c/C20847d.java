package com.google.android.libraries.elements.p1714d.p1717c;

import android.graphics.LinearGradient;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Shader;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.d.c.d */
/* compiled from: PG */
final class C20847d {

    /* renamed from: a */
    public LinearGradient f58419a;

    /* renamed from: b */
    private final float f58420b;

    /* renamed from: c */
    private final int[] f58421c;

    /* renamed from: d */
    private final float[] f58422d;

    /* renamed from: e */
    private final PointF f58423e;

    /* renamed from: f */
    private final PointF f58424f;

    /* renamed from: g */
    private final C21259bb f58425g;

    /* renamed from: h */
    private final int f58426h;

    public C20847d(float f, PointF pointF, PointF pointF2, int[] iArr, float[] fArr, int i, C21259bb bbVar) {
        this.f58420b = f;
        this.f58421c = iArr;
        this.f58422d = fArr;
        this.f58423e = pointF;
        this.f58424f = pointF2;
        this.f58426h = i;
        this.f58425g = bbVar;
    }

    /* renamed from: a */
    static LinearGradient m39182a(float f, float f2, float f3, float f4, int[] iArr, float[] fArr) {
        if (fArr == null || iArr.length != fArr.length) {
            return new LinearGradient(f, f2, f3, f4, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(f, f2, f3, f4, iArr, fArr, Shader.TileMode.CLAMP);
    }

    /* renamed from: b */
    static PointF m39183b(PointF pointF, double d, float f) {
        double tan = Math.tan(Math.toRadians((double) (f + 90.0f)));
        double d2 = (double) pointF.x;
        Double.isNaN(d2);
        double d3 = (double) pointF.y;
        Double.isNaN(d3);
        double pow = (-(((d2 * tan) + (-d3)) + d)) / (Math.pow(tan, 2.0d) + 1.0d);
        PointF pointF2 = new PointF();
        double d4 = (double) pointF.x;
        Double.isNaN(d4);
        pointF2.x = (float) (d4 + (tan * pow));
        double d5 = (double) pointF.y;
        Double.isNaN(d5);
        pointF2.y = (float) (d5 + (-pow));
        return pointF2;
    }

    /* renamed from: c */
    static PointF m39184c(RectF rectF, int i, C21259bb bbVar) {
        if (i == 0) {
            return new PointF(rectF.left, rectF.bottom);
        }
        if (i == 1) {
            return new PointF(rectF.left, rectF.top);
        }
        if (i == 2) {
            return new PointF(rectF.right, rectF.top);
        }
        if (i == 3) {
            return new PointF(rectF.right, rectF.bottom);
        }
        bbVar.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "ElementsLinearGradientWrapper Quadrant has to be in the range 0 to 3", C21319z.f59680u, (Throwable) null);
        return new PointF(rectF.left, rectF.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo25965d(RectF rectF, boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        if (this.f58423e == null || this.f58424f == null) {
            int i = (int) (this.f58420b / 90.0f);
            float centerX = rectF.centerX();
            double centerY = (double) rectF.centerY();
            double tan = Math.tan(Math.toRadians((double) (this.f58420b + 90.0f)));
            double d = (double) centerX;
            Double.isNaN(d);
            Double.isNaN(centerY);
            double d2 = centerY - (tan * d);
            PointF b = m39183b(m39184c(rectF, i % 4, this.f58425g), d2, this.f58420b);
            PointF b2 = m39183b(m39184c(rectF, (i + 2) % 4, this.f58425g), d2, this.f58420b);
            if (!z || !z2) {
                f2 = b.x;
                f = b2.x;
            } else {
                f2 = rectF.right - Math.abs(b.x - rectF.left);
                f = rectF.right - Math.abs(b2.x - rectF.left);
            }
            this.f58419a = m39182a(f2, b.y, f, b2.y, this.f58421c, this.f58422d);
            return;
        }
        if (this.f58426h - 1 != 1) {
            if (!z || !z2) {
                f4 = rectF.left + (rectF.width() * this.f58423e.x);
                f3 = rectF.left + (rectF.width() * this.f58424f.x);
            } else {
                f4 = rectF.right - (rectF.width() * this.f58423e.x);
                f3 = rectF.right - (rectF.width() * this.f58424f.x);
            }
            f6 = rectF.top + (rectF.height() * this.f58423e.y);
            f5 = rectF.top + (rectF.height() * this.f58424f.y);
        } else {
            if (!z || !z2) {
                f7 = rectF.left + this.f58423e.x;
                f8 = rectF.left + this.f58424f.x;
            } else {
                f7 = rectF.right - this.f58423e.x;
                f8 = rectF.right - this.f58424f.x;
            }
            f6 = rectF.top + this.f58423e.y;
            f5 = this.f58424f.y + rectF.top;
        }
        this.f58419a = m39182a(f4, f6, f3, f5, this.f58421c, this.f58422d);
    }
}
