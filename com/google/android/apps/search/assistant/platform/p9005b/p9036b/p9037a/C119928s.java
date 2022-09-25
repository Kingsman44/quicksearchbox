package com.google.android.apps.search.assistant.platform.p9005b.p9036b.p9037a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.b.b.a.s */
/* compiled from: PG */
final class C119928s implements C32774c {
    /* renamed from: a */
    public final void mo38033a(C32796ar arVar) {
        C69664n.m101061g(arVar, "contextKey");
        C59071e eVar = C119931v.f334004a;
        C58976aa aaVar = C58975e.f156826a;
        if (arVar.f87975a == 1) {
            String str = (String) arVar.f87976b;
        }
    }

    /* renamed from: b */
    public final void mo38034b(Throwable th) {
        if (th == null) {
            C59052c cVar = (C59052c) C119931v.f334004a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Context");
            cVar.mo56379ah(new C59094n(34595));
            cVar.mo56386p("#onSessionDisconnected: client disconnected from Context API successfully");
            return;
        }
        C59052c cVar2 = (C59052c) C119931v.f334004a.mo56226d();
        cVar2.mo56378ag(C58975e.f156826a, "ConvEngine.Context");
        String message = th.getMessage();
        cVar2.mo56379ah(new C59094n(34594));
        cVar2.mo56389s("#onSessionDisconnected: client is disconnected from Context API due to Error: %s", message);
    }
}
