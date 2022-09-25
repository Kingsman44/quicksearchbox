package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9849e;

import com.google.android.apps.search.assistant.libraries.p8984ui.transcription.TranscriptionView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.e.e */
/* compiled from: PG */
public final /* synthetic */ class C129769e implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C129776l f356081a;

    public /* synthetic */ C129769e(C129776l lVar) {
        this.f356081a = lVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C129776l lVar = this.f356081a;
        C127170c cVar = (C127170c) obj;
        if (!cVar.f350108b.f333871e) {
            lVar.mo109254h(!cVar.mo107982c());
            cVar.mo107981b((TranscriptionView) lVar.f356095b.requireView().findViewById(R.id.assistant_canvas_plate_voice_transcription));
        }
    }
}
