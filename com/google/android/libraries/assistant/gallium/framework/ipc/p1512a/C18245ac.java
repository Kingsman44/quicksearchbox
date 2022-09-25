package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.android.libraries.assistant.gallium.p1503a.p1504a.C18191b;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C18245ac implements C18191b {

    /* renamed from: a */
    public final /* synthetic */ C70862aj f51804a;

    public /* synthetic */ C18245ac(C70862aj ajVar) {
        this.f51804a = ajVar;
    }

    /* renamed from: a */
    public final void mo23652a(Throwable th) {
        C70862aj ajVar = this.f51804a;
        if (th instanceof C18218av) {
            ajVar.mo20122b(C18253ak.m35565d(((C18218av) th).f51741a).asException());
            return;
        }
        ((C59052c) ((C59052c) ((C59052c) C18246ad.f51805a.mo56225c()).mo56382g(th)).mo56372aa(47078)).mo56386p("Unexpected unary gRPC to Gallium response error.");
        ajVar.mo20122b(th);
    }
}
