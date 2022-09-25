package com.google.android.libraries.lens.view.p2056af;

import com.google.android.libraries.lens.view.filters.C25897ad;
import com.google.common.base.C58817ah;
import com.google.common.p4552o.adf;
import com.google.common.p4552o.adh;
import com.google.common.p4552o.adj;

/* renamed from: com.google.android.libraries.lens.view.af.bj */
/* compiled from: PG */
public final /* synthetic */ class C25065bj implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C25068bm f68312a;

    public /* synthetic */ C25065bj(C25068bm bmVar) {
        this.f68312a = bmVar;
    }

    public final Object apply(Object obj) {
        C25068bm bmVar = this.f68312a;
        Void voidR = (Void) obj;
        adf adf = (adf) adj.f158371e.createBuilder();
        long a = bmVar.f68317c.mo30345a();
        if (a <= 0) {
            a = bmVar.f68317c.mo30347c();
        }
        if (a <= 0) {
            a = -1;
        }
        adf.copyOnWrite();
        adj adj = (adj) adf.instance;
        adj.f158373a |= 16;
        adj.f158374b = a;
        adf.copyOnWrite();
        adj adj2 = (adj) adf.instance;
        adj2.f158375c = ((adh) bmVar.f68321g.f70369e.mo6453a()).f158369h;
        adj2.f158373a |= 32;
        int b = ((C25897ad) bmVar.f68321g.f70368d.mo6453a()).mo31005b();
        adf.copyOnWrite();
        adj adj3 = (adj) adf.instance;
        int i = b - 1;
        if (b != 0) {
            adj3.f158376d = i;
            adj3.f158373a |= 64;
            return (adj) adf.build();
        }
        throw null;
    }
}
