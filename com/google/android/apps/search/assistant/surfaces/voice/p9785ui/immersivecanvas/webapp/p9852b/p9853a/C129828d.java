package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129824e;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a.p9854a.C129825f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.d */
/* compiled from: PG */
final class C129828d implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56382g(th)).mo56372aa(38499)).mo56386p("Failed to post TTS mark to event queue.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C129825f fVar = (C129825f) obj;
        if (fVar == null) {
            ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38501)).mo56386p("TtsMarkResult result is null.");
            return;
        }
        int a = C129824e.m211965a(fVar.f356207b);
        if (a == 0 || a != 2) {
            C59052c cVar = (C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38500);
            int a2 = C129824e.m211965a(fVar.f356207b);
            if (a2 == 0) {
                a2 = 1;
            }
            cVar.mo56387q("Error posting TTS mark to queue, code: %d", a2 - 1);
        }
    }
}
