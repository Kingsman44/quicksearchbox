package com.google.android.apps.gsa.assistant.handoff;

import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90878al;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70334de;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.x */
/* compiled from: PG */
final class C9491x extends C90878al {

    /* renamed from: a */
    final /* synthetic */ C9492y f32935a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9491x(C9492y yVar) {
        super("transform tokenFuture to ManagedChannel", 1, 4);
        this.f32935a = yVar;
    }

    public final /* bridge */ /* synthetic */ C60870cx apply(Object obj) {
        String str = (String) obj;
        if (str != null) {
            return ((C89012aj) this.f32935a.f32938c.mo27525b()).mo27501m(this.f32935a.f32937b.mo79758x(C90014bt.f247532it), (int) this.f32935a.f32937b.mo79743a(C90014bt.f247533iu), (C70334de) null, str, 40);
        }
        C59104x c = C9492y.f32936a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GrpcHandoffSubmitter");
        ((C59052c) ((C59052c) c).mo56372aa(270)).mo56386p("Failed to get token for the user, can't submit handoff result.");
        throw new RuntimeException("Can't get token for the signed in user.");
    }
}
