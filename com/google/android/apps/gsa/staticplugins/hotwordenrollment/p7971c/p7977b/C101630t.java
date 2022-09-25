package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7977b;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.b.t */
/* compiled from: PG */
public final /* synthetic */ class C101630t implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C101633w f283595a;

    /* renamed from: b */
    public final /* synthetic */ boolean f283596b;

    public /* synthetic */ C101630t(C101633w wVar, boolean z) {
        this.f283595a = wVar;
        this.f283596b = z;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C101633w wVar = this.f283595a;
        boolean z = this.f283596b;
        C59104x b = C101633w.f283601a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PhoneDspEnroll");
        ((C59052c) ((C59052c) b).mo56372aa(20371)).mo56386p("Dsp enrollment not needed, calling handleEnrollResult directly");
        if (wVar.f283602b == null) {
            C59104x c = C101633w.f283601a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PhoneDspEnroll");
            ((C59052c) ((C59052c) c).mo56372aa(20372)).mo56386p("DSP enrollment hotwordAdapter is null");
            cVar.mo5437b(false);
            return "HotwordAdapter.connect operation";
        }
        wVar.f283603c.mo92452a(z);
        wVar.f283602b.mo87273a(new C101632v(wVar, cVar));
        return "HotwordAdapter.connect operation";
    }
}
