package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.d */
/* compiled from: PG */
public final /* synthetic */ class C129721d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C129722e f355968a;

    public /* synthetic */ C129721d(C129722e eVar) {
        this.f355968a = eVar;
    }

    public final void run() {
        C129722e eVar = this.f355968a;
        C60870cx cxVar = eVar.f355972d;
        if (cxVar == null || cxVar.isDone()) {
            ((C59052c) ((C59052c) C129722e.f355969a.mo56226d()).mo56372aa(38429)).mo56386p("There is no ongoing Continuous Match Mode session.");
        }
        eVar.f355971c.mo109200a();
    }
}
