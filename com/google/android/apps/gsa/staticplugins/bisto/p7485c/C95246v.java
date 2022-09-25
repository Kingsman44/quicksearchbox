package com.google.android.apps.gsa.staticplugins.bisto.p7485c;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.c.v */
/* compiled from: PG */
public final class C95246v implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ String f266472a;

    /* renamed from: b */
    final /* synthetic */ C95248x f266473b;

    public C95246v(C95248x xVar, String str) {
        this.f266473b = xVar;
        this.f266472a = str;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C95248x.f266475a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BvraAudioRouteManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(14744)).mo56389s("Failed to get deviceinfo for %s", this.f266472a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C124548d dVar = (C124548d) obj;
        synchronized (this.f266473b) {
            this.f266473b.f266486l = true;
        }
    }
}
