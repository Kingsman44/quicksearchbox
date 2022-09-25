package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9026d.p9027a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9022c.p9024b.C119707a;
import com.google.android.libraries.search.assistant.p2703l.C34794h;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.b.c.d.a.c */
/* compiled from: PG */
public final /* synthetic */ class C119720c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C119724g f333537a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f333538b;

    public /* synthetic */ C119720c(C119724g gVar, C51809dy dyVar) {
        this.f333537a = gVar;
        this.f333538b = dyVar;
    }

    public final Object call() {
        C119724g gVar = this.f333537a;
        C51809dy dyVar = this.f333538b;
        if (gVar.f333547e == null) {
            C34794h a = gVar.f333544b.mo39515a(new C119722e(gVar));
            gVar.f333547e = a.f92324a;
            gVar.f333548f.mo38849b(new C119719b(a));
            C59104x b = C119724g.f333543a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ConvEngine.DynamicServices");
            ((C59052c) ((C59052c) b).mo56372aa(34566)).mo56389s("OpaHandoverService initialized: %s", gVar.f333547e.f92323b);
        }
        C51808dx dxVar = (C51808dx) dyVar.toBuilder();
        C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
        dvVar.mo53733c(C119707a.f333524a.mo38881b(gVar.f333547e));
        dxVar.mo53736a((C51807dw) dvVar.build());
        return (C51809dy) dxVar.build();
    }
}
