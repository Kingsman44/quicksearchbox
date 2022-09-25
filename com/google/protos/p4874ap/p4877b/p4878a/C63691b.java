package com.google.protos.p4874ap.p4877b.p4878a;

import com.google.common.util.concurrent.C60870cx;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70866e;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.protos.ap.b.a.b */
/* compiled from: PG */
public final class C63691b extends C70864c {
    public C63691b(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C63691b(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo59230b(C63706q qVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C63692c.f172212a;
        if (diVar == null) {
            synchronized (C63692c.class) {
                diVar = C63692c.f172212a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("personalization.settings.oneplatform.OnePlatformUserSettingsService", "SyncSettings");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C63706q.f172241d);
                    d.f187486b = C70850d.m103697c(C63710u.f172252d);
                    diVar = d.mo62040a();
                    C63692c.f172212a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), qVar);
    }
}
