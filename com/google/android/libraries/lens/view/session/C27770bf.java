package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24213e;
import com.google.android.libraries.lens.p2014e.C24230v;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.main.C27301ar;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.abp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;

/* renamed from: com.google.android.libraries.lens.view.session.bf */
/* compiled from: PG */
public abstract class C27770bf implements C27777bm {
    /* renamed from: g */
    public static C27769be m51660g() {
        C27783c cVar = new C27783c();
        cVar.mo33251e(C24231w.UNKNOWN);
        cVar.f75790b = 1;
        return cVar;
    }

    /* renamed from: a */
    public abstract float mo33254a();

    /* renamed from: b */
    public abstract RectF mo33255b();

    /* renamed from: c */
    public abstract C24231w mo33256c();

    /* renamed from: d */
    public abstract boolean mo33257d();

    /* renamed from: e */
    public abstract int mo33258e();

    /* renamed from: f */
    public final C58485gu mo33259f() {
        return C58485gu.m89845m();
    }

    /* renamed from: h */
    public final int mo33260h() {
        return 3;
    }

    /* renamed from: i */
    public final C27777bm mo33261i(C27301ar arVar) {
        return this;
    }

    /* renamed from: j */
    public final C24233y mo33262j(C56251be beVar, boolean z, C60214n nVar, abp abp, int i, int i2) {
        RectF b = mo33255b();
        C24230v p = C24233y.m45227p(3);
        C24213e eVar = (C24213e) p;
        eVar.f66188e = C58833ax.m90833j(b);
        eVar.f66189f = C58833ax.m90833j(Float.valueOf(mo33254a()));
        return C27768bd.m51652b(p, this, beVar, z, nVar, abp, i, i2);
    }

    /* renamed from: k */
    public final int mo33263k() {
        return 1;
    }
}
