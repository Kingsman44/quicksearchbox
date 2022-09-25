package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129718g;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129719h;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.g */
/* compiled from: PG */
final class C129724g implements C60845bz {
    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C129725h.f355976a.mo56226d()).mo56382g(th)).mo56372aa(38430)).mo56386p("Failed to post Continuous Match event to event queue.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C129719h hVar = (C129719h) obj;
        if (hVar == null) {
            ((C59052c) ((C59052c) C129725h.f355976a.mo56226d()).mo56372aa(38432)).mo56386p("ContinuousMatchEventResult is null.");
            return;
        }
        int a = C129718g.m211779a(hVar.f355965b);
        if (a == 0 || a != 2) {
            C59052c cVar = (C59052c) ((C59052c) C129725h.f355976a.mo56226d()).mo56372aa(38431);
            int a2 = C129718g.m211779a(hVar.f355965b);
            if (a2 == 0) {
                a2 = 1;
            }
            cVar.mo56387q("Error posting Continuous Match event to queue, code: %d", a2 - 1);
        }
    }
}
