package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bp */
/* compiled from: PG */
final class C126807bp implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126804bo f349241a;

    public C126807bp(C126804bo boVar) {
        this.f349241a = boVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126804bo.f349196a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37180)).mo56386p("Assistant state loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            C59104x b = C126804bo.f349196a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
            ((C59052c) ((C59052c) ((C59052c) b).mo56382g(th)).mo56372aa(37181)).mo56389s("onDisconnection from APA, Error: %s", th);
            C126838cr.m207507f(this.f349241a.f349220h, 3);
            this.f349241a.mo107808n(R.string.assistant_roti_networkunreachable_greeting, 3);
        }
    }
}
