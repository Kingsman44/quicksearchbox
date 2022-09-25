package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6159c;

import com.google.android.apps.gsa.shared.p6983ah.C89153j;
import com.google.android.apps.gsa.shared.p6983ah.C89154k;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.c.b */
/* compiled from: PG */
public abstract class C78224b {

    /* renamed from: a */
    public static final C78224b f215366a = new C78188a(false, false, false, C89158o.f241716c, C89154k.f241700e);

    /* renamed from: a */
    public abstract C89154k mo73120a();

    /* renamed from: b */
    public abstract C89158o mo73121b();

    /* renamed from: c */
    public abstract boolean mo73122c();

    /* renamed from: d */
    public abstract boolean mo73123d();

    /* renamed from: e */
    public abstract boolean mo73124e();

    /* renamed from: f */
    public final C78224b mo73143f() {
        return new C78188a(mo73124e(), false, true, mo73121b(), mo73120a());
    }

    /* renamed from: h */
    public final C78224b mo73145h(C89154k kVar) {
        return new C78188a(mo73124e(), mo73123d(), mo73122c(), mo73121b(), kVar);
    }

    /* renamed from: i */
    public final boolean mo73146i() {
        if (!mo73148k(C89160q.DEMAND_STATE)) {
            return false;
        }
        int a = C89153j.m145039a(mo73120a().f241704c);
        if (a == 0) {
            a = 1;
        }
        return a == 4 || a == 3 || a == 5;
    }

    /* renamed from: j */
    public final boolean mo73147j() {
        return mo73124e() || mo73123d();
    }

    /* renamed from: k */
    public final boolean mo73148k(C89160q qVar) {
        if (!mo73147j()) {
            return false;
        }
        C89160q a = C89160q.m145040a(mo73121b().f241719b);
        if (a == null) {
            a = C89160q.UNKNOWN;
        }
        return a.equals(qVar);
    }

    /* renamed from: g */
    public final C78224b mo73144g(boolean z) {
        if (mo73122c() && z) {
            return mo73143f();
        }
        return new C78188a(mo73124e(), z, false, mo73121b(), mo73120a());
    }
}
