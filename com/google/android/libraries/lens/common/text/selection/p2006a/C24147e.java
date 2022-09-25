package com.google.android.libraries.lens.common.text.selection.p2006a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24151a;
import com.google.android.libraries.lens.common.text.selection.p2008c.C24152b;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Iterator;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.common.text.selection.a.e */
/* compiled from: PG */
public final class C24147e implements Iterator, p3186j$.util.Iterator {

    /* renamed from: a */
    final /* synthetic */ List f65934a;

    /* renamed from: b */
    private int f65935b;

    public C24147e(List list) {
        this.f65934a = list;
    }

    /* renamed from: a */
    private static final float[] m44874a(RectF rectF) {
        return new float[]{rectF.left, rectF.bottom, rectF.left, rectF.top, rectF.right, rectF.top, rectF.right, rectF.bottom};
    }

    /* renamed from: b */
    private static final void m44875b(float[] fArr, RectF rectF) {
        rectF.set(fArr[0], fArr[3], fArr[4], fArr[7]);
    }

    /* renamed from: c */
    private static final boolean m44876c(C24146d dVar, C24146d dVar2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f;
        float f10 = f2;
        float f11 = f3;
        float f12 = f4;
        float f13 = f5;
        float f14 = f6;
        float f15 = f7;
        float f16 = f8;
        if (dVar.mo29550c() != dVar2.mo29550c() || dVar.mo29549b() != dVar2.mo29549b() || dVar.mo29558i() != dVar2.mo29558i()) {
            return false;
        }
        if (C24152b.m44879a(dVar.mo29558i())) {
            double abs = (double) Math.abs((f13 + f15) - (f9 + f11));
            double max = (double) Math.max(f11, f15);
            Double.isNaN(max);
            if (abs >= max * 0.2d) {
                return false;
            }
            return ((double) ((f12 + f16) / (Math.max(f10 + f12, f14 + f16) - Math.min(f10, f14)))) >= 0.75d;
        }
        double abs2 = (double) Math.abs(f14 - f10);
        double max2 = (double) Math.max(f12, f16);
        Double.isNaN(max2);
        if (abs2 >= max2 * 0.2d) {
            return false;
        }
        return ((double) ((f11 + f15) / (Math.max(f9 + f11, f13 + f15) - Math.min(f9, f13)))) >= 0.75d;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final boolean hasNext() {
        return this.f65935b < this.f65934a.size();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        C24146d dVar;
        RectF rectF;
        RectF rectF2;
        Matrix matrix;
        int i;
        C24147e eVar = this;
        C24146d dVar2 = (C24146d) eVar.f65934a.get(eVar.f65935b);
        if (eVar.f65934a.size() <= 1) {
            eVar.f65935b++;
            C24148f fVar = new C24148f(dVar2.mo29552e(), dVar2.mo29548a(), dVar2.mo29558i());
            C24147e eVar2 = eVar;
            return fVar;
        }
        int i2 = eVar.f65935b + 1;
        float a = C24151a.m44877a(dVar2.mo29548a());
        if (!C24151a.m44878b(a, 0.0f)) {
            RectF rectF3 = new RectF(dVar2.mo29552e());
            Matrix matrix2 = new Matrix();
            float[] a2 = m44874a(rectF3);
            matrix2.setRotate(a, rectF3.centerX(), rectF3.centerY());
            matrix2.mapPoints(a2);
            Matrix matrix3 = new Matrix();
            Matrix matrix4 = new Matrix();
            matrix3.setRotate(a);
            matrix3.postTranslate(a2[0], a2[1]);
            matrix3.invert(matrix4);
            matrix4.mapPoints(a2);
            RectF rectF4 = new RectF();
            m44875b(a2, rectF4);
            int i3 = i2;
            while (true) {
                if (i3 >= eVar.f65934a.size()) {
                    break;
                }
                C24146d dVar3 = (C24146d) eVar.f65934a.get(i3);
                if (((double) Math.abs(C24151a.m44877a(dVar3.mo29548a()) - a)) <= 4.0d) {
                    RectF rectF5 = new RectF(dVar3.mo29552e());
                    float[] a3 = m44874a(rectF5);
                    matrix2.setRotate(a, rectF5.centerX(), rectF5.centerY());
                    matrix2.mapPoints(a3);
                    matrix4.mapPoints(a3);
                    m44875b(a3, rectF5);
                    float f = rectF4.left;
                    float f2 = rectF4.top;
                    float width = rectF4.width();
                    float height = rectF4.height();
                    float f3 = rectF5.left;
                    float f4 = rectF5.top;
                    float f5 = f3;
                    C24146d dVar4 = dVar2;
                    dVar = dVar2;
                    RectF rectF6 = rectF5;
                    i = i3;
                    rectF = rectF3;
                    rectF2 = rectF4;
                    float f6 = f4;
                    Matrix matrix5 = matrix4;
                    Matrix matrix6 = matrix5;
                    matrix = matrix3;
                    if (!m44876c(dVar4, dVar3, f, f2, width, height, f5, f6, rectF5.width(), rectF5.height())) {
                        break;
                    }
                    rectF2.union(rectF6);
                    i3 = i + 1;
                    eVar = this;
                    matrix3 = matrix;
                    rectF4 = rectF2;
                    rectF3 = rectF;
                    matrix4 = matrix6;
                    dVar2 = dVar;
                } else {
                    break;
                }
            }
            dVar = dVar2;
            i = i3;
            matrix = matrix3;
            rectF = rectF3;
            rectF2 = rectF4;
            float[] a4 = m44874a(rectF2);
            matrix.mapPoints(a4);
            float f7 = a4[0];
            float f8 = a4[1];
            matrix2.setRotate(-a, ((a4[4] - f7) / 2.0f) + f7, ((a4[5] - f8) / 2.0f) + f8);
            matrix2.mapPoints(a4);
            RectF rectF7 = rectF;
            m44875b(a4, rectF7);
            this.f65935b = i;
            return new C24148f(new Rect((int) Math.rint((double) rectF7.left), (int) Math.rint((double) rectF7.top), (int) Math.rint((double) rectF7.right), (int) Math.rint((double) rectF7.bottom)), dVar.mo29548a(), dVar.mo29558i());
        }
        C24146d dVar5 = dVar2;
        C24147e eVar3 = eVar;
        Rect rect = new Rect(dVar5.mo29552e());
        int i4 = i2;
        while (i4 < eVar3.f65934a.size()) {
            C24146d dVar6 = (C24146d) eVar3.f65934a.get(i4);
            Rect e = dVar6.mo29552e();
            if (!m44876c(dVar5, dVar6, (float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height(), (float) e.left, (float) e.top, (float) e.width(), (float) e.height())) {
                break;
            }
            rect.union(e);
            i4++;
        }
        eVar3.f65935b = i4;
        return new C24148f(rect, dVar5.mo29548a(), dVar5.mo29558i());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
