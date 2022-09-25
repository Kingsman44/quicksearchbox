package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8462m;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.smartspace.p8459j.C110713l;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123774cn;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.m.u */
/* compiled from: PG */
public final /* synthetic */ class C110833u implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110835w f308783a;

    public /* synthetic */ C110833u(C110835w wVar) {
        this.f308783a = wVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        int a;
        C110835w wVar = this.f308783a;
        C123746bm bmVar = (C123746bm) obj;
        C62971cq<C123744bk> cqVar = bmVar.f341820a;
        for (C123744bk bkVar : cqVar) {
            if (bkVar.f341810e == 7 && (a = C123774cn.m203111a(bkVar.f341815j)) != 0 && a == 5) {
                C58976aa aaVar = C58975e.f156826a;
            }
        }
        return wVar.f308791g.mo28210j(wVar.f308792h.mo98858a(bmVar.f341820a), BuildConfig.FLAVOR, new C110821i(wVar, (List) Collection.EL.stream(cqVar).filter(C110713l.f308483a).collect(Collectors.toList())));
    }
}
