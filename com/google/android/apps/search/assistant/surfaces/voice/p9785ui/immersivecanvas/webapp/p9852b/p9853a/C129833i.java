package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.p9852b.p9853a;

import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.p4449cd.p4456g.C57981b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.b.a.i */
/* compiled from: PG */
public final class C129833i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C129834j f356216a;

    /* renamed from: b */
    private final C17360b f356217b;

    public C129833i(C129834j jVar, C17360b bVar) {
        this.f356216a = jVar;
        this.f356217b = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) C129834j.f356218a.mo56226d()).mo56372aa(38513)).mo56386p("TtsTimepointStreamCallback callback failure.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            this.f356217b.mo23303b();
        } else {
            ((C57981b) optional.get()).mo20440jJ(new C129832h(this.f356216a, this.f356217b));
        }
    }
}
