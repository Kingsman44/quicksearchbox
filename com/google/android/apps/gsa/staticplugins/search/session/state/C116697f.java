package com.google.android.apps.gsa.staticplugins.search.session.state;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.search.session.state.f */
/* compiled from: PG */
public final /* synthetic */ class C116697f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C116836z f323626a;

    public /* synthetic */ C116697f(C116836z zVar) {
        this.f323626a = zVar;
    }

    public final void run() {
        C116836z zVar = this.f323626a;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 6;
        kVar.f236086a |= 1;
        zVar.mo103029z((VoiceAction) null, (C87423k) jVar.build(), false, true, true);
    }
}
