package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.w */
/* compiled from: PG */
public final /* synthetic */ class C87168w implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235523a;

    /* renamed from: b */
    public final /* synthetic */ ModularAction f235524b;

    /* renamed from: c */
    public final /* synthetic */ VoiceAction f235525c;

    /* renamed from: d */
    public final /* synthetic */ CardDecision f235526d;

    public /* synthetic */ C87168w(C87171z zVar, ModularAction modularAction, VoiceAction voiceAction, CardDecision cardDecision) {
        this.f235523a = zVar;
        this.f235524b = modularAction;
        this.f235525c = voiceAction;
        this.f235526d = cardDecision;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235523a;
        ModularAction modularAction = this.f235524b;
        VoiceAction voiceAction = this.f235525c;
        CardDecision cardDecision = this.f235526d;
        ((ModularActionMatchingProviderInfo) modularAction.f235986b).mo81240c((List) obj);
        zVar.mo80771C(voiceAction, cardDecision);
        zVar.mo80774F();
    }
}
