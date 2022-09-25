package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.p4152bb.p4153a.C55240la;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.o */
/* compiled from: PG */
public final /* synthetic */ class C116825o implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f324203a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f324204b;

    public /* synthetic */ C116825o(C116836z zVar, VoiceAction voiceAction) {
        this.f324203a = zVar;
        this.f324204b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f324203a;
        VoiceAction voiceAction = this.f324204b;
        C87421i iVar = (C87421i) obj;
        int ht = voiceAction.mo81067ht();
        if (!iVar.mo81197b() || iVar.f236083e != 2) {
            zVar.f324260t.mo78501u(zVar.f324250j, zVar.mo103014i(), ((C116735gk) zVar.f324244d.mo27525b()).f323784p);
            zVar.mo102972B(voiceAction, iVar, ht);
            if (iVar.mo81198c() && zVar.mo103004aj() && voiceAction.mo81082u()) {
                ModularAction modularAction = (ModularAction) voiceAction;
                C55240la laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236115a;
                zVar.f324260t.mo78504x(modularAction, (C84773a) zVar.f324242b.mo27525b());
                return;
            }
            return;
        }
        zVar.mo102972B(voiceAction, C87421i.f236081c, ht);
    }
}
