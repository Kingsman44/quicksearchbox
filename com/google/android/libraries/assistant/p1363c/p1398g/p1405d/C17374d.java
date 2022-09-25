package com.google.android.libraries.assistant.p1363c.p1398g.p1405d;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.assistant.c.g.d.d */
/* compiled from: PG */
final class C17374d extends C69665o implements C69626l {

    /* renamed from: a */
    public static final C17374d f50255a = new C17374d();

    public C17374d() {
        super(1);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th != null) {
            C59052c cVar = (C59052c) C17375e.f50256a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Tts.Debug");
            C59052c cVar2 = (C59052c) cVar.mo56382g(th);
            cVar2.mo56379ah(new C59094n(42690));
            cVar2.mo56386p("Appending TtsSessionDebugData failed.");
        }
        return C69788q.f186170a;
    }
}
