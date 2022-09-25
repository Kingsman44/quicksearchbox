package com.google.android.apps.gsa.staticplugins.p8019j;

import com.google.assistant.p3897e.p3921j.C51714bl;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.assistant.p3897e.p3921j.C51771cx;
import com.google.assistant.p3897e.p3921j.C51772cy;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.ai */
/* compiled from: PG */
final class C102547ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C51771cx f286193a;

    /* renamed from: b */
    final /* synthetic */ C51714bl f286194b;

    public C102547ai(C51771cx cxVar, C51714bl blVar) {
        this.f286193a = cxVar;
        this.f286194b = blVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C102550al.f286195a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(13963)).mo56386p("Retrieving Physical AppCapabilities failed.");
        C51714bl blVar = this.f286194b;
        C51771cx cxVar = this.f286193a;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51772cy cyVar = (C51772cy) cxVar.build();
        C51715bm bmVar2 = C51715bm.f135662t;
        cyVar.getClass();
        bmVar.f135671h = cyVar;
        bmVar.f135664a |= 128;
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58485gu guVar = (C58485gu) obj;
        if (!guVar.isEmpty()) {
            C59104x b = C102550al.f286195a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceCapHelper");
            ((C59052c) ((C59052c) b).mo56372aa(13964)).mo56386p("Physical radio app found on device.");
            this.f286193a.mo53722a(guVar);
        }
        C51714bl blVar = this.f286194b;
        C51771cx cxVar = this.f286193a;
        blVar.copyOnWrite();
        C51715bm bmVar = (C51715bm) blVar.instance;
        C51772cy cyVar = (C51772cy) cxVar.build();
        C51715bm bmVar2 = C51715bm.f135662t;
        cyVar.getClass();
        bmVar.f135671h = cyVar;
        bmVar.f135664a |= 128;
    }
}
