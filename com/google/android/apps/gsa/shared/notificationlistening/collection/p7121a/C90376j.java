package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.p4741o.p4742a.p4743a.C62857f;
import com.google.p4741o.p4742a.p4743a.C62859h;
import com.google.p4741o.p4742a.p4743a.C62867p;
import com.google.p4741o.p4742a.p4743a.C62868q;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.j */
/* compiled from: PG */
public final /* synthetic */ class C90376j implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C90378l f252411a;

    /* renamed from: b */
    public final /* synthetic */ C62857f f252412b;

    public /* synthetic */ C90376j(C90378l lVar, C62857f fVar) {
        this.f252411a = lVar;
        this.f252412b = fVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C90378l lVar = this.f252411a;
        C62857f fVar = this.f252412b;
        C62867p pVar = lVar.mo84077a().f252437a;
        C70888j jVar = pVar.f189039a;
        C70338di diVar = C62868q.f169756a;
        if (diVar == null) {
            synchronized (C62868q.class) {
                diVar = C62868q.f169756a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.cloud.vision.v1.ImageAnnotator", "BatchAnnotateImages");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C62857f.f169740b);
                    d.f187486b = C70850d.m103697c(C62859h.f169743b);
                    diVar = d.mo62040a();
                    C62868q.f169756a = diVar;
                }
            }
        }
        return C60922j.m93044g(C70876o.m103760a(jVar.mo39510a(diVar, pVar.f189040b), fVar), C90377k.f252413a, C60826bg.f164896a);
    }
}
