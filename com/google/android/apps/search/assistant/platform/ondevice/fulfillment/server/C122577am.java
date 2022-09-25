package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122401at;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123030bx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123042ci;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65186et;
import com.google.protos.p4985f.p5030q.C65187eu;
import com.google.protos.p4985f.p5030q.C65191ey;
import p3186j$.time.ZoneId;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.am */
/* compiled from: PG */
public final /* synthetic */ class C122577am implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122720au f339739a;

    /* renamed from: b */
    public final /* synthetic */ C122401at f339740b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f339741c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f339742d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f339743e;

    public /* synthetic */ C122577am(C122720au auVar, C122401at atVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f339739a = auVar;
        this.f339740b = atVar;
        this.f339741c = cxVar;
        this.f339742d = cxVar2;
        this.f339743e = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122720au auVar = this.f339739a;
        C122401at atVar = this.f339740b;
        C60870cx cxVar = this.f339741c;
        C60870cx cxVar2 = this.f339742d;
        C60870cx cxVar3 = this.f339743e;
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar3);
        C122419bk bkVar = atVar.f339340b;
        if (bkVar == null) {
            bkVar = C122419bk.f339392l;
        }
        C65185es esVar = (C65185es) C65191ey.f176424p.createBuilder();
        Objects.requireNonNull(esVar);
        optional.ifPresent(new C122572ah(esVar));
        C123042ci.m202375a(esVar, bkVar);
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(guVar);
        C122594e eVar = auVar.f340017e;
        C122445cj cjVar = atVar.f339339a;
        if (cjVar == null) {
            cjVar = C122445cj.f339450b;
        }
        String str = cjVar.f339452a;
        C122454i iVar = atVar.f339341c;
        if (iVar == null) {
            iVar = C122454i.f339472b;
        }
        e.mo55396h(eVar.mo105688a(str, iVar.f339474a, ZoneId.m71280of(bkVar.f339398e)));
        C58485gu f = e.mo55394f();
        C65186et etVar = (C65186et) C65187eu.f176405e.createBuilder();
        C122445cj cjVar2 = atVar.f339339a;
        if (cjVar2 == null) {
            cjVar2 = C122445cj.f339450b;
        }
        String str2 = cjVar2.f339452a;
        etVar.copyOnWrite();
        str2.getClass();
        ((C65187eu) etVar.instance).f176407a = str2;
        etVar.copyOnWrite();
        ((C65187eu) etVar.instance).f176409c = true;
        boolean z = auVar.f340024l;
        etVar.copyOnWrite();
        ((C65187eu) etVar.instance).f176410d = z;
        etVar.mo59347a(f);
        C65187eu euVar = (C65187eu) etVar.build();
        esVar.copyOnWrite();
        C65191ey eyVar = (C65191ey) esVar.instance;
        euVar.getClass();
        eyVar.f176428c = euVar;
        eyVar.f176427b = 10;
        C123030bx bxVar = auVar.f340015c;
        C122561k kVar = auVar.f340025m;
        int b = C64802b.m96464b(atVar.f339342d);
        int i = b == 0 ? 1 : b;
        String str3 = bkVar.f339397d;
        C122859d dVar = auVar.f340019g;
        return C60922j.m93044g(bxVar.mo105840a(new C122716aq(cxVar, auVar.f340020h, esVar, dVar, str3, i, kVar), kVar, dVar, C122573ai.f339733a), C47810es.m84963c(new C122574aj(f)), C60826bg.f164896a);
    }
}
