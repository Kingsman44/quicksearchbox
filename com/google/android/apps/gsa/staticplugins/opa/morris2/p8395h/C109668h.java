package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h;

import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.h */
/* compiled from: PG */
final class C109668h implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109669i f305435a;

    public C109668h(C109669i iVar) {
        this.f305435a = iVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C109669i.f305436a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MiniShimImpl");
        ((C59052c) ((C59052c) d).mo56372aa(25022)).mo56386p("#maybeCleanupMorrisStates(): failed to get MorrisData.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C14077e eVar = (C14077e) obj;
        if (eVar == null) {
            C59104x d = C109669i.f305436a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Morris.MiniShimImpl");
            ((C59052c) ((C59052c) d).mo56372aa(25024)).mo56386p("#maybeCleanupMorrisStates(): MorrisData is null.");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (eVar.f42737e) {
            this.f305435a.f305441f.mo21431e(C37182a.f98075fp.mo40813g());
            C14160ab.m30480a(this.f305435a.f305437b, eVar);
            this.f305435a.f305443h.disableCarMode(0);
            this.f305435a.f305442g.mo21397a();
            this.f305435a.f305441f.mo21428b(C37182a.f98076fq.mo40805c(C62722b.OK), this.f305435a.f305438c.e());
        }
    }
}
