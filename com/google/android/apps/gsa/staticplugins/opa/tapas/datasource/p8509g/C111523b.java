package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8509g;

import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.g.b */
/* compiled from: PG */
public final class C111523b extends C113409et {

    /* renamed from: a */
    public static final /* synthetic */ int f310198a = 0;

    /* renamed from: b */
    private static final C59071e f310199b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.g.b");

    /* renamed from: c */
    private final C22871g f310200c;

    public C111523b(C22871g gVar) {
        this.f310200c = gVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.GEO;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C60870cx cxVar = (C60870cx) map.get(C48672ag.ICING);
        if (cxVar == null) {
            ((C59052c) ((C59052c) f310199b.mo56225c()).mo56372aa(27220)).mo56386p("Expected SearchQueriesIcingSource in dependencies.");
            return C60856cj.m92900i(C113408es.f314036b);
        }
        ((C59052c) ((C59052c) f310199b.mo56224b()).mo56372aa(27219)).mo56389s("#fetchSuggestions(): prefix='%s'", epVar.mo100033p());
        return this.f310200c.mo28209i(cxVar, "IcingResponse for geo source", C111522a.f310197a);
    }
}
