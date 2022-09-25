package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.bisto.C89646bc;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60285mz;
import com.google.common.p4552o.C60290nc;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.da */
/* compiled from: PG */
public final /* synthetic */ class C95404da implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95405db f266921a;

    public /* synthetic */ C95404da(C95405db dbVar) {
        this.f266921a = dbVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C89646bc bcVar;
        C95405db dbVar = this.f266921a;
        Exception exc = (Exception) obj;
        C60285mz mzVar = ((C95373bx) dbVar.f266931w.mo27525b()).f266874d;
        if (mzVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            mzVar.copyOnWrite();
            C60290nc ncVar = (C60290nc) mzVar.instance;
            C60290nc ncVar2 = C60290nc.f163102j;
            ncVar.f163104a |= 16;
            ncVar.f163109f = false;
        }
        if (exc instanceof CancellationException) {
            C59104x b = C95405db.f266927s.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) b).mo56372aa(15011)).mo56386p("Cancelled");
            SettableFuture settableFuture = dbVar.f266932x;
            if (settableFuture != null) {
                settableFuture.mo57357o(exc);
                dbVar.f266932x = null;
            }
        } else if (!dbVar.f266934z && !dbVar.mo89347u()) {
            C59104x b2 = C95405db.f266927s.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) b2).mo56372aa(15010)).mo56386p("!shouldReconnect - early check");
            SettableFuture settableFuture2 = dbVar.f266932x;
            if (settableFuture2 != null) {
                settableFuture2.mo57357o(new Exception("!shouldReconnect"));
                dbVar.f266932x = null;
            }
        } else {
            if (dbVar.f266934z) {
                bcVar = dbVar.f266928t;
            } else {
                bcVar = dbVar.f266929u;
            }
            C59104x c = C95405db.f266927s.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(15006)).mo56386p("Connect failed");
            if (bcVar.mo83536c()) {
                C59104x c2 = C95405db.f266927s.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
                ((C59052c) ((C59052c) c2).mo56372aa(15008)).mo56386p("maxRetryTimeExceeded");
                SettableFuture settableFuture3 = dbVar.f266932x;
                if (settableFuture3 != null) {
                    settableFuture3.mo57357o(new Exception("maxRetryTimeExceeded"));
                    dbVar.f266932x = null;
                    return;
                }
                C59104x c3 = C95405db.f266927s.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "ReconnectingBistoDevice");
                ((C59052c) ((C59052c) c3).mo56372aa(15009)).mo56386p("connectFuture is null");
                return;
            }
            dbVar.f266933y = dbVar.f266930v.mo28203c("retry-connect", bcVar.mo83534a(), new C95401cy(dbVar));
            dbVar.mo89346t();
        }
    }
}
