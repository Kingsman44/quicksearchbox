package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.p8248c;

import android.view.View;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.c.a */
/* compiled from: PG */
final class C106746a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C106747b f297472a;

    public C106746a(C106747b bVar) {
        this.f297472a = bVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f297472a.f297473a.mo56225c()).mo56382g(th)).mo56372aa(23270)).mo56386p("failed to get view.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Optional optional = (Optional) obj;
        if (optional != null && optional.isPresent()) {
            C28295m.m52919e((View) optional.get(), new C28292j(104340));
        }
    }
}
