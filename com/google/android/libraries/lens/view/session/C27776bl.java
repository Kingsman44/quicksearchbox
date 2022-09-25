package com.google.android.libraries.lens.view.session;

import com.google.android.libraries.lens.p2014e.C24213e;
import com.google.android.libraries.lens.p2014e.C24230v;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.main.C27301ar;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.abp;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56251be;

/* renamed from: com.google.android.libraries.lens.view.session.bl */
/* compiled from: PG */
public abstract class C27776bl implements C27777bm {
    /* renamed from: g */
    public static C27775bk m51710g() {
        C27789i iVar = new C27789i();
        iVar.mo33284c(C24231w.UNKNOWN);
        return iVar;
    }

    /* renamed from: a */
    public abstract C58485gu mo33286a();

    /* renamed from: b */
    public abstract C56226ag mo33287b();

    /* renamed from: c */
    public abstract C24231w mo33256c();

    /* renamed from: d */
    public abstract boolean mo33257d();

    /* renamed from: e */
    public final /* synthetic */ int mo33258e() {
        return 1;
    }

    /* renamed from: f */
    public final C58485gu mo33259f() {
        return C58485gu.m89845m();
    }

    /* renamed from: h */
    public final int mo33260h() {
        return 2;
    }

    /* renamed from: i */
    public final C27777bm mo33261i(C27301ar arVar) {
        return this;
    }

    /* renamed from: j */
    public final C24233y mo33262j(C56251be beVar, boolean z, C60214n nVar, abp abp, int i, int i2) {
        C56226ag b = mo33287b();
        C58485gu a = mo33286a();
        C24230v p = C24233y.m45227p(2);
        p.mo29750a(b);
        ((C24213e) p).f66187d = C58833ax.m90833j(a);
        return C27768bd.m51652b(p, this, beVar, z, nVar, abp, i, i2);
    }

    /* renamed from: k */
    public final int mo33263k() {
        return 1;
    }
}
