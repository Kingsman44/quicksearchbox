package com.google.android.apps.search.fedora.p10110k.p10113c;

import android.text.TextUtils;
import com.google.android.libraries.assistant.trainingcache.p1615a.C19396a;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19408l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.k.c.j */
/* compiled from: PG */
public final /* synthetic */ class C133036j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133046t f362761a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362762b;

    public /* synthetic */ C133036j(C133046t tVar, boolean z) {
        this.f362761a = tVar;
        this.f362762b = z;
    }

    public final C60870cx apply(Object obj) {
        C133046t tVar = this.f362761a;
        boolean z = this.f362762b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C133046t.f362774a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b).mo56372aa(39981)).mo56386p("Empty FL trainer options. Skipping to the next provider.");
            return C60866ct.f164955a;
        } else if (TextUtils.isEmpty(((C19408l) optional.get()).mo24548b())) {
            C59104x b2 = C133046t.f362774a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b2).mo56372aa(39980)).mo56386p("Empty FL training population. Skipping to the next provider.");
            return C60866ct.f164955a;
        } else {
            C59104x b3 = C133046t.f362774a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b3).mo56372aa(39979)).mo56389s("Scheduling the FL training for population: %s.", ((C19408l) optional.get()).mo24548b());
            return tVar.mo110957c(C19396a.m36985b((C19408l) optional.get(), z));
        }
    }
}
