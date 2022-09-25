package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9282a.C122561k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123085a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123164d;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protos.p4985f.p5030q.C65179em;
import com.google.protos.p4985f.p5030q.C65180en;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65187eu;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.dv */
/* compiled from: PG */
public final /* synthetic */ class C122850dv implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C123164d f340259a;

    /* renamed from: b */
    public final /* synthetic */ C65185es f340260b;

    /* renamed from: c */
    public final /* synthetic */ C52091ex f340261c;

    /* renamed from: d */
    public final /* synthetic */ C122859d f340262d;

    /* renamed from: e */
    public final /* synthetic */ String f340263e;

    /* renamed from: f */
    public final /* synthetic */ int f340264f;

    /* renamed from: g */
    public final /* synthetic */ C122561k f340265g;

    public /* synthetic */ C122850dv(C123164d dVar, C65185es esVar, C52091ex exVar, C122859d dVar2, String str, int i, C122561k kVar) {
        this.f340259a = dVar;
        this.f340260b = esVar;
        this.f340261c = exVar;
        this.f340262d = dVar2;
        this.f340263e = str;
        this.f340264f = i;
        this.f340265g = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C65187eu euVar;
        C123164d dVar = this.f340259a;
        C65185es esVar = this.f340260b;
        C52091ex exVar = this.f340261c;
        C122859d dVar2 = this.f340262d;
        String str = this.f340263e;
        int i = this.f340264f;
        C122561k kVar = this.f340265g;
        long a = dVar.mo105875a();
        C65179em emVar = (C65179em) C65180en.f176389b.createBuilder();
        emVar.copyOnWrite();
        ((C65180en) emVar.instance).f176391a = a;
        esVar.copyOnWrite();
        C65180en enVar = (C65180en) emVar.build();
        C65191ey eyVar = C65191ey.f176424p;
        enVar.getClass();
        ((C65191ey) esVar.instance).f176437l = enVar;
        C52091ex exVar2 = ((C65191ey) esVar.instance).f176435j;
        if (exVar2 == null) {
            exVar2 = C52091ex.f136710b;
        }
        C52090ew ewVar = (C52090ew) exVar2.toBuilder();
        ewVar.mo53790c(exVar.f136712a);
        esVar.copyOnWrite();
        C52091ex exVar3 = (C52091ex) ewVar.build();
        exVar3.getClass();
        ((C65191ey) esVar.instance).f176435j = exVar3;
        C65191ey eyVar2 = (C65191ey) esVar.build();
        ((C59052c) dVar2.mo105764c().mo56372aa(34841)).mo56388r("Starting POP fulfillment with Gallium span %d", a);
        C59052c cVar = (C59052c) dVar2.mo105767f(C59071e.f157037b).mo56372aa(34842);
        if (eyVar2.f176427b == 10) {
            euVar = (C65187eu) eyVar2.f176428c;
        } else {
            euVar = C65187eu.f176405e;
        }
        C52091ex exVar4 = eyVar2.f176435j;
        if (exVar4 == null) {
            exVar4 = C52091ex.f136710b;
        }
        cVar.mo56354G("Request input %s\nparams %s", euVar, exVar4);
        return dVar.mo105879e(eyVar2, new C123085a(str, i, kVar, dVar2));
    }
}
