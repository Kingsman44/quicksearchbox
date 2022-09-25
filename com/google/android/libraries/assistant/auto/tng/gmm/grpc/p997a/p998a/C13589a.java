package com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.p998a;

import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13601c;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13604f;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13605g;
import com.google.android.libraries.assistant.auto.tng.gmm.grpc.p997a.C13609k;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70862aj;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.gmm.grpc.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13589a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13595g f41600a;

    public /* synthetic */ C13589a(C13595g gVar) {
        this.f41600a = gVar;
    }

    public final void run() {
        C13595g gVar = this.f41600a;
        if (!gVar.f41612c.mo21180b()) {
            ((C59052c) ((C59052c) C13595g.f41610a.mo56224b()).mo56372aa(45130)).mo56386p("Opening connection");
            C13594f fVar = gVar.f41612c;
            if (fVar.f41607a == null) {
                C13604f fVar2 = fVar.f41609c.f41611b;
                C70862aj ajVar = fVar.f41608b;
                C70888j jVar = fVar2.f189039a;
                C70338di diVar = C13605g.f41633a;
                if (diVar == null) {
                    synchronized (C13605g.class) {
                        diVar = C13605g.f41633a;
                        if (diVar == null) {
                            C70335df d = C70338di.m102603d();
                            d.f187487c = C70337dh.BIDI_STREAMING;
                            d.f187488d = C70338di.m102602c("java.com.google.android.libraries.assistant.auto.tng.gmm.grpc.conversation.proto.GmmConversationService", "OngoingDialog");
                            d.f187489e = true;
                            d.f187485a = C70850d.m103697c(C13601c.f41627e);
                            d.f187486b = C70850d.m103697c(C13609k.f41635b);
                            diVar = d.mo62040a();
                            C13605g.f41633a = diVar;
                        }
                    }
                }
                fVar.f41607a = C47686k.m84827a(C70876o.m103761b(jVar.mo39510a(diVar, fVar2.f189040b), ajVar, true));
            }
        }
    }
}
