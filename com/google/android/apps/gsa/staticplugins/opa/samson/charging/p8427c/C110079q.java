package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8427c;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.c.q */
/* compiled from: PG */
public final /* synthetic */ class C110079q implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C110080r f306690a;

    public /* synthetic */ C110079q(C110080r rVar) {
        this.f306690a = rVar;
    }

    public final void onClick(View view) {
        C110080r rVar = this.f306690a;
        if (C36619a.m65148d(rVar.f306692c)) {
            C59104x b = C110080r.f306691b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ChAmNotFragment");
            ((C59052c) ((C59052c) b).mo56372aa(25667)).mo56386p("Already have permission, exiting.");
            rVar.mo77318iT().mo77312a();
            return;
        }
        C83395k.m132733d(rVar.f306692c);
        Intent b2 = C83395k.m132731b(rVar.f306692c);
        if (b2 != null) {
            rVar.f306694e.mo77327a(new C110077o(rVar), rVar.mo77318iT());
            rVar.f306693d.mo65089a(b2);
            return;
        }
        C59104x d = C110080r.f306691b.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ChAmNotFragment");
        ((C59052c) ((C59052c) d).mo56372aa(25666)).mo56386p("Fails to get notification permission intent.");
    }
}
