package com.google.android.libraries.lens.view.p2154p.p2155a;

import android.graphics.PointF;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60752i;
import com.google.lens.p4699e.C62231l;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62487dj;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;
import com.google.lens.p4707j.C62580n;

/* renamed from: com.google.android.libraries.lens.view.p.a.i */
/* compiled from: PG */
public abstract class C27539i {

    /* renamed from: a */
    public static final C58495hd f75327a;

    /* renamed from: b */
    private static final C59071e f75328b = C59071e.m91332i("com.google.android.libraries.lens.view.p.a.i");

    static {
        C62490dm dmVar = C62490dm.CLOCKWISE;
        C62490dm dmVar2 = C62490dm.COUNTER_CLOCKWISE;
        C62490dm dmVar3 = C62490dm.CLOCKWISE;
        C62490dm dmVar4 = C62490dm.VERTEX_ORDERING_UNSPECIFIED;
        f75327a = C58495hd.m89902p(dmVar, dmVar2, dmVar2, dmVar3, dmVar4, dmVar4);
    }

    /* renamed from: e */
    static int m51289e(int i) {
        return (i + 1) % 4;
    }

    /* renamed from: g */
    public static C27539i m51290g(C62491dn dnVar, C27540j jVar, float f) {
        C58838bb.m90868c(dnVar.f168713b.size() == 4);
        C27531a aVar = new C27531a();
        aVar.mo33077c(dnVar);
        if (jVar != null) {
            aVar.f75304a = jVar;
            aVar.mo33076b(f);
            return aVar.mo33075a();
        }
        throw new NullPointerException("Null size");
    }

    /* renamed from: h */
    public static C27539i m51291h(C62231l lVar) {
        boolean z = false;
        C58838bb.m90868c(1 == (lVar.f168025a & 1));
        C62491dn dnVar = lVar.f168026b;
        if (dnVar == null) {
            dnVar = C62491dn.f168710e;
        }
        int a = C62580n.m94802a(dnVar.f168715d);
        if (a != 0 && a == 2) {
            z = true;
        }
        C58838bb.m90868c(z);
        C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
        diVar.copyOnWrite();
        C62491dn dnVar2 = (C62491dn) diVar.instance;
        dnVar2.f168715d = 1;
        dnVar2.f168712a |= 2;
        C62491dn dnVar3 = lVar.f168026b;
        if (dnVar3 == null) {
            dnVar3 = C62491dn.f168710e;
        }
        for (C62488dk dkVar : dnVar3.f168713b) {
            C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
            float j = m51293j(dkVar.f168702b);
            djVar.copyOnWrite();
            C62488dk dkVar2 = (C62488dk) djVar.instance;
            dkVar2.f168701a |= 1;
            dkVar2.f168702b = j;
            float j2 = m51293j(dkVar.f168703c);
            djVar.copyOnWrite();
            C62488dk dkVar3 = (C62488dk) djVar.instance;
            dkVar3.f168701a |= 2;
            dkVar3.f168703c = j2;
            diVar.mo58500c((C62488dk) djVar.build());
        }
        C27531a aVar = new C27531a();
        aVar.mo33077c((C62491dn) diVar.build());
        aVar.mo33076b(lVar.f168027c);
        aVar.f75304a = new C27533c(1, 1);
        return aVar.mo33075a();
    }

    /* renamed from: i */
    public static boolean m51292i(PointF[] pointFArr) {
        for (int i = 0; i < pointFArr.length; i++) {
            PointF pointF = pointFArr[(i + 3) % 4];
            PointF pointF2 = pointFArr[m51289e(i)];
            PointF pointF3 = pointFArr[i];
            float degrees = (float) Math.toDegrees((double) (((float) Math.atan2((double) (pointF2.y - pointF3.y), (double) (pointF2.x - pointF3.x))) - ((float) Math.atan2((double) (pointF.y - pointF3.y), (double) (pointF.x - pointF3.x)))));
            if (degrees < 0.0f) {
                degrees += 360.0f;
            }
            ((C59052c) ((C59052c) f75328b.mo56224b()).mo56372aa(49306)).mo56392v("isConvex() angle %d: %f", i, degrees);
            if (degrees > 170.0f || degrees < 0.0f) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private static float m51293j(float f) {
        return C60752i.m92727a(f, 0.0f, 1.0f);
    }

    /* renamed from: a */
    public abstract float mo33078a();

    /* renamed from: b */
    public abstract C27540j mo33079b();

    /* renamed from: c */
    public abstract C62491dn mo33080c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final float mo33095d(float f) {
        double d = (double) f;
        Double.isNaN(d);
        return (float) ((Math.hypot((double) mo33079b().mo33085b(), (double) mo33079b().mo33084a()) * 0.05000000074505806d) / d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C27539i mo33096f(int i, float f, float f2) {
        float max = Math.max(Math.min(f, (float) mo33079b().mo33085b()), 0.0f);
        float max2 = Math.max(Math.min(f2, (float) mo33079b().mo33084a()), 0.0f);
        C62486di diVar = (C62486di) mo33080c().toBuilder();
        C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
        djVar.copyOnWrite();
        C62488dk dkVar = (C62488dk) djVar.instance;
        dkVar.f168701a |= 1;
        dkVar.f168702b = max;
        djVar.copyOnWrite();
        C62488dk dkVar2 = (C62488dk) djVar.instance;
        dkVar2.f168701a |= 2;
        dkVar2.f168703c = max2;
        diVar.copyOnWrite();
        C62491dn dnVar = (C62491dn) diVar.instance;
        C62488dk dkVar3 = (C62488dk) djVar.build();
        dkVar3.getClass();
        dnVar.mo58502a();
        dnVar.f168713b.set(i, dkVar3);
        return m51290g((C62491dn) diVar.build(), mo33079b(), mo33078a());
    }
}
