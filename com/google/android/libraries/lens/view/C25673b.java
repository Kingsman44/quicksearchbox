package com.google.android.libraries.lens.view;

import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.b */
/* compiled from: PG */
public final /* synthetic */ class C25673b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25698c f69814a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f69815b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f69816c;

    public /* synthetic */ C25673b(C25698c cVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f69814a = cVar;
        this.f69815b = cxVar;
        this.f69816c = cxVar2;
    }

    public final void run() {
        C25698c cVar = this.f69814a;
        C60870cx cxVar = this.f69815b;
        C60870cx cxVar2 = this.f69816c;
        ((C58970a) ((C58970a) C25698c.f69868a.mo56224b()).mo56372aa(48968)).mo56386p("BEGIN_LENS_EXPERIMENTS");
        C58800sl lA = cVar.mo30827b().entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            ((C58970a) ((C58970a) C25698c.f69868a.mo56224b()).mo56372aa(48971)).mo56354G("LENS_FLAG %s=%s", entry.getKey(), entry.getValue());
        }
        C58800sl lA2 = cVar.mo30826a(cxVar, cxVar2).entrySet().iterator();
        while (lA2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) lA2.next();
            ((C58970a) ((C58970a) C25698c.f69868a.mo56224b()).mo56372aa(48970)).mo56354G("LENS_SERVER_TOKEN %s=%s", entry2.getKey(), entry2.getValue());
        }
        ((C58970a) ((C58970a) C25698c.f69868a.mo56224b()).mo56372aa(48969)).mo56386p("END_LENS_EXPERIMENTS");
    }
}
