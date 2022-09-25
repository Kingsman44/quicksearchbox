package com.google.android.apps.gsa.searchbox.client.gsa.p6951a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89201f;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.corpora.C145885i;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.a.c */
/* compiled from: PG */
public final class C88630c implements C89196a, C89201f, C89200e {

    /* renamed from: a */
    final C145885i f239590a;

    /* renamed from: b */
    public Account f239591b;

    /* renamed from: c */
    public C90931ca f239592c;

    /* renamed from: d */
    C86051l f239593d = null;

    /* renamed from: e */
    C146006ab f239594e;

    /* renamed from: f */
    private final C86054o f239595f;

    public C88630c(Context context, C86054o oVar) {
        this.f239595f = oVar;
        this.f239590a = C145891g.m237666b(context);
    }

    /* renamed from: a */
    public final void mo82249a() {
        C86051l lVar = this.f239593d;
        if (lVar != null) {
            this.f239595f.mo79681o(lVar);
            this.f239593d = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo82292b(C58833ax axVar) {
        if (axVar.mo56113h()) {
            this.f239594e = this.f239590a.mo122259b(((Suggestion) axVar.mo56107c()).mo44269v());
        } else {
            this.f239594e = this.f239590a.mo122258a();
        }
        if (!this.f239594e.mo122491j()) {
            this.f239594e.mo122487f();
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: d */
    public final /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        if (this.f239593d == null) {
            this.f239591b = this.f239595f.mo79668a();
            C88623a aVar = new C88623a(this);
            this.f239593d = aVar;
            this.f239595f.mo79675i(aVar);
        }
    }

    /* renamed from: f */
    public final void mo82222f(C90931ca caVar) {
        this.f239592c = caVar;
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
    }
}
