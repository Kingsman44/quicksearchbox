package com.google.android.libraries.assistant.auto.tng.p1112p.p1113a.p1114a.p1115a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66607ce;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.auto.tng.p.a.a.a.j */
/* compiled from: PG */
public final /* synthetic */ class C15515j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15519n f46472a;

    /* renamed from: b */
    public final /* synthetic */ C66607ce f46473b;

    public /* synthetic */ C15515j(C15519n nVar, C66607ce ceVar) {
        this.f46472a = nVar;
        this.f46473b = ceVar;
    }

    public final void run() {
        C15519n nVar = this.f46472a;
        C66607ce ceVar = this.f46473b;
        if (!nVar.f46483d) {
            return;
        }
        if (((C70869h) nVar.f46481b).f189042b.mo62058i() && nVar.f46482c.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            nVar.f46481b.mo20123c(ceVar);
        } else if (nVar.f46482c.size() < 200) {
            C58976aa aaVar2 = C58975e.f156826a;
            nVar.f46482c.add(ceVar);
        } else {
            C59104x d = C15527v.f46501a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "S3ConnectionImpl");
            ((C59052c) ((C59052c) d).mo56372aa(46128)).mo56386p("Pending request size limit exceeded.");
            nVar.mo22383e("The limit of the pending request exceeded");
        }
    }
}
