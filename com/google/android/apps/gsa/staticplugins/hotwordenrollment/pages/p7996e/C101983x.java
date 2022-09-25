package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.x */
/* compiled from: PG */
final class C101983x {

    /* renamed from: a */
    final /* synthetic */ C101933ag f284551a;

    public C101983x(C101933ag agVar) {
        this.f284551a = agVar;
    }

    /* renamed from: a */
    public final void mo92756a() {
        C59104x d = C101933ag.f284328a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "FreshEnrollScreenFrag");
        ((C59052c) ((C59052c) d).mo56372aa(20445)).mo56386p("handleQueryValidationFailed");
        this.f284551a.mo92713q(0);
        this.f284551a.mo92710n(R.string.hotword_enrollment_wrong_query);
        if (this.f284551a.mo92714r()) {
            this.f284551a.mo92708l(false);
            this.f284551a.f284341K.findViewById(R.id.start_recording_button).setEnabled(true);
            C101933ag agVar = this.f284551a;
            agVar.f284339I.mo92742b(agVar.f284341K, 1);
            C101933ag agVar2 = this.f284551a;
            agVar2.f284339I.mo92741a(agVar2.f284341K);
        }
    }

    /* renamed from: b */
    public final void mo92757b() {
        this.f284551a.mo92713q(-1);
        this.f284551a.mo92705i();
    }
}
