package com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c;

import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.speech.microdetection.a.c.c */
/* compiled from: PG */
public final /* synthetic */ class C92498c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C92504i f258136a;

    /* renamed from: b */
    public final /* synthetic */ C92497b f258137b;

    /* renamed from: c */
    public final /* synthetic */ C92216a f258138c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f258139d;

    public /* synthetic */ C92498c(C92504i iVar, C92497b bVar, C92216a aVar, SettableFuture settableFuture) {
        this.f258136a = iVar;
        this.f258137b = bVar;
        this.f258138c = aVar;
        this.f258139d = settableFuture;
    }

    public final void run() {
        C92504i iVar = this.f258136a;
        C92497b bVar = this.f258137b;
        C92216a aVar = this.f258138c;
        SettableFuture settableFuture = this.f258139d;
        C59104x b = C92504i.f258151a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "MicroDataManager");
        ((C59052c) ((C59052c) b).mo56372aa(12733)).mo56386p("Initialize done, creating the hotword data.");
        iVar.mo87266g(bVar, aVar, settableFuture);
    }
}
