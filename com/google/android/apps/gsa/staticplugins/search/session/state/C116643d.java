package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.d */
/* compiled from: PG */
public final /* synthetic */ class C116643d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f323509a;

    /* renamed from: b */
    public final /* synthetic */ ModularAction f323510b;

    /* renamed from: c */
    public final /* synthetic */ VoiceAction f323511c;

    /* renamed from: d */
    public final /* synthetic */ CardDecision f323512d;

    public /* synthetic */ C116643d(C116836z zVar, ModularAction modularAction, VoiceAction voiceAction, CardDecision cardDecision) {
        this.f323509a = zVar;
        this.f323510b = modularAction;
        this.f323511c = voiceAction;
        this.f323512d = cardDecision;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f323509a;
        ModularAction modularAction = this.f323510b;
        VoiceAction voiceAction = this.f323511c;
        CardDecision cardDecision = this.f323512d;
        ((ModularActionMatchingProviderInfo) modularAction.f235986b).mo81240c((List) obj);
        zVar.mo102976F(voiceAction, cardDecision);
        zVar.mo102979I();
    }
}
