package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87695ad;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87696ae;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3994s.p3995a.C53090b;
import com.google.assistant.p3994s.p3995a.C53268hp;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bs */
/* compiled from: PG */
final class C97808bs implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C53268hp f273104a;

    /* renamed from: b */
    final /* synthetic */ C97811bv f273105b;

    public C97808bs(C97811bv bvVar, C53268hp hpVar) {
        this.f273105b = bvVar;
        this.f273104a = hpVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C97811bv.f273109a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30262)).mo56386p("Failed to get auto drive context for client sync request.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C53268hp hpVar = this.f273104a;
            C53090b bVar = (C53090b) axVar.mo56107c();
            hpVar.copyOnWrite();
            C53271hs hsVar = (C53271hs) hpVar.instance;
            C53271hs hsVar2 = C53271hs.f139650u;
            bVar.getClass();
            hsVar.f139669r = bVar;
            hsVar.f139652a |= C89885b.HTTP_VALUE;
        }
        C87695ad adVar = (C87695ad) C87696ae.f237132p.createBuilder();
        adVar.copyOnWrite();
        C87696ae aeVar = (C87696ae) adVar.instance;
        aeVar.f237134a |= 1024;
        aeVar.f237144k = true;
        C53268hp hpVar2 = this.f273104a;
        adVar.copyOnWrite();
        C87696ae aeVar2 = (C87696ae) adVar.instance;
        C53271hs hsVar3 = (C53271hs) hpVar2.build();
        hsVar3.getClass();
        aeVar2.f237136c = hsVar3;
        aeVar2.f237134a |= 2;
        adVar.copyOnWrite();
        C87696ae aeVar3 = (C87696ae) adVar.instance;
        aeVar3.f237134a |= 2048;
        aeVar3.f237145l = true;
        this.f273105b.mo90819i("Send ClientSync ClientEvent", new C97807br(this, (C87696ae) adVar.build()));
    }
}
