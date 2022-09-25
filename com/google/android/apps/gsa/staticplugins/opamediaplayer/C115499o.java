package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.o */
/* compiled from: PG */
public final /* synthetic */ class C115499o implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f320362a;

    public /* synthetic */ C115499o(C115157bb bbVar) {
        this.f320362a = bbVar;
    }

    public final void run() {
        C115157bb bbVar = this.f320362a;
        C86337q b = ((C86338r) bbVar.f319596g.mo27525b()).mo80076b();
        b.mo80068c("opa_media_player_session_data", ((C115169f) bbVar.f319601l.f319612c.build()).toByteArray());
        b.apply();
    }
}
