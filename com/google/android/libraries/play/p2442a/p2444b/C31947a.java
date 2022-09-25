package com.google.android.libraries.play.p2442a.p2444b;

import com.google.android.libraries.play.p2442a.C31944a;
import com.google.android.libraries.play.p2442a.p2443a.C31946b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4222bl.p4223a.C56055a;
import com.google.p4222bl.p4223a.C56088b;
import com.google.p4222bl.p4223a.C56089c;
import com.google.p4222bl.p4223a.C56095i;
import com.google.p4222bl.p4223a.C56098l;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.play.a.b.a */
/* compiled from: PG */
public final class C31947a implements C31944a {

    /* renamed from: a */
    private final C56088b f85921a;

    public C31947a(C70286co coVar) {
        this.f85921a = coVar != null ? (C56088b) C70864c.m103731e(new C56055a(), coVar, C70851i.f189015a) : null;
    }

    /* renamed from: a */
    public final C60870cx mo37719a(C56095i iVar) {
        C56088b bVar = this.f85921a;
        if (bVar == null) {
            return C60856cj.m92899h(new C31946b());
        }
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C56089c.f149433a;
        if (diVar == null) {
            synchronized (C56089c.class) {
                diVar = C56089c.f149433a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("play.appcontentservice.proto.service.AppContentService", "GetCarouselGroups");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C56095i.f149440c);
                    d.f187486b = C70850d.m103697c(C56098l.f149445b);
                    diVar = d.mo62040a();
                    C56089c.f149433a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), iVar);
    }
}
