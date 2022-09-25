package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84773a;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularActionMatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.p4152bb.p4153a.C55240la;

/* renamed from: com.google.android.apps.gsa.search.core.state.u */
/* compiled from: PG */
public final /* synthetic */ class C87166u implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235520a;

    /* renamed from: b */
    public final /* synthetic */ VoiceAction f235521b;

    public /* synthetic */ C87166u(C87171z zVar, VoiceAction voiceAction) {
        this.f235520a = zVar;
        this.f235521b = voiceAction;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235520a;
        VoiceAction voiceAction = this.f235521b;
        C87421i iVar = (C87421i) obj;
        int ht = voiceAction.mo81067ht();
        if (!iVar.mo81197b() || iVar.f236083e != 2) {
            zVar.f235567v.mo78501u(zVar.f235555j, zVar.mo80806e(), ((C87052fn) zVar.f235549d.mo27525b()).f235177m);
            zVar.mo80823v(voiceAction, iVar, ht);
            if (iVar.mo81198c() && zVar.mo80798ad() && voiceAction.mo81082u()) {
                ModularAction modularAction = (ModularAction) voiceAction;
                C55240la laVar = ((ModularActionMatchingProviderInfo) modularAction.f235986b).f236115a;
                zVar.f235567v.mo78504x(modularAction, (C84773a) zVar.f235547b.mo27525b());
                return;
            }
            return;
        }
        zVar.mo80823v(voiceAction, C87421i.f236081c, ht);
    }
}
