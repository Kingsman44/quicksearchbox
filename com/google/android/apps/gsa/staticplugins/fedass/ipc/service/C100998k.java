package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.k */
/* compiled from: PG */
public final /* synthetic */ class C100998k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282082a;

    /* renamed from: b */
    public final /* synthetic */ boolean f282083b;

    public /* synthetic */ C100998k(C101012y yVar, boolean z) {
        this.f282082a = yVar;
        this.f282083b = z;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282082a;
        boolean z = this.f282083b;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C101012y.f282104a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) b).mo56372aa(19611)).mo56386p("Empty FL trainer options. Skipping to the next provider.");
            return C60866ct.f164955a;
        } else if (TextUtils.isEmpty(((C19408l) optional.get()).mo24548b())) {
            C59104x b2 = C101012y.f282104a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) b2).mo56372aa(19610)).mo56386p("Empty FL training population. Skipping to the next provider.");
            return C60866ct.f164955a;
        } else {
            C59104x b3 = C101012y.f282104a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) b3).mo56372aa(19609)).mo56389s("Scheduling the FL training for population: %s.", ((C19408l) optional.get()).mo24548b());
            return yVar.f282110g.mo92128b(C19396a.m36985b((C19408l) optional.get(), z));
        }
    }
}
