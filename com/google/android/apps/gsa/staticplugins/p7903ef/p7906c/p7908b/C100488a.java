package com.google.android.apps.gsa.staticplugins.p7903ef.p7906c.p7908b;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88302wq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88303wr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88304ws;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.staticplugins.ef.c.b.a */
/* compiled from: PG */
public final class C100488a {

    /* renamed from: a */
    public C87682aj f280915a;

    /* renamed from: a */
    public final void mo91935a(int i) {
        C87682aj ajVar = this.f280915a;
        if (ajVar != null) {
            C87684al alVar = new C87684al(C88244um.SHOW_RECOGNITION_STATE);
            C62940bt btVar = C88302wq.f238816a;
            C88303wr wrVar = (C88303wr) C88304ws.f238817c.createBuilder();
            wrVar.copyOnWrite();
            C88304ws wsVar = (C88304ws) wrVar.instance;
            wsVar.f238819a |= 1;
            wsVar.f238820b = i;
            alVar.mo81965b(btVar, (C88304ws) wrVar.build());
            ((C86771n) ajVar).mo80379b(alVar.mo81964a());
        }
    }
}
