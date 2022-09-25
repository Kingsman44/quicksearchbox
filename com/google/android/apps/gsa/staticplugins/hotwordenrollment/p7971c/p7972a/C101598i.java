package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7972a;

import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.hotword.enrollmentutils.C92408n;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92360b;
import com.google.android.apps.gsa.speech.hotword.p7285c.C92362c;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.a.i */
/* compiled from: PG */
final class C101598i implements C92360b {

    /* renamed from: a */
    final /* synthetic */ C101599j f283493a;

    public C101598i(C101599j jVar) {
        this.f283493a = jVar;
    }

    /* renamed from: a */
    public final void mo64728a(C92362c cVar) {
        C59104x b = C101599j.f283494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20267)).mo56389s("#onError [state: %s]", cVar);
        Intent a = C92408n.m151739a(C92354c.m151656b(cVar));
        a.putExtra("assistant_enrollment_error", cVar);
        this.f283493a.mo92417b(2, a);
    }

    /* renamed from: b */
    public final void mo64729b(C92362c cVar) {
        C101773m mVar = this.f283493a.f283499f.f283875b;
        C59104x b = C101599j.f283494a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HomeEnrollmentCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(20268)).mo56354G("#onUpdate [state: %s, screen: %s]", cVar, mVar.name());
        C92362c cVar2 = C92362c.LINK_ACCOUNT;
        if (cVar.ordinal() == 5 && !this.f283493a.f283498e.f284134a.get()) {
            ((C89859i) this.f283493a.f283496c.mo27525b()).mo83702b(C89849ae.VOICE_MATCH_MULTI_DEVICE_ENROLLMENT_COMPLETE);
            if (mVar == C101773m.PROGRESS_UPDATE_SCREEN) {
                this.f283493a.mo92418c();
            }
        }
    }
}
