package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.d */
/* compiled from: PG */
public final /* synthetic */ class C110066d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110067e f306643a;

    public /* synthetic */ C110066d(C110067e eVar) {
        this.f306643a = eVar;
    }

    public final void onClick(View view) {
        C110067e eVar = this.f306643a;
        eVar.mo98348e(view);
        eVar.f306652j = false;
        eVar.f306653k = true;
        C58976aa aaVar = C58975e.f156826a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("seq_args_is_ch_am", true);
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "ch_am_photos_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        o.mo77222b(C59567w.f158058g);
        gVar.f228606b = bundle;
        eVar.startActivity(o.mo77221a().mo77240n());
    }
}
