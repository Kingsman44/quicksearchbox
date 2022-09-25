package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4152bb.p4153a.C55263lx;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.u */
/* compiled from: PG */
public final /* synthetic */ class C116831u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f324211a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f324212b;

    public /* synthetic */ C116831u(C116836z zVar, VoiceAction voiceAction) {
        this.f324211a = zVar;
        this.f324212b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f324211a;
        VoiceAction voiceAction = this.f324212b;
        CardDecision cardDecision = (CardDecision) obj;
        C59104x b = C116836z.f324217a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "S_ActionState");
        ((C59052c) ((C59052c) b).mo56372aa(31910)).mo56389s("card decision generated %s", cardDecision);
        C60870cx cxVar = null;
        if (voiceAction.mo81082u()) {
            ModularAction modularAction = (ModularAction) voiceAction;
            C55263lx lxVar = cardDecision.f236263q;
            if (lxVar == null || lxVar.f145551f.size() <= 0) {
                ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236121g = null;
            } else {
                cxVar = zVar.f324260t.mo78489h(modularAction, lxVar.f145551f);
                new C90873ag(cxVar, zVar.f324261u, String.format("[%s] On resolved alternate execution infos", new Object[]{"S_ActionState"}), new C116643d(zVar, modularAction, voiceAction, cardDecision)).mo85223a(C116670e.f323538a);
            }
        }
        if (cxVar == null) {
            zVar.mo102976F(voiceAction, cardDecision);
            zVar.mo102979I();
        }
    }
}
