package com.google.android.libraries.assistant.gallium.framework.ipc.p1512a;

import com.google.android.libraries.assistant.gallium.framework.C18231d;
import com.google.protos.p5127o.C65682h;
import p5488io.grpc.p5533i.C70868g;
import p5488io.grpc.p5533i.C70869h;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ipc.a.d */
/* compiled from: PG */
public final /* synthetic */ class C18258d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C18231d f51823a;

    /* renamed from: b */
    public final /* synthetic */ C65682h f51824b;

    /* renamed from: c */
    public final /* synthetic */ C70868g f51825c;

    public /* synthetic */ C18258d(C18231d dVar, C65682h hVar, C70868g gVar) {
        this.f51823a = dVar;
        this.f51824b = hVar;
        this.f51825c = gVar;
    }

    public final void run() {
        C18231d dVar = this.f51823a;
        C65682h hVar = this.f51824b;
        C70868g gVar = this.f51825c;
        dVar.mo23660d(hVar);
        ((C70869h) gVar).f189042b.mo27480d("Gallium has shut down", (Throwable) null);
    }
}
