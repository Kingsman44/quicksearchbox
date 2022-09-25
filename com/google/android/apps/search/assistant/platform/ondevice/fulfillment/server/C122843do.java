package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122388ag;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122391aj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122395an;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122397ap;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122461p;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9287d.p9288a.C122811k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122859d;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123029bw;
import com.google.android.libraries.assistant.p1363c.p1451h.p1452a.p1453a.C17597g;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.protos.p4985f.p5030q.C65190ex;
import com.google.protos.p4985f.p5030q.C65195fb;
import com.google.protos.p4985f.p5030q.C65196fc;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.do */
/* compiled from: PG */
public final /* synthetic */ class C122843do implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340237a;

    /* renamed from: b */
    public final /* synthetic */ C122859d f340238b;

    /* renamed from: c */
    public final /* synthetic */ C122419bk f340239c;

    /* renamed from: d */
    public final /* synthetic */ C122852dx f340240d;

    /* renamed from: e */
    public final /* synthetic */ C122461p f340241e;

    /* renamed from: f */
    public final /* synthetic */ int f340242f;

    /* renamed from: g */
    public final /* synthetic */ C122811k f340243g;

    public /* synthetic */ C122843do(C122870ea eaVar, C122859d dVar, C122419bk bkVar, C122852dx dxVar, C122811k kVar, C122461p pVar, int i) {
        this.f340237a = eaVar;
        this.f340238b = dVar;
        this.f340239c = bkVar;
        this.f340240d = dxVar;
        this.f340243g = kVar;
        this.f340241e = pVar;
        this.f340242f = i;
    }

    public final C60870cx apply(Object obj) {
        C65190ex exVar;
        C122870ea eaVar = this.f340237a;
        C122859d dVar = this.f340238b;
        C122419bk bkVar = this.f340239c;
        C122852dx dxVar = this.f340240d;
        C122811k kVar = this.f340243g;
        C122461p pVar = this.f340241e;
        int i = this.f340242f;
        C123029bw bwVar = (C123029bw) obj;
        if (eaVar.f340316q.equals(C122854dz.FINISHED)) {
            ((C59052c) dVar.mo105767f(C59071e.f157037b).mo56372aa(34847)).mo56386p("Ignoring fulfillment results because already finalized.");
            return C60866ct.f164955a;
        }
        C39141kp kpVar = eaVar.f340310k;
        String str = eaVar.f340311l;
        C65195fb a = C65195fb.m96585a(((C65196fc) bwVar.mo105839b()).f176458d);
        if (a == null) {
            a = C65195fb.UNRECOGNIZED;
        }
        kpVar.mo41698m(str, a.name(), bkVar.f339404k);
        ((C59052c) dVar.mo105764c().mo56372aa(34844)).mo56389s("Fulfillment request finished with response %s", C122865j.m202185b((C65196fc) bwVar.mo105839b()));
        C122448cm i2 = eaVar.mo105771i(bwVar.mo105838a(), dxVar, kVar);
        C65196fc fcVar = (C65196fc) bwVar.mo105839b();
        if (eaVar.f340315p) {
            C65195fb a2 = C65195fb.m96585a(fcVar.f176458d);
            if (a2 == null) {
                a2 = C65195fb.UNRECOGNIZED;
            }
            if (a2.equals(C65195fb.FULFILLER_FAILED) && pVar.f339490b == 2 && ((C65190ex) pVar.f339491c).f176423a.size() == 1) {
                if (pVar.f339490b == 2) {
                    exVar = (C65190ex) pVar.f339491c;
                } else {
                    exVar = C65190ex.f176421b;
                }
                C52083ep epVar = (C52083ep) exVar.f176423a.get(0);
                if (epVar.f136692b == 3 && ((C52078ek) epVar.f136693c).f136674b == 3) {
                    ((C59052c) eaVar.f340302c.mo105764c().mo56372aa(34846)).mo56386p("Replacing result to OK");
                    fcVar = C65196fc.f176453l;
                }
            }
        }
        C17597g gVar = eaVar.f340301b;
        C122391aj ajVar = (C122391aj) C122392ak.f339309c.createBuilder();
        ajVar.copyOnWrite();
        fcVar.getClass();
        ((C122392ak) ajVar.instance).f339311a = fcVar;
        ajVar.copyOnWrite();
        i2.getClass();
        ((C122392ak) ajVar.instance).f339312b = i2;
        C122392ak akVar = (C122392ak) ajVar.build();
        C122395an anVar = (C122395an) C122397ap.f339328d.createBuilder();
        anVar.copyOnWrite();
        ((C122397ap) anVar.instance).f339332c = i;
        anVar.copyOnWrite();
        C122397ap apVar = (C122397ap) anVar.instance;
        akVar.getClass();
        apVar.f339331b = akVar;
        apVar.f339330a = 2;
        gVar.mo20123c((C122397ap) anVar.build());
        C17597g gVar2 = eaVar.f340301b;
        C122395an anVar2 = (C122395an) C122397ap.f339328d.createBuilder();
        anVar2.copyOnWrite();
        ((C122397ap) anVar2.instance).f339332c = i;
        C122388ag agVar = C122388ag.f339302a;
        anVar2.copyOnWrite();
        C122397ap apVar2 = (C122397ap) anVar2.instance;
        agVar.getClass();
        apVar2.f339331b = agVar;
        apVar2.f339330a = 3;
        gVar2.mo20123c((C122397ap) anVar2.build());
        return C60866ct.f164955a;
    }
}
