package com.google.android.apps.gsa.p8889z.p8909e.p8910a.p8912b;

import com.google.android.apps.gsa.search.core.p6816p.C86246cb;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.z.e.a.b.l */
/* compiled from: PG */
public final /* synthetic */ class C118971l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C118976q f331754a;

    /* renamed from: b */
    public final /* synthetic */ Query f331755b;

    /* renamed from: c */
    public final /* synthetic */ C86246cb f331756c;

    public /* synthetic */ C118971l(C118976q qVar, Query query, C86246cb cbVar) {
        this.f331754a = qVar;
        this.f331755b = query;
        this.f331756c = cbVar;
    }

    public final void run() {
        C118976q qVar = this.f331754a;
        Query query = this.f331755b;
        C86246cb cbVar = this.f331756c;
        if (cbVar != null) {
            qVar.f331767b.mo91313j(qVar.f331771f);
            qVar.f331767b.mo91311h(qVar.f331771f, query, cbVar);
            return;
        }
        ((C59052c) ((C59052c) C118976q.f331762a.mo56225c()).mo56372aa(34204)).mo56386p("No results given when we needed the last recognition result.");
    }
}
