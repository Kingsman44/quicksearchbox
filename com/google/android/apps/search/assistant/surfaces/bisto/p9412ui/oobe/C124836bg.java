package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import androidx.activity.C0800m;
import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124524e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.p9415b.C124827c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3506c.C44581b;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142355cg;
import com.google.apps.tiktok.tracing.C47752cq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60106kz;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bg */
/* compiled from: PG */
final class C124836bg extends C0800m {

    /* renamed from: a */
    final /* synthetic */ C124838bi f344406a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C124836bg(C124838bi biVar) {
        super(true);
        this.f344406a = biVar;
    }

    /* renamed from: a */
    public final void mo608a() {
        C124838bi biVar = this.f344406a;
        C59104x b = C124838bi.f344408a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) b).mo56372aa(36338)).mo56386p("Back Button");
        C44581b b2 = C124849bt.m204631b(biVar.f344409b);
        b2.mo47604w(R.string.assistant_bisto_oobe_cancel_confirm_title);
        b2.mo47601t(R.string.assistant_bisto_oobe_cancel_confirm_button_positive, new C47752cq(biVar.f344414g, "quit", new C124834be(biVar)));
        b2.mo47598q(R.string.assistant_bisto_oobe_cancel_confirm_button_negative, new C47752cq(biVar.f344414g, "continue", C124835bf.f344405a));
        b2.f1347a.f1333n = false;
        OobeActivityViewModel oobeActivityViewModel = (OobeActivityViewModel) new C2368bp(biVar.f344409b).mo5770a(OobeActivityViewModel.class);
        C142324bc bcVar = oobeActivityViewModel.f344276c;
        try {
            if (((C60106kz) ((C124827c) oobeActivityViewModel.mo106637a()).f344386b.instance).f162535c) {
                b2.mo47597p(R.string.assistant_bisto_oobe_exit_setup_after_success);
                b2.create().show();
            }
        } catch (IllegalStateException unused) {
        }
        C142346by byVar = bcVar.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142355cg cgVar = byVar.f386231k;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        C124524e a = C124525f.m203985a(cgVar);
        OobeActivity oobeActivity = biVar.f344409b;
        C124844bo boVar = biVar.f344410c;
        boolean z = boVar.f344427i;
        int i = R.string.assistant_bisto_oobe_exit_setup_early_watches;
        if (!z && boVar.f344426h.isEmpty()) {
            i = R.string.assistant_bisto_oobe_exit_setup_early;
        }
        a.mo106449b(oobeActivity, i);
        Objects.requireNonNull(b2);
        a.mo106448a(new C124833bd(b2));
        b2.create().show();
    }
}
