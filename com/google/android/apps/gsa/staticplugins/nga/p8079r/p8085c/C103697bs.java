package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80111az;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80136bn;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80175cx;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80176cy;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.staticplugins.opa.C109739nm;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.bs */
/* compiled from: PG */
public final /* synthetic */ class C103697bs implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C103698bt f288812a;

    /* renamed from: b */
    public final /* synthetic */ C80136bn f288813b;

    public /* synthetic */ C103697bs(C103698bt btVar, C80136bn bnVar) {
        this.f288812a = btVar;
        this.f288813b = bnVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C80111az azVar;
        C103698bt btVar = this.f288812a;
        C80136bn bnVar = this.f288813b;
        if (bnVar.f219917a == 33) {
            C58976aa aaVar = C58975e.f156826a;
            if (bnVar.f219917a == 33) {
                azVar = (C80111az) bnVar.f219918b;
            } else {
                azVar = C80111az.f219821c;
            }
            e a = e.a(azVar.f219824b);
            if (a == null) {
                a = e.a;
            }
            C109739nm nmVar = btVar.f288815b;
            Bundle bundle = new Bundle();
            bundle.putInt("triggered_by", a.ca);
            C87565h hVar = new C87565h(bundle);
            hVar.f236560f = 6;
            hVar.f236523a = "and.opa";
            hVar.f236497A = false;
            hVar.f236515S = true;
            hVar.f236516T = false;
            boolean h = btVar.f288816c.mo97290h(nmVar.mo98060a(hVar.mo81685a()));
            C80143bu buVar = (C80143bu) C80275dd.f220288c.createBuilder();
            C80175cx cxVar = (C80175cx) C80176cy.f219994d.createBuilder();
            cxVar.copyOnWrite();
            C80176cy cyVar = (C80176cy) cxVar.instance;
            cyVar.f219996a = 1 | cyVar.f219996a;
            cyVar.f219997b = h;
            cxVar.copyOnWrite();
            C80176cy cyVar2 = (C80176cy) cxVar.instance;
            cyVar2.f219998c = a.ca;
            cyVar2.f219996a |= 2;
            buVar.copyOnWrite();
            C80275dd ddVar = (C80275dd) buVar.instance;
            C80176cy cyVar3 = (C80176cy) cxVar.build();
            cyVar3.getClass();
            ddVar.f220291b = cyVar3;
            ddVar.f220290a = 20;
            return (C80275dd) buVar.build();
        }
        C59104x d = C103698bt.f288814a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "QueryVMStatusHandler");
        ((C58970a) ((C58970a) d).mo56372aa(21646)).mo56386p("Invalid request in QueryVoiceMatchOnboardingStatusHandler. Returning default response.");
        return C80275dd.f220288c;
    }
}
