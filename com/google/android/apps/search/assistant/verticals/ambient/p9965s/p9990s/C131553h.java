package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9990s;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.s.h */
/* compiled from: PG */
public final /* synthetic */ class C131553h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131558m f359437a;

    public /* synthetic */ C131553h(C131558m mVar) {
        this.f359437a = mVar;
    }

    public final Object apply(Object obj) {
        C131558m mVar = this.f359437a;
        C123746bm bmVar = (C123746bm) obj;
        ((C58970a) ((C58970a) mVar.f359442a.mo56224b()).mo56372aa(39317)).mo56387q("PCP response size is: %d", bmVar.f341820a.size());
        Optional findFirst = Collection.EL.stream(bmVar.f341820a).filter(C131547b.f359430a).map(C131548c.f359431a).findFirst();
        if (findFirst.isEmpty()) {
            ((C58970a) ((C58970a) mVar.f359442a.mo56224b()).mo56372aa(39318)).mo56386p("Stations data are missing PCP response.");
        }
        return findFirst;
    }
}
