package com.google.android.libraries.search.p3005i.p3010e.p3011a;

import com.google.android.libraries.geller.p1818f.C21850cf;
import com.google.android.libraries.geller.portable.GellerException;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p5129p.p5130a.C65708ag;
import com.google.protos.p5129p.p5130a.C65710ai;
import com.google.protos.p5129p.p5131b.C65753ak;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.i.e.a.d */
/* compiled from: PG */
final class C38452d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C65708ag f101771a;

    /* renamed from: b */
    final /* synthetic */ C58528ij f101772b;

    /* renamed from: c */
    final /* synthetic */ C70862aj f101773c;

    public C38452d(C65708ag agVar, C58528ij ijVar, C70862aj ajVar) {
        this.f101771a = agVar;
        this.f101772b = ijVar;
        this.f101773c = ajVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C38453e.f101774a.mo56226d()).mo56382g(th)).mo56372aa(53107)).mo56386p("Failed to write to Geller storage");
        this.f101773c.mo20122b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58495hd hdVar = (C58495hd) obj;
        if (this.f101771a.f178524c) {
            C58800sl lA = this.f101772b.iterator();
            while (lA.hasNext()) {
                C65753ak akVar = (C65753ak) lA.next();
                if (!hdVar.containsKey(akVar)) {
                    this.f101773c.mo20122b(new GellerException(C62722b.UNKNOWN, String.format("Could not find %s corpus from sync result map", new Object[]{akVar.name()})));
                    return;
                } else if (!((C21850cf) hdVar.get(akVar)).mo27152b().isEmpty()) {
                    this.f101773c.mo20122b((Throwable) ((C21850cf) hdVar.get(akVar)).mo27152b().get(0));
                    return;
                }
            }
        }
        this.f101773c.mo20123c(C65710ai.f178526b);
    }
}
