package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.C24213e;
import com.google.android.libraries.lens.p2014e.C24230v;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.main.C27301ar;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26765q;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.abp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;

/* renamed from: com.google.android.libraries.lens.view.session.bh */
/* compiled from: PG */
public abstract class C27772bh implements C27777bm {
    /* renamed from: g */
    public static C27771bg m51678g() {
        C27785e eVar = new C27785e();
        eVar.mo33266c(C24231w.UNKNOWN);
        eVar.mo33269f(C58485gu.m89845m());
        return eVar;
    }

    /* renamed from: a */
    public abstract PointF mo33271a();

    /* renamed from: b */
    public abstract C27771bg mo33272b();

    /* renamed from: c */
    public abstract C24231w mo33256c();

    /* renamed from: d */
    public abstract boolean mo33257d();

    /* renamed from: e */
    public final /* synthetic */ int mo33258e() {
        return 1;
    }

    /* renamed from: f */
    public abstract C58485gu mo33259f();

    /* renamed from: h */
    public final int mo33260h() {
        return 1;
    }

    /* renamed from: i */
    public final C27777bm mo33261i(C27301ar arVar) {
        if (mo33257d()) {
            return this;
        }
        C27771bg b = mo33272b();
        PointF a = mo33271a();
        C26765q qVar = arVar.f74711a.f74766L;
        if (qVar != null) {
            a = qVar.mo32112b(a);
        }
        b.mo33268e(a);
        return b.mo33270g();
    }

    /* renamed from: j */
    public final C24233y mo33262j(C56251be beVar, boolean z, C60214n nVar, abp abp, int i, int i2) {
        PointF a = mo33271a();
        C24230v p = C24233y.m45227p(1);
        ((C24213e) p).f66185b = C58833ax.m90833j(a);
        return C27768bd.m51652b(p, this, beVar, z, nVar, abp, i, i2);
    }

    /* renamed from: k */
    public final int mo33263k() {
        return 4;
    }
}
