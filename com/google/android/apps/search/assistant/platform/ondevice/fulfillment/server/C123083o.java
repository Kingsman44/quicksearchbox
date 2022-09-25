package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122445cj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122454i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122456k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.p9283a.C122594e;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123030bx;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123042ci;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p4988b.p4995e.C64802b;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65186et;
import com.google.protos.p4985f.p5030q.C65187eu;
import com.google.protos.p4985f.p5030q.C65191ey;
import p3186j$.time.ZoneId;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.o */
/* compiled from: PG */
public final /* synthetic */ class C123083o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123562z f340662a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f340663b;

    /* renamed from: c */
    public final /* synthetic */ C122419bk f340664c;

    /* renamed from: d */
    public final /* synthetic */ C122456k f340665d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f340666e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f340667f;

    public /* synthetic */ C123083o(C123562z zVar, C60870cx cxVar, C122419bk bkVar, C122456k kVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f340662a = zVar;
        this.f340663b = cxVar;
        this.f340664c = bkVar;
        this.f340665d = kVar;
        this.f340666e = cxVar2;
        this.f340667f = cxVar3;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C123562z zVar = this.f340662a;
        C60870cx cxVar = this.f340663b;
        C122419bk bkVar = this.f340664c;
        C122456k kVar = this.f340665d;
        C60870cx cxVar2 = this.f340666e;
        C60870cx cxVar3 = this.f340667f;
        C65185es esVar = (C65185es) C65191ey.f176424p.createBuilder();
        Objects.requireNonNull(esVar);
        ((Optional) C60856cj.m92909r(cxVar)).ifPresent(new C123558v(esVar));
        C123042ci.m202375a(esVar, bkVar);
        C65186et etVar = (C65186et) C65187eu.f176405e.createBuilder();
        C122445cj cjVar = kVar.f339478a;
        if (cjVar == null) {
            cjVar = C122445cj.f339450b;
        }
        String str = cjVar.f339452a;
        etVar.copyOnWrite();
        str.getClass();
        ((C65187eu) etVar.instance).f176407a = str;
        etVar.copyOnWrite();
        ((C65187eu) etVar.instance).f176409c = true;
        etVar.mo59347a((Iterable) C60856cj.m92909r(cxVar2));
        C122594e eVar = zVar.f341429e;
        C122445cj cjVar2 = kVar.f339478a;
        if (cjVar2 == null) {
            cjVar2 = C122445cj.f339450b;
        }
        String str2 = cjVar2.f339452a;
        C122454i iVar = kVar.f339481d;
        if (iVar == null) {
            iVar = C122454i.f339472b;
        }
        etVar.mo59347a(eVar.mo105688a(str2, iVar.f339474a, ZoneId.m71280of(bkVar.f339398e)));
        C65187eu euVar = (C65187eu) etVar.build();
        esVar.copyOnWrite();
        C65191ey eyVar = (C65191ey) esVar.instance;
        euVar.getClass();
        eyVar.f176428c = euVar;
        eyVar.f176427b = 10;
        C123030bx bxVar = zVar.f341427c;
        C61752n nVar = kVar.f339479b;
        if (nVar == null) {
            nVar = C61752n.f166808f;
        }
        C61752n nVar2 = nVar;
        C122561k kVar2 = zVar.f341435k;
        int b = C64802b.m96464b(kVar.f339482e);
        int i = b == 0 ? 1 : b;
        String str3 = bkVar.f339397d;
        C122859d dVar = zVar.f341431g;
        return bxVar.mo105840a(new C123555s(cxVar3, esVar, dVar, nVar2, str3, i, kVar2), kVar2, dVar, C123559w.f341422a);
    }
}
