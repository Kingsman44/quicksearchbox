package com.google.android.apps.search.assistant.surfaces.roti.home;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.roti.home.w */
/* compiled from: PG */
public final /* synthetic */ class C126862w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126780ar f349337a;

    public /* synthetic */ C126862w(C126780ar arVar) {
        this.f349337a = arVar;
    }

    public final void run() {
        C119748c cVar = this.f349337a.f349128g;
        if (cVar == null) {
            C59104x b = C126780ar.f349122a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConversationController");
            ((C59052c) ((C59052c) b).mo56372aa(37164)).mo56386p("[disconnect] connection does not exist, exiting");
            return;
        }
        cVar.mo104501d();
    }
}
