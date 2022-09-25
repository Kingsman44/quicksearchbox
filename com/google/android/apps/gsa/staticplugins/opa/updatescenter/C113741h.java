package com.google.android.apps.gsa.staticplugins.opa.updatescenter;

import com.google.android.apps.gsa.staticplugins.opa.p8335be.C108013bm;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50637am;
import com.google.assistant.p3882b.p3883a.p3884a.p3885a.C50638an;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.updatescenter.h */
/* compiled from: PG */
final class C113741h implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C113742i f314987a;

    public C113741h(C113742i iVar) {
        this.f314987a = iVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        C59104x d = C113742i.f314988a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "UpdatesCenterController");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(28366)).mo56386p("Failed to read Updates Center profile to disable badge.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        long j;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            j = ((C50638an) axVar.mo56107c()).f131732e;
        } else {
            C58976aa aaVar = C58975e.f156826a;
            j = 0;
        }
        C108013bm bmVar = this.f314987a.f314989b;
        C50637am amVar = (C50637am) C50638an.f131726h.createBuilder();
        amVar.copyOnWrite();
        ((C50638an) amVar.instance).f131732e = j;
        amVar.copyOnWrite();
        C50638an anVar = (C50638an) amVar.instance;
        anVar.f131728a |= 1;
        anVar.f131733f = false;
        amVar.copyOnWrite();
        C50638an anVar2 = (C50638an) amVar.instance;
        anVar2.f131728a |= 2;
        anVar2.f131734g = false;
        long b = this.f314987a.f314991d.mo26870b();
        amVar.copyOnWrite();
        ((C50638an) amVar.instance).f131731d = b;
        bmVar.mo96360K((C50638an) amVar.build());
    }
}
