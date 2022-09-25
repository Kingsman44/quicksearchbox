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
import com.google.common.util.concurrent.C60931s;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protos.p4985f.p5030q.C65179em;
import com.google.protos.p4985f.p5030q.C65180en;
import com.google.protos.p4985f.p5030q.C65185es;
import com.google.protos.p4985f.p5030q.C65187eu;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p */
/* compiled from: PG */
public final /* synthetic */ class C123084p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C65185es f340668a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f340669b;

    /* renamed from: c */
    public final /* synthetic */ C122859d f340670c;

    /* renamed from: d */
    public final /* synthetic */ C61752n f340671d;

    /* renamed from: e */
    public final /* synthetic */ String f340672e;

    /* renamed from: f */
    public final /* synthetic */ int f340673f;

    /* renamed from: g */
    public final /* synthetic */ C122561k f340674g;

    public /* synthetic */ C123084p(C65185es esVar, C52091ex exVar, C122859d dVar, C61752n nVar, String str, int i, C122561k kVar) {
        this.f340668a = esVar;
        this.f340669b = exVar;
        this.f340670c = dVar;
        this.f340671d = nVar;
        this.f340672e = str;
        this.f340673f = i;
        this.f340674g = kVar;
    }

    public final C60870cx apply(Object obj) {
        C65187eu euVar;
        C65185es esVar = this.f340668a;
        C52091ex exVar = this.f340669b;
        C122859d dVar = this.f340670c;
        C61752n nVar = this.f340671d;
        String str = this.f340672e;
        int i = this.f340673f;
        C122561k kVar = this.f340674g;
        C123164d dVar2 = (C123164d) obj;
        long a = dVar2.mo105875a();
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
        ((C59052c) dVar.mo105764c().mo56372aa(34803)).mo56388r("Starting POP callIGDP with Gallium span %d", a);
        C59052c cVar = (C59052c) dVar.mo105767f(C59071e.f157037b).mo56372aa(34804);
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
        return dVar2.mo105876b(eyVar2, nVar, new C123085a(str, i, kVar, dVar));
    }
}
