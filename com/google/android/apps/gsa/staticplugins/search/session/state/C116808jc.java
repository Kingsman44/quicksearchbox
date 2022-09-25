package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90918bo;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.jc */
/* compiled from: PG */
public final /* synthetic */ class C116808jc implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116811jf f324098a;

    /* renamed from: b */
    public final /* synthetic */ Query f324099b;

    public /* synthetic */ C116808jc(C116811jf jfVar, Query query) {
        this.f324098a = jfVar;
        this.f324099b = query;
    }

    public final void run() {
        C116811jf jfVar = this.f324098a;
        Query query = this.f324099b;
        if (jfVar.f324111j.mo84383cP(query)) {
            if (!((C116735gk) jfVar.f324104c.mo27525b()).f323784p.mo84383cP(query)) {
                jfVar.mo102953e(C60856cj.m92899h(new IllegalStateException("Query is not current commit.")));
            } else if (jfVar.f324110i) {
                jfVar.mo102953e(C90918bo.m148514a(jfVar.f324107f.mo78929c(query, jfVar.f324105d)));
            } else {
                jfVar.mo102953e(C60856cj.m92900i(C58836b.f156633a));
            }
        }
    }
}
