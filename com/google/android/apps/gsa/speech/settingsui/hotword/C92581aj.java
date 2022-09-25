package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92603b;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.aj */
/* compiled from: PG */
final class C92581aj extends C92603b {

    /* renamed from: a */
    final /* synthetic */ C92582ak f258355a;

    public C92581aj(C92582ak akVar) {
        this.f258355a = akVar;
    }

    /* renamed from: a */
    public final void mo64739a() {
        C92582ak akVar = this.f258355a;
        C92559l lVar = akVar.f258357a;
        if (lVar != null) {
            lVar.mo87331g(true);
            EventForDump.m147676e(5, "voiceModelDeleted");
            akVar.mo87360e(false);
        }
    }
}
