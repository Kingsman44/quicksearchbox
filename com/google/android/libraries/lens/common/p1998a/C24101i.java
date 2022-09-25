package com.google.android.libraries.lens.common.p1998a;

import android.graphics.PointF;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62486di;
import com.google.lens.p4707j.C62488dk;
import com.google.lens.p4707j.C62490dm;
import com.google.lens.p4707j.C62491dn;
import com.google.lens.p4707j.C62580n;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.google.android.libraries.lens.common.a.i */
/* compiled from: PG */
public final class C24101i {

    /* renamed from: a */
    private static final C59071e f65807a = C59071e.m91332i("com.google.android.libraries.lens.common.a.i");

    /* renamed from: a */
    public static PointF m44774a(C62491dn dnVar) {
        C58838bb.m90868c(dnVar.f168713b.size() == 4);
        PointF c = C24095c.m44758c((C62488dk) dnVar.f168713b.get(0));
        PointF c2 = C24095c.m44758c((C62488dk) dnVar.f168713b.get(2));
        PointF c3 = C24095c.m44758c((C62488dk) dnVar.f168713b.get(1));
        PointF c4 = C24095c.m44758c((C62488dk) dnVar.f168713b.get(3));
        float f = ((c.x - c2.x) * (c3.y - c4.y)) - ((c.y - c2.y) * (c3.x - c4.x));
        return new PointF(((((c.x * c2.y) - (c.y * c2.x)) * (c3.x - c4.x)) - ((c.x - c2.x) * ((c3.x * c4.y) - (c3.y * c4.x)))) / f, ((((c.x * c2.y) - (c.y * c2.x)) * (c3.y - c4.y)) - ((c.y - c2.y) * ((c3.x * c4.y) - (c3.y * c4.x)))) / f);
    }

    /* renamed from: b */
    public static C62491dn m44775b(C62491dn dnVar) {
        C62488dk dkVar;
        C62488dk dkVar2;
        C62488dk dkVar3;
        C62488dk dkVar4;
        C58838bb.m90868c(dnVar.f168713b.size() == 4);
        ArrayList arrayList = new ArrayList(dnVar.f168713b);
        Collections.sort(arrayList, new C24100h());
        if (((C62488dk) arrayList.get(0)).f168702b < ((C62488dk) arrayList.get(1)).f168702b) {
            dkVar2 = (C62488dk) arrayList.get(0);
            dkVar = (C62488dk) arrayList.get(1);
        } else {
            dkVar2 = (C62488dk) arrayList.get(1);
            dkVar = (C62488dk) arrayList.get(0);
        }
        if (((C62488dk) arrayList.get(2)).f168702b < ((C62488dk) arrayList.get(3)).f168702b) {
            dkVar3 = (C62488dk) arrayList.get(2);
            dkVar4 = (C62488dk) arrayList.get(3);
        } else {
            dkVar3 = (C62488dk) arrayList.get(3);
            dkVar4 = (C62488dk) arrayList.get(2);
        }
        C62486di diVar = (C62486di) C62491dn.f168710e.createBuilder();
        diVar.mo58500c(dkVar3);
        diVar.mo58500c(dkVar2);
        diVar.mo58500c(dkVar);
        diVar.mo58500c(dkVar4);
        int a = C62580n.m94802a(dnVar.f168715d);
        if (a == 0) {
            a = 1;
        }
        diVar.copyOnWrite();
        C62491dn dnVar2 = (C62491dn) diVar.instance;
        dnVar2.f168715d = a - 1;
        dnVar2.f168712a |= 2;
        C62490dm dmVar = C62490dm.COUNTER_CLOCKWISE;
        diVar.copyOnWrite();
        C62491dn dnVar3 = (C62491dn) diVar.instance;
        dnVar3.f168714c = dmVar.f168709d;
        dnVar3.f168712a |= 1;
        C62491dn dnVar4 = (C62491dn) diVar.build();
        ((C59052c) ((C59052c) f65807a.mo56224b()).mo56372aa(48714)).mo56389s("Computed ordered quad: %s", dnVar4);
        return dnVar4;
    }

    /* renamed from: c */
    public static float[] m44776c(C62491dn dnVar) {
        C58838bb.m90868c(dnVar.f168713b.size() == 4);
        float[] fArr = new float[8];
        for (int i = 0; i < 4; i++) {
            int i2 = i + i;
            fArr[i2] = ((C62488dk) dnVar.f168713b.get(i)).f168702b;
            fArr[i2 + 1] = ((C62488dk) dnVar.f168713b.get(i)).f168703c;
        }
        return fArr;
    }
}
