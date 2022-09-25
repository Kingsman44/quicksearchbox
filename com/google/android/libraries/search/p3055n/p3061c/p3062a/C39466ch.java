package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.n.c.a.ch */
/* compiled from: PG */
public final /* synthetic */ class C39466ch implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39479cu f103905a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103906b;

    /* renamed from: c */
    public final /* synthetic */ C39767h f103907c;

    public /* synthetic */ C39466ch(C39479cu cuVar, C39411b bVar, C39767h hVar) {
        this.f103905a = cuVar;
        this.f103906b = bVar;
        this.f103907c = hVar;
    }

    public final C60870cx apply(Object obj) {
        C39479cu cuVar = this.f103905a;
        C39411b bVar = this.f103906b;
        C39767h hVar = this.f103907c;
        Void voidR = (Void) obj;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53591)).mo56386p("#initialize inside sequencer after logAppFlowAfterAccountHandled finished");
        cuVar.f103970u.mo41870d(C37176a.f97169gV.mo40779c(), bVar);
        C39385aa aaVar = cuVar.f103958i;
        if (aaVar.f103700a == null) {
            aaVar.f103700a = cuVar;
            C58833ax axVar = cuVar.f103975z;
            cuVar.f103975z = C58833ax.m90834k(hVar);
            return cuVar.mo41844e(hVar, axVar, true, (C39393ai) null, bVar);
        }
        throw new IllegalStateException("Only one subscriber is allowed!");
    }
}
