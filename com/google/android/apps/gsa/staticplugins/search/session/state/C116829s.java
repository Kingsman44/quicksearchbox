package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.s */
/* compiled from: PG */
public final /* synthetic */ class C116829s implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f324208a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f324209b;

    public /* synthetic */ C116829s(C116836z zVar, VoiceAction voiceAction) {
        this.f324208a = zVar;
        this.f324209b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f324208a;
        VoiceAction voiceAction = this.f324209b;
        voiceAction.mo81076o((MatchingProviderInfo) obj);
        if (zVar.mo80807f() != voiceAction) {
            C59104x d = C116836z.f324217a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S_ActionState");
            ((C59052c) ((C59052c) d).mo56372aa(31934)).mo56386p("#onMatchingProviderInfoRefreshed for unrecognized action.");
            return;
        }
        boolean c = zVar.f324248h.mo85049c(524288, 8);
        zVar.mo103022r();
        zVar.mo103008au();
        if (c) {
            zVar.mo80591ar();
        }
    }
}
