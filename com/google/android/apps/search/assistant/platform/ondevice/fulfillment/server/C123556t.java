package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.t */
/* compiled from: PG */
public final /* synthetic */ class C123556t implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C123562z f341418a;

    /* renamed from: b */
    public final /* synthetic */ C122456k f341419b;

    public /* synthetic */ C123556t(C123562z zVar, C122456k kVar) {
        this.f341418a = zVar;
        this.f341419b = kVar;
    }

    public final void run() {
        C123562z zVar = this.f341418a;
        C122456k kVar = this.f341419b;
        ((C59052c) zVar.f341431g.mo105764c().mo56372aa(34808)).mo56386p("Received igdp request");
        if (zVar.f341433i == null) {
            C60870cx a = zVar.f341425a.mo105841a();
            C122419bk bkVar = kVar.f339480c;
            if (bkVar == null) {
                bkVar = C122419bk.f339392l;
            }
            C60870cx a2 = zVar.f341426b.mo105754a(bkVar.f339395b);
            C123554r rVar = new C123554r(zVar, kVar, a, bkVar);
            zVar.f341433i = C60922j.m93045h(a2, C47810es.m84966f(rVar), C60826bg.f164896a);
            C60870cx cxVar = zVar.f341433i;
            C123561y yVar = new C123561y(zVar);
            C60856cj.m92911t(cxVar, C47810es.m84974n(yVar), zVar.f341428d);
            return;
        }
        zVar.f341430f.mo20122b(Status.f186912j.withDescription("Already processing another request.").asException());
    }
}
