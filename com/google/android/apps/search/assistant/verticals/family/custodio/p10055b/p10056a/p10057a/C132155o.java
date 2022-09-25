package com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.p10057a;

import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p427am.p432b.p433a.C8648b;
import com.google.p427am.p432b.p433a.C8669bu;
import com.google.p427am.p432b.p433a.C8670bv;
import com.google.p427am.p432b.p433a.C8672bx;
import com.google.p427am.p432b.p433a.C8673c;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.b.a.a.o */
/* compiled from: PG */
final class C132155o implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C132161u f360710a;

    public C132155o(C132161u uVar) {
        this.f360710a = uVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        C60870cx d = this.f360710a.f360726d.f360741a.mo46042d();
        C132154n nVar = new C132154n(this);
        return new C46463o(new C60817ay(C60922j.m93044g(d, C47810es.m84963c(nVar), C60826bg.f164896a)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        this.f360710a.f360729g.mo19974a(C37176a.f97019de);
        C8648b bVar = this.f360710a.f360725c;
        C8669bu buVar = (C8669bu) C8670bv.f29981b.createBuilder();
        C132161u uVar = this.f360710a;
        buVar.copyOnWrite();
        ((C8670bv) buVar.instance).f29983a = "com.google.android.googlequicksearchbox/" + uVar.f360730h + "/" + uVar.f360731i;
        C8670bv bvVar = (C8670bv) buVar.build();
        C70888j jVar = bVar.f189039a;
        C70338di diVar = C8673c.f29989c;
        if (diVar == null) {
            synchronized (C8673c.class) {
                diVar = C8673c.f29989c;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.home.foyer.v1.AssistantFamilyService", "ValidateCustodioFlow");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C8670bv.f29981b);
                    d.f187486b = C70850d.m103697c(C8672bx.f29984b);
                    diVar = d.mo62040a();
                    C8673c.f29989c = diVar;
                }
            }
        }
        return C60922j.m93045h(C70876o.m103760a(jVar.mo39510a(diVar, bVar.f189040b), bvVar), C47810es.m84966f(new C132153m(this)), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo18088c() {
        return new C46885y("validationInfoSingleKey");
    }
}
