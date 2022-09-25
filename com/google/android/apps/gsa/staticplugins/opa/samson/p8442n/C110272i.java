package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.i */
/* compiled from: PG */
public final /* synthetic */ class C110272i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C110283t f307302a;

    public /* synthetic */ C110272i(C110283t tVar) {
        this.f307302a = tVar;
    }

    public final void run() {
        Activity activity = this.f307302a.f307316d;
        Bundle bundle = new Bundle();
        bundle.putBoolean("dreamliner_seq_arg_pf_from_settings", true);
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "ch_am_photos_seq";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        C9439b bVar = C9439b.OPA_AMBIENT_MODE_ONBOARDING;
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158062c = bVar.f32835aq;
        wVar.f158060a |= 2;
        o.mo77222b((C59567w) vVar.build());
        gVar.f228606b = bundle;
        activity.startActivity(o.mo77221a().mo77240n());
    }
}
