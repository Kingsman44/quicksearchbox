package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import android.content.Intent;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.shared.util.p7159c.C90904ba;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ae */
/* compiled from: PG */
final class C101931ae extends C90904ba {

    /* renamed from: a */
    final /* synthetic */ C101932af f284325a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C101931ae(C101932af afVar) {
        super("On failure");
        this.f284325a = afVar;
    }

    public final void run() {
        C101933ag agVar = this.f284325a.f284326a;
        if (!agVar.f284357h.isAdded()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        agVar.mo92710n(R.string.hotword_enrollment_retry_enroll);
        agVar.f284367r.sendBroadcast(new Intent("com.google.android.googlequicksearchbox.action.RESUME_HOTWORD").putExtra("com.google.android.googlequicksearchbox.extra.PAUSE_HOTWORD_REQUESTING_PACKAGE", agVar.f284367r.getPackageName()));
        agVar.mo92706j();
        C101970k b = C101970k.m168758b(agVar.f284359j);
        FragmentManager parentFragmentManager = agVar.f284357h.getParentFragmentManager();
        parentFragmentManager.getClass();
        C0154a aVar = new C0154a(parentFragmentManager);
        aVar.mo689v(R.id.setup_content, b, "FRESH_ENROLL_SCREEN");
        aVar.mo509f();
    }
}
