package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.content.Intent;
import androidx.lifecycle.C2368bp;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.n */
/* compiled from: PG */
final class C124917n implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C124919p f344653a;

    public C124917n(C124919p pVar) {
        this.f344653a = pVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        Optional optional = (Optional) obj;
        C59071e eVar = C124919p.f344655a;
        C58976aa aaVar = C58975e.f156826a;
        if (!optional.isPresent() || ((Intent) optional.get()).getAction() == null) {
            this.f344653a.mo106714a();
            return;
        }
        C59104x b = C124919p.f344655a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AuthTokenCheckerFrag");
        ((C59052c) ((C59052c) b).mo56372aa(36317)).mo56389s("Starting recovery activity: %s.", optional);
        ((OobeActivityViewModel) new C2368bp(this.f344653a.f344657c.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("FixAccountToken");
        this.f344653a.f344660f.mo526b((Intent) optional.get());
    }
}
