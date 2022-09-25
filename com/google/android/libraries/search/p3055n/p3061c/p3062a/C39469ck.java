package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.ck */
/* compiled from: PG */
public final /* synthetic */ class C39469ck implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103915a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103916b;

    /* renamed from: c */
    public final /* synthetic */ C39389ae f103917c;

    public /* synthetic */ C39469ck(C39479cu cuVar, C39411b bVar, C39389ae aeVar) {
        this.f103915a = cuVar;
        this.f103916b = bVar;
        this.f103917c = aeVar;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103915a;
        C39411b bVar = this.f103916b;
        C39389ae aeVar = this.f103917c;
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g((Throwable) obj)).mo56372aa(53601)).mo56386p("shutdown triggering failed.");
        C37259h d2 = C37176a.f97247hu.mo40806d();
        C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
        dzVar.copyOnWrite();
        C71082ea eaVar = (C71082ea) dzVar.instance;
        eaVar.f189566b = aeVar.getNumber();
        eaVar.f189565a |= 1;
        return cuVar.mo41857s(d2, bVar, (C71082ea) dzVar.build(), 7);
    }
}
