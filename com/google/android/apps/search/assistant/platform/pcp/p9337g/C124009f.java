package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.f */
/* compiled from: PG */
public final /* synthetic */ class C124009f implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C124009f f342520a = new C124009f();

    private /* synthetic */ C124009f() {
    }

    public final C60870cx apply(Object obj) {
        RuntimeException runtimeException = (RuntimeException) obj;
        C59104x d = C124012i.f342525a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "PCP.SyncManager");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(runtimeException)).mo56372aa(35355)).mo56386p("PCP.SyncManager: sync failed.");
        return C60856cj.m92899h(runtimeException);
    }
}
