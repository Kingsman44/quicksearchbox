package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Size;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.lens.p4707j.C62440bq;
import com.google.lens.p4707j.C62441br;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62487dj;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;
import com.google.lens.p4707j.C62580n;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.common.a.c */
/* compiled from: PG */
public final class C24095c {
    /* renamed from: a */
    public static float m44756a(PointF pointF, PointF pointF2) {
        return (pointF.x * pointF2.x) + (pointF.y * pointF2.y);
    }

    /* renamed from: b */
    public static float m44757b(C62441br brVar, PointF pointF) {
        float cos = (float) Math.cos((double) brVar.f168615f);
        float sin = (float) Math.sin((double) brVar.f168615f);
        return (Math.abs(m44756a(new PointF(cos, sin), pointF)) * brVar.f168613d) + (Math.abs(m44756a(new PointF(-sin, cos), pointF)) * brVar.f168614e);
    }

    /* renamed from: c */
    public static PointF m44758c(C62488dk dkVar) {
        return new PointF(dkVar.f168702b, dkVar.f168703c);
    }

    /* renamed from: d */
    public static RectF m44759d(C62441br brVar) {
        PointF pointF = new PointF(brVar.f168611b - (brVar.f168613d / 2.0f), brVar.f168612c - (brVar.f168614e / 2.0f));
        PointF pointF2 = new PointF(brVar.f168611b + (brVar.f168613d / 2.0f), brVar.f168612c + (brVar.f168614e / 2.0f));
        return new RectF(pointF.x, pointF.y, pointF2.x, pointF2.y);
    }

    /* renamed from: e */
    public static C58485gu m44760e(List list) {
        C58480gp e = C58485gu.m89837e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e.mo55395g(m44758c((C62488dk) it.next()));
        }
        return e.mo55394f();
    }

    /* renamed from: f */
    public static C62441br m44761f(C62491dn dnVar) {
        float f = Float.MAX_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = -3.4028235E38f;
        float f4 = -3.4028235E38f;
        for (C62488dk dkVar : dnVar.f168713b) {
            f = Math.min(f, dkVar.f168702b);
            f3 = Math.max(f3, dkVar.f168702b);
            f2 = Math.min(f2, dkVar.f168703c);
            f4 = Math.max(f4, dkVar.f168703c);
        }
        C62440bq bqVar = (C62440bq) C62441br.f168608h.createBuilder();
        bqVar.copyOnWrite();
        C62441br brVar = (C62441br) bqVar.instance;
        int i = 1;
        brVar.f168610a |= 1;
        brVar.f168611b = (f + f3) / 2.0f;
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 2;
        brVar2.f168612c = (f2 + f4) / 2.0f;
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 4;
        brVar3.f168613d = f3 - f;
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 8;
        brVar4.f168614e = f4 - f2;
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168610a |= 16;
        brVar5.f168615f = 0.0f;
        int a = C62580n.m94802a(dnVar.f168715d);
        if (a != 0) {
            i = a;
        }
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168616g = i - 1;
        brVar6.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: g */
    public static C62441br m44762g(C62441br brVar, Size size) {
        int a = C62580n.m94802a(brVar.f168616g);
        if (a == 0 || a != 2) {
            return brVar;
        }
        C62440bq bqVar = (C62440bq) brVar.toBuilder();
        float f = brVar.f168611b;
        int width = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 1;
        brVar2.f168611b = f * ((float) width);
        float f2 = brVar.f168612c;
        int height = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 2;
        brVar3.f168612c = f2 * ((float) height);
        float f3 = brVar.f168613d;
        int width2 = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 4;
        brVar4.f168613d = f3 * ((float) width2);
        float f4 = brVar.f168614e;
        int height2 = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168610a |= 8;
        brVar5.f168614e = f4 * ((float) height2);
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168616g = 2;
        brVar6.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: h */
    public static C62441br m44763h(C62441br brVar, Size size) {
        int a = C62580n.m94802a(brVar.f168616g);
        if (a == 0 || a != 3) {
            return brVar;
        }
        C62440bq bqVar = (C62440bq) brVar.toBuilder();
        float f = brVar.f168611b;
        int width = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar2 = (C62441br) bqVar.instance;
        brVar2.f168610a |= 1;
        brVar2.f168611b = f / ((float) width);
        float f2 = brVar.f168612c;
        int height = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar3 = (C62441br) bqVar.instance;
        brVar3.f168610a |= 2;
        brVar3.f168612c = f2 / ((float) height);
        float f3 = brVar.f168613d;
        int width2 = size.getWidth();
        bqVar.copyOnWrite();
        C62441br brVar4 = (C62441br) bqVar.instance;
        brVar4.f168610a |= 4;
        brVar4.f168613d = f3 / ((float) width2);
        float f4 = brVar.f168614e;
        int height2 = size.getHeight();
        bqVar.copyOnWrite();
        C62441br brVar5 = (C62441br) bqVar.instance;
        brVar5.f168610a |= 8;
        brVar5.f168614e = f4 / ((float) height2);
        bqVar.copyOnWrite();
        C62441br brVar6 = (C62441br) bqVar.instance;
        brVar6.f168616g = 1;
        brVar6.f168610a |= 32;
        return (C62441br) bqVar.build();
    }

    /* renamed from: i */
    public static C62488dk m44764i(C62488dk dkVar, C62441br brVar) {
        float f = (dkVar.f168702b * brVar.f168613d) / 2.0f;
        float f2 = (dkVar.f168703c * brVar.f168614e) / 2.0f;
        double d = (double) brVar.f168615f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        float f3 = brVar.f168611b;
        float f4 = brVar.f168612c;
        C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
        djVar.copyOnWrite();
        C62488dk dkVar2 = (C62488dk) djVar.instance;
        dkVar2.f168701a |= 1;
        dkVar2.f168702b = ((cos * f) - (sin * f2)) + f3;
        djVar.copyOnWrite();
        C62488dk dkVar3 = (C62488dk) djVar.instance;
        dkVar3.f168701a |= 2;
        dkVar3.f168703c = (sin * f) + (cos * f2) + f4;
        return (C62488dk) djVar.build();
    }

    /* renamed from: j */
    public static C62491dn m44765j(C62491dn dnVar, Size size) {
        int a = C62580n.m94802a(dnVar.f168715d);
        if (a == 0 || a != 2) {
            return dnVar;
        }
        C62486di diVar = (C62486di) dnVar.toBuilder();
        diVar.copyOnWrite();
        ((C62491dn) diVar.instance).f168713b = C62491dn.emptyProtobufList();
        for (C62488dk dkVar : dnVar.f168713b) {
            C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
            float f = dkVar.f168702b;
            int width = size.getWidth();
            djVar.copyOnWrite();
            C62488dk dkVar2 = (C62488dk) djVar.instance;
            dkVar2.f168701a |= 1;
            dkVar2.f168702b = f * ((float) width);
            float f2 = dkVar.f168703c;
            int height = size.getHeight();
            djVar.copyOnWrite();
            C62488dk dkVar3 = (C62488dk) djVar.instance;
            dkVar3.f168701a |= 2;
            dkVar3.f168703c = f2 * ((float) height);
            diVar.mo58500c((C62488dk) djVar.build());
        }
        diVar.copyOnWrite();
        C62491dn dnVar2 = (C62491dn) diVar.instance;
        dnVar2.f168715d = 2;
        dnVar2.f168712a |= 2;
        return (C62491dn) diVar.build();
    }

    /* renamed from: k */
    public static C62491dn m44766k(C58485gu guVar) {
        C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
        if (guVar.size() % 2 == 0) {
            for (int i = 0; i < guVar.size() / 2; i++) {
                C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
                int i2 = i + i;
                float floatValue = ((Float) guVar.get(i2)).floatValue();
                djVar.copyOnWrite();
                C62488dk dkVar = (C62488dk) djVar.instance;
                dkVar.f168701a |= 1;
                dkVar.f168702b = floatValue;
                float floatValue2 = ((Float) guVar.get(i2 + 1)).floatValue();
                djVar.copyOnWrite();
                C62488dk dkVar2 = (C62488dk) djVar.instance;
                dkVar2.f168701a |= 2;
                dkVar2.f168703c = floatValue2;
                diVar.mo58499b(djVar);
            }
            C62490dm dmVar = C62490dm.COUNTER_CLOCKWISE;
            diVar.copyOnWrite();
            C62491dn dnVar = (C62491dn) diVar.instance;
            dnVar.f168714c = dmVar.f168709d;
            dnVar.f168712a |= 1;
            diVar.copyOnWrite();
            C62491dn dnVar2 = (C62491dn) diVar.instance;
            dnVar2.f168715d = 1;
            dnVar2.f168712a |= 2;
        }
        return (C62491dn) diVar.build();
    }
}
