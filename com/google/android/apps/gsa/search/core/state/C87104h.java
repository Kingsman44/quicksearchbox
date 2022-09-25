package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.search.core.state.h */
/* compiled from: PG */
public final /* synthetic */ class C87104h implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C87171z f235348a;

    public /* synthetic */ C87104h(C87171z zVar) {
        this.f235348a = zVar;
    }

    public final void run() {
        C87171z zVar = this.f235348a;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 6;
        kVar.f236086a |= 1;
        zVar.mo80822u((VoiceAction) null, (C87423k) jVar.build(), false, true, true);
    }
}
