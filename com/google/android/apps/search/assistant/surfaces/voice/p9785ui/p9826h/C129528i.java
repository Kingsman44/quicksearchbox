package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9826h;

import android.support.p031v4.app.C0154a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9538d.C127170c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128614c;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9741e.C128617f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.h.i */
/* compiled from: PG */
public final /* synthetic */ class C129528i implements C46852f {

    /* renamed from: a */
    public final /* synthetic */ C129529j f355571a;

    public /* synthetic */ C129528i(C129529j jVar) {
        this.f355571a = jVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final void mo20961j(Object obj) {
        C129529j jVar = this.f355571a;
        C127170c cVar = (C127170c) obj;
        if (cVar.f350108b.f333871e || cVar.mo107982c()) {
            return;
        }
        if (jVar.f355573b.getChildFragmentManager().f634a.mo670b(R.id.assistant_feature_container) == null) {
            C128614c c = C128617f.m209911c(jVar.f355575d);
            C0154a aVar = new C0154a(jVar.f355573b.getChildFragmentManager());
            aVar.mo511h(R.id.assistant_feature_container, c, "transcription", 1);
            aVar.mo509f();
        } else if (!"transcription".equals(jVar.f355573b.getTag())) {
            C128614c c2 = C128617f.m209911c(jVar.f355575d);
            C0154a aVar2 = new C0154a(jVar.f355573b.getChildFragmentManager());
            aVar2.mo689v(R.id.assistant_feature_container, c2, "transcription");
            aVar2.mo509f();
        }
    }
}
