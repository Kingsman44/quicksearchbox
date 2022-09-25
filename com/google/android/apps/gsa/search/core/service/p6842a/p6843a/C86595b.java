package com.google.android.apps.gsa.search.core.service.p6842a.p6843a;

import android.os.Process;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.service.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C86595b implements Runnable {

    /* renamed from: a */
    public static final /* synthetic */ C86595b f233945a = new C86595b();

    private /* synthetic */ C86595b() {
    }

    public final void run() {
        C59104x b = C86596c.f233946a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "EventBusThread");
        ((C59052c) ((C59052c) b).mo56372aa(8483)).mo56387q("Event Bus thread starting with TID %d", Process.myTid());
    }
}
