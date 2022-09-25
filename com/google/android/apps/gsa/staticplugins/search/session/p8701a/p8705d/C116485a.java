package com.google.android.apps.gsa.staticplugins.search.session.p8701a.p8705d;

import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.C86354a;
import com.google.android.apps.gsa.search.core.p6820r.p6821a.p6825d.C86364b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116569ag;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116593bd;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116628cl;
import com.google.android.apps.gsa.staticplugins.search.session.state.C116735gk;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.knowledge.p4682d.C61995f;
import com.google.p4500cm.p4514b.C58170d;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.a.d.a */
/* compiled from: PG */
public final class C116485a extends C86354a implements C86364b {

    /* renamed from: a */
    private final Query f322964a;

    /* renamed from: b */
    private final C116593bd f322965b;

    /* renamed from: c */
    private final C116735gk f322966c;

    /* renamed from: d */
    private final C116628cl f322967d;

    public C116485a(Query query, C116593bd bdVar, C116735gk gkVar, C116628cl clVar) {
        this.f322964a = query;
        this.f322965b = bdVar;
        this.f322966c = gkVar;
        this.f322967d = clVar;
    }

    /* renamed from: a */
    public final void mo80128a(C58833ax axVar) {
        C116593bd bdVar = this.f322965b;
        Query query = this.f322964a;
        C116735gk gkVar = (C116735gk) bdVar.f323344c.mo27525b();
        if (gkVar.f323784p.mo84383cP(query) && ((C116569ag) bdVar.f323343b.mo27525b()).f323267a.mo81873C() && !gkVar.mo102874O()) {
            gkVar.f323791w.mo102862m(ActionData.f235991b);
            boolean k = bdVar.mo102791k(gkVar);
            bdVar.mo102789i((C58170d) axVar.mo56111f());
            if (k) {
                bdVar.mo80591ar();
            }
        }
    }

    /* renamed from: b */
    public final void mo80129b(List list) {
        C116628cl clVar = this.f322967d;
        Query query = this.f322964a;
        C58838bb.m90883r(query.mo84435dP());
        if (clVar.f323450a.mo84383cP(query)) {
            clVar.f323454e = list;
            clVar.mo80591ar();
        }
    }

    /* renamed from: c */
    public final void mo80130c(String str) {
        C116735gk gkVar = this.f322966c;
        Query query = this.f322964a;
        C58838bb.m90883r(query.mo84435dP());
        if (gkVar.f323784p.mo84383cP(query) && !TextUtils.equals(gkVar.f323784p.mo84347bf("android.search.extra.EVENT_ID"), str)) {
            gkVar.mo102873N(gkVar.f323784p.mo84306ar(str));
        }
    }

    /* renamed from: d */
    public final void mo80131d(C58833ax axVar) {
        C116628cl clVar = this.f322967d;
        Query query = this.f322964a;
        C58838bb.m90883r(query.mo84435dP());
        if (clVar.f323450a.mo84383cP(query)) {
            clVar.f323452c = (C61995f) axVar.mo56111f();
            clVar.mo80591ar();
        }
    }

    /* renamed from: e */
    public final void mo80132e(long j) {
        C116628cl clVar = this.f322967d;
        clVar.f323457h = Long.valueOf(j);
        clVar.mo80591ar();
    }

    /* renamed from: f */
    public final void mo80133f(C58833ax axVar) {
        this.f322967d.mo102809i(this.f322964a, axVar);
    }

    /* renamed from: g */
    public final void mo80134g(Query query, Query query2) {
        C116628cl clVar = this.f322967d;
        C58838bb.m90883r(query.mo84435dP());
        if (clVar.f323450a.mo84383cP(query) && clVar.f323455f != query2) {
            clVar.f323455f = query2;
            clVar.mo80591ar();
        }
    }
}
