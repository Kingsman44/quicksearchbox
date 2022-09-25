package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;
import com.google.common.p4522b.C58485gu;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62487dj;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;

/* renamed from: com.google.android.libraries.lens.common.a.g */
/* compiled from: PG */
public final class C24099g {
    /* renamed from: a */
    public static C62486di m44772a(C62491dn dnVar, float f, float f2) {
        C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
        C62490dm a = C62490dm.m94786a(dnVar.f168714c);
        if (a == null) {
            a = C62490dm.VERTEX_ORDERING_UNSPECIFIED;
        }
        diVar.copyOnWrite();
        C62491dn dnVar2 = (C62491dn) diVar.instance;
        dnVar2.f168714c = a.f168709d;
        dnVar2.f168712a |= 1;
        for (C62488dk dkVar : dnVar.f168713b) {
            C62487dj djVar = (C62487dj) C62488dk.f168699d.createBuilder();
            float f3 = dkVar.f168702b;
            djVar.copyOnWrite();
            C62488dk dkVar2 = (C62488dk) djVar.instance;
            dkVar2.f168701a |= 1;
            dkVar2.f168702b = f3 * f;
            float f4 = dkVar.f168703c;
            djVar.copyOnWrite();
            C62488dk dkVar3 = (C62488dk) djVar.instance;
            dkVar3.f168701a |= 2;
            dkVar3.f168703c = f4 * f2;
            diVar.mo58499b(djVar);
        }
        return diVar;
    }

    /* renamed from: b */
    public static boolean m44773b(C62491dn dnVar, PointF pointF) {
        if (dnVar.f168713b.size() >= 3) {
            C58485gu e = C24095c.m44760e(dnVar.f168713b);
            PointF pointF2 = new PointF(1.0E9f, pointF.y);
            int i = 0;
            int i2 = 0;
            while (i < dnVar.f168713b.size()) {
                int i3 = i + 1;
                int size = i3 % dnVar.f168713b.size();
                if (C24098f.m44769a((PointF) e.get(i), (PointF) e.get(size), pointF, pointF2)) {
                    if (C24098f.m44771c((PointF) e.get(i), pointF, (PointF) e.get(size)) == 1) {
                        return C24098f.m44770b((PointF) e.get(i), pointF, (PointF) e.get(size));
                    }
                    i2++;
                }
                i = i3;
            }
            if (i2 % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
