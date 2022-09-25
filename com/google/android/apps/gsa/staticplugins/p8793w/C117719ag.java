package com.google.android.apps.gsa.staticplugins.p8793w;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87727bi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87728bj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87729bk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.ag */
/* compiled from: PG */
public final /* synthetic */ class C117719ag implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87726bh f326720a;

    /* renamed from: b */
    public final /* synthetic */ C87673aa f326721b;

    public /* synthetic */ C117719ag(C87726bh bhVar, C87673aa aaVar) {
        this.f326720a = bhVar;
        this.f326721b = aaVar;
    }

    public final void run() {
        C87726bh bhVar = this.f326720a;
        C87673aa aaVar = this.f326721b;
        C58976aa aaVar2 = C58975e.f156826a;
        C88489j jVar = new C88489j(C87739bu.CAR_ASSISTANT_SESSION_STATE);
        C62940bt btVar = C87727bi.f237208a;
        C87728bj bjVar = (C87728bj) C87729bk.f237209c.createBuilder();
        bjVar.copyOnWrite();
        C87729bk bkVar = (C87729bk) bjVar.instance;
        bkVar.f237212b = bhVar.f237207d;
        bkVar.f237211a |= 1;
        jVar.mo82014b(btVar, (C87729bk) bjVar.build());
        aaVar.mo81937i(jVar.mo82013a());
    }
}
