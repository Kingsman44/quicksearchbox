package com.google.android.apps.gsa.staticplugins.opa.promo.p8407a;

import com.google.assistant.p4008y.p4011c.p4012a.C53625b;
import com.google.assistant.p4008y.p4011c.p4012a.C53626c;
import com.google.assistant.p4008y.p4011c.p4012a.C53628e;
import com.google.assistant.p4008y.p4011c.p4012a.C53630g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.promo.a.m */
/* compiled from: PG */
public final /* synthetic */ class C109891m implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C53628e f306194a;

    public /* synthetic */ C109891m(C53628e eVar) {
        this.f306194a = eVar;
    }

    public final C60870cx apply(Object obj) {
        C53628e eVar = this.f306194a;
        C53625b bVar = (C53625b) obj;
        if (bVar == null) {
            return C60856cj.m92899h(new IllegalStateException("OPA Acquisition Notification Stub not found."));
        }
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C53626c.f140750a;
        if (diVar == null) {
            synchronized (C53626c.class) {
                diVar = C53626c.f140750a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("growth.notifications.v1.AcquisitionNotificationService", "FetchAcquisitionNotification");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53628e.f140751f);
                    d.f187486b = C70850d.m103697c(C53630g.f140758f);
                    diVar = d.mo62040a();
                    C53626c.f140750a = diVar;
                }
            }
        }
        return C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), eVar);
    }
}
