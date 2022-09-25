package com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e;

import android.view.View;
import com.google.android.apps.search.assistant.libraries.p8984ui.transcription.TranscriptionView;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.ui.e.g */
/* compiled from: PG */
final /* synthetic */ class C128618g implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C128619h f353615a;

    public C128618g(C128619h hVar) {
        this.f353615a = hVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C127170c cVar = (C127170c) obj;
        C69664n.m101061g(cVar, "p0");
        C128619h hVar = this.f353615a;
        if (!cVar.mo107982c()) {
            View findViewById = hVar.f353618c.requireView().findViewById(R.id.assistant_transcription);
            C69664n.m101060f(findViewById, "fragment.requireView().f….assistant_transcription)");
            cVar.mo107981b((TranscriptionView) findViewById);
        }
    }
}
