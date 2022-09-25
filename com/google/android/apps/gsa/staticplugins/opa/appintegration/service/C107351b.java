package com.google.android.apps.gsa.staticplugins.opa.appintegration.service;

import android.app.UiModeManager;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appintegration.service.b */
/* compiled from: PG */
final class C107351b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C107359j f298763a;

    public C107351b(C107359j jVar) {
        this.f298763a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C107359j.f298778a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
        ((C59052c) ((C59052c) d).mo56372aa(23699)).mo56386p("#maybeCleanupMorrisStates(): failed to get MorrisData.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C14077e eVar = (C14077e) obj;
        if (eVar == null) {
            C59104x d = C107359j.f298778a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d).mo56372aa(23702)).mo56386p("#maybeCleanupMorrisStates(): MorrisData is null.");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        if (eVar.f42737e) {
            C59104x d2 = C107359j.f298778a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "AILegacyServiceHdlr");
            ((C59052c) ((C59052c) d2).mo56372aa(23701)).mo56386p("#maybeCleanupMorrisStates(): kicking off Morris teardown flow after binder to :search process died.");
            this.f298763a.mo95975d(C89849ae.MORRIS_TEARDOWN_APP_INTEGRATION_SERVICE_SEARCH_PROCESS_BINDER_DIED);
            C14160ab.m30480a(this.f298763a.f298797t.getApplicationContext(), eVar);
            ((UiModeManager) this.f298763a.f298797t.getApplicationContext().getSystemService("uimode")).disableCarMode(0);
            ((C14096x) this.f298763a.f298794q.mo27525b()).mo21397a();
            this.f298763a.mo95975d(C89849ae.MORRIS_TEARDOWN_APP_INTEGRATION_SERVICE_CLEANUP_COMPLETED);
        }
    }
}
