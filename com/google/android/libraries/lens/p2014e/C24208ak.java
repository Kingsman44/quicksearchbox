package com.google.android.libraries.lens.p2014e;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.e.ak */
/* compiled from: PG */
public abstract class C24208ak {
    /* renamed from: e */
    public static C24208ak m45056e(C24201ad adVar) {
        if (!adVar.mo29682e().mo56113h()) {
            return m45057h(adVar.mo29680c(), C24229u.f66273o).mo29693a();
        }
        C24203af c = adVar.mo29680c();
        C24229u uVar = C24229u.f66273o;
        C24199ab abVar = C24199ab.f66140a;
        C24207aj h = m45057h(c, uVar);
        ((C24223o) h).f66259b = C58833ax.m90833j(abVar);
        return h.mo29693a();
    }

    /* renamed from: h */
    private static C24207aj m45057h(C24203af afVar, C24229u uVar) {
        C24223o oVar = new C24223o();
        if (afVar != null) {
            oVar.f66258a = afVar;
            oVar.mo29694b(uVar);
            return oVar;
        }
        throw new NullPointerException("Null queryId");
    }

    /* renamed from: a */
    public abstract C24229u mo29696a();

    /* renamed from: b */
    public abstract C24203af mo29697b();

    /* renamed from: c */
    public abstract C24207aj mo29698c();

    /* renamed from: d */
    public abstract C58833ax mo29699d();

    /* renamed from: f */
    public final boolean mo29700f() {
        return !mo29696a().equals(C24229u.f66273o);
    }

    /* renamed from: g */
    public final boolean mo29701g() {
        return mo29696a().mo29747n() && ((Boolean) mo29699d().mo56106b(C24206ai.f66141a).mo56109e(true)).booleanValue();
    }
}
