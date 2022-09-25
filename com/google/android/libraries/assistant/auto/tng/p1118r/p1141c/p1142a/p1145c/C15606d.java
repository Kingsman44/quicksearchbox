package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1145c;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.c.d */
/* compiled from: PG */
public final /* synthetic */ class C15606d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C15666r f46660a;

    public /* synthetic */ C15606d(C15666r rVar) {
        this.f46660a = rVar;
    }

    public final Object apply(Object obj) {
        C15666r rVar = this.f46660a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C15593a aVar = (C15593a) axVar.mo56107c();
            C58976aa aaVar = C58975e.f156826a;
            aVar.getClass();
            return aVar.mo22414a(rVar);
        }
        C59104x b = C15609g.f46664a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PortableDispatcher");
        ((C59052c) ((C59052c) b).mo56372aa(46185)).mo56386p("#maybeExecuteFulfillmentRequest: No fulfiller can handle.");
        return C15668t.m32460b();
    }
}
