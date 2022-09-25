package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.search.assistant.proactive.ba */
/* compiled from: PG */
public final /* synthetic */ class C36233ba implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94641a;

    /* renamed from: b */
    public final /* synthetic */ C119851cs f94642b;

    public /* synthetic */ C36233ba(C36240bh bhVar, C119851cs csVar) {
        this.f94641a = bhVar;
        this.f94642b = csVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C36240bh bhVar = this.f94641a;
        C119851cs csVar = this.f94642b;
        if (bhVar.f94663m == null) {
            bhVar.f94663m = bhVar.f94659i.mo38224a("Proactive", C58485gu.m89842j(bhVar.f94658h));
        }
        bhVar.f94653c.mo19974a(C37197a.f98671g);
        C59104x b = C36240bh.f94651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52257)).mo56386p("#Connects to Torus/Cross Device service");
        C36235bc bcVar = new C36235bc(bhVar);
        return C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(bcVar), bhVar.f94656f)).mo51516i(new C36236bd(bhVar, csVar), bhVar.f94656f);
    }
}
