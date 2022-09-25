package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3066d;

import androidx.p104d.p105a.C2164c;
import com.google.android.hotword.service.HotwordInformation;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.search.n.c.a.d.e */
/* compiled from: PG */
final class C39490e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ HotwordInformation f104006a;

    /* renamed from: b */
    final /* synthetic */ C2164c f104007b;

    public C39490e(HotwordInformation hotwordInformation, C2164c cVar) {
        this.f104006a = hotwordInformation;
        this.f104007b = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C39493h.f104012a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) d).mo56372aa(53672)).mo56389s("Getting the Hotword model from URL failed: %s. Cannot get the hotword model!", th.getMessage());
        this.f104007b.mo5437b(this.f104006a);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        HotwordInformation hotwordInformation = this.f104006a;
        hotwordInformation.f395875G = (byte[]) obj;
        this.f104007b.mo5437b(hotwordInformation);
        C59104x b = C39493h.f104012a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HotwordInfoProvider");
        ((C59052c) ((C59052c) b).mo56372aa(53673)).mo56386p("Save the htoword model in the HotwordInformation.");
    }
}
