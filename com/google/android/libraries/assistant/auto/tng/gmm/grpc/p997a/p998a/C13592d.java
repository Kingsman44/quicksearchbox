package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a;

import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13601c;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.d */
/* compiled from: PG */
public final /* synthetic */ class C13592d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13595g f41604a;

    /* renamed from: b */
    public final /* synthetic */ C13601c f41605b;

    public /* synthetic */ C13592d(C13595g gVar, C13601c cVar) {
        this.f41604a = gVar;
        this.f41605b = cVar;
    }

    public final void run() {
        C13595g gVar = this.f41604a;
        C13601c cVar = this.f41605b;
        if (gVar.f41612c.mo21180b()) {
            try {
                C70862aj ajVar = gVar.f41612c.f41607a;
                ajVar.getClass();
                ajVar.mo20123c(cVar);
            } catch (RuntimeException e) {
                ((C59052c) ((C59052c) ((C59052c) C13595g.f41610a.mo56226d()).mo56382g(e)).mo56372aa(45133)).mo56386p("Failed to send conversation update. Closing.");
                C70862aj ajVar2 = gVar.f41612c.f41607a;
                ajVar2.getClass();
                gVar.mo21181a(ajVar2, (Long) null);
            }
        }
    }
}
