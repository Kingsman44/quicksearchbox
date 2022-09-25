package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71080dz;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71082ea;

/* renamed from: com.google.android.libraries.search.n.c.a.bv */
/* compiled from: PG */
public final /* synthetic */ class C39445bv implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103841a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103842b;

    /* renamed from: c */
    public final /* synthetic */ C39389ae f103843c;

    /* renamed from: d */
    public final /* synthetic */ C39767h f103844d;

    public /* synthetic */ C39445bv(C39479cu cuVar, C39411b bVar, C39389ae aeVar, C39767h hVar) {
        this.f103841a = cuVar;
        this.f103842b = bVar;
        this.f103843c = aeVar;
        this.f103844d = hVar;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103841a;
        C39411b bVar = this.f103842b;
        C39389ae aeVar = this.f103843c;
        C39767h hVar = this.f103844d;
        Void voidR = (Void) obj;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53605)).mo56386p("#update inside sequencer after logAppFlowAfterAccountHandled finished.");
        if (!cuVar.f103971v.get()) {
            C59104x c = C39479cu.f103938a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
            ((C59052c) ((C59052c) c).mo56372aa(53606)).mo56386p("#update called when HDM is not initialized!");
            C37259h d = C37176a.f97248hv.mo40806d();
            C71080dz dzVar = (C71080dz) C71082ea.f189563q.createBuilder();
            dzVar.copyOnWrite();
            C71082ea eaVar = (C71082ea) dzVar.instance;
            eaVar.f189566b = aeVar.getNumber();
            eaVar.f189565a |= 1;
            return cuVar.mo41857s(d, bVar, (C71082ea) dzVar.build(), 9);
        }
        cuVar.f103970u.mo41870d(C37176a.f97170gW.mo40779c(), bVar);
        C58833ax axVar = cuVar.f103975z;
        cuVar.f103975z = C58833ax.m90834k(hVar);
        return cuVar.mo41844e(hVar, axVar, false, (C39393ai) null, bVar);
    }
}
