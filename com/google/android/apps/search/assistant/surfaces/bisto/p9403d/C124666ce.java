package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62912at;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70716eu;
import p5488io.grpc.p5531h.p5532a.C70850d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ce */
/* compiled from: PG */
public final class C124666ce {

    /* renamed from: a */
    public static volatile C70716eu f343934a;

    /* renamed from: b */
    private static volatile C70338di f343935b;

    private C124666ce() {
    }

    /* renamed from: a */
    public static C70338di m204346a() {
        C70338di diVar = f343935b;
        if (diVar == null) {
            synchronized (C124666ce.class) {
                diVar = f343935b;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("java.com.google.android.apps.search.assistant.surfaces.bisto.proto.BistoDownloaderService", "BistoDownloadFile");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C124685cx.f343980d);
                    d.f187486b = C70850d.m103697c(C62912at.f169862a);
                    diVar = d.mo62040a();
                    f343935b = diVar;
                }
            }
        }
        return diVar;
    }
}
