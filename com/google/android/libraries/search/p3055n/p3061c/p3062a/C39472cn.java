package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.n.c.a.cn */
/* compiled from: PG */
public final /* synthetic */ class C39472cn implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C39477cs f103924a;

    /* renamed from: b */
    public final /* synthetic */ C39411b f103925b;

    public /* synthetic */ C39472cn(C39477cs csVar, C39411b bVar) {
        this.f103924a = csVar;
        this.f103925b = bVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C39477cs csVar = this.f103924a;
        C39411b bVar = this.f103925b;
        C59104x b = C39479cu.f103938a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SodaTriggeringFrontend");
        ((C59052c) ((C59052c) b).mo56372aa(53541)).mo56386p("Inside Sequencer. Try to start recognition again after hotword timeout.");
        csVar.f103935a.f103970u.mo41870d(C37176a.f97230hd.mo40779c(), bVar);
        C39479cu cuVar = csVar.f103935a;
        return cuVar.mo41844e((C39767h) cuVar.f103975z.mo56107c(), csVar.f103935a.f103975z, true, (C39393ai) null, bVar);
    }
}
