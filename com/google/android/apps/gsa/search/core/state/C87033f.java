package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.state.f */
/* compiled from: PG */
public final /* synthetic */ class C87033f implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235085a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f235086b;

    public /* synthetic */ C87033f(C87171z zVar, VoiceAction voiceAction) {
        this.f235085a = zVar;
        this.f235086b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235085a;
        VoiceAction voiceAction = this.f235086b;
        voiceAction.mo81076o((MatchingProviderInfo) obj);
        if (zVar.mo80807f() != voiceAction) {
            C59104x d = C87171z.f235529a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ActionState");
            ((C59052c) ((C59052c) d).mo56372aa(8614)).mo56386p("#onMatchingProviderInfoRefreshed for unrecognized action.");
            return;
        }
        boolean c = zVar.f235552g.mo85049c(524288, 8);
        zVar.mo80815o();
        zVar.mo80800ah();
        if (c) {
            zVar.mo80591ar();
        }
    }
}
