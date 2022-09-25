package com.google.android.libraries.search.p3055n.p3056a.p3057a;

import com.google.android.p3523p.p3524a.C45017b;
import com.google.android.p3523p.p3524a.C45018c;
import com.google.android.p3523p.p3524a.C45020e;
import com.google.android.p3523p.p3524a.C45024i;
import com.google.common.base.C58817ah;
import com.google.protobuf.C62912at;
import p3186j$.util.Optional;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.search.n.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C39246e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C39250i f103385a;

    public /* synthetic */ C39246e(C39250i iVar) {
        this.f103385a = iVar;
    }

    public final Object apply(Object obj) {
        C39250i iVar = this.f103385a;
        C39249h hVar = new C39249h();
        iVar.f103391d = Optional.m71637of((C45020e) obj);
        C45017b bVar = (C45017b) iVar.f103389b.get();
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C45018c.f117629b;
        if (diVar == null) {
            synchronized (C45018c.class) {
                diVar = C45018c.f117629b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.CLIENT_STREAMING;
                    d.f187488d = C70338di.m102602c("speech.data.device_testing.art.device.ArtSodaEventConsumerService", "StreamSodaEvents");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C45024i.f117638d);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    C45018c.f117629b = diVar;
                }
            }
        }
        iVar.f103392e = Optional.m71637of(C70876o.m103761b(jVar.mo39510a(diVar, bVar.f189040b), hVar, false));
        iVar.f103393f = 3;
        return null;
    }
}
