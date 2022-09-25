package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.al */
/* compiled from: PG */
public final /* synthetic */ class C9657al implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9664as f33401a;

    public /* synthetic */ C9657al(C9664as asVar) {
        this.f33401a = asVar;
    }

    public final void onClick(View view) {
        C9664as asVar = this.f33401a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("dreamliner_seq_arg_pf_from_settings", true);
        bundle.putBoolean("seq_args_is_ch_am", true);
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "ch_am_photos_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        o.mo77222b(C59567w.f158058g);
        gVar.f228606b = bundle;
        asVar.startActivity(o.mo77221a().mo77240n());
    }
}
