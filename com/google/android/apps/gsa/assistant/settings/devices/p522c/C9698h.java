package com.google.android.apps.gsa.assistant.settings.devices.p522c;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.c.h */
/* compiled from: PG */
public final /* synthetic */ class C9698h implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C9702l f33518a;

    public /* synthetic */ C9698h(C9702l lVar) {
        this.f33518a = lVar;
    }

    public final void onClick(View view) {
        C9702l lVar = this.f33518a;
        Bundle bundle = new Bundle();
        bundle.putString("dreamliner_seq_args", lVar.f33532e);
        bundle.putBoolean("dreamliner_seq_arg_pf_from_settings", true);
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        C9439b bVar = C9439b.OPA_DREAMLINER_PF_SETUP;
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        wVar.f158060a |= 2;
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "dreamliner_pf_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        o.mo77222b((C59567w) vVar.build());
        gVar.f228606b = bundle;
        lVar.startActivity(o.mo77221a().mo77240n());
    }
}
