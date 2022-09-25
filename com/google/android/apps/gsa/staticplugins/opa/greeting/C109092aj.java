package com.google.android.apps.gsa.staticplugins.opa.greeting;

import android.view.View;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.opaonboarding.C83879am;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83938e;
import com.google.android.apps.gsa.opaonboarding.C83940g;
import com.google.common.p4552o.p4553a.C59566v;
import com.google.common.p4552o.p4553a.C59567w;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.greeting.aj */
/* compiled from: PG */
final class C109092aj implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C109100ar f303723a;

    public C109092aj(C109100ar arVar) {
        this.f303723a = arVar;
    }

    public final void onClick(View view) {
        C109100ar arVar = this.f303723a;
        C83879am o = C83880an.m133553o();
        C83940g gVar = (C83940g) o;
        gVar.f228605a = "opa_android:entry_point";
        gVar.f228607c = new C83938e(0, (String) null, (String) null);
        C59566v vVar = (C59566v) C59567w.f158058g.createBuilder();
        e eVar = e.R;
        vVar.copyOnWrite();
        C59567w wVar = (C59567w) vVar.instance;
        wVar.f158064e = eVar.ca;
        wVar.f158060a |= 16;
        o.mo77222b((C59567w) vVar.build());
        arVar.f303789v.mo65090b(o.mo77221a().mo77240n(), new C109112i(arVar));
    }
}
