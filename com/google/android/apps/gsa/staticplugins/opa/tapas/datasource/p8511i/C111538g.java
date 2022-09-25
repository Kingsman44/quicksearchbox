package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8511i;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.gms.search.queries.C145948p;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.i.g */
/* compiled from: PG */
public final class C111538g implements C111536e {

    /* renamed from: b */
    private static final CorpusId f310229b = new CorpusId("com.google.android.gms", "internal.3p:MobileApplication", (Bundle) null);

    /* renamed from: c */
    private static final CorpusId f310230c = new CorpusId("com.google.android.googlequicksearchbox", "internal.3p:Thing", (Bundle) null);

    /* renamed from: a */
    public final C111532a f310231a;

    /* renamed from: d */
    private final STSortSpec f310232d = new STSortSpec("(MUL _MAX_HIT_WEIGHT (DIV (MAX _CLICK_COUNT 0) (ADD 1 (MAX _CLICK_COUNT 0))))");

    /* renamed from: e */
    private final C60887da f310233e;

    /* renamed from: f */
    private final C145948p f310234f;

    /* renamed from: g */
    private final C90021c f310235g;

    public C111538g(C145948p pVar, C60887da daVar, C111532a aVar, C90021c cVar) {
        this.f310234f = pVar;
        this.f310233e = daVar;
        this.f310231a = aVar;
        this.f310235g = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo99170a(C113405ep epVar) {
        CorpusId corpusId;
        String p = epVar.mo100033p();
        C58976aa aaVar = C58975e.f156826a;
        C145948p pVar = this.f310234f;
        String format = String.format("(Q_PREFIX \"%s\")", new Object[]{p});
        C142826w wVar = new C142826w();
        wVar.f387614g = "assistant.gemini";
        wVar.f387609b = 5;
        wVar.f387613f = this.f310232d;
        wVar.f387610c = 3;
        if (this.f310235g.mo79746e(C90063do.f249493ea)) {
            corpusId = f310230c;
        } else {
            corpusId = f310229b;
        }
        wVar.mo117756b(corpusId);
        C60870cx b = C43205e.m76192b(pVar.mo122338b(format, 10, wVar.mo117755a()));
        C111537f fVar = new C111537f(this);
        return C60922j.m93044g(b, C47810es.m84963c(fVar), this.f310233e);
    }
}
