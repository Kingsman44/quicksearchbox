package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.LinearGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import com.google.android.libraries.p2460r.p2464b.C32050a;
import com.google.android.libraries.p2460r.p2464b.p2465a.C32052b;

/* renamed from: com.google.android.libraries.r.c.b.e */
/* compiled from: PG */
final class C32101e extends ShapeDrawable.ShaderFactory {

    /* renamed from: a */
    final double f86196a;

    /* renamed from: b */
    final double f86197b;

    /* renamed from: c */
    final C32052b f86198c;

    /* renamed from: d */
    private final int[] f86199d;

    /* renamed from: e */
    private final float[] f86200e;

    public C32101e(int[] iArr, float[] fArr, int i, C32052b bVar) {
        int length = iArr.length;
        int length2 = fArr.length;
        C32050a.m59726a(length == length2, "Mismatch: got %s colors and %s stops", Integer.valueOf(length), Integer.valueOf(length2));
        this.f86199d = iArr;
        this.f86200e = fArr;
        this.f86196a = Math.toRadians((double) (i % 360));
        this.f86197b = Math.toRadians((double) (i % 90));
        this.f86198c = bVar;
    }

    public final Shader resize(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        double d = this.f86196a;
        double d2 = this.f86197b;
        C32052b bVar = this.f86198c;
        boolean z = false;
        if (bVar != null && ((Boolean) bVar.mo37837a()).booleanValue()) {
            z = true;
        }
        double d3 = (double) i3;
        double d4 = (double) i4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        double hypot = Math.hypot(d3 / 2.0d, d4 / 2.0d) * Math.cos((1.5707963267948966d - Math.atan2(d4, d3)) - d2);
        double d5 = (double) (((float) i3) / 2.0f);
        double d6 = (double) (true != z ? 1.0f : -1.0f);
        Double.isNaN(d6);
        double d7 = d6 * hypot;
        double sin = Math.sin(d);
        double sin2 = Math.sin(d);
        double d8 = (double) (((float) i4) / 2.0f);
        double cos = Math.cos(d);
        double cos2 = Math.cos(d);
        Double.isNaN(d5);
        Double.isNaN(d8);
        Double.isNaN(d5);
        Double.isNaN(d8);
        RectF rectF = new RectF((float) (d5 - (sin * d7)), (float) ((cos * hypot) + d8), (float) (d5 + (d7 * sin2)), (float) (d8 - (hypot * cos2)));
        return new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.f86199d, this.f86200e, Shader.TileMode.CLAMP);
    }
}
