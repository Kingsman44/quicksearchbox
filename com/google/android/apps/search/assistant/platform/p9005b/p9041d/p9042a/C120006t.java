package com.google.android.apps.search.assistant.platform.p9005b.p9041d.p9042a;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119800av;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34829c;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65479b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5078a.p5079a.p5080a.p5081a.C65480c;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.platform.b.d.a.t */
/* compiled from: PG */
public final /* synthetic */ class C120006t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C119944aa f334147a;

    /* renamed from: b */
    public final /* synthetic */ C119800av f334148b;

    public /* synthetic */ C120006t(C119944aa aaVar, C119800av avVar) {
        this.f334147a = aaVar;
        this.f334148b = avVar;
    }

    public final void run() {
        C52070ec ecVar;
        C34822b bVar;
        C119944aa aaVar = this.f334147a;
        C119800av avVar = this.f334148b;
        C120012z zVar = (C120012z) aaVar.f334028c.get(Long.valueOf(avVar.f333697c));
        if (zVar != null) {
            C2164c cVar = zVar.f334155b;
            if (cVar != null) {
                int i = avVar.f333695a;
                int i2 = i != 0 ? i != 2 ? i != 3 ? 0 : 2 : 1 : 3;
                int i3 = i2 - 1;
                if (i2 == 0) {
                    throw null;
                } else if (i3 == 0) {
                    if (i == 2) {
                        ecVar = (C52070ec) avVar.f333696b;
                    } else {
                        ecVar = C52070ec.f136651d;
                    }
                    cVar.mo5437b(ecVar);
                } else if (i3 == 1) {
                    if (i == 3) {
                        bVar = (C34822b) avVar.f333696b;
                    } else {
                        bVar = C34822b.f92358d;
                    }
                    cVar.mo5439d(C34830d.m63594a(bVar));
                } else if (i3 == 2) {
                    cVar.mo5439d(new StatusException(Status.f186906d.withDescription("Invalid ClientOpExecutionResponse"), C34829c.m63593b(C65480c.f177999a, C65479b.INTERNAL_INVALID_CLIENT_OP_EXECUTION_RESPONSE)));
                }
            }
            zVar.f334156c.f334028c.remove(Long.valueOf(zVar.f334154a));
        }
    }
}
