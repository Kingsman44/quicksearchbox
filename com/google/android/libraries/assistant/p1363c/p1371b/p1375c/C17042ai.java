package com.google.android.libraries.assistant.p1363c.p1371b.p1375c;

import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70715et;
import p5488io.grpc.C70716eu;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70864c;

/* renamed from: com.google.android.libraries.assistant.c.b.c.ai */
/* compiled from: PG */
public final class C17042ai {

    /* renamed from: a */
    private static volatile C70338di f49648a;

    /* renamed from: b */
    private static volatile C70716eu f49649b;

    private C17042ai() {
    }

    /* renamed from: a */
    public static C17039af m34206a(C70888j jVar) {
        return (C17039af) C70864c.m103731e(new C17038ae(), jVar, C70851i.f189015a);
    }

    /* renamed from: b */
    public static C70338di m34207b() {
        C70338di diVar = f49648a;
        if (diVar == null) {
            synchronized (C17042ai.class) {
                diVar = f49648a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("com.google.android.libraries.assistant.apa.datadownload.grpc.FileGroupStoreView", "GetFileGroup");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C17044ak.f49650c);
                    d.f187486b = C70850d.m103697c(C17046am.f49655c);
                    diVar = d.mo62040a();
                    f49648a = diVar;
                }
            }
        }
        return diVar;
    }

    /* renamed from: c */
    public static C70716eu m34208c() {
        C70716eu euVar = f49649b;
        if (euVar == null) {
            synchronized (C17042ai.class) {
                euVar = f49649b;
                if (euVar == null) {
                    C70715et etVar = new C70715et("com.google.android.libraries.assistant.apa.datadownload.grpc.FileGroupStoreView");
                    etVar.mo62433a(m34207b());
                    euVar = new C70716eu(etVar);
                    f49649b = euVar;
                }
            }
        }
        return euVar;
    }
}
