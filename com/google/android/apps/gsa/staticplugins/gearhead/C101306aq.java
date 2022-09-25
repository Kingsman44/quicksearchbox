package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.android.apps.gsa.search.core.carassistant.CarAssistantSessionManager;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87726bh;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.aq */
/* compiled from: PG */
public final /* synthetic */ class C101306aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C101325be f282720a;

    public /* synthetic */ C101306aq(C101325be beVar) {
        this.f282720a = beVar;
    }

    public final void accept(Object obj) {
        C101325be beVar = this.f282720a;
        if (((Boolean) obj).booleanValue()) {
            beVar.f282773c.mo20153f(true);
            beVar.f282784n.mo92257e();
        } else if (beVar.f282782l.mo79299a() == C87726bh.ONGOING) {
            if (beVar.f282776f.mo79746e(C90086ek.f250323av)) {
                beVar.f282778h.mo79321c(beVar.f282782l.mo79300b());
            }
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(20016)).mo56386p("stopOrDequeueVoiceSessionInternal(): Stopping ongoing voice session");
            beVar.f282773c.mo20153f(true);
            CarAssistantSessionManager carAssistantSessionManager = beVar.f282782l;
            Objects.requireNonNull(carAssistantSessionManager);
            beVar.mo92237n("cancelSession()", new C101400s(carAssistantSessionManager));
        } else {
            new C90873ag(beVar.f282773c.mo20149b(), beVar.f282788r, "#Fetch MediaRecSessionState", new C101345o(beVar)).mo85223a(C101346p.f282838a);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
