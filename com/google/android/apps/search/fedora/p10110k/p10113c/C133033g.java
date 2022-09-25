package com.google.android.apps.search.fedora.p10110k.p10113c;

import com.google.android.libraries.assistant.trainingcache.p1615a.C19396a;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19417u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.k.c.g */
/* compiled from: PG */
public final /* synthetic */ class C133033g implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C133046t f362756a;

    /* renamed from: b */
    public final /* synthetic */ boolean f362757b;

    /* renamed from: c */
    public final /* synthetic */ C19417u f362758c;

    public /* synthetic */ C133033g(C133046t tVar, boolean z, C19417u uVar) {
        this.f362756a = tVar;
        this.f362757b = z;
        this.f362758c = uVar;
    }

    public final C60870cx apply(Object obj) {
        C133046t tVar = this.f362756a;
        boolean z = this.f362757b;
        C19417u uVar = this.f362758c;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            C59104x b = C133046t.f362774a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b).mo56372aa(39984)).mo56386p("Empty p13n trainer options. Skipping to the next provider.");
            return C60866ct.f164955a;
        }
        C59104x b2 = C133046t.f362774a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b2).mo56372aa(39983)).mo56389s("Scheduling the p13n training for session: %s.", ((C19414r) optional.get()).mo24572g());
        C60870cx c = tVar.mo110957c(C19396a.m36986c(tVar.f362776c, (C19414r) optional.get(), z));
        C60856cj.m92911t(c, C47810es.m84974n(new C133045s(uVar, (C19414r) optional.get())), tVar.f362778e);
        return c;
    }
}
