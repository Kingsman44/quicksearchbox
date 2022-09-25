package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.cg */
/* compiled from: PG */
final class C126827cg implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126824cf f349285a;

    public C126827cg(C126824cf cfVar) {
        this.f349285a = cfVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126824cf.f349260a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37200)).mo56386p("Assistant state loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            C59104x b = C126824cf.f349260a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "IntentApiFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(37201)).mo56389s("onDisconnection from APA, Error: %s", th);
            C126838cr.m207507f(this.f349285a.f349266g, 3);
            this.f349285a.mo107822e(R.string.assistant_roti_networkunreachable_greeting, 3);
        }
    }
}
