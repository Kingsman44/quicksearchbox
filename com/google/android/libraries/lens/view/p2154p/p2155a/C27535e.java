package com.google.android.libraries.lens.view.p2154p.p2155a;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.view.p.a.e */
/* compiled from: PG */
public final class C27535e {

    /* renamed from: a */
    public static final C59071e f75314a = C59071e.m91332i("com.google.android.libraries.lens.view.p.a.e");

    /* renamed from: b */
    public C27539i f75315b;

    /* renamed from: c */
    public C27540j f75316c;

    /* renamed from: d */
    public C27539i f75317d;

    /* renamed from: e */
    public int f75318e;

    /* renamed from: f */
    public int f75319f;

    /* renamed from: g */
    public final Matrix f75320g = new Matrix();

    /* renamed from: h */
    public final Matrix f75321h = new Matrix();

    /* renamed from: i */
    public boolean[] f75322i;

    /* renamed from: j */
    private int f75323j = -1;

    /* renamed from: k */
    private int f75324k = -1;

    /* renamed from: l */
    private PointF f75325l;

    /* renamed from: a */
    public final void mo33089a() {
        ((C59052c) ((C59052c) f75314a.mo56224b()).mo56372aa(49301)).mo56386p("Reset Touch State");
        this.f75323j = -1;
        this.f75324k = -1;
        this.f75325l = null;
    }

    /* renamed from: b */
    public final boolean mo33090b() {
        return (this.f75315b == null || this.f75316c == null) ? false : true;
    }

    /* renamed from: c */
    public final boolean mo33091c() {
        return mo33092d() || mo33093e();
    }

    /* renamed from: d */
    public final boolean mo33092d() {
        return this.f75323j != -1;
    }

    /* renamed from: e */
    public final boolean mo33093e() {
        return this.f75324k != -1;
    }

    /* renamed from: f */
    public final boolean mo33094f(float f, float f2, float f3) {
        C27539i iVar;
        float f4 = f3;
        if (!mo33090b() || f < 0.0f || f > ((float) this.f75318e) || f2 < 0.0f || f2 > ((float) this.f75319f)) {
            return false;
        }
        C59071e eVar = f75314a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(49303)).mo56360M("touched (%f, %f), editing corner: %s,  editing edge: %s", Float.valueOf(f), Float.valueOf(f2), Boolean.valueOf(mo33092d()), Boolean.valueOf(mo33093e()));
        float[] fArr = {f, f2};
        this.f75321h.mapPoints(fArr);
        PointF pointF = new PointF(fArr[0], fArr[1]);
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(49304)).mo56390t("touched %f %f", pointF.x, pointF.y);
        if (!mo33091c()) {
            C27539i iVar2 = this.f75315b;
            iVar2.getClass();
            float d = iVar2.mo33095d(f4);
            float f5 = Float.MAX_VALUE;
            int i = -1;
            float f6 = Float.MAX_VALUE;
            for (int i2 = 0; i2 < 4; i2++) {
                float b = C27537g.m51283b(((C62488dk) iVar2.mo33080c().f168713b.get(i2)).f168702b, ((C62488dk) iVar2.mo33080c().f168713b.get(i2)).f168703c, pointF.x, pointF.y);
                if (b < f6 && b < d) {
                    i = i2;
                    f6 = b;
                }
            }
            this.f75323j = i;
            if (!mo33092d()) {
                C27539i iVar3 = this.f75315b;
                iVar3.getClass();
                float d2 = iVar3.mo33095d(f4);
                PointF[] d3 = C27537g.m51285d(iVar3.mo33080c());
                int i3 = -1;
                for (int i4 = 0; i4 < d3.length; i4++) {
                    PointF pointF2 = d3[i4];
                    PointF pointF3 = d3[C27539i.m51289e(i4)];
                    PointF pointF4 = new PointF((pointF2.x + pointF3.x) / 2.0f, (pointF2.y + pointF3.y) / 2.0f);
                    float b2 = C27537g.m51283b(pointF4.x, pointF4.y, pointF.x, pointF.y);
                    float a = C27537g.m51282a(pointF2, pointF3);
                    float a2 = C27537g.m51282a(pointF2, pointF);
                    float a3 = C27537g.m51282a(pointF3, pointF);
                    if (b2 < f5 && b2 < d2 && a2 < a && a3 < a) {
                        f5 = b2;
                        i3 = i4;
                    }
                }
                this.f75324k = i3;
            }
        }
        if (!mo33091c()) {
            return false;
        }
        if (this.f75325l == null) {
            this.f75325l = pointF;
        }
        PointF pointF5 = new PointF(pointF.x - this.f75325l.x, pointF.y - this.f75325l.y);
        if (mo33092d()) {
            C27539i iVar4 = this.f75317d;
            iVar4.getClass();
            int i5 = this.f75323j;
            iVar = iVar4.mo33096f(i5, ((C62488dk) iVar4.mo33080c().f168713b.get(i5)).f168702b + pointF5.x, ((C62488dk) iVar4.mo33080c().f168713b.get(i5)).f168703c + pointF5.y);
        } else {
            C27539i iVar5 = this.f75317d;
            iVar5.getClass();
            int i6 = this.f75324k;
            float f7 = pointF5.x;
            float f8 = pointF5.y;
            int e = C27539i.m51289e(i6);
            C62488dk dkVar = (C62488dk) iVar5.mo33080c().f168713b.get(i6);
            C62488dk dkVar2 = (C62488dk) iVar5.mo33080c().f168713b.get(e);
            float f9 = dkVar2.f168702b - dkVar.f168702b;
            float f10 = dkVar2.f168703c - dkVar.f168703c;
            C62490dm a4 = C62490dm.m94786a(iVar5.mo33080c().f168714c);
            if (a4 == null) {
                a4 = C62490dm.VERTEX_ORDERING_UNSPECIFIED;
            }
            float f11 = a4 == C62490dm.COUNTER_CLOCKWISE ? 1.0f : -1.0f;
            float hypot = (float) Math.hypot((double) f9, (double) f10);
            float f12 = ((-f10) * f11) / hypot;
            float f13 = (f9 * f11) / hypot;
            float f14 = (f7 * f12) + (f8 * f13);
            float f15 = f12 * f14;
            float f16 = f13 * f14;
            iVar = iVar5.mo33096f(i6, dkVar.f168702b + f15, dkVar.f168703c + f16).mo33096f(e, dkVar2.f168702b + f15, dkVar2.f168703c + f16);
        }
        if (mo33092d()) {
            ((C59052c) ((C59052c) f75314a.mo56224b()).mo56372aa(49300)).mo56390t("Corner: %f %f", ((C62488dk) iVar.mo33080c().f168713b.get(this.f75323j)).f168702b, ((C62488dk) iVar.mo33080c().f168713b.get(this.f75323j)).f168703c);
        }
        if (!C27539i.m51292i(C27537g.m51285d(iVar.mo33080c()))) {
            C58480gp e2 = C58485gu.m89837e();
            for (int size = iVar.mo33080c().f168713b.size() - 1; size >= 0; size--) {
                e2.mo55395g((C62488dk) iVar.mo33080c().f168713b.get(size));
            }
            C62486di diVar = (C62486di) iVar.mo33080c().toBuilder();
            C58495hd hdVar = C27539i.f75327a;
            C62490dm a5 = C62490dm.m94786a(iVar.mo33080c().f168714c);
            if (a5 == null) {
                a5 = C62490dm.VERTEX_ORDERING_UNSPECIFIED;
            }
            diVar.copyOnWrite();
            C62491dn dnVar = (C62491dn) diVar.instance;
            dnVar.f168714c = ((C62490dm) hdVar.getOrDefault(a5, C62490dm.VERTEX_ORDERING_UNSPECIFIED)).f168709d;
            dnVar.f168712a |= 1;
            diVar.copyOnWrite();
            ((C62491dn) diVar.instance).f168713b = C62491dn.emptyProtobufList();
            diVar.mo58498a(e2.mo55394f());
            if (!C27539i.m51292i(C27537g.m51285d(C27539i.m51290g((C62491dn) diVar.build(), iVar.mo33079b(), iVar.mo33078a()).mo33080c()))) {
                return false;
            }
        }
        this.f75315b = iVar;
        if (mo33092d()) {
            this.f75322i[this.f75323j] = true;
            return true;
        }
        boolean[] zArr = this.f75322i;
        int i7 = this.f75324k;
        zArr[i7] = true;
        zArr[C27539i.m51289e(i7)] = true;
        return true;
    }
}
