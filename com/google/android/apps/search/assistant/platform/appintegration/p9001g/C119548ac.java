package com.google.android.apps.search.assistant.platform.appintegration.p9001g;

import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119624f;
import com.google.android.apps.search.assistant.platform.appintegration.grpc.C119627i;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.g.ac */
/* compiled from: PG */
public final class C119548ac {

    /* renamed from: a */
    public final C70862aj f333189a;

    public C119548ac(C70862aj ajVar) {
        this.f333189a = ajVar;
    }

    /* renamed from: a */
    public final void mo104427a(Throwable th) {
        this.f333189a.mo20122b(th);
    }

    /* renamed from: b */
    public final void mo104428b(String str) {
        C70862aj ajVar = this.f333189a;
        C119624f fVar = (C119624f) C119627i.f333384i.createBuilder();
        fVar.copyOnWrite();
        C119627i iVar = (C119627i) fVar.instance;
        iVar.f333386a |= 1;
        iVar.f333387b = str;
        ajVar.mo20123c((C119627i) fVar.build());
    }
}
