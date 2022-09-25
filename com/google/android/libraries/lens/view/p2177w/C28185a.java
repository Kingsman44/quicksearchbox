package com.google.android.libraries.lens.view.p2177w;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.util.SizeF;
import com.google.android.libraries.lens.common.p1998a.C24093a;
import com.google.android.libraries.lens.common.p1998a.C24095c;
import com.google.android.libraries.lens.common.p1998a.C24097e;
import com.google.android.libraries.lens.common.p1998a.C24098f;
import com.google.android.libraries.lens.p2014e.p2015a.C24194m;
import com.google.android.libraries.lens.p2014e.p2015a.C24195n;
import com.google.android.libraries.lens.view.p2069am.C25333i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4535g.C59203do;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62580n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56221ab;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56223ad;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56224ae;

/* renamed from: com.google.android.libraries.lens.view.w.a */
/* compiled from: PG */
public final class C28185a {
    static {
        new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        new PointF(0.0f, 0.0f);
        new PointF(1.0f, 0.0f);
        new PointF(1.0f, 1.0f);
        new PointF(0.0f, 1.0f);
        new PointF(0.5f, 0.5f);
    }

    /* renamed from: a */
    public static PointF m52683a(C56224ae aeVar) {
        return new PointF(aeVar.f149757c + (aeVar.f149758d / 2.0f), aeVar.f149756b + (aeVar.f149759e / 2.0f));
    }

    /* renamed from: b */
    public static Rect m52684b(RectF rectF, Size size) {
        return new Rect((int) (rectF.left * ((float) size.getWidth())), (int) (rectF.top * ((float) size.getHeight())), (int) (rectF.right * ((float) size.getWidth())), (int) (rectF.bottom * ((float) size.getHeight())));
    }

    /* renamed from: c */
    public static Rect m52685c(C56224ae aeVar, Size size) {
        int a = C56223ad.m87941a(aeVar.f149761g);
        if (a == 0 || a == 1) {
            return new Rect((int) (aeVar.f149757c * ((float) size.getWidth())), (int) (aeVar.f149756b * ((float) size.getHeight())), (int) ((aeVar.f149757c + aeVar.f149758d) * ((float) size.getWidth())), (int) ((aeVar.f149756b + aeVar.f149759e) * ((float) size.getHeight())));
        }
        float f = aeVar.f149757c;
        float f2 = aeVar.f149756b;
        return new Rect((int) f, (int) f2, (int) (f + aeVar.f149758d), (int) (f2 + aeVar.f149759e));
    }

    /* renamed from: d */
    public static RectF m52686d(RectF rectF, Size size, float f) {
        return new RectF(Math.max(rectF.left, f), Math.max(rectF.top, f), Math.min(rectF.right, ((float) size.getWidth()) - f), Math.min(rectF.bottom, ((float) size.getHeight()) - f));
    }

    /* renamed from: e */
    public static RectF m52687e(RectF rectF, float f, float f2) {
        return new RectF(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
    }

    /* renamed from: f */
    public static C24195n m52688f(C62441br brVar, C25333i iVar) {
        int i = brVar.f168616g;
        int a = C62580n.m94802a(i);
        float f = 1.0f;
        float f2 = (a != 0 && a == 2) ? 1.0f : 1.0f / ((float) iVar.f68947a);
        int a2 = C62580n.m94802a(i);
        if (a2 == 0 || a2 != 2) {
            f = 1.0f / ((float) iVar.f68948b);
        }
        C24194m mVar = (C24194m) C24195n.f66127f.createBuilder();
        float f3 = brVar.f168611b;
        float f4 = brVar.f168613d;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66129a = (f3 - (f4 * 0.5f)) * f2;
        float f5 = brVar.f168612c;
        float f6 = brVar.f168614e;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66130b = (f5 - (f6 * 0.5f)) * f;
        float f7 = brVar.f168611b;
        float f8 = brVar.f168613d;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66131c = (f7 + (f8 * 0.5f)) * f2;
        float f9 = brVar.f168612c;
        float f10 = brVar.f168614e;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66132d = (f9 + (f10 * 0.5f)) * f;
        double degrees = Math.toDegrees((double) brVar.f168615f);
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66133e = (float) degrees;
        return (C24195n) mVar.build();
    }

    /* renamed from: g */
    public static C24195n m52689g(C56224ae aeVar, C25333i iVar) {
        float f;
        int i = aeVar.f149761g;
        int a = C56223ad.m87941a(i);
        float f2 = 1.0f;
        if (a == 0 || a == 1) {
            f = 1.0f;
        } else {
            f = 1.0f / ((float) iVar.f68947a);
        }
        int a2 = C56223ad.m87941a(i);
        if (!(a2 == 0 || a2 == 1)) {
            f2 = 1.0f / ((float) iVar.f68948b);
        }
        C24194m mVar = (C24194m) C24195n.f66127f.createBuilder();
        float f3 = aeVar.f149757c;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66129a = f3 * f;
        float f4 = aeVar.f149756b;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66130b = f4 * f2;
        float f5 = aeVar.f149757c;
        float f6 = aeVar.f149758d;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66131c = (f5 + f6) * f;
        float f7 = aeVar.f149756b;
        float f8 = aeVar.f149759e;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66132d = (f7 + f8) * f2;
        float f9 = aeVar.f149760f;
        mVar.copyOnWrite();
        ((C24195n) mVar.instance).f66133e = f9;
        return (C24195n) mVar.build();
    }

    /* renamed from: h */
    public static C62441br m52690h(C24195n nVar) {
        float f = nVar.f66131c;
        float f2 = nVar.f66129a;
        float f3 = f - f2;
        float f4 = nVar.f66132d;
        float f5 = nVar.f66130b;
        float f6 = f4 - f5;
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        brVar.f168610a |= 8;
        brVar.f168614e = f6;
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 4;
        brVar2.f168613d = f3;
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 1;
        brVar3.f168611b = f2 + (f3 / 2.0f);
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 2;
        brVar4.f168612c = f5 + (f6 / 2.0f);
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168616g = 1;
        brVar5.f168610a |= 32;
        double radians = Math.toRadians((double) nVar.f66133e);
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168610a |= 16;
        brVar6.f168615f = (float) radians;
        return (C62441br) bqVar.build();
    }

    /* renamed from: i */
    public static C56224ae m52691i(C24195n nVar) {
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        float f = nVar.f66129a;
        abVar.copyOnWrite();
        C56224ae aeVar = (C56224ae) abVar.instance;
        aeVar.f149755a |= 2;
        aeVar.f149757c = f;
        float f2 = nVar.f66130b;
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a |= 1;
        aeVar2.f149756b = f2;
        float f3 = nVar.f66131c;
        float f4 = nVar.f66129a;
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 4;
        aeVar3.f149758d = f3 - f4;
        float f5 = nVar.f66132d;
        float f6 = nVar.f66130b;
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 8;
        aeVar4.f149759e = f5 - f6;
        float f7 = nVar.f66133e;
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149755a |= 16;
        aeVar5.f149760f = f7;
        abVar.copyOnWrite();
        C56224ae aeVar6 = (C56224ae) abVar.instance;
        aeVar6.f149761g = 0;
        aeVar6.f149755a |= 32;
        return (C56224ae) abVar.build();
    }

    /* renamed from: j */
    public static C56224ae m52692j(C58485gu guVar, SizeF sizeF) {
        C58485gu guVar2 = guVar;
        if (guVar.isEmpty()) {
            return C56224ae.f149753h;
        }
        int size = guVar.size();
        double d = C59203do.f157270a;
        double d2 = 0.0d;
        for (int i = 0; i < size; i++) {
            double radians = Math.toRadians((double) ((C56224ae) guVar2.get(i)).f149760f);
            d2 += Math.cos(radians);
            d += Math.sin(radians);
        }
        double size2 = (double) guVar.size();
        Double.isNaN(size2);
        double d3 = d / size2;
        double size3 = (double) guVar.size();
        Double.isNaN(size3);
        float degrees = (float) Math.toDegrees(Math.atan2(d3, d2 / size3));
        if ((degrees > 90.0f && degrees < 225.0f) || (degrees > -225.0f && degrees < -90.0f)) {
            degrees -= 0.024902344f;
        }
        double radians2 = (double) ((float) Math.toRadians((double) degrees));
        float cos = (float) Math.cos(radians2);
        float sin = (float) Math.sin(radians2);
        PointF pointF = new PointF(cos, sin);
        PointF pointF2 = new PointF(-sin, cos);
        int size4 = guVar.size();
        float f = Float.NEGATIVE_INFINITY;
        float f2 = Float.NEGATIVE_INFINITY;
        float f3 = Float.POSITIVE_INFINITY;
        float f4 = Float.POSITIVE_INFINITY;
        for (int i2 = 0; i2 < size4; i2++) {
            C62441br g = C24095c.m44762g(C24093a.m44747c((C56224ae) guVar2.get(i2)), new Size((int) sizeF.getWidth(), (int) sizeF.getHeight()));
            PointF pointF3 = new PointF(g.f168611b, g.f168612c);
            float a = C24095c.m44756a(pointF, pointF3);
            float b = C24095c.m44757b(g, pointF);
            float a2 = C24095c.m44756a(pointF2, pointF3);
            float b2 = C24095c.m44757b(g, pointF2);
            float f5 = b / 2.0f;
            f3 = Math.min(f3, a - f5);
            f = Math.max(f, a + f5);
            float f6 = b2 / 2.0f;
            f4 = Math.min(f4, a2 - f6);
            f2 = Math.max(f2, a2 + f6);
        }
        float f7 = f - f3;
        float f8 = f2 - f4;
        PointF pointF4 = new PointF((f + f3) / 2.0f, (f2 + f4) / 2.0f);
        PointF pointF5 = new PointF(pointF.x, -pointF.y);
        PointF pointF6 = new PointF(C24095c.m44756a(pointF4, pointF5), C24095c.m44756a(pointF4, new PointF(-pointF5.y, pointF5.x)));
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        float width = sizeF.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar = (C56224ae) abVar.instance;
        aeVar.f149755a |= 4;
        aeVar.f149758d = f7 / width;
        float height = sizeF.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149755a |= 8;
        aeVar2.f149759e = f8 / height;
        float f9 = pointF6.x;
        float width2 = sizeF.getWidth();
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 2;
        aeVar3.f149757c = (f9 - (f7 / 2.0f)) / width2;
        float f10 = pointF6.y;
        float height2 = sizeF.getHeight();
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a |= 1;
        aeVar4.f149756b = (f10 - (f8 / 2.0f)) / height2;
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149755a |= 16;
        aeVar5.f149760f = degrees;
        return (C56224ae) abVar.build();
    }

    /* renamed from: k */
    public static C56224ae m52693k(C56224ae aeVar, C25333i iVar) {
        int a = C56223ad.m87941a(aeVar.f149761g);
        if (a == 0 || a == 1) {
            return aeVar;
        }
        float f = 1.0f / ((float) iVar.f68947a);
        float f2 = 1.0f / ((float) iVar.f68948b);
        C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
        abVar.copyOnWrite();
        C56224ae aeVar2 = (C56224ae) abVar.instance;
        aeVar2.f149761g = 0;
        aeVar2.f149755a |= 32;
        float f3 = aeVar.f149757c;
        abVar.copyOnWrite();
        C56224ae aeVar3 = (C56224ae) abVar.instance;
        aeVar3.f149755a |= 2;
        aeVar3.f149757c = f3 * f;
        float f4 = aeVar.f149756b;
        abVar.copyOnWrite();
        C56224ae aeVar4 = (C56224ae) abVar.instance;
        aeVar4.f149755a = 1 | aeVar4.f149755a;
        aeVar4.f149756b = f4 * f2;
        float f5 = aeVar.f149758d;
        abVar.copyOnWrite();
        C56224ae aeVar5 = (C56224ae) abVar.instance;
        aeVar5.f149755a |= 4;
        aeVar5.f149758d = f5 * f;
        float f6 = aeVar.f149759e;
        abVar.copyOnWrite();
        C56224ae aeVar6 = (C56224ae) abVar.instance;
        aeVar6.f149755a |= 8;
        aeVar6.f149759e = f6 * f2;
        float f7 = aeVar.f149760f;
        abVar.copyOnWrite();
        C56224ae aeVar7 = (C56224ae) abVar.instance;
        aeVar7.f149755a |= 16;
        aeVar7.f149760f = f7;
        return (C56224ae) abVar.build();
    }

    /* renamed from: l */
    public static boolean m52694l(C56224ae aeVar, C56224ae aeVar2, C25333i iVar) {
        int i = aeVar.f149761g;
        int a = C56223ad.m87941a(i);
        if (a == 0) {
            a = 1;
        }
        int a2 = C56223ad.m87941a(aeVar2.f149761g);
        if (a2 == 0) {
            a2 = 1;
        }
        if (a != a2) {
            int a3 = C56223ad.m87941a(i);
            if (a3 != 0 && a3 == 2) {
                aeVar = m52693k(aeVar, iVar);
            } else {
                aeVar2 = m52693k(aeVar2, iVar);
            }
        }
        if (Math.abs(aeVar.f149757c - aeVar2.f149757c) >= 1.0E-5f || Math.abs(aeVar.f149756b - aeVar2.f149756b) >= 1.0E-5f || Math.abs(aeVar.f149759e - aeVar2.f149759e) >= 1.0E-5f || Math.abs(aeVar.f149758d - aeVar2.f149758d) >= 1.0E-5f || Math.abs(aeVar.f149760f - aeVar2.f149760f) >= 1.0E-5f) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m52695m(C56224ae aeVar, C25333i iVar) {
        int i = aeVar.f149761g;
        int a = C56223ad.m87941a(i);
        if (a == 0 || a != 2) {
            int a2 = C56223ad.m87941a(i);
            C58838bb.m90868c(a2 == 0 || a2 == 1);
            C56221ab abVar = (C56221ab) C56224ae.f149753h.createBuilder();
            abVar.copyOnWrite();
            C56224ae aeVar2 = (C56224ae) abVar.instance;
            aeVar2.f149761g = 1;
            aeVar2.f149755a |= 32;
            float f = aeVar.f149757c;
            int i2 = iVar.f68947a;
            abVar.copyOnWrite();
            C56224ae aeVar3 = (C56224ae) abVar.instance;
            aeVar3.f149755a |= 2;
            aeVar3.f149757c = f * ((float) i2);
            float f2 = aeVar.f149756b;
            int i3 = iVar.f68948b;
            abVar.copyOnWrite();
            C56224ae aeVar4 = (C56224ae) abVar.instance;
            aeVar4.f149755a |= 1;
            aeVar4.f149756b = f2 * ((float) i3);
            float f3 = aeVar.f149758d;
            int i4 = iVar.f68947a;
            abVar.copyOnWrite();
            C56224ae aeVar5 = (C56224ae) abVar.instance;
            aeVar5.f149755a |= 4;
            aeVar5.f149758d = f3 * ((float) i4);
            float f4 = aeVar.f149759e;
            int i5 = iVar.f68948b;
            abVar.copyOnWrite();
            C56224ae aeVar6 = (C56224ae) abVar.instance;
            aeVar6.f149755a |= 8;
            aeVar6.f149759e = f4 * ((float) i5);
            float f5 = aeVar.f149760f;
            abVar.copyOnWrite();
            C56224ae aeVar7 = (C56224ae) abVar.instance;
            aeVar7.f149755a |= 16;
            aeVar7.f149760f = f5;
            aeVar = (C56224ae) abVar.build();
        }
        PointF a3 = m52683a(aeVar);
        RectF rectF = new RectF(0.0f, 0.0f, (float) iVar.f68947a, (float) iVar.f68948b);
        if (rectF.contains(a3.x, a3.y)) {
            return true;
        }
        PointF[] p = m52698p(aeVar);
        for (int i6 = 0; i6 < 4; i6++) {
            if (rectF.contains(p[i6].x, p[i6].y)) {
                return true;
            }
        }
        PointF pointF = new PointF((float) (iVar.f68947a / 2), (float) (iVar.f68948b / 2));
        int i7 = 0;
        int i8 = 0;
        while (i7 < 4) {
            int i9 = i7 + 1;
            PointF pointF2 = p[i9 % 4];
            PointF pointF3 = p[i7];
            PointF pointF4 = new PointF(pointF3.x - pointF2.x, pointF3.y - pointF2.y);
            PointF pointF5 = new PointF(pointF.x - pointF2.x, pointF.y - pointF2.y);
            i8 += (int) Math.signum((pointF4.x * pointF5.x) + (pointF4.y * pointF5.y));
            i7 = i9;
        }
        if (Math.abs(i8) == 4) {
            return true;
        }
        C56221ab abVar2 = (C56221ab) C56224ae.f149753h.createBuilder();
        abVar2.copyOnWrite();
        C56224ae aeVar8 = (C56224ae) abVar2.instance;
        aeVar8.f149755a = 2 | aeVar8.f149755a;
        aeVar8.f149757c = 0.0f;
        abVar2.copyOnWrite();
        C56224ae aeVar9 = (C56224ae) abVar2.instance;
        aeVar9.f149755a |= 1;
        aeVar9.f149756b = 0.0f;
        int i10 = iVar.f68947a;
        abVar2.copyOnWrite();
        C56224ae aeVar10 = (C56224ae) abVar2.instance;
        aeVar10.f149755a |= 4;
        aeVar10.f149758d = (float) i10;
        int i11 = iVar.f68948b;
        abVar2.copyOnWrite();
        C56224ae aeVar11 = (C56224ae) abVar2.instance;
        aeVar11.f149755a |= 8;
        aeVar11.f149759e = (float) i11;
        abVar2.copyOnWrite();
        C56224ae aeVar12 = (C56224ae) abVar2.instance;
        aeVar12.f149755a |= 16;
        aeVar12.f149760f = 0.0f;
        PointF[] p2 = m52698p((C56224ae) abVar2.build());
        for (int i12 = 0; i12 < 4; i12++) {
            int i13 = 0;
            while (i13 < 4) {
                int i14 = i13 + 1;
                if (C24098f.m44769a(p[i12], p[(i12 + 1) % 4], p2[i13], p2[i14 % 4])) {
                    return true;
                }
                i13 = i14;
            }
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m52696n(RectF rectF, RectF rectF2) {
        return Math.abs(rectF.left - rectF2.left) < 1.0E-5f && Math.abs(rectF.top - rectF2.top) < 1.0E-5f && Math.abs(rectF.right - rectF2.right) < 1.0E-5f && Math.abs(rectF.bottom - rectF2.bottom) < 1.0E-5f;
    }

    /* renamed from: o */
    public static boolean m52697o(C24195n nVar, PointF pointF, C25333i iVar) {
        float f = (float) iVar.f68947a;
        float f2 = f * 0.0f;
        float f3 = (float) iVar.f68948b;
        float f4 = f3 * 0.0f;
        RectF rectF = new RectF(nVar.f66129a * f, nVar.f66130b * f3, nVar.f66131c * f, nVar.f66132d * f3);
        PointF a = C24097e.m44767a(rectF.centerX(), rectF.centerY(), -nVar.f66133e, 1, new PointF(pointF.x * ((float) iVar.f68947a), pointF.y * ((float) iVar.f68948b)));
        if (f2 <= 0.0f || f4 <= 0.0f) {
            return rectF.contains(a.x, a.y);
        }
        return rectF.intersects(a.x - f2, a.y - f4, a.x + f2, a.y + f4);
    }

    /* renamed from: p */
    private static PointF[] m52698p(C56224ae aeVar) {
        PointF a = m52683a(aeVar);
        return C24097e.m44768b(a.x, a.y, aeVar.f149760f, 1, new PointF(aeVar.f149757c, aeVar.f149756b), new PointF(aeVar.f149757c + aeVar.f149758d, aeVar.f149756b), new PointF(aeVar.f149757c + aeVar.f149758d, aeVar.f149756b + aeVar.f149759e), new PointF(aeVar.f149757c, aeVar.f149756b + aeVar.f149759e));
    }
}
