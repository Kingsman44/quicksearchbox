package com.google.android.apps.gsa.staticplugins.p7714cv.p7725i.p7727b.p7735b.p7736a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.cv.i.b.b.a.b */
/* compiled from: PG */
public final /* synthetic */ class C98912b implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C98914d f276418a;

    public /* synthetic */ C98912b(C98914d dVar) {
        this.f276418a = dVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C98914d dVar = this.f276418a;
        C118826c cVar = (C118826c) obj;
        dVar.f276427h = false;
        dVar.f276423d.edit().putLong("CarTtsLastPlayedMs", dVar.f276424e.mo26870b()).commit();
        dVar.f276425f.mo83702b(C89849ae.VOICE_SEARCH_AUTO_TTS_PLAYED);
        if (dVar.f276422c.mo79746e(C90086ek.f250259K)) {
            dVar.mo91336c();
        }
    }
}
