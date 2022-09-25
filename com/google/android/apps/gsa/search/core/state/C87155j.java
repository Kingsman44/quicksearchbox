package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88205ta;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.search.core.state.j */
/* compiled from: PG */
public final /* synthetic */ class C87155j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235505a;

    /* renamed from: b */
    public final /* synthetic */ C88206tb f235506b;

    public /* synthetic */ C87155j(C87171z zVar, C88206tb tbVar) {
        this.f235505a = zVar;
        this.f235506b = tbVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C87171z zVar = this.f235505a;
        C88206tb tbVar = this.f235506b;
        VoiceAction voiceAction = (VoiceAction) obj;
        if (voiceAction == null) {
            zVar.mo80824x();
            return;
        }
        C87739bu buVar = C87739bu.UNKNOWN;
        int a = C88205ta.m142792a(tbVar.f238427b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            zVar.f235567v.mo78499s(voiceAction);
        } else if (i == 2) {
            zVar.mo80826z(voiceAction, 1);
            zVar.mo80815o();
        }
    }
}
