package com.google.android.libraries.search.assistant.invocation.p2601d.p2602a.p2606b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.invocation.d.a.b.c */
/* compiled from: PG */
final class C33633c extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C69648ae f89869a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33633c(C69648ae aeVar) {
        super(0);
        this.f89869a = aeVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        if (this.f89869a.f186027a == null) {
            C59052c cVar = (C59052c) C33638h.f89888a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.AudioFocus.Server");
            cVar.mo56379ah(new C59094n(51242));
            cVar.mo56386p("Audio focus streaming call completed, but no InvocationToken is available.");
        }
        return C69788q.f186170a;
    }
}
