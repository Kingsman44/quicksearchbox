package com.google.android.apps.gsa.staticplugins.bisto.p7479ae.p7480a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.p2904c.C37513dt;
import com.google.android.libraries.search.p2904c.C37514du;
import com.google.android.libraries.search.p2904c.C37516dw;
import com.google.android.libraries.search.p2904c.C37672hs;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.a.m */
/* compiled from: PG */
public final /* synthetic */ class C95050m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C95051n f265908a;

    /* renamed from: b */
    public final /* synthetic */ C37672hs f265909b;

    public /* synthetic */ C95050m(C95051n nVar, C37672hs hsVar) {
        this.f265908a = nVar;
        this.f265909b = hsVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C95051n nVar = this.f265908a;
        nVar.f265922l.remove(this.f265909b);
        if (nVar.f265922l.isEmpty()) {
            C59104x b = C95051n.f265910a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DialogHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18104)).mo56386p("No more listening invocations, closing mic.");
            return nVar.f265912b.mo88883d(true);
        }
        C37513dt dtVar = (C37513dt) C37514du.f99629c.createBuilder();
        C37516dw dwVar = C37516dw.CLOSED;
        dtVar.copyOnWrite();
        C37514du duVar = (C37514du) dtVar.instance;
        duVar.f99632b = Integer.valueOf(dwVar.f99638d);
        duVar.f99631a = 1;
        return C60856cj.m92900i((C37514du) dtVar.build());
    }
}
