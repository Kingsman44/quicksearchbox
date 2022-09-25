package com.google.android.apps.gsa.staticplugins.microdetection;

import com.google.android.apps.gsa.c.f.bd;
import com.google.android.apps.gsa.p5836c.p5843f.C74456aq;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.search.p2904c.C37670hq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.v */
/* compiled from: PG */
public final /* synthetic */ class C102866v implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C102792ac f287298a;

    /* renamed from: b */
    public final /* synthetic */ Query f287299b;

    public /* synthetic */ C102866v(C102792ac acVar, Query query) {
        this.f287298a = acVar;
        this.f287299b = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C102792ac acVar = this.f287298a;
        Query query = this.f287299b;
        C37670hq hqVar = (C37670hq) obj;
        if ((hqVar.f100054a & 1) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            ((C74456aq) acVar.f287018e.mo27525b()).mo70773c(hqVar, ((bd) acVar.f287022i.mo56107c()).g, query.f252749G);
        }
    }
}
