package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a.p9078e;

import com.google.android.libraries.search.assistant.p2517f.p2518a.C32774c;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.e.a */
/* compiled from: PG */
final class C120300a implements C32774c {

    /* renamed from: a */
    public static final C120300a f334709a = new C120300a();

    /* renamed from: b */
    private static final C59071e f334710b = C59071e.m91331h();

    private C120300a() {
    }

    /* renamed from: a */
    public final void mo38033a(C32796ar arVar) {
        C69664n.m101061g(arVar, "contextKey");
        C59052c cVar = (C59052c) f334710b.mo56226d();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
        cVar.mo56379ah(new C59094n(34709));
        cVar.mo56386p("Context key invalidated for assist data sender!");
    }

    /* renamed from: b */
    public final void mo38034b(Throwable th) {
        if (th != null) {
            C59052c cVar = (C59052c) f334710b.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "ConvEngine.OnlineProcessing");
            C59052c cVar2 = (C59052c) cVar.mo56382g(th);
            cVar2.mo56379ah(new C59094n(34710));
            cVar2.mo56386p("Failure in access session callback");
        }
    }
}
