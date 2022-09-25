package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a;

import com.google.android.apps.gsa.proactive.p6475b.C84162e;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.nowstream.streamfeature.p8155a.p8158c.C105687ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.a.bw */
/* compiled from: PG */
public final /* synthetic */ class C105228bw implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C105263dd f293500a;

    public /* synthetic */ C105228bw(C105263dd ddVar) {
        this.f293500a = ddVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C105263dd ddVar = this.f293500a;
        C84162e eVar = (C84162e) obj;
        C59104x b = C105263dd.f293540a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NowController");
        ((C59052c) ((C59052c) b).mo56372aa(22272)).mo56359L("NextPageRequest(token:%b, content:%b: %d)", Boolean.valueOf(eVar.mo77596d()), Boolean.valueOf(eVar.mo77595c()), Integer.valueOf(eVar.mo77593a()));
        C105687ar arVar = ddVar.f293549H;
        if (arVar != null) {
            if (eVar.mo77593a() != 0) {
                C90456c b2 = eVar.mo77594b();
                if (b2 == null) {
                    b2 = new C90452a(211, 917504);
                }
                arVar.mo94979q(b2);
                ddVar.f293633z.mo86060c(ddVar.f293563V, b2);
            } else if (!eVar.mo77595c()) {
                arVar.mo94980r();
                ddVar.f293633z.mo86060c(ddVar.f293563V, new C90452a(211, C89885b.FEED_RESPONSE_NO_CONTENT_RETURNED_VALUE));
            }
            if (!eVar.mo77596d()) {
                if (arVar.f294846Q) {
                    ddVar.f293561T = true;
                } else {
                    ddVar.mo94676H(arVar);
                }
            }
        }
        ddVar.f293556O.mo94731a(eVar.mo77596d());
        if (eVar.mo77593a() == 12) {
            ddVar.mo94686q(true);
        }
    }
}
