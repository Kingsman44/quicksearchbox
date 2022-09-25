package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.ck */
/* compiled from: PG */
public final /* synthetic */ class C132224ck implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C132227cn f360900a;

    public /* synthetic */ C132224ck(C132227cn cnVar) {
        this.f360900a = cnVar;
    }

    public final void onClick(View view) {
        C132227cn cnVar = this.f360900a;
        if (!cnVar.f360905c.containsKey("supervised_oid")) {
            cnVar.f360906d.mo50482c(cnVar.f360904b).mo50508d(R.id.assistant_custodio_overview_fragment_next_child_absent, cnVar.f360905c);
        } else if (cnVar.f360905c.getBoolean("skip_child_presence_verification", false)) {
            cnVar.f360906d.mo50482c(cnVar.f360904b).mo50508d(R.id.assistant_custodio_overview_next_child_present_skip_verification, cnVar.f360905c);
        } else {
            cnVar.f360906d.mo50482c(cnVar.f360904b).mo50508d(R.id.assistant_custodio_overview_fragment_next_child_present, cnVar.f360905c);
        }
    }
}
