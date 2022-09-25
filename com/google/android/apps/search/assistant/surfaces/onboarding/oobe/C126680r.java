package com.google.android.apps.search.assistant.surfaces.onboarding.oobe;

import com.google.android.apps.search.assistant.surfaces.onboarding.oobe.p9496b.C126661b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protos.p4759ad.p4760a.p4761a.p4788b.p4789a.p4790a.p4791a.p4792a.p4793a.C63145c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.onboarding.oobe.r */
/* compiled from: PG */
final class C126680r implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C126681s f348848a;

    public C126680r(C126681s sVar) {
        this.f348848a = sVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C126681s.f348849a.mo56225c()).mo56382g(th)).mo56372aa(37095)).mo56386p("Assistant state loading failed");
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        ((C126661b) this.f348848a.f348854f).f348804a = Optional.m71637of(C58485gu.m89842j(((C63145c) obj).f170517b));
        C126681s sVar = this.f348848a;
        if (sVar.f348860l) {
            sVar.f348860l = false;
        } else if (!sVar.f348854f.mo107667a((String) null, Optional.m71637of(sVar.f348850b)) && this.f348848a.f348851c.getActivity() != null) {
            this.f348848a.f348852d.mo19974a(C37176a.f97255iB.mo40805c(C62722b.OK));
            this.f348848a.f348857i.mo40257u();
            this.f348848a.f348851c.getActivity().finish();
        }
    }
}
