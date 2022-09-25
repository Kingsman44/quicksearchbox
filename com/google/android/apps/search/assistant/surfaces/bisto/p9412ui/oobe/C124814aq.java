package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.Intent;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.aq */
/* compiled from: PG */
class C124814aq implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C124815ar f344352a;

    public C124814aq(C124815ar arVar) {
        this.f344352a = arVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C59104x b = C124815ar.f344353a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InitSetupFragment");
        ((C59052c) ((C59052c) b).mo56372aa(36325)).mo56386p("New device");
        this.f344352a.mo106653b();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18078b(Object obj) {
        C124679cr crVar = (C124679cr) obj;
        C59071e eVar = C124815ar.f344353a;
        C58976aa aaVar = C58975e.f156826a;
        C124844bo boVar = this.f344352a.f344355b.f344439b;
        if (boVar == null) {
            boVar = C124844bo.f344417m;
        }
        boolean z = boVar.f344430l;
        C124844bo boVar2 = this.f344352a.f344355b.f344439b;
        if (boVar2 == null) {
            boVar2 = C124844bo.f344417m;
        }
        if (!boVar2.f344430l) {
            C124633az a = C124633az.m204299a(crVar.f343960c);
            if (a == null) {
                a = C124633az.OOBE_STATE_UNKNOWN;
            }
            if (a.equals(C124633az.OOBE_FINISHED)) {
                C124636bb a2 = C124636bb.m204301a(crVar.f343962e);
                if (a2 == null) {
                    a2 = C124636bb.UNKNOWN_ENABLED_STATE;
                }
                if (a2.equals(C124636bb.OPA_ENABLED)) {
                    C59104x b = C124815ar.f344353a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "InitSetupFragment");
                    ((C59052c) ((C59052c) b).mo56372aa(36327)).mo56386p("Device is setup");
                    C124815ar arVar = this.f344352a;
                    InitSetupFragment initSetupFragment = arVar.f344356c;
                    C124844bo boVar3 = arVar.f344355b.f344439b;
                    if (boVar3 == null) {
                        boVar3 = C124844bo.f344417m;
                    }
                    String str = boVar3.f344420b;
                    C18509a c = C18522b.m35986c();
                    ((C18523c) c).f52492a = "device_info";
                    c.mo24027i(8);
                    c.mo24021c(str);
                    Intent a3 = c.mo24020b().mo24031a();
                    C45963aa.m82131a(a3, arVar.f344359f);
                    C47709i.m84862b(initSetupFragment, a3, 0);
                    return;
                }
            }
        }
        this.f344352a.f344363j = Optional.m71637of(crVar);
        this.f344352a.mo106653b();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
