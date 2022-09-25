package com.google.android.libraries.assistant.soda.p1611f;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.protobuf.C62940bt;
import com.google.speech.p5218j.C66892di;
import com.google.speech.p5218j.C66893dj;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import com.google.speech.p5218j.C67150mx;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.m */
/* compiled from: PG */
final class C19333m implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f54102a;

    /* renamed from: b */
    final /* synthetic */ C19335o f54103b;

    public C19333m(C19335o oVar, C70862aj ajVar) {
        this.f54103b = oVar;
        this.f54102a = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C19336p.f54108a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(47779)).mo56386p("Exception when getting the Soda configResult");
        this.f54102a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C67150mx mxVar = (C67150mx) obj;
        C59104x b = C19336p.f54108a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaService");
        ((C59052c) ((C59052c) b).mo56372aa(47780)).mo56389s("Sending configResult: %s back to client", mxVar);
        C19335o oVar = this.f54103b;
        C70862aj ajVar = this.f54102a;
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        C62940bt btVar = C66893dj.f181859d;
        C66892di diVar = (C66892di) C66893dj.f181858c.createBuilder();
        diVar.copyOnWrite();
        C66893dj djVar = (C66893dj) diVar.instance;
        mxVar.getClass();
        djVar.f181862b = mxVar;
        djVar.f181861a |= 1;
        knVar.mo58885m(btVar, (C66893dj) diVar.build());
        oVar.mo24467d(ajVar, (C67087ko) knVar.build());
    }
}
