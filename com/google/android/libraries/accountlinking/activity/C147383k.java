package com.google.android.libraries.accountlinking.activity;

import com.google.android.libraries.accountlinking.C147434l;
import com.google.common.util.concurrent.C60845bz;
import com.google.p3562ao.p3563a.p3568d.C45587y;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;

/* renamed from: com.google.android.libraries.accountlinking.activity.k */
/* compiled from: PG */
final class C147383k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C147388p f397842a;

    public C147383k(C147388p pVar) {
        this.f397842a = pVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f397842a.f397858g.mo5706i(false);
        C147388p pVar = this.f397842a;
        C147434l lVar = C147434l.APP_FLIP;
        pVar.mo124152j(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C45587y yVar = (C45587y) obj;
        if (yVar != null) {
            C147388p pVar = this.f397842a;
            if (pVar.f397854c.f397903l) {
                pVar.mo124144a(yVar.f119136b);
                return;
            }
            pVar.f397858g.mo5706i(false);
            this.f397842a.mo124148f(C65881e.STATE_COMPLETE);
            this.f397842a.mo124150h(C147381i.m240295b(yVar.f119136b));
            return;
        }
        this.f397842a.f397858g.mo5706i(false);
        this.f397842a.mo124145b(C65879c.EVENT_MALFORMED_RESPONSE);
        this.f397842a.mo124150h(C147381i.m240294a(1, "Linking failed; link was not returned by the server "));
    }
}
