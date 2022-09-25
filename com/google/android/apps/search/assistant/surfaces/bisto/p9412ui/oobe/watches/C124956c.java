package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46853g;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62971cq;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63138d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.c */
/* compiled from: PG */
final class C124956c implements C46852f {

    /* renamed from: a */
    final /* synthetic */ C124958e f344787a;

    public C124956c(C124958e eVar) {
        this.f344787a = eVar;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo20960h(Throwable th) {
        throw new C46853g(th);
    }

    /* renamed from: j */
    public final /* synthetic */ void mo20961j(Object obj) {
        String str = (String) obj;
        C63138d dVar = this.f344787a.f344796h.f344277d.f344851c;
        if (dVar == null) {
            dVar = C63138d.f170494j;
        }
        C62971cq cqVar = dVar.f170498c;
        String str2 = true != cqVar.isEmpty() ? BuildConfig.FLAVOR : "-edoras-acc-empty";
        if (C58837ba.m90859h(str)) {
            str2 = str2.concat("-agsa-acc-null");
        }
        C58976aa aaVar = C58975e.f156826a;
        if (cqVar.contains(str)) {
            this.f344787a.mo106754a();
            return;
        }
        C59104x b = C124958e.f344789a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AccountMismatchFragment");
        ((C59052c) ((C59052c) b).mo56372aa(36372)).mo56386p("Account mismatch");
        this.f344787a.f344796h.mo106637a().mo106662b("AccountMismatch".concat(str2));
        C44581b a = C124849bt.m204630a(this.f344787a.f344791c.requireContext());
        a.mo47604w(R.string.assistant_bisto_oobe_set_up_later_title);
        a.f1347a.f1326g = this.f344787a.f344791c.requireContext().getString(R.string.assistant_bisto_account_mismatch_body, new Object[]{str});
        a.mo47601t(R.string.assistant_bisto_generic_next, new C47752cq(this.f344787a.f344795g, "quit", new C124954b(this)));
        a.create().show();
    }
}
