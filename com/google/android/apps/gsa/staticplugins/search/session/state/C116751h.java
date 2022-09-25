package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88205ta;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88206tb;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.h */
/* compiled from: PG */
public final /* synthetic */ class C116751h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C116836z f323847a;

    /* renamed from: b */
    public final /* synthetic */ C88206tb f323848b;

    public /* synthetic */ C116751h(C116836z zVar, C88206tb tbVar) {
        this.f323847a = zVar;
        this.f323848b = tbVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C116836z zVar = this.f323847a;
        C88206tb tbVar = this.f323848b;
        VoiceAction voiceAction = (VoiceAction) obj;
        if (voiceAction == null) {
            zVar.mo102973C();
            return;
        }
        C87739bu buVar = C87739bu.UNKNOWN;
        int a = C88205ta.m142792a(tbVar.f238427b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            zVar.f324260t.mo78499s(voiceAction);
        } else if (i == 2) {
            zVar.mo102974D(voiceAction, 1);
            zVar.mo103022r();
        }
    }
}
