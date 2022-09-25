package com.google.assistant.p4003x.p4004a;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.assistant.x.a.c */
/* compiled from: PG */
public final class C53526c {

    /* renamed from: a */
    private static volatile C70338di f140474a;

    /* renamed from: b */
    private static volatile C70716eu f140475b;

    private C53526c() {
    }

    /* renamed from: a */
    public static C53523b m86853a(C70888j jVar) {
        return (C53523b) C70864c.m103731e(new C53508a(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m86854b() {
        C70338di diVar = f140474a;
        if (diVar == null) {
            synchronized (C53526c.class) {
                diVar = f140474a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("assistant.frontend.v1.AssistantCloudExecutionProxyService", "ExecuteCloudOp");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53530g.f140481c);
                    d.f187486b = C70850d.m103697c(C53532i.f140485b);
                    diVar = d.mo62040a();
                    f140474a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m86855c() {
        C70716eu euVar = f140475b;
        if (euVar == null) {
            synchronized (C53526c.class) {
                euVar = f140475b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("assistant.frontend.v1.AssistantCloudExecutionProxyService");
                    etVar.mo62433a(m86854b());
                    euVar = new C70716eu(etVar);
                    f140475b = euVar;
                }
            }
        }
        return euVar;
    }
}
