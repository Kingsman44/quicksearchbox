package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.C124211d;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.proactive.bd */
/* compiled from: PG */
public final /* synthetic */ class C36236bd implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36240bh f94646a;

    /* renamed from: b */
    public final /* synthetic */ C119851cs f94647b;

    public /* synthetic */ C36236bd(C36240bh bhVar, C119851cs csVar) {
        this.f94646a = bhVar;
        this.f94647b = csVar;
    }

    public final C60870cx apply(Object obj) {
        C36240bh bhVar = this.f94646a;
        C119851cs csVar = this.f94647b;
        bhVar.f94662l = (C124211d) obj;
        bhVar.f94653c.mo19974a(C37197a.f98672h);
        C59104x b = C36240bh.f94651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52260)).mo56386p("#Starts conversation interaction");
        C36237be beVar = new C36237be(bhVar, csVar);
        return C60856cj.m92905n(C47810es.m84965e(beVar), bhVar.f94656f);
    }
}
