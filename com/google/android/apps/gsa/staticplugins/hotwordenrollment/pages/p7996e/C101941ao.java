package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7996e;

import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.service.C88499t;
import com.google.android.apps.gsa.shared.speech.hotword.HotwordResult;
import com.google.android.apps.gsa.speech.audio.C92173d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.speech.p5208h.C66667eg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.e.ao */
/* compiled from: PG */
final class C101941ao extends C88499t {

    /* renamed from: a */
    final /* synthetic */ C101942ap f284397a;

    /* renamed from: b */
    private final C101945as f284398b;

    public C101941ao(C101942ap apVar, C101945as asVar) {
        this.f284397a = apVar;
        this.f284398b = asVar;
    }

    /* renamed from: f */
    public final void mo17567f(ParcelableVoiceAction parcelableVoiceAction) {
        C59104x c = C101942ap.f284399a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) c).mo56372aa(20494)).mo56389s("showError: %s", parcelableVoiceAction);
    }

    /* renamed from: i */
    public final void mo17570i(String str, String str2, String str3) {
        C58976aa aaVar = C58975e.f156826a;
        C101942ap apVar = this.f284397a;
        C101983x xVar = apVar.f284410l;
        int a = C101961bh.m168747a(str, apVar.f284404f.mo92638c());
        xVar.f284551a.mo92713q(a + 2 + C101961bh.m168747a(str2, this.f284397a.f284404f.mo92638c()));
    }

    /* renamed from: iK */
    public final void mo17572iK(int i, String str, String str2) {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: j */
    public final void mo17574j(int i) {
        this.f284398b.f284437a = i;
    }

    /* renamed from: o */
    public final void mo82018o() {
        C59104x c = C101942ap.f284399a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "HotwordDController");
        ((C59052c) ((C59052c) c).mo56372aa(20491)).mo56386p("onHotwordDetectionError");
        this.f284397a.f284410l.f284551a.mo92710n(R.string.hotword_enrollment_hotword_not_running);
    }

    /* renamed from: p */
    public final void mo82019p(C66667eg egVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (egVar == C66667eg.ENROLLMENT_VALIDATION_SUCCESS) {
            this.f284397a.f284410l.mo92757b();
        } else {
            this.f284397a.f284410l.mo92756a();
        }
    }

    /* renamed from: q */
    public final void mo82020q(HotwordResult hotwordResult) {
        C58976aa aaVar = C58975e.f156826a;
        hotwordResult.mo84683c();
        C101942ap apVar = this.f284397a;
        if (apVar.f284402d) {
            apVar.f284410l.f284551a.mo92713q(2);
        } else if (hotwordResult.mo84698p().mo56113h()) {
            C59104x b = C101942ap.f284399a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "HotwordDController");
            ((C59052c) ((C59052c) b).mo56372aa(20496)).mo56386p("#showHotwordTriggere audio present");
            List arrayList = new ArrayList();
            if (this.f284397a.f284409k.containsKey(C92173d.OK_HEY_GOOGLE)) {
                arrayList = (List) this.f284397a.f284409k.get(C92173d.OK_HEY_GOOGLE);
            }
            arrayList.add((byte[]) hotwordResult.mo84698p().mo56107c());
            this.f284397a.f284409k.put(C92173d.OK_HEY_GOOGLE, arrayList);
            this.f284397a.f284410l.f284551a.mo92705i();
        }
    }
}
