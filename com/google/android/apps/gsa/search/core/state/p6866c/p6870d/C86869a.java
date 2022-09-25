package com.google.android.apps.gsa.search.core.state.p6866c.p6870d;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86364b;
import com.google.android.apps.gsa.search.core.state.C86812ai;
import com.google.android.apps.gsa.search.core.state.C86854bw;
import com.google.android.apps.gsa.search.core.state.C86903cy;
import com.google.android.apps.gsa.search.core.state.C87052fn;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.knowledge.p4682d.C61995f;
import com.google.p4500cm.p4514b.C58170d;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.c.d.a */
/* compiled from: PG */
public final class C86869a extends C86354a implements C86364b {

    /* renamed from: a */
    private final Query f234597a;

    /* renamed from: b */
    private final C86854bw f234598b;

    /* renamed from: c */
    private final C87052fn f234599c;

    /* renamed from: d */
    private final C86903cy f234600d;

    public C86869a(Query query, C86854bw bwVar, C87052fn fnVar, C86903cy cyVar) {
        this.f234597a = query;
        this.f234598b = bwVar;
        this.f234599c = fnVar;
        this.f234600d = cyVar;
    }

    /* renamed from: a */
    public final void mo80128a(C58833ax axVar) {
        C86854bw bwVar = this.f234598b;
        Query query = this.f234597a;
        C87052fn fnVar = (C87052fn) bwVar.f234571c.mo27525b();
        if (fnVar.f235177m.mo84383cP(query) && ((C86812ai) bwVar.f234570b.mo27525b()).f234471a.mo81873C() && !fnVar.f235184t.mo80681k(fnVar.f235177m)) {
            fnVar.f235184t.mo80676f(ActionData.f235991b);
            boolean g = bwVar.mo80542g(fnVar);
            bwVar.mo80540e((C58170d) axVar.mo56111f());
            if (g) {
                bwVar.mo80591ar();
            }
        }
    }

    /* renamed from: b */
    public final void mo80129b(List list) {
    }

    /* renamed from: c */
    public final void mo80130c(String str) {
        C87052fn fnVar = this.f234599c;
        Query query = this.f234597a;
        C58838bb.m90883r(query.mo84435dP());
        if (fnVar.f235177m.mo84383cP(query) && !TextUtils.equals(fnVar.f235177m.mo84347bf("android.search.extra.EVENT_ID"), str)) {
            Query ar = fnVar.f235177m.mo84306ar(str);
            C58976aa aaVar = C58975e.f156826a;
            fnVar.f235177m = fnVar.mo80712n(ar);
        }
    }

    /* renamed from: d */
    public final void mo80131d(C58833ax axVar) {
        C86903cy cyVar = this.f234600d;
        Query query = this.f234597a;
        C58838bb.m90883r(query.mo84435dP());
        if (cyVar.f234678a.mo84383cP(query)) {
            cyVar.f234680c = (C61995f) axVar.mo56111f();
            cyVar.mo80591ar();
        }
    }

    /* renamed from: e */
    public final void mo80132e(long j) {
        this.f234600d.mo80591ar();
    }

    /* renamed from: f */
    public final void mo80133f(C58833ax axVar) {
        this.f234600d.mo80563e(this.f234597a, axVar);
    }

    /* renamed from: g */
    public final void mo80134g(Query query, Query query2) {
        C86903cy cyVar = this.f234600d;
        C58838bb.m90883r(query.mo84435dP());
        if (cyVar.f234678a.mo84383cP(query) && cyVar.f234682e != query2) {
            cyVar.f234682e = query2;
            cyVar.mo80591ar();
        }
    }
}
