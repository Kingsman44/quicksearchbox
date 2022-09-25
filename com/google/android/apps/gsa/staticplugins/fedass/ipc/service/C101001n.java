package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100742h;
import com.google.android.libraries.assistant.trainingcache.p1615a.C19396a;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19415s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.n */
/* compiled from: PG */
public final /* synthetic */ class C101001n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C101012y f282087a;

    /* renamed from: b */
    public final /* synthetic */ boolean f282088b;

    /* renamed from: c */
    public final /* synthetic */ C19415s f282089c;

    public /* synthetic */ C101001n(C101012y yVar, boolean z, C19415s sVar) {
        this.f282087a = yVar;
        this.f282088b = z;
        this.f282089c = sVar;
    }

    public final C60870cx apply(Object obj) {
        C101012y yVar = this.f282087a;
        boolean z = this.f282088b;
        C19415s sVar = this.f282089c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C101012y.f282104a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrainCommBinder");
            ((C59052c) ((C59052c) b).mo56372aa(19613)).mo56386p("Empty p13n trainer options. Skipping to the next provider.");
            return C60866ct.f164955a;
        }
        C59104x b2 = C101012y.f282104a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TrainCommBinder");
        ((C59052c) ((C59052c) b2).mo56372aa(19612)).mo56389s("Scheduling the p13n training for session: %s.", ((C19414r) optional.get()).mo24572g());
        C100742h c = C100742h.m166944c(yVar.f282110g.mo92128b(C19396a.m36986c(yVar.f282106c, (C19414r) optional.get(), z)));
        c.mo92037h(new C101011x(sVar, (C19414r) optional.get()));
        return c.f281631a;
    }
}
