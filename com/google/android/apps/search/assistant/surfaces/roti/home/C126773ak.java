package com.google.android.apps.search.assistant.surfaces.roti.home;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.ak */
/* compiled from: PG */
public final /* synthetic */ class C126773ak implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126778ap f349112a;

    /* renamed from: b */
    public final /* synthetic */ C119748c f349113b;

    public /* synthetic */ C126773ak(C126778ap apVar, C119748c cVar) {
        this.f349112a = apVar;
        this.f349113b = cVar;
    }

    public final void run() {
        C126778ap apVar = this.f349112a;
        C119748c cVar = this.f349113b;
        C59104x b = C126780ar.f349122a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ConversationController");
        ((C59052c) ((C59052c) b).mo56372aa(37152)).mo56386p("onConnected");
        ((C2164c) apVar.f349121a.f349134m.orElseThrow(C126775am.f349116a)).mo5437b(cVar);
        apVar.f349121a.f349134m = Optional.empty();
    }
}
