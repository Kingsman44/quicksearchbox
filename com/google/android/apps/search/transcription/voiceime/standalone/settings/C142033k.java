package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import androidx.preference.C4023s;
import androidx.preference.Preference;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10980g;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10984k;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.k */
/* compiled from: PG */
public final /* synthetic */ class C142033k implements C4023s {

    /* renamed from: a */
    public final /* synthetic */ C142036n f385368a;

    public /* synthetic */ C142033k(C142036n nVar) {
        this.f385368a = nVar;
    }

    /* renamed from: a */
    public final boolean mo8472a(Preference preference, Object obj) {
        C142036n nVar = this.f385368a;
        boolean equals = Boolean.TRUE.equals(obj);
        C10984k kVar = nVar.f385373c;
        C60870cx a = kVar.f36123c.mo46039a(new C10980g(equals), kVar.f36125e);
        kVar.f36124d.mo50787a(a, "Transcription:VoiceImeSettings");
        nVar.f385375e.mo50445g(C46438d.m82810b(a), new C46436b(Boolean.valueOf(equals)), nVar.f385378h);
        return false;
    }
}
