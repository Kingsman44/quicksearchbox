package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8916f;

import com.google.android.apps.gsa.c.f.a.j;
import com.google.android.apps.gsa.p8889z.p8893c.p8899f.C118896b;
import com.google.android.apps.gsa.search.core.p6519al.p6723dr.C85422c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.base.C58836b;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.z.e.a.f.q */
/* compiled from: PG */
public final /* synthetic */ class C119041q implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C119042r f332087a;

    /* renamed from: b */
    public final /* synthetic */ C68214a f332088b;

    /* renamed from: c */
    public final /* synthetic */ Query f332089c;

    /* renamed from: d */
    public final /* synthetic */ C118896b f332090d;

    /* renamed from: e */
    public final /* synthetic */ C85422c f332091e;

    public /* synthetic */ C119041q(C119042r rVar, C68214a aVar, Query query, C118896b bVar, C85422c cVar) {
        this.f332087a = rVar;
        this.f332088b = aVar;
        this.f332089c = query;
        this.f332090d = bVar;
        this.f332091e = cVar;
    }

    public final void run() {
        C119042r rVar = this.f332087a;
        C68214a aVar = this.f332088b;
        Query query = this.f332089c;
        C118896b bVar = this.f332090d;
        C85422c cVar = this.f332091e;
        if (!rVar.f332092a.getAndSet(true)) {
            j.a((C89859i) aVar.mo27525b(), C89849ae.FIRST_RECOGNIZED_TEXT_RECEIVED, query.f252749G, C58836b.f156633a);
        }
        if (bVar.mo104061d()) {
            j.a((C89859i) aVar.mo27525b(), C89849ae.FINAL_RECOGNIZED_TEXT_RECEIVED, query.f252749G, C58836b.f156633a);
        }
        cVar.mo78949o(query, bVar.mo104059b(), bVar.mo104060c(), bVar.mo104061d(), bVar.mo104058a());
    }
}
