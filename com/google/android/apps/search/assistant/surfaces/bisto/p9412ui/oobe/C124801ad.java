package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60103kw;
import com.google.common.p4552o.C60106kz;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.ad */
/* compiled from: PG */
final class C124801ad implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C124803af f344317a;

    public C124801ad(C124803af afVar) {
        this.f344317a = afVar;
    }

    /* renamed from: h */
    public final void mo20960h(Throwable th) {
        C59104x c = C124803af.f344319a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "EnableAssistantFragment");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36321)).mo56386p("Failed");
        C124803af afVar = this.f344317a;
        ((OobeActivityViewModel) new C2368bp(afVar.f344321c.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("EnableDeviceFailed");
        C44581b b = C124849bt.m204631b(afVar.f344321c.requireContext());
        b.mo47604w(R.string.assistant_bisto_oobe_enable_failed);
        b.mo47597p(R.string.assistant_bisto_oobe_error_enable_opa);
        b.mo47601t(R.string.assistant_bisto_try_again_button, new C47752cq(afVar.f344325g, "retry", new C124799ab(afVar)));
        b.mo47598q(R.string.assistant_bisto_generic_cancel_button, new C47752cq(afVar.f344325g, "cancel", new C124800ac(afVar)));
        b.create().show();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ void mo20961j(Object obj) {
        C124679cr crVar = (C124679cr) obj;
        C124827c cVar = (C124827c) ((OobeActivityViewModel) new C2368bp(this.f344317a.f344321c.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a();
        if (cVar.f344388d) {
            C59104x d = C124827c.f344384a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoOobeLogger");
            ((C59052c) ((C59052c) d).mo56372aa(36366)).mo56386p("session ended already");
        }
        C60103kw kwVar = cVar.f344386b;
        kwVar.copyOnWrite();
        C60106kz kzVar = (C60106kz) kwVar.instance;
        C60106kz kzVar2 = C60106kz.f162531p;
        kzVar.f162533a |= 8;
        kzVar.f162535c = true;
        C124803af afVar = this.f344317a;
        afVar.f344324f.mo50482c(afVar.f344321c).mo50509e(R.id.assistant_bisto_oobe_next, this.f344317a.f344322d);
    }
}
