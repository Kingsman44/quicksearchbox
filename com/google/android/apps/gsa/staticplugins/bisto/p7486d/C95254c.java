package com.google.android.apps.gsa.staticplugins.bisto.p7486d;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.d.c */
/* compiled from: PG */
public final /* synthetic */ class C95254c implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C95258g f266502a;

    public /* synthetic */ C95254c(C95258g gVar) {
        this.f266502a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C95258g gVar = this.f266502a;
        C59104x c = C95258g.f266509a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AudioPathTester");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(14790)).mo56386p("audio testing failed");
        synchronized (gVar) {
            gVar.f266516g = null;
        }
        ((C89492cd) gVar.f266512c.mo27525b()).mo83376R(gVar.f266515f, C58729pv.f156485a);
        gVar.f266513d.close();
    }
}
