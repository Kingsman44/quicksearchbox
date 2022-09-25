package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.cf */
/* compiled from: PG */
public final /* synthetic */ class C39464cf implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103899a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103900b;

    /* renamed from: c */
    public final /* synthetic */ C39389ae f103901c;

    public /* synthetic */ C39464cf(C39479cu cuVar, C39411b bVar, C39389ae aeVar) {
        this.f103899a = cuVar;
        this.f103900b = bVar;
        this.f103901c = aeVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39479cu cuVar = this.f103899a;
        C39411b bVar = this.f103900b;
        C39389ae aeVar = this.f103901c;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53602)).mo56386p("#shutdown inside sequencer");
        cuVar.f103970u.mo41870d(C37176a.f97171gX.mo40779c(), bVar);
        cuVar.f103958i.f103700a = null;
        cuVar.f103968s.mo41879a(false);
        if (cuVar.f103974y.mo56113h()) {
            C58836b bVar2 = C58836b.f156633a;
            cuVar.f103974y = bVar2;
            cuVar.f103973x = bVar2;
            cuVar.f103975z = bVar2;
            cuVar.f103939A = bVar2;
            cuVar.f103940B = bVar2;
            return C47633f.m84733g(((C39406av) cuVar.f103974y.mo56107c()).mo41818a()).mo51516i(new C39468cj(cuVar, bVar, aeVar), cuVar.f103953d).mo51514f(Throwable.class, new C39469ck(cuVar, bVar, aeVar), cuVar.f103953d);
        }
        C59104x d = C39479cu.f103938a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) d).mo56372aa(53603)).mo56386p("#shutdown called when HDM is not initialized!");
        C37259h d2 = C37176a.f97248hv.mo40806d();
        C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
        dzVar.copyOnWrite();
        C71082ea eaVar = (C71082ea) dzVar.instance;
        eaVar.f189566b = aeVar.getNumber();
        eaVar.f189565a |= 1;
        return cuVar.mo41857s(d2, bVar, (C71082ea) dzVar.build(), 8);
    }
}
