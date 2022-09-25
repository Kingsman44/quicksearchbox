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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.w */
/* compiled from: PG */
final class C109683w implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C109685y f305472a;

    public C109683w(C109685y yVar) {
        this.f305472a = yVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C109685y.f305480a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
        ((C59052c) ((C59052c) d).mo56372aa(25028)).mo56386p("#maybeCleanupMorrisStates(): failed to get MorrisData.");
        this.f305472a.mo97976B();
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C14077e eVar = (C14077e) obj;
        synchronized (this.f305472a) {
            if (eVar == null) {
                C59104x d = C109685y.f305480a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Morris.StateImpl");
                ((C59052c) ((C59052c) d).mo56372aa(25030)).mo56386p("#maybeCleanupMorrisStates(): MorrisData is null.");
                this.f305472a.mo97976B();
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            if (!eVar.f42737e) {
                this.f305472a.mo97976B();
                return;
            }
            this.f305472a.f305495d.mo21431e(C37182a.f98075fp.mo40813g());
            C14160ab.m30480a(this.f305472a.f305497f, eVar);
            this.f305472a.f305507p.disableCarMode(0);
            this.f305472a.f305500i.mo21397a();
            this.f305472a.f305495d.mo21428b(C37182a.f98076fq.mo40805c(C62722b.OK), this.f305472a.mo97984e());
            this.f305472a.mo97976B();
        }
    }
}
