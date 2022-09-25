package com.google.android.apps.gsa.staticplugins.accl.performers.p7347h;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.h.ba */
/* compiled from: PG */
final class C93149ba extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f259798a;

    /* renamed from: b */
    final /* synthetic */ C93150bb f259799b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C93149ba(C93150bb bbVar, SettableFuture settableFuture) {
        super("TTS completes", 2, 0);
        this.f259799b = bbVar;
        this.f259798a = settableFuture;
    }

    public final void run() {
        this.f259798a.mo57356n(C118826c.f331422a);
        this.f259799b.mo87559j(C88244um.TTS_PLAYBACK_DONE);
    }
}
