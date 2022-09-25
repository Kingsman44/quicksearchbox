package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.experiments.C46890b;
import com.google.apps.tiktok.experiments.C46891c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bv */
/* compiled from: PG */
final /* synthetic */ class C46955bv implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C46966cf f122449a;

    public C46955bv(C46966cf cfVar) {
        this.f122449a = cfVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        C46891c cVar = (C46891c) obj;
        C69664n.m101061g(cVar, "p0");
        C46966cf cfVar = this.f122449a;
        C46890b bVar = (C46890b) C46891c.f122341i.createBuilder();
        C69664n.m101060f(bVar, "newBuilder()");
        if (!C69664n.m101066l(cVar, C69664n.m101061g(bVar, "builder").mo50900a())) {
            return C60856cj.m92900i(cVar);
        }
        C60870cx d = ((C42876ab) cfVar.f122475i.mo6453a()).mo46042d();
        C69664n.m101060f(d, "fallbackExperimentCache.get().data");
        return d;
    }
}
