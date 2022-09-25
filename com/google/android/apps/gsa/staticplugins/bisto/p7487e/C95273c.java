package com.google.android.apps.gsa.staticplugins.bisto.p7487e;

import com.google.android.apps.gsa.staticplugins.bisto.p7485c.C95235k;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.e.c */
/* compiled from: PG */
public final /* synthetic */ class C95273c implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C95283m f266574a;

    public /* synthetic */ C95273c(C95283m mVar) {
        this.f266574a = mVar;
    }

    public final void run() {
        C95283m mVar = this.f266574a;
        C59104x d = C95283m.f266591a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AudioPlayer");
        ((C59052c) ((C59052c) d).mo56372aa(14831)).mo56386p("Playback timeout. Misbehaving caller!");
        C95235k kVar = (C95235k) mVar.f266599i.get();
        synchronized (mVar.f266592b) {
            if (mVar.f266600j != null) {
                kVar = null;
            }
        }
        if (kVar != null) {
            kVar.mo89146a(1);
        }
    }
}
