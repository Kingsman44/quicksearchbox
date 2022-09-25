package com.google.p4184bj.p4193c.p4197c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.bj.c.c.al */
/* compiled from: PG */
public final class C55938al {

    /* renamed from: a */
    public static volatile C70338di f148899a;

    /* renamed from: b */
    public static volatile C70338di f148900b;

    /* renamed from: c */
    private static volatile C70338di f148901c;

    private C55938al() {
    }

    /* renamed from: a */
    public static C55937ak m87863a(C70888j jVar) {
        return (C55937ak) C70864c.m103731e(new C55935ai(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m87864b() {
        C70338di diVar = f148901c;
        if (diVar == null) {
            synchronized (C55938al.class) {
                diVar = f148901c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("footprints.oneplatform.FootprintsService", "GetSettingText");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C55946at.f148915f);
                    d.f187486b = C70850d.m103697c(C55951ay.f148932g);
                    diVar = d.mo62040a();
                    f148901c = diVar;
                }
            }
        }
        return diVar;
    }
}
