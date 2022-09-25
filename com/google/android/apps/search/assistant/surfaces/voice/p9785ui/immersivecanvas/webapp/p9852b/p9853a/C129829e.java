package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17465aa;
import com.google.android.libraries.assistant.p1363c.p1398g.p1436k.C17467ac;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.e */
/* compiled from: PG */
final class C129829e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C129834j f356210a;

    public C129829e(C129834j jVar) {
        this.f356210a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38502)).mo56354G("%s Callback failure: %s", "[TtsPlaybackEndCallback]", this.f356210a.f356223d.f123099a.mo51243b(th).f123104a);
        this.f356210a.mo109287b("ERROR");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C17465aa aaVar;
        C17467ac acVar = (C17467ac) obj;
        if (acVar.f50443b != 1) {
            C59052c cVar = (C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38503);
            if (acVar.f50443b == 2) {
                aaVar = C17465aa.m34779a(((Integer) acVar.f50444c).intValue());
                if (aaVar == null) {
                    aaVar = C17465aa.UNSPECIFIED_PLAYBACK_END_FAILURE;
                }
            } else {
                aaVar = C17465aa.UNSPECIFIED_PLAYBACK_END_FAILURE;
            }
            cVar.mo56352E("%s TTS playback end failed with error code: %d", "[TtsPlaybackEndCallback]", aaVar.f50439g);
            this.f356210a.mo109287b("ERROR");
            return;
        }
        this.f356210a.mo109287b("END");
    }
}
