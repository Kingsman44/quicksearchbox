package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.aq */
/* compiled from: PG */
public final /* synthetic */ class C117973aq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C117975as f327428a;

    public /* synthetic */ C117973aq(C117975as asVar) {
        this.f327428a = asVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C117975as asVar = this.f327428a;
        C118826c cVar = (C118826c) obj;
        asVar.f327443n = false;
        asVar.f327437h.edit().putLong("CarTtsLastPlayedMs", asVar.f327438i.mo26870b()).commit();
        asVar.f327439j.mo83702b(C89849ae.VOICE_SEARCH_AUTO_TTS_PLAYED);
        if (asVar.f327432c.mo79746e(C90086ek.f250259K)) {
            asVar.mo103491c();
        }
    }
}
