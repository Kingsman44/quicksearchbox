package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8507e;

import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.e.aj */
/* compiled from: PG */
public final /* synthetic */ class C111483aj implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C111485al f310120a;

    public /* synthetic */ C111483aj(C111485al alVar) {
        this.f310120a = alVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C111485al alVar = this.f310120a;
        UriRequest uriRequest = (UriRequest) obj;
        String uri = uriRequest.f236331a.toString();
        C58495hd a = uriRequest.mo81502a();
        C58976aa aaVar = C58975e.f156826a;
        C89019aq c = C89020ar.m144758c();
        c.mo82994f(uri);
        c.mo82991c(a);
        c.f241244j = true;
        c.f241245k = 1;
        C89020ar a2 = c.mo82989a();
        return alVar.f310124d.mo80852a(alVar.f310125e.mo78025a("GsaCompleteServerConnection", 148, 154), C89066v.f241382a, new C89018ap(a2, C89009ag.f241207b));
    }
}
