package com.google.android.apps.gsa.staticplugins.bisto.p7489g;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.g.bq */
/* compiled from: PG */
public final /* synthetic */ class C95366bq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95369bt f266827a;

    /* renamed from: b */
    public final /* synthetic */ SettableFuture f266828b;

    public /* synthetic */ C95366bq(C95369bt btVar, SettableFuture settableFuture) {
        this.f266827a = btVar;
        this.f266828b = settableFuture;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95369bt btVar = this.f266827a;
        SettableFuture settableFuture = this.f266828b;
        Void voidR = (Void) obj;
        btVar.f266840p = false;
        settableFuture.mo57356n((Object) null);
        if (!btVar.f266841q) {
            while (true) {
                C95368bs bsVar = (C95368bs) btVar.f266842r.poll();
                if (bsVar != null) {
                    C58976aa aaVar = C58975e.f156826a;
                    bsVar.f266834d.mo57358p(bsVar.f266831a.mo89257D(bsVar.f266835e, bsVar.f266832b, bsVar.f266833c));
                } else {
                    return;
                }
            }
        }
    }
}
