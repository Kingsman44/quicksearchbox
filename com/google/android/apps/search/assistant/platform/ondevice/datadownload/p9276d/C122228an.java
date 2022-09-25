package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9276d;

import com.google.android.libraries.assistant.p1363c.p1371b.p1375c.C17078w;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.Collection;
import p5488io.grpc.p5533i.C70887z;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.d.an */
/* compiled from: PG */
public final /* synthetic */ class C122228an implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122261bt f338962a;

    /* renamed from: b */
    public final /* synthetic */ C17078w f338963b;

    public /* synthetic */ C122228an(C122261bt btVar, C17078w wVar) {
        this.f338962a = btVar;
        this.f338963b = wVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122261bt btVar = this.f338962a;
        C17078w wVar = this.f338963b;
        if (btVar.f339024g || ((C70887z) btVar.f339022e).f189070a.mo62063h()) {
            ((C58970a) ((C58970a) C122261bt.f339018a.mo56226d()).mo56372aa(34737)).mo56386p("Received a downloadRequest but processing was aborted. Discarding.");
        }
        C60870cx a = btVar.f339021d.mo105583a();
        C122231aq aqVar = new C122231aq(btVar, wVar);
        C60870cx f = C60856cj.m92897f(C60922j.m93045h(a, C47810es.m84966f(aqVar), btVar.f339020c), C60856cj.m92896e((Iterable) Collection.EL.stream(wVar.f49717c).map(new C122232ar(btVar)).collect(C58370cn.f155946a)));
        C122234at atVar = C122234at.f338972a;
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(atVar), btVar.f339020c);
        C122237aw awVar = new C122237aw(btVar);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(awVar), btVar.f339020c);
        C122238ax axVar = new C122238ax(btVar, wVar);
        C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(axVar), btVar.f339020c);
        C122239ay ayVar = new C122239ay(btVar);
        C60870cx g2 = C60846c.m92878g(h2, Exception.class, C47810es.m84963c(ayVar), btVar.f339020c);
        btVar.f339023f.add(g2);
        return g2;
    }
}
