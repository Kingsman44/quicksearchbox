package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.bn */
/* compiled from: PG */
final class C126803bn implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126804bo f349195a;

    public C126803bn(C126804bo boVar) {
        this.f349195a = boVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C126804bo.f349196a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(37176)).mo56386p("Audio level loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C119785ag agVar = (C119785ag) obj;
        C59104x b = C126804bo.f349196a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeFragmentPeer");
        ((C59052c) ((C59052c) b).mo56372aa(37177)).mo56387q("onAudioLevelUpdate: %s", agVar.f333650a);
        this.f349195a.f349200D = agVar.f333650a;
    }
}
