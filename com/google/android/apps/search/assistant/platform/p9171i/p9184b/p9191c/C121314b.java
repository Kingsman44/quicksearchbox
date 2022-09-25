package com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9191c;

import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9185a.C121283c;
import com.google.android.apps.search.assistant.platform.p9171i.p9184b.p9196e.C121334a;
import com.google.android.gms.appdatasearch.C142826w;
import com.google.android.gms.appdatasearch.CorpusId;
import com.google.android.gms.appdatasearch.STSortSpec;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.assistant.platform.i.b.c.b */
/* compiled from: PG */
public final class C121314b implements C121283c {

    /* renamed from: b */
    private static final CorpusId f336899b = new CorpusId("com.google.android.gms", "internal.3p:MobileApplication", (Bundle) null);

    /* renamed from: a */
    public final C121324l f336900a;

    /* renamed from: c */
    private final STSortSpec f336901c = new STSortSpec("(MUL _MAX_HIT_WEIGHT (DIV (MAX _CLICK_COUNT 0) (ADD 1 (MAX _CLICK_COUNT 0))))");

    /* renamed from: d */
    private final C60887da f336902d;

    /* renamed from: e */
    private final C121334a f336903e;

    public C121314b(C121334a aVar, C60887da daVar, C121324l lVar) {
        this.f336903e = aVar;
        this.f336902d = daVar;
        this.f336900a = lVar;
    }

    /* renamed from: b */
    public final C60870cx mo105108b(String str, int i) {
        C121334a aVar = this.f336903e;
        String format = String.format("(Q_PREFIX \"%s\")", new Object[]{str});
        C142826w wVar = new C142826w();
        wVar.f387614g = "assistant.gemini";
        wVar.f387609b = 5;
        wVar.f387613f = this.f336901c;
        wVar.f387610c = 3;
        wVar.mo117756b(f336899b);
        C60870cx b = C43205e.m76192b(aVar.f336941a.mo122338b(format, 10, wVar.mo117755a()));
        C121313a aVar2 = new C121313a(this, i);
        return C60922j.m93044g(b, C47810es.m84963c(aVar2), this.f336902d);
    }
}
