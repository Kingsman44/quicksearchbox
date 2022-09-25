package com.google.android.libraries.search.location.p3029a;

import com.google.common.p4552o.C59448a;
import com.google.common.p4552o.C59603b;
import com.google.common.p4552o.adp;
import com.google.common.p4552o.adq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.location.a.n */
/* compiled from: PG */
public final /* synthetic */ class C38670n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C59448a f102133a;

    public /* synthetic */ C38670n(C59448a aVar) {
        this.f102133a = aVar;
    }

    public final C60870cx apply(Object obj) {
        C59448a aVar = this.f102133a;
        boolean z = ((C38630bv) obj).f102076b;
        aVar.copyOnWrite();
        C59603b bVar = (C59603b) aVar.instance;
        C59603b bVar2 = C59603b.f159814e;
        bVar.f159816a |= 2;
        bVar.f159818c = z;
        adp adp = (adp) adq.f158397c.createBuilder();
        adp.copyOnWrite();
        adq adq = (adq) adp.instance;
        C59603b bVar3 = (C59603b) aVar.build();
        bVar3.getClass();
        adq.f158401b = bVar3;
        adq.f158400a |= 1;
        return C60856cj.m92900i((adq) adp.build());
    }
}
