package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123064l;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.ag */
/* compiled from: PG */
public final /* synthetic */ class C122571ag implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339730a;

    /* renamed from: b */
    public final /* synthetic */ C122401at f339731b;

    public /* synthetic */ C122571ag(C122720au auVar, C122401at atVar) {
        this.f339730a = auVar;
        this.f339731b = atVar;
    }

    public final void run() {
        C122720au auVar = this.f339730a;
        C122401at atVar = this.f339731b;
        ((C59052c) auVar.f340019g.mo105764c().mo56372aa(34821)).mo56386p("Received intent request");
        if (auVar.f340022j == null) {
            C60870cx a = auVar.f340013a.mo105841a();
            C122419bk bkVar = atVar.f339340b;
            if (bkVar == null) {
                bkVar = C122419bk.f339392l;
            }
            C60870cx a2 = auVar.f340014b.mo105754a(bkVar.f339395b);
            C122578an anVar = new C122578an(auVar, atVar, a);
            auVar.f340022j = C60922j.m93045h(a2, C47810es.m84966f(anVar), C60826bg.f164896a);
            C123064l.m202406a(C47633f.m84733g(auVar.f340022j).mo51515h(new C122718as(auVar), auVar.f340016d).mo51513e(Throwable.class, new C122567ac(auVar), auVar.f340016d), auVar.f340018f, "callback");
            return;
        }
        ((C59052c) auVar.f340019g.mo105765d().mo56372aa(34822)).mo56386p("Received unexpected second request.");
        auVar.f340018f.mo20122b(Status.f186912j.withDescription("Already processing another request.").asException());
    }
}
