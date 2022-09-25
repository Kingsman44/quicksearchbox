package com.google.assistant.p3931f.p3940d.p3941a;

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

/* renamed from: com.google.assistant.f.d.a.c */
/* compiled from: PG */
public final class C52896c extends C70864c {
    public C52896c(C70888j jVar, C70851i iVar) {
        super(jVar, iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C70866e mo17207a(C70888j jVar, C70851i iVar) {
        return new C52896c(jVar, iVar);
    }

    /* renamed from: b */
    public final C60870cx mo53943b(C52914u uVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C52898e.f138738d;
        if (diVar == null) {
            synchronized (C52898e.class) {
                diVar = C52898e.f138738d;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestCollection");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C52914u.f138754e);
                    d.f187486b = C70850d.m103697c(C52855ae.f138665c);
                    diVar = d.mo62040a();
                    C52898e.f138738d = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), uVar);
    }

    /* renamed from: c */
    public final C60870cx mo53944c(C52878ba baVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C52898e.f138737c;
        if (diVar == null) {
            synchronized (C52898e.class) {
                diVar = C52898e.f138737c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.assistant.appactions.service.proto.AppActionsService", "RequestUi");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C52878ba.f138720b);
                    d.f187486b = C70850d.m103697c(C52881bd.f138723c);
                    diVar = d.mo62040a();
                    C52898e.f138737c = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), baVar);
    }

    /* renamed from: d */
    public final C60870cx mo53945d(C52868ar arVar) {
        C70888j jVar = this.f189039a;
        C70338di diVar = C52898e.f138735a;
        if (diVar == null) {
            synchronized (C52898e.class) {
                diVar = C52898e.f138735a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.assistant.appactions.service.proto.AppActionsService", "StartSession");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C52868ar.f138706d);
                    d.f187486b = C70850d.m103697c(C52870at.f138711c);
                    diVar = d.mo62040a();
                    C52898e.f138735a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, this.f189040b), arVar);
    }
}
