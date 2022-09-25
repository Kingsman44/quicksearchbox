package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.p427am.p432b.p433a.C8625ad;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8675e;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.c */
/* compiled from: PG */
public final /* synthetic */ class C132200c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132242d f360835a;

    /* renamed from: b */
    public final /* synthetic */ C8675e f360836b;

    public /* synthetic */ C132200c(C132242d dVar, C8675e eVar) {
        this.f360835a = dVar;
        this.f360836b = eVar;
    }

    public final void onClick(View view) {
        C132242d dVar = this.f360835a;
        C8675e eVar = this.f360836b;
        C132305f fVar = dVar.f360941d.f361043c;
        if (fVar != null) {
            C132347m mVar = fVar.f361095a;
            Bundle a = C132361w.m215129a(mVar.f361271c);
            a.putString("supervised_oid", eVar.f29992a);
            if (!eVar.f29995d) {
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                int a2 = C8625ad.m23351a(agVar.f29897f);
                if (a2 != 0 && a2 == 6 && mVar.f361277i) {
                    a.putBoolean("should_open_ulp_upgrade_flow", true);
                    mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_upgrade_ulp_account, a);
                } else if (mVar.f361271c.getBoolean("skip_child_presence_verification", false)) {
                    mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_select_child_requiring_setup_skip_verification, a);
                } else {
                    mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_select_child_requiring_setup, a);
                }
            } else if (mVar.f361278j) {
                mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_select_set_up_child_steady_state, a);
            } else {
                mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_select_set_up_child, a);
            }
        }
    }
}
