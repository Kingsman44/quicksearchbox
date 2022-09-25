package com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b;

import android.webkit.CookieManager;
import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.C16895b;
import com.google.android.libraries.assistant.auto.tng.p1344w.p1345a.p1348b.C16899d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61278b;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61279c;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61280d;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61281e;
import com.google.frameworks.p4619a.p4620a.p4621a.p4622a.C61283g;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.libraries.assistant.auto.tng.w.a.b.b */
/* compiled from: PG */
public final /* synthetic */ class C16897b implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C16899d f49401a;

    public /* synthetic */ C16897b(C16899d dVar) {
        this.f49401a = dVar;
    }

    public final C60870cx apply(Object obj) {
        C16899d dVar = this.f49401a;
        C16899d.C16900a aVar = (C16899d.C16900a) obj;
        dVar.f49406e = (C61278b) aVar.mo23077hq().mo62577p(C61409d.f166071a, aVar.mo23076hp());
        dVar.f49405d = aVar.mo23075eO();
        CookieManager instance = CookieManager.getInstance();
        String a = C16895b.m33901a(instance.getCookie("https://www.google.com"));
        C61280d dVar2 = (C61280d) C61281e.f165746c.createBuilder();
        dVar2.copyOnWrite();
        C61281e eVar = (C61281e) dVar2.instance;
        a.getClass();
        eVar.f165748a = 1;
        eVar.f165749b = a;
        C61281e eVar2 = (C61281e) dVar2.build();
        C61278b bVar = dVar.f49406e;
        bVar.getClass();
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C61279c.f165745a;
        if (diVar == null) {
            synchronized (C61279c.class) {
                diVar = C61279c.f165745a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("frameworks.debug.settings.proto.external.DebugSettingsPublicService", "UpdateCookieBasedStatus");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C61281e.f165746c);
                    d.f187486b = C70850d.m103697c(C61283g.f165750c);
                    C70338di a2 = d.mo62040a();
                    C61279c.f165745a = a2;
                    diVar = a2;
                }
            }
        }
        C60870cx a3 = C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), eVar2);
        C16896a aVar2 = new C16896a(dVar, instance);
        return C60922j.m93045h(a3, C47810es.m84966f(aVar2), dVar.f49404c);
    }
}
