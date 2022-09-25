package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import android.text.TextUtils;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119053i;
import com.google.android.apps.gsa.p8889z.p8909e.p8910a.C119067w;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.C90530b;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C63088z;
import com.google.speech.p5230n.p5232b.C67400ap;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.cp */
/* compiled from: PG */
public final class C118026cp implements C119067w {

    /* renamed from: a */
    public final C58974d f327569a = C58974d.m91135i("SGVSResultHandler");

    /* renamed from: b */
    public final C58833ax f327570b;

    /* renamed from: c */
    private final C119053i f327571c;

    /* renamed from: d */
    private final C22871g f327572d;

    /* renamed from: e */
    private final C118027cq f327573e;

    public C118026cp(C119053i iVar, C58833ax axVar, C118027cq cqVar, C22871g gVar) {
        this.f327571c = iVar;
        this.f327570b = axVar;
        this.f327573e = cqVar;
        this.f327572d = gVar;
    }

    /* renamed from: a */
    public final C119053i mo91376a() {
        return this.f327571c;
    }

    /* renamed from: b */
    public final void mo91377b(C63088z zVar) {
        this.f327571c.f332140a.f332134o.mo54591h(zVar);
    }

    /* renamed from: c */
    public final void mo91378c(int i) {
        this.f327571c.f332140a.mo104101m();
        if (this.f327570b.mo56113h()) {
            this.f327572d.mo28211k(this.f327571c.f332140a.f332125f.f232931a, "Add the auto fulfillMode logging for query %s", new C118025co(this, i));
        }
    }

    /* renamed from: d */
    public final void mo91379d(int i) {
        if (!this.f327571c.f332140a.f332124e.f232931a.isDone()) {
            this.f327571c.f332140a.mo104095g();
        }
        if (i == 2) {
            this.f327573e.mo103500b();
        }
    }

    /* renamed from: e */
    public final void mo91380e(Query query, C86232bo boVar) {
        if (!TextUtils.isEmpty(query.f252768g)) {
            this.f327571c.f332140a.mo104096h(C58833ax.m90834k(query));
        }
        this.f327571c.f332140a.f332120a.mo79832b(boVar);
    }

    /* renamed from: f */
    public final void mo91381f(C90606n nVar) {
        this.f327571c.f332140a.mo104100l(C58833ax.m90834k(((C90530b) nVar).f253083a));
        this.f327571c.f332140a.mo104092d(C58833ax.m90834k(nVar));
    }

    /* renamed from: g */
    public final void mo91382g(C67400ap apVar) {
    }

    /* renamed from: h */
    public final void mo91383h(C90528t tVar) {
        this.f327571c.f332140a.mo104093e(tVar);
    }
}
