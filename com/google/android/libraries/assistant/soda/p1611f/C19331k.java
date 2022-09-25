package com.google.android.libraries.assistant.soda.p1611f;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67145ms;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.k */
/* compiled from: PG */
final class C19331k implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f54098a;

    /* renamed from: b */
    final /* synthetic */ C19335o f54099b;

    public C19331k(C19335o oVar, C70862aj ajVar) {
        this.f54099b = oVar;
        this.f54098a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C19336p.f54108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47775)).mo56386p("Exception when start capturing!");
        this.f54098a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        C58976aa aaVar = C58975e.f156826a;
        C19335o oVar = this.f54099b;
        C70862aj ajVar = this.f54098a;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        knVar.mo58885m(C67145ms.f182515b, C67145ms.f182514a);
        oVar.mo24467d(ajVar, (C67087ko) knVar.build());
    }
}
