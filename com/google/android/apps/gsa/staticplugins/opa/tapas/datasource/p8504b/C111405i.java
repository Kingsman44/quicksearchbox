package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import com.google.android.apps.gsa.staticplugins.opa.tapas.framework.C111884bv;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.i */
/* compiled from: PG */
public final class C111405i extends C113409et {

    /* renamed from: b */
    public static final /* synthetic */ int f309959b = 0;

    /* renamed from: c */
    private static final C59071e f309960c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.i");

    /* renamed from: a */
    public final C113188cs f309961a;

    /* renamed from: d */
    private final C22871g f309962d;

    /* renamed from: e */
    private final C111884bv f309963e;

    public C111405i(C22871g gVar, C113188cs csVar, C111884bv bvVar) {
        this.f309962d = gVar;
        this.f309961a = csVar;
        this.f309963e = bvVar;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.APPS;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo99135b(C113405ep epVar, C68283d dVar) {
        epVar.mo100033p();
        return this.f309962d.mo28209i(dVar.mo60297gq(), "IcingResponse for apps source", new C111404h(this, epVar));
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C60870cx cxVar = this.f309963e.mo99271a(epVar).contains(C48672ag.ICING) ? (C60870cx) map.get(C48672ag.ICING) : null;
        if (cxVar != null) {
            return mo99135b(epVar, new C111399c(cxVar));
        }
        ((C59052c) ((C59052c) f309960c.mo56225c()).mo56372aa(27182)).mo56386p("Expected dependent response from Icing.");
        return C60856cj.m92900i(C113408es.f314036b);
    }
}
