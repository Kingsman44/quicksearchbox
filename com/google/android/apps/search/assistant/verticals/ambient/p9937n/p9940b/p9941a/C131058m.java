package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.assistant.p3886c.p3887a.C50677m;
import com.google.assistant.p3886c.p3887a.C50678n;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4580v.C60945d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.m */
/* compiled from: PG */
public final /* synthetic */ class C131058m implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358492a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358493b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358494c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f358495d;

    public /* synthetic */ C131058m(C131071z zVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f358492a = zVar;
        this.f358493b = cxVar;
        this.f358494c = cxVar2;
        this.f358495d = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131071z zVar = this.f358492a;
        C60870cx cxVar = this.f358493b;
        C60870cx cxVar2 = this.f358494c;
        C60870cx cxVar3 = this.f358495d;
        C50677m mVar = (C50677m) ((Optional) C60856cj.m92909r(cxVar)).map(C131060o.f358497a).orElse((C50677m) C50678n.f131835l.createBuilder());
        long epochMilli = zVar.f358521j.mo57444a().toEpochMilli();
        mVar.copyOnWrite();
        C50678n nVar = (C50678n) mVar.instance;
        nVar.f131837a |= 1;
        nVar.f131839c = epochMilli;
        boolean booleanValue = ((C131070y) C60856cj.m92909r(cxVar3)).mo110022b().booleanValue();
        mVar.copyOnWrite();
        C50678n nVar2 = (C50678n) mVar.instance;
        nVar2.f131837a |= 64;
        nVar2.f131846j = booleanValue;
        C50678n nVar3 = (C50678n) mVar.build();
        ((C58970a) ((C58970a) zVar.f358518g.mo56224b()).mo56372aa(39017)).mo56387q("AppEventsSummary count: %d", nVar3.f131840d.size());
        zVar.f358522k.mo109947t(true, zVar.f358523l.mo110020a().isPresent(), ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue(), nVar3.f131841e > 0, nVar3.f131845i > 0);
        if (nVar3.f131840d.size() <= 0) {
            ((C58970a) ((C58970a) zVar.f358518g.mo56224b()).mo56372aa(39020)).mo56386p("Skip saving model, no model data available");
            return C60866ct.f164955a;
        }
        int i = nVar3.f131837a;
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long a = C60945d.m93096a(zVar.f358521j.mo57444a());
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = a;
        C65139d dVar2 = (C65139d) cVar.build();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        dVar2.getClass();
        azVar.f178796b = dVar2;
        azVar.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/com.google.android.apps.gsa.staticplugins.opa.ambient.context.headset.appusage.HeadphoneAppUsage";
        C63088z byteString = nVar3.toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar2.f178799e = hVar;
        azVar2.f178795a |= 8;
        return zVar.f358516e.mo41434e(C65753ak.SMARTSPACE_HEADPHONE_APP_USAGE_MODEL, (C65768az) ayVar.build());
    }
}
