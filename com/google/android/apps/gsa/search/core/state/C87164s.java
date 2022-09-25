package com.google.android.apps.gsa.search.core.state;

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

/* renamed from: com.google.android.apps.gsa.search.core.state.s */
/* compiled from: PG */
public final /* synthetic */ class C87164s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235517a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f235518b;

    public /* synthetic */ C87164s(C87171z zVar, VoiceAction voiceAction) {
        this.f235517a = zVar;
        this.f235518b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235517a;
        VoiceAction voiceAction = this.f235518b;
        CardDecision cardDecision = (CardDecision) obj;
        C59104x b = C87171z.f235529a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ActionState");
        ((C59052c) ((C59052c) b).mo56372aa(8588)).mo56389s("card decision generated %s", cardDecision);
        C60870cx cxVar = null;
        if (voiceAction.mo81082u()) {
            ModularAction modularAction = (ModularAction) voiceAction;
            C55263lx lxVar = cardDecision.f236263q;
            if (lxVar == null || lxVar.f145551f.size() <= 0) {
                ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236121g = null;
            } else {
                cxVar = zVar.f235567v.mo78489h(modularAction, lxVar.f145551f);
                new C90873ag(cxVar, zVar.f235568w, String.format("[%s] On resolved alternate execution infos", new Object[]{"ActionState"}), new C87168w(zVar, modularAction, voiceAction, cardDecision)).mo85223a(C87169x.f235527a);
            }
        }
        if (cxVar == null) {
            zVar.mo80771C(voiceAction, cardDecision);
            zVar.mo80774F();
        }
    }
}
