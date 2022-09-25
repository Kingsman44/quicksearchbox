package com.google.android.apps.gsa.speech.settingsui.hotword;

import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.speech.settingsui.hotword.base.C92603b;
import com.google.android.apps.gsa.speech.settingsui.p7313a.C92559l;

/* renamed from: com.google.android.apps.gsa.speech.settingsui.hotword.y */
/* compiled from: PG */
final class C92630y extends C92603b {

    /* renamed from: a */
    final /* synthetic */ C92631z f258541a;

    public C92630y(C92631z zVar) {
        this.f258541a = zVar;
    }

    /* renamed from: a */
    public final void mo64739a() {
        C92631z zVar = this.f258541a;
        C92559l lVar = zVar.f258543a;
        if (lVar != null) {
            lVar.mo87331g(true);
            zVar.mo87399e(false, EventForDump.m147676e(5, "voiceModelDeleted"));
        }
    }
}
