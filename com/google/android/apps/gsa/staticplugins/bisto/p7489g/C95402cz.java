package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60285mz;
import com.google.common.p4552o.C60290nc;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.cz */
/* compiled from: PG */
public final /* synthetic */ class C95402cz implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95405db f266920a;

    public /* synthetic */ C95402cz(C95405db dbVar) {
        this.f266920a = dbVar;
    }

    public final void run() {
        C95405db dbVar = this.f266920a;
        C58976aa aaVar = C58975e.f156826a;
        C60285mz mzVar = ((C95373bx) dbVar.f266931w.mo27525b()).f266874d;
        if (mzVar != null) {
            mzVar.copyOnWrite();
            C60290nc ncVar = (C60290nc) mzVar.instance;
            C60290nc ncVar2 = C60290nc.f163102j;
            ncVar.f163104a |= 16;
            ncVar.f163109f = true;
        }
        SettableFuture settableFuture = dbVar.f266932x;
        if (settableFuture != null) {
            settableFuture.mo57356n((Object) null);
            dbVar.f266932x = null;
            return;
        }
        C59104x c = C95405db.f266927s.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
        ((C59052c) ((C59052c) c).mo56372aa(15005)).mo56386p("Connected; connectFuture is null");
    }
}
