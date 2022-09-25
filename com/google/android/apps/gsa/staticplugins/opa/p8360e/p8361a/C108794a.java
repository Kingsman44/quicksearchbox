package com.google.android.apps.gsa.staticplugins.opa.p8360e.p8361a;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.libraries.assistant.p1594s.p1597b.C19170bd;
import com.google.android.libraries.assistant.p1594s.p1597b.C19171be;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.e.a.a */
/* compiled from: PG */
final class C108794a implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C70862aj f302522a;

    /* renamed from: b */
    final /* synthetic */ C113405ep f302523b;

    /* renamed from: c */
    final /* synthetic */ C108795b f302524c;

    public C108794a(C108795b bVar, C70862aj ajVar, C113405ep epVar) {
        this.f302524c = bVar;
        this.f302522a = ajVar;
        this.f302523b = epVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C108795b.f302525a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "AsstTapasServiceImpl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(23825)).mo56386p("TapasEngine request failed.");
        this.f302522a.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C70862aj ajVar = this.f302522a;
        C19170bd bdVar = (C19170bd) C19171be.f53699b.createBuilder();
        bdVar.mo24304a((C58485gu) obj);
        ajVar.mo20123c((C19171be) bdVar.build());
        this.f302522a.mo20121a();
        C58976aa aaVar = C58975e.f156826a;
        this.f302523b.mo100033p();
        C118831d dVar = this.f302524c.f302527c;
        dVar.getClass();
        dVar.mo104025g(this.f302524c.f302526b.mo26870b() - this.f302523b.mo100018c());
    }
}
